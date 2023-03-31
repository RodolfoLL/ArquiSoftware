package juego.editor;

import java.util.ArrayList;
import java.util.List;

public class Escenario implements Entorno {
    private String nombreEscenario;
    private List<Entorno> misAmbientes;

    public Escenario(String nombreEscenario){
        this.nombreEscenario = nombreEscenario;
        this.misAmbientes = new ArrayList<>();
    }

    @Override
    public void agregarEntorno(Entorno nuevoEntorno) {
        if(nuevoEntorno !=null){
            if(!misAmbientes.contains(nuevoEntorno)){
                misAmbientes.add(nuevoEntorno);
            }
        }
    }
    public Entorno buscar(Entorno entornoBuscar,String nombreAmbiente){
        Entorno res = null;
        if(entornoBuscar instanceof Escenario){
            for (Entorno elemento:((Escenario) entornoBuscar).getMisAmbientes()) {
                String miNombre = elemento.getNombreEntorno();
                if(nombreAmbiente.equals(miNombre)){
                    res = elemento;
                }
            }
        }
        return res;
    }
    public String getNombreEntorno(){
        return nombreEscenario;
    }
    public Entorno getEntornoList(){
        Entorno inicio = misAmbientes.get(0);
        return inicio;
    }
    public List<Entorno> getMisAmbientes(){
        return misAmbientes;
    }
}
