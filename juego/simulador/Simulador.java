package juego.simulador;


import juego.editor.Ambiente;
import juego.editor.Entorno;
import juego.editor.Escenario;
import java.util.Scanner;

public class Simulador {
    private Personaje miPersonaje;
    private Entorno miEntorno;
    private Boolean enJuego;
    private Scanner sc;

    public Simulador(Entorno entorno) {
        this.miPersonaje = new Personaje("P1");
        this.miEntorno = entorno;
        sc = new Scanner(System.in);
        enJuego = true;
    }
    public Entorno getMiEntorno(){
        Entorno res = null;
        Entorno entornoInicio = miEntorno.getEntornoList();
        if(entornoInicio instanceof Escenario){
            res =entornoInicio;
        }
        return res;
    }

    public void run()  {
        System.out.println("Simulador corriendo");
        Entorno inicio = getMiEntorno();
        if (inicio instanceof Escenario){
            System.out.println("Estamos en el escenario: "+ inicio.getNombreEntorno());
            miPersonaje.setAmbienteActual((Ambiente) inicio.getEntornoList());
            miPersonaje.mostrarAmbiente();
            miPersonaje.mostrarElementosAmbientes();
        }
        while(enJuego){
            System.out.println("Introduzca un numero para ir a un ambiente:");
            int opcion = sc.nextInt();
            if(opcion < 6){
                miPersonaje.Mover(opcion-1);
                System.out.println("Utilizaste la " + miPersonaje.getAmbienteActual().getElemento(0).getNombreElemento());
                miPersonaje.mostrarAmbiente();
                miPersonaje.mostrarElementosAmbientes();
            }else{
                enJuego = false;
            }
        }
        System.out.println("Navegacion terminada");

    }


}
