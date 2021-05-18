import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
        //esta clase permite leer datos por teclado
        Scanner leer = new Scanner(System.in);
        //solicitamos los datos del usuario
        System.out.println("Nombre de usuario: ");
        String nombreUsuario = leer.nextLine();
        System.out.println("Celular: ");
        String celular = leer.nextLine();
        System.out.println("Edad: ");
        int edad = leer.nextInt();
        //mostrar datos en pantalla
        System.out.println("Bienvenido señor " + nombreUsuario + ", es un placer para nosotros contar con una persona de " + edad + " años.\n" + "\n" + "Próximamente nos comunicaremos con usted al numero " + celular + ".\n" + "\n" + "Feliz día");
    }
}
