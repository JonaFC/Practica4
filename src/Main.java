import Builder.Builder;
import Builder.NaveBuilder;
import Builder.PrebuiltShip;
import Nave.ComponentesNave.Arma.Arma;
import Nave.ComponentesNave.Arma.LaserDestructor;
import Nave.ComponentesNave.Arma.LaserSimple;
import Nave.ComponentesNave.Arma.MisilesDePlasma;
import Nave.ComponentesNave.Blindaje.Blindaje;
import Nave.ComponentesNave.Blindaje.BlindajeFortaleza;
import Nave.ComponentesNave.Blindaje.BlindajeReforzado;
import Nave.ComponentesNave.Blindaje.BlindajeSimple;
import Nave.ComponentesNave.Cabina.Cabina;
import Nave.ComponentesNave.Cabina.CabinaEjercito;
import Nave.ComponentesNave.Cabina.CabinaPiloto;
import Nave.ComponentesNave.Cabina.CabinaTripulacion;
import Nave.ComponentesNave.Propulsion.SistemaDePropulsion;
import Nave.ComponentesNave.Propulsion.ViajeIntercontinental;
import Nave.ComponentesNave.Propulsion.ViajeIntergalactico;
import Nave.ComponentesNave.Propulsion.ViajeInterplanetario;
import Nave.Nave;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {

    public static double obtenerDinero(){

        Scanner scannerDouble = new Scanner(System.in);
        double presupuesto;


        while (true){
            try {
                System.out.print("Introduce tú presupuesto \uD83E\uDD11: ");
                presupuesto = scannerDouble.nextDouble();
                if (presupuesto <= 0){
                    System.out.print("\nNo puedes introducir valores negativos.\n");
                    continue;
                }
                return presupuesto;
            }
            catch (InputMismatchException e){
                System.out.print("\n Solo puedes introducir números.\n Vuelve a intentarlo.\n\n");
                scannerDouble.next();
            }
        }
    }

    public static int obtenerElección(String componentes){

        Scanner scannerInt = new Scanner(System.in);
        int elección;

        while (true){
            try {
                System.out.print(componentes);
                System.out.print("Introduce tú elección: ");
                elección = scannerInt.nextInt();
                if (elección > 3 || elección < 1){
                    System.out.print("\nSelecciona una opción válida.\n");
                    continue;
                }
                return elección;
            }
            catch (InputMismatchException e){
                System.out.print("\nSolo puedes introducir números.\nVuelve a intentarlo\n\n");
                scannerInt.next();
            }
        }
    }

    public static SistemaDePropulsion elegirSistemaPropulsión(int elección){
        return switch (elección) {
            case 1 -> new ViajeIntercontinental();
            case 2 -> new ViajeIntergalactico();
            case 3 -> new ViajeInterplanetario();
            default -> null;
        };
    }

    public static Blindaje elegirBlindaje(int elección){
        return switch (elección){
            case 1 -> new BlindajeFortaleza();
            case 2 -> new BlindajeReforzado();
            case 3 -> new BlindajeSimple();
            default -> null;
        };
    }

    public static Cabina elegirCabina(int elección){
        return switch (elección){
            case 1 -> new CabinaEjercito();
            case 2 -> new CabinaPiloto();
            case 3 -> new CabinaTripulacion();
            default -> null;
        };
    }

    public static Arma elegirArma(int elección){
        return switch (elección){
            case 1 -> new LaserDestructor();
            case 2 -> new LaserSimple();
            case 3 -> new MisilesDePlasma();
            default -> null;
        };
    }

    public static void main(String[] args) {


        double presupuesto = 0;
        double costo;

        System.out.println("\n**** ⍟ Bienvenido al Sistema de Creación de Naves del Imperio Galáctico ⍟ ****\n");
        presupuesto = obtenerDinero(); // PREGUNTAR POR PRESUPUESTO.

        while (true){

            Scanner scannerString = new Scanner(System.in);
            Builder builder = new NaveBuilder();
            String elección;

            // MOSTRAR COMPONENTES DISPONIBLES Y ELEGIR LOS COMPONENTES.
            System.out.print("\n**** Componentes Disponibles para la creación de la nave \uD83C\uDFD7 ***+\n");
            builder.addComponent(elegirSistemaPropulsión(obtenerElección("\n *** \uD83D\uDD25 Sistemas de Propulsión \uD83D\uDE80 ***\n1.- Viaje Intercontinental \uD83D\uDDFA\n2.- Viaje Intergaláctico \uD83C\uDF0C\n3.- Viaje Interplanetario \uD83E\uDE90\n"))); //  SISTEMA DE PROPULSIÓN.
            builder.addComponent(elegirBlindaje(obtenerElección("\n *** \uD83D\uDEE1 Blindaje ***\n1.- Fortaleza \uD83C\uDFEF\n2.- Reforzado \uD83C\uDFF0\n3.- Simple \uD83C\uDFE0\n"))); // BLINDAJE
            builder.addComponent(elegirCabina(obtenerElección("\n *** Cabina \uD83D\uDCBA ***\n1.- Ejército \uD83E\uDDBE\n2.- Pequeña\n3.- Tripulación\n"))); // CABINA.
            builder.addComponent(elegirArma(obtenerElección("\n *** Armas \uD83D\uDD2B\n1.- Láser destructor de planetas \uD83C\uDF0D \uD83D\uDD28\n2.- Láser simple \uD83E\uDE9B\n3.- Misiles de plasma\n"))); // ARMAS.

            Nave nave = builder.build(); // CREANDO LA NAVE.

            System.out.print("\n **** \uD83D\uDE80 MOSTRAR NAVE \uD83D\uDD28 ****\n");
            System.out.print(nave.mostrarNave()); // MOSTRAR NAVE.


            costo = nave.costoNave();   // MOSTRAR PRECIO.
            System.out.print("\n*** \uD83D\uDCB8 PRECIO DE LA NAVE: " + costo + " ***\n");


            if (costo <= presupuesto){
                System.out.print("\nAPROBADO ✅\nTú nave está lista para recoger, estas son sus características, paga en la caja la cantidad de " +
                        costo + "\n");
                break;
            }
            else {
                double diferencia = costo - presupuesto;
                System.out.print("\nEl costo de tu nave sobrepasa tu presupuesto por " + diferencia  + ".\n¿Deseas diseñar otra nave o ver nuestro catálogo?(DISEÑAR/VER): ");
                elección = scannerString.nextLine();
                while (true){
                    if (elección.equals("VER") || elección.equals("DISEÑAR")){
                        break;
                    }
                    System.out.print("\nSolo puedes introducir DISEÑAR/VER: ");
                    elección = scannerString.nextLine();
                }

                if (elección.equals("DISEÑAR")){
                    continue;
                }

                PrebuiltShip prebuiltShip = new PrebuiltShip();
                System.out.print("\nNaves");
                nave = prebuiltShip.construct(obtenerElección("\n1.- Nave Individual de Combate \uD83E\uDD4A\n2.- Nave Militar de Transporte  \uD83C\uDF96\n3.- Base Especial de Guerra \uD83D\uDEF8\n"));

                System.out.print("\n **** \uD83D\uDE80 MOSTRAR NAVE \uD83D\uDD28 ****\n");
                System.out.print(nave.mostrarNave()); // MOSTRAR NAVE.


                costo = nave.costoNave();   // MOSTRAR PRECIO.
                System.out.print("\n*** \uD83D\uDCB8 PRECIO DE LA NAVE: " + costo + " ***\n");

                if (costo <= presupuesto){
                    System.out.print("\nAPROBADO ✅\nTú nave está lista para recoger, estas son sus características, paga en la caja la cantidad de " +
                            costo + "\n");
                }
                else {
                    System.out.print("\nLo siento pero NO tienes el dinero suficiente para comprar la nave.\nSimulación Terminada.\n");
                }
                break;
            }

        }
    }
}