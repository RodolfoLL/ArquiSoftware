package juego.editor;

import java.util.List;

public class Puerta extends Elemento{
    private Ambiente ambienteDestino;
    private Ambiente ambienteOrigen;
    private Boolean utilizado;

    public Puerta(String nombreElemento){
        this.nombreElemento = nombreElemento;
        this.utilizado = false;
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


    public Boolean getUtilizado(){
        return utilizado;
    }
    public void setUtilizado(Boolean estado){
        utilizado = estado;
    }
}
