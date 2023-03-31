package juego;

import juego.editor.Editor;
import juego.editor.Entorno;
import juego.simulador.Simulador;

public class Main {
    public static void main(String[] args) {
        Editor editor = new Editor();
        Entorno entorno = editor.getEntorno();
        Simulador simulador = new Simulador(entorno);
        simulador.run();
    }
}