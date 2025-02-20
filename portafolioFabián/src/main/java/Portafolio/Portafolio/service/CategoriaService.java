
package Portafolio.Portafolio.service;

import Portafolio.Portafolio.domain.Categoria;
import java.util.List;

public interface CategoriaService  {
    public List<Categoria> getCategorias(boolean activos);
}
