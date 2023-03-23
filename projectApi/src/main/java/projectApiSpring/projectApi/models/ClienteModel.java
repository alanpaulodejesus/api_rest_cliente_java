package projectApiSpring.projectApi.models;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "TB_CLIENTE")
public class ClienteModel implements Serializable {
    private static final long serialVersionUID=1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID codCiente;
    @Column(nullable = false, length = 50)
    private String nome;
    @Column(nullable = false, unique = true, length = 13)
    private String CPF;
    @Column(nullable = false, length = 2)
    private String idade;
    @Column(nullable = false)
    private LocalDateTime dataCadastro;

    public LocalDateTime getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDateTime dataCadastro) {
        this.dataCadastro = dataCadastro;
    }


    public UUID getCodCiente() {
        return codCiente;
    }

    public void setCodCiente(UUID codCiente) {
        this.codCiente = codCiente;
    }

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
