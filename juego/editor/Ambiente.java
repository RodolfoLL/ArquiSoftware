package juego.editor;

import java.util.ArrayList;
import java.util.List;

public class Ambiente extends Entorno{
    private String nombreAmbiente;
    private List<Elemento> misElementos;
    private String typeEntorno;

    public Ambiente(String nombreAmbiente){
        this.nombreAmbiente = nombreAmbiente;
        this.misElementos = new ArrayList<>();
        this.typeEntorno = "Ambiente";

    }
    @Override
    public Entorno getElementEntorno() {
        return null;
    }

    @Override
    public String getTipo() {
        return typeEntorno;
    }
    public List<Elemento> getListElements(){
        return misElementos;
    }

    @Override
    public void agregarEntorno(Entorno nuevoEntorno) {
        System.out.println("No puedo agregar ningun entorno");
    }

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
    public Elemento getElemento(int posicion){
        return misElementos.get(posicion);
    }
}
