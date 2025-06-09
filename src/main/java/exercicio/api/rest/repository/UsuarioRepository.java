package exercicio.api.rest.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import exercicio.api.rest.Usuario;
import exercicio.api.rest.handler.BusinessException;


@Repository
public class UsuarioRepository {

    public void save(Usuario usuario){
        
        if(usuario.getLogin()==null){
            throw new BusinessException("O campo login é obrigatório");
        }

        if(usuario.getPassword()==null){
            System.out.println("SAVE - Recebendo o usuário na camada de repositório");
        }
        else{
            System.out.println("UPDATE - Recebendo o usuário na camada de repositório");
        }
        System.out.println(usuario);
    }
    public void update(Usuario usuario){
        System.out.println("UPDATE - Recebendo o usuário na camada de repositório");
        System.out.println(usuario);
    }
    public void remove(Integer id){
        System.out.println(String.format("DELETE/id - Recebendo o id: %d para excluir um usuário", id));
        System.out.println(id);
    }
    public List<Usuario> listAll(){
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("pedrinho","word"));
        usuarios.add(new Usuario("frank ocean","masterpass"));
        return usuarios;
    }
    public Usuario finById(Integer id){
        System.out.println(String.format("GET/id - Recebendo o id: %d para localizar um usuário", id));
        return new Usuario("pedrinho","word");
    }

    public Usuario findByUsername(String username){
        System.out.println(String.format("FIND/username - Recebendo o username: %s para localizar um usuário", username));
        return new Usuario("pedrinho","word");
    }

}