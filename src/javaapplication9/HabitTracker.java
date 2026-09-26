import java.util.ArrayList;
import java.util.List;
public class HabitTracker {
    private List<Habito> listaHabitos;
    private List<Habito> completados;
    
    public HabitTracker() {
        this.listaHabitos = new ArrayList<>();
        this.completados = new ArrayList<>();
    }
    
    public void verHabitos(int opcion){
        int i = 1;
        if(opcion == 1) {
            if(listaHabitos.isEmpty()){
                System.out.println("No se encuentra ningun habito");
            }
            else {
                for(Habito habito: this.listaHabitos) {
                    System.out.println(i + ". " + habito.getNombre());
                    i++;
                }
            }
        }
        else if(opcion == 2) {
            if(completados.isEmpty()){
                System.out.println("No se encuentra ningun habito completado");
            }
            else {
                for(Habito completo: this.completados) {
                    System.out.println(i + ". " + completo.getNombre());
                i++;
                }
            }
        }
    }
    
    public void addHabito(Habito habito) {
        boolean existe = false;
        for(Habito comparar : this.listaHabitos) {
            existe = comparar.getNombre().equalsIgnoreCase(habito.getNombre());
            if (existe) {
                System.out.println("Ese habito ya existe.");
                break;
            }
        }
        if(!existe) {
            this.listaHabitos.add(habito);
        }
    }
    
    public void completar(int habito) {
        boolean existente = false;
        if(habito > 0 && habito <= listaHabitos.size()) {
            for(Habito comparar : this.completados) {
                if(comparar.getNombre().equals(this.listaHabitos.get(habito -1).getNombre())){
                    System.out.println("Este habito ya lo completaste");
                    existente = true;
                    break;
                }
            }
            if(!existente) {
                Habito completado = this.listaHabitos.get(habito - 1);
                this.completados.add(completado);
            }
        }
        else {
            System.out.println("Ese habito no existe");
        }
    }
    
    public void eliminar (int eliminar) {
        if (eliminar > 0 && eliminar <= listaHabitos.size()) {
            listaHabitos.remove(eliminar - 1);
        }
        else {
            System.out.println("Habito inexistente");
        }
    }
    
}
