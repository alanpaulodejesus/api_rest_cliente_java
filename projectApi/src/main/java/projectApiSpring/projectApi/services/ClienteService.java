package projectApiSpring.projectApi.services;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import projectApiSpring.projectApi.models.ClienteModel;
import projectApiSpring.projectApi.repositories.ClienteRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class ClienteService {

    final ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    @Transactional
    public ClienteModel save(ClienteModel clienteModel) {
        return clienteRepository.save(clienteModel);
    }

    public boolean existsByCPF(String cpf) {
        return clienteRepository.existsByCPF(cpf);
    }

    public Page<ClienteModel> findAll(Pageable pageable) {
        return clienteRepository.findAll(pageable);
    }

    public Optional<ClienteModel> findById(UUID uuid) {
        return clienteRepository.findById(uuid);
    }

    @Transactional
    public void delete(ClienteModel clienteModel) {
         clienteRepository.delete(clienteModel);
    }
}
