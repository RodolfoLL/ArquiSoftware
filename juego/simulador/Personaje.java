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
    public void setAmbienteActual(Ambiente actual){
        this.ambienteActual = actual;
    }
    public void Mover(int opcion){
        if(opcion == 4){
            volverAtras();
        }else{
            if(!ambienteActual.getNombreEntorno().equals("pasillo")){
                Elemento inicial = ambienteActual.getElemento(0);
                if(inicial instanceof Puerta){
                    inicial.setEncontrado(true);
                    this.ambienteActual = ((Puerta) inicial).getAmbienteDestino();
                }
            }else{
                verificarPuertaPasillo(opcion);
            }
        }
    }
    public void mostrarAmbiente(){
        System.out.println("el personaje "+idPersonaje+" "+"esta en el ambiente "+ambienteActual.getNombreEntorno());
        mostrarElementosAmbientes();
    }
    private void mostrarElementosAmbientes(){
        int tamanio = ambienteActual.getMisElementos().size();
        for (int i = 0; i < tamanio; i++) {
            String nombreElemento = ambienteActual.getElemento(i).getNombreElemento();
            System.out.println(i+1+".- "+nombreElemento);
        }
        System.out.println(5+".- volver atras");
    }
    private void verificarPuertaPasillo(int opcion){
        Elemento elementoInical = ambienteActual.getElemento(opcion);
        if (!elementoInical.encontrado() && elementoInical instanceof Puerta){
            elementoInical.setEncontrado(true);
            this.ambienteActual = elementoInical.getAmbienteOrigen();
        }else{
            elementoInical.setEncontrado(false);
            this.ambienteActual = ((Puerta)elementoInical).getAmbienteDestino();
        }
    }
    private void volverAtras(){
        Elemento elementAmbiente = ambienteActual.getElemento(0);
        this.ambienteActual = ((Puerta)elementAmbiente).getAmbienteDestino();
        elementAmbiente.setEncontrado(false);
    }
}
