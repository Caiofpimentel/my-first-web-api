package dio.web.api.repository;

import dio.web.api.model.User;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;

@Repository
public class userRepository {
    public void save(User usuario){
        System.out.println("SAVE - Recebendo o usuário na camada de repositório");
        System.out.println(usuario);
    }
    public void update(User usuario){
        System.out.println("UPDATE - Recebendo o usuário na camada de repositório");
        System.out.println(usuario);
    }
    public void deleteById(Integer id){
        System.out.println(String.format("DELETE/id - Recebendo o id: %d para excluir um usuário", id));
        System.out.println(id);
    }
    public List<User> findAll(){
        List<User> usuarios = new ArrayList<>();
        usuarios.add(new User("Caio","password"));
        usuarios.add(new User("Cris","masterpass"));
        return usuarios;
    }
    public User findByUsername(String username){
        System.out.println(String.format("FIND/username - Recebendo o id: %s para localizar um usuário", username));
        return new User("Caio","password" + username);
    }

}
