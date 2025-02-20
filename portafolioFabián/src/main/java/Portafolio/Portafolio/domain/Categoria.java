
package Portafolio.Portafolio.domain;
import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;
import nonapi.io.github.classgraph.json.Id;

@Data
@Entity
@Table(name="categoria")

public class Categoria implements Serializable  {
     private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String descripcion;
    private String rutaImagen;
    private boolean activo;

    public Categoria() {
    }

    public Categoria(String categoria, boolean activo) {
        this.descripcion = categoria;
        this.activo = activo;
    }
}
