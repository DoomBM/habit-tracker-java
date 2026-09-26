import java.util.ArrayList;
import java.util.List;
public class HabitTracker {
    private List<String> listaHabitos;
    private List<String> completados;
    
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
                for(String habito: this.listaHabitos) {
                    System.out.println(i + ". " + habito);
                    i++;
                }
            }
        }
        else if(opcion == 2) {
            if(completados.isEmpty()){
                System.out.println("No se encuentra ningun habito completado");
            }
            else {
                for(String completo: this.completados) {
                    System.out.println(i + ". " + completo);
                i++;
                }
            }
        }
    }
    
    public void addHabito(String habito) {
        boolean existe = false;
        for(String comparar : this.listaHabitos) {
            existe = comparar.equalsIgnoreCase(habito);
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
        if(habito > 0 && habito <= listaHabitos.size()) {
            String completado = listaHabitos.get(habito - 1);
            this.completados.add(completado);
            this.listaHabitos.remove(habito - 1);
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
