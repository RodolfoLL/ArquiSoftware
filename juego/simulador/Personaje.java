package juego.simulador;

import juego.editor.Ambiente;
import juego.editor.Elemento;
import juego.editor.Puerta;

import java.util.List;

public class Personaje {
    private String idPersonaje;
    private Ambiente ambienteActual;
    public Personaje(String idPersonaje){
        this.idPersonaje = idPersonaje;
    }
    public Ambiente getAmbienteActual(){
        return ambienteActual;
    }
    public String getNombreAmbiente(){
        return ambienteActual.getNombreEntorno();
    }
    public void setAmbienteActual(Ambiente actual){
        this.ambienteActual = actual;
    }
    public void Mover(int opcion){
        if(opcion == 4){
            volverAtras();
        }else{
            if(!ambienteActual.getNombreEntorno().equals("pasillo")){
                Elemento inicial = ambienteActual.getElemento(opcion);
                if(inicial instanceof Puerta){
                    ((Puerta) inicial).setUtilizado(true);
                    setAmbienteActual(((Puerta) inicial).getAmbienteDestino());
                }
            }else{
                verificarPuertaPasillo(opcion);
            }
        }
    }
    public void mostrarAmbiente(){
        System.out.println("el personaje "+idPersonaje+" "+"esta en el ambiente "+ambienteActual.getNombreEntorno());
    }
    public void mostrarElementosAmbientes(){
        for (int i = 0; i < ambienteActual.getMisElementos().size(); i++) {
            System.out.println(i+1+".- "+ambienteActual.getMisElementos().get(i).getNombreElemento());
        }
        System.out.println(5+".- volver atras");
    }
    public void verificarPuertaPasillo(int opcion){
        Elemento elementoInical = ambienteActual.getElemento(opcion);
        if (!((Puerta) elementoInical).getUtilizado()){
            ((Puerta) elementoInical).setUtilizado(true);
            setAmbienteActual(((Puerta) elementoInical).getAmbienteOrigen());
        }else{
            ((Puerta) elementoInical).setUtilizado(false);
            setAmbienteActual(((Puerta) elementoInical).getAmbienteDestino());
        }
    }
    public void volverAtras(){
        Elemento elementAmbiente = ambienteActual.getElemento(0);
        setAmbienteActual(((Puerta) elementAmbiente).getAmbienteDestino());
        ((Puerta)elementAmbiente).setUtilizado(false);
    }
}
