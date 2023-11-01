package ejemplo.demo.persona;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class personaService {
    @Autowired
    private personaRepository personaRepository;
//create
    public persona save(persona entity){
        return personaRepository.save(entity);
    }
//find by id
    
    public persona findById(long id){
        return personaRepository.findById(id).orElse(null);
    }

    public void deleteById(long id){
        personaRepository.deleteById(id);
    }

    //list 
    public List<persona> findAll(){
        return personaRepository.findAll();
    }
}
