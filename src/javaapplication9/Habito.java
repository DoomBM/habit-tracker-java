import java.time.LocalDate;
import java.util.ArrayList;
public class Habito {
    private String habito;
    private LocalDate fecha;
    
    public Habito(String habito){
        this.habito = habito;
        this.fecha = null;
        
    }
    
    public String getNombre(){
        return this.habito;
    }
    
    public void setNombre(String nombre) {
        if(nombre.isEmpty()) {
            System.out.println("Nombre invalido");        
        }
        else {
            this.habito = nombre;
        }
    }
    
    public void fechaHabito() {
        this.fecha = LocalDate.now();
    }

}
