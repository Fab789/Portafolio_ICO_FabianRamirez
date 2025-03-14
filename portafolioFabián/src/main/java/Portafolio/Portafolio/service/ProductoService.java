
package Portafolio.Portafolio.service;

import Portafolio.Portafolio.domain.Producto;
import java.util.List;


public interface ProductoService {
     public List<Producto> getProductos(boolean activo);
      public Producto getProducto(Producto producto);
      
       public void save(Producto producto);
       
        public void delete(Producto producto);


// Lista de productos con precio entre ordendados por descripción ConsultaAmpliada
    public List<Producto> findByPrecioBetweenOrderByDescripcion(double precioInf, double precioSup);

    //Lista de productos utilizando consultas con JPQL    
    public List<Producto> metodoJPQL(double precioInf, double precioSup);

    //Lista de productos utilizando consultas con SQL Nativo
    public List<Producto> metodoNativo(double precioInf, double precioSup);
     


}
