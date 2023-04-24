package juego.editor;

import java.util.ArrayList;
import java.util.List;

public class Escenario extends Entorno {
    private String nombreEscenario;
    private List<Entorno> misAmbientes;
    private String typeEntorno;

    public Escenario(String nombreEscenario){
        this.nombreEscenario = nombreEscenario;
        this.misAmbientes = new ArrayList<>();
        this.typeEntorno = "Escenario";
    }

    @Override
    public void agregarEntorno(Entorno nuevoEntorno) {
        if(nuevoEntorno !=null){
            misAmbientes.add(nuevoEntorno);
        }
    }
    public String getTipo(){
        return typeEntorno;
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

}
