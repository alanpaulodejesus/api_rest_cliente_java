package projectApiSpring.projectApi.repositories;

import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import projectApiSpring.projectApi.models.ClienteModel;

import java.util.UUID;

@Repository
public interface ClienteRepository extends JpaRepository<ClienteModel, UUID> {

    boolean existsByCPF(String cpf);
}
