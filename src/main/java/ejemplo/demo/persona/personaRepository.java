package ejemplo.demo.persona;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface personaRepository extends CrudRepository<persona, Long>{
    List<persona> findAll();
}
