package dio.web.api.controller;

import dio.web.api.model.User;
import dio.web.api.repository.userRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users") // Define que todas as requisições nete controller vai iniciar com usuers
public class UserController {
    @Autowired
    private userRepository repository;
    @GetMapping()
    public List<User> getUsers(){
       return repository.findAll();
    }
    @GetMapping("/{username}")
    public User getOne(@PathVariable("username") String username){
        return repository.findByUsername(username);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id){
        repository.deleteById(id);
    }

    @PostMapping()
    public void postUser(@RequestBody User user){
        repository.save(user);
    }
}
