
package Portafolio.Portafolio.DAO;

import Portafolio.Portafolio.domain.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaDao extends JpaRepository <Categoria,Long> {
    
}
