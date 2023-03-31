package juego.editor;

public interface Entorno {
    public String getNombreEntorno();
    public void agregarEntorno(Entorno nuevoEntorno);
    public Entorno buscar(Entorno escenario,String  nombreAmbiente);
    public Entorno getEntornoList();
}
