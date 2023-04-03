package juego.editor;

import java.util.ArrayList;
import java.util.List;

public class Ambiente extends Entorno{
    private String nombreAmbiente;
    private List<Elemento> misElementos;

    public Ambiente(String nombreAmbiente){
        this.nombreAmbiente = nombreAmbiente;
        this.misElementos = new ArrayList<>();

    }

    @Override
    public Entorno getElementEntorno() {
        return null;
    }

    @Override
    public void agregarEntorno(Entorno nuevoEntorno) {
        System.out.println("No puedo agregar ningun entorno");
    }

//    public Entorno buscar(Entorno miEntorno){
//        return null;
//    }
    public String getNombreEntorno(){
        return nombreAmbiente;
    }
    public void agregarElemento(Elemento nuevoElemento){
        if(nuevoElemento instanceof Puerta){
            if(!misElementos.contains(nuevoElemento)){
                misElementos.add(nuevoElemento);
            }
        }
    }
    public List<Elemento> getMisElementos(){
        return misElementos;
    }
    public Elemento getElemento(int opcion){
        return misElementos.get(opcion);
    }
}
