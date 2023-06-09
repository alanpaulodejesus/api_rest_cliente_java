package projectApiSpring.projectApi.controllers;

import io.swagger.v3.oas.annotations.Operation;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.querydsl.QSort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import projectApiSpring.projectApi.dtos.ClienteDto;
import projectApiSpring.projectApi.models.ClienteModel;
import projectApiSpring.projectApi.services.ClienteService;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/cliente")
public class ClienteController {

    final ClienteService clienteService;

    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }
    @PostMapping
    public ResponseEntity<Object> saveCliente(@RequestBody @Valid ClienteDto clienteDto){

        if(clienteService.existsByCPF(clienteDto.getCPF())){
            return ResponseEntity.status(HttpStatus.CONFLICT).body("Conflict: CPF already existents!");
        }
        var clienteModel = new ClienteModel();
        BeanUtils.copyProperties(clienteDto, clienteModel);
        clienteModel.setDataCadastro(LocalDateTime.now(ZoneId.of("UTC")));
        return ResponseEntity.status(HttpStatus.CREATED).body(clienteService.save(clienteModel));
    }

    @GetMapping
    public ResponseEntity<Page<ClienteModel>>getAllCliente(@PageableDefault(page = 0,size = 5, sort = "codCiente", direction = Sort.Direction.ASC)Pageable pageable){
        return ResponseEntity.status(HttpStatus.OK).body(clienteService.findAll(pageable));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> getOneCliente(@PathVariable(value = "id")UUID uuid){
        Optional <ClienteModel> clienteModelOptional = clienteService.findById(uuid);
        if(!clienteModelOptional.isPresent()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Cliente not found.");
        }
        return ResponseEntity.status(HttpStatus.OK).body(clienteModelOptional.get());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deleteOneCliente(@PathVariable(value = "id")UUID uuid){
        Optional <ClienteModel> clienteModelOptional = clienteService.findById(uuid);
        if(!clienteModelOptional.isPresent()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Cliente not found.");
        }
        clienteService.delete(clienteModelOptional.get());
        return ResponseEntity.status(HttpStatus.OK).body("Cliente deleted successfully.");
    }

    @PutMapping("/{id}")
    public ResponseEntity<Object> putCliente(@PathVariable(value = "id")UUID uuid, @RequestBody @Valid ClienteDto clienteDto){
        Optional <ClienteModel> clienteModelOptional = clienteService.findById(uuid);
        if(!clienteModelOptional.isPresent()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Cliente not found.");
        }
        if(clienteService.existsByCPF(clienteDto.getCPF())){
            return ResponseEntity.status(HttpStatus.CONFLICT).body("Conflict: CPF already existents!");
        }
        var clienteModel =  clienteModelOptional.get();
        clienteModel.setCPF(clienteDto.getCPF());
        clienteModel.setNome(clienteDto.getNome());
        clienteModel.setIdade(clienteDto.getIdade());
        return ResponseEntity.status(HttpStatus.OK).body(clienteService.save(clienteModel));
    }
}
