
package Portafolio.Portafolio.service;

import Portafolio.Portafolio.domain.Producto;
import java.util.List;


public interface ProductoService {
     public List<Producto> getProductos(boolean activo);
      public Producto getProducto(Producto producto);
      
       public void save(Producto producto);
       
        public void delete(Producto producto);



     


}
