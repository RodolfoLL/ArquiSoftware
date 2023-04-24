package juego.editor;

import java.util.List;

public class Puerta extends Elemento{
    private Ambiente ambienteDestino;
    private Ambiente ambienteOrigen;
    private Boolean encontrado;
    private String typeElement;

    public Puerta(String nombreElemento){
        this.nombreElemento = nombreElemento;
        this.encontrado = false;
        this.typeElement = "Puerta";
    }
    public String getTipoElement(){
        return typeElement;
    }

    public Ambiente getAmbienteDestino(){
        return ambienteDestino;
    }
    public Ambiente getAmbienteOrigen(){
        return ambienteOrigen;
    }
    public void agregarAmbienteDestino(Ambiente ambienteDestino){
        this.ambienteDestino = ambienteDestino;
    }
    public void agregarAmbienteOrigen(Ambiente ambienteOrigen){
        this.ambienteOrigen = ambienteOrigen;
    }

    @Override
    public String getNombreElemento() {
        return nombreElemento;
    }


    public Boolean encontrado(){
        return encontrado;
    }
    public Boolean getEncontrado(){
        return encontrado;
    }
    public void setEncontrado(Boolean nuevoEstado){
        encontrado = nuevoEstado;
    }
}
