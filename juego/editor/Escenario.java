package juego.editor;

import java.util.ArrayList;
import java.util.List;

public class Escenario extends Entorno {
    private String nombreEscenario;
    private List<Entorno> misAmbientes;

    public Escenario(String nombreEscenario){
        this.nombreEscenario = nombreEscenario;
        this.misAmbientes = new ArrayList<>();
    }

    @Override
    public void agregarEntorno(Entorno nuevoEntorno) {
        if(nuevoEntorno !=null){
            misAmbientes.add(nuevoEntorno);
        }
    }
//    public Entorno buscar(Entorno entornoBuscar){
//        Entorno res = null;
//        if(entornoBuscar instanceof Escenario){
//            String nombreEntorno = entornoBuscar.getNombreEntorno();
//            for (Entorno elemento:((Escenario) entornoBuscar).getMisAmbientes()) {
//                String miNombre = elemento.getNombreEntorno();
//                if(nombreEntorno.equals(miNombre)){
//                    res = elemento;
//                }
//            }
//        }
//        return res;
//    }
    public String getNombreEntorno(){
        return nombreEscenario;
    }

    @Override
    public Entorno getElementEntorno() {
        return misAmbientes.get(0);
    }

    public List<Entorno> getMisAmbientes(){
        return misAmbientes;
    }
}
