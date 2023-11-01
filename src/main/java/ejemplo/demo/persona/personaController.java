package ejemplo.demo.persona;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/persona")
@CrossOrigin({"*"})
public class personaController {
    @Autowired
    private personaService personaService;
    @PostMapping("/")
    public persona save(@RequestBody persona entity){
        return personaService.save(entity);
    }
    //editar
    @GetMapping("/{id}/")
    public persona findById(@PathVariable long id){
        return personaService.findById(id);
    }
    @DeleteMapping("/{id}/")
    public void deleteById(@PathVariable long id){
        personaService.deleteById(id);
    }
    //read all
    @GetMapping("/")
    public List<persona> findAll(){
        return personaService.findAll();
    }
}
