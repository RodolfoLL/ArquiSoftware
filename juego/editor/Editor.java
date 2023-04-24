package juego.editor;

public class Editor {
    public Entorno getEntorno() {
        return getEscenarioDePrueba();
    }

    private  Entorno getEscenarioDePrueba() {
        Entorno escenarioPrincipal  = new Escenario("Departamento Info Sis");
        Entorno miEscenario = new Escenario("Planta Baja");
        Entorno ambiente1 = new Ambiente("Laboratorio1");
        Entorno ambiente2 = new Ambiente("Auditorio");
        Entorno ambiente3 = new Ambiente("Laboratorio de redes");
        Entorno ambiente4 = new Ambiente("Administracion");
        Entorno ambiente5 = new Ambiente("pasillo");
        Elemento puerta1 = new Puerta("plaboratorio1");
        Elemento puerta2 =  new Puerta("pauditorio");
        Elemento puerta3 = new Puerta("plaboredes");
        Elemento puerta4 = new Puerta("padministracion");
        Elemento puerta5 = new Puerta("pasillo");

        agregarPuertaDestino(puerta1,ambiente5);
        agregarPuertaDestino(puerta2,ambiente5);
        agregarPuertaDestino(puerta3,ambiente5);
        agregarPuertaDestino(puerta4,ambiente5);
        agregarPuertaOrigen(puerta1,ambiente1);
        agregarPuertaOrigen(puerta2,ambiente2);
        agregarPuertaOrigen(puerta3,ambiente3);
        agregarPuertaOrigen(puerta4,ambiente4);

        agregarElementoAmbiente(puerta1,ambiente1);
        agregarElementoAmbiente(puerta2,ambiente2);
        agregarElementoAmbiente(puerta3,ambiente3);
        agregarElementoAmbiente(puerta4,ambiente4);
        agregarElementoAmbiente(puerta1,ambiente5);
        agregarElementoAmbiente(puerta2,ambiente5);
        agregarElementoAmbiente(puerta3,ambiente5);
        agregarElementoAmbiente(puerta4,ambiente5);

        miEscenario.agregarEntorno(ambiente1);
        miEscenario.agregarEntorno(ambiente2);
        miEscenario.agregarEntorno(ambiente5);
        miEscenario.agregarEntorno(ambiente3);
        miEscenario.agregarEntorno(ambiente4);
        escenarioPrincipal.agregarEntorno(miEscenario);

        return escenarioPrincipal;
    }
    private void agregarElementoAmbiente(Elemento nuevoElemento,Entorno miAmbiente){
        if(miAmbiente instanceof Ambiente){
            ((Ambiente) miAmbiente).agregarElemento(nuevoElemento);
        }
    }
    private void agregarPuertaDestino(Elemento puerta,Entorno destino){
        if(puerta instanceof Puerta && destino instanceof Ambiente){
            ((Puerta) puerta).agregarAmbienteDestino((Ambiente) destino);
        }
    }
    private void agregarPuertaOrigen(Elemento puerta,Entorno origen){
        if(puerta instanceof  Puerta && origen instanceof Ambiente){
            ((Puerta) puerta).agregarAmbienteOrigen((Ambiente) origen);
        }
    }


}
