package server.side.java;

import java.util.Scanner;

public class PrePOO {

    public static void matrices() {

        int example[][];
        example = new int[7][9];
        System.out.println("length : " + example.length + " * " + example[0].length);
        for (int i = 0; i < example.length; i++) {
            System.out.print("|");
            for (int j = 0; j < example[0].length; j++) {
                example[i][j] = (i + j) + 33;
                System.out.print(example[i][j]);
                System.out.print("|");
            }
            System.out.println("");
        }
    }

    public static void array() {
        int x[];
        x = new int[3];
        x[0] = 2;
        x[1] = 100;
        x[2] = 200;

        int y[] = {2, 4, 6, 8};

        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i]);
        }
    }

    public static void switchCase() {
        int x = 0;
        x = 0;
        switch (x) {
            case 0: {
                System.out.println("Option 0");
            }
            case 1: {
                System.out.println("Option 1");
            }
            default: {
                break;
            }
        }
    }

    public static void breakAndContinue() {
        for (int i = 0; i <= 10; i++) {
            //break; cortar un ciclo
            //continue; nos devuelve al inicio del ciclo sin continuar con las instrcuciones que le faltaban al ciclo
        }
    }

    public static void pedirDatos() {
        //esta clase permite leer datos por teclado
        Scanner read = new Scanner(System.in);
        //solicitamos los datos del usuario
        System.out.println("Nombre de usuario: ");
        String nombreUsuario = read.nextLine();
        System.out.println("Celular: ");
        String celular = read.nextLine();
        System.out.println("Edad: ");
        int age = read.nextInt();
        //mostrar datos del usuario en pantalla
        System.out.println("Bienvenido señor " + nombreUsuario + ", es un placer para nosotros contar con una persona de " + age + " años.\n" + "\n" + "Próximamente nos comunicaremos con usted al numero " + celular + ".\n" + "\n" + "Feliz día");
    }
}
