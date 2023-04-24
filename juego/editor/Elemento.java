package juego.editor;

public abstract class Elemento {
    protected String nombreElemento;

    public abstract String getNombreElemento();
    public abstract Ambiente getAmbienteOrigen();
    public abstract Boolean encontrado();
    public abstract void setEncontrado(Boolean estado);
    public abstract String getTipoElement();
}
