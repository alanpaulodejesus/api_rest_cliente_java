package projectApiSpring.projectApi.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

public class ClienteDto {

    @NotBlank
    private String nome;
    @NotBlank
    //@org.hibernate.validator.constraints.br.CPF
    @NotBlank
    @Size(max= 13)
    private String CPF;
    @NotBlank
    private String idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }
}
