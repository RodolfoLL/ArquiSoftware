package juego.editor;

public abstract class Entorno {
    public abstract String getNombreEntorno();
    public abstract void agregarEntorno(Entorno nuevoEntorno);
//    public abstract Entorno buscar(Entorno escenario);
    public abstract Entorno getElementEntorno();
}
