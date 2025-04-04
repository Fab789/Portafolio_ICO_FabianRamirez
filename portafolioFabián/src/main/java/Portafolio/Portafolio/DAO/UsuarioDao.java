
package Portafolio.Portafolio.DAO;

import Portafolio.Portafolio.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioDao  extends JpaRepository<Usuario, Long> {
    
     public Usuario findByUsername(String username);

    Usuario findByUsernameAndPassword(String username, String Password);

    Usuario findByUsernameOrCorreo(String username, String correo);

    boolean existsByUsernameOrCorreo(String username, String correo);

    
}
