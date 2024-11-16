import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("JASSIR YANCES SALGADO");
        System.out.println("7502410016");
        System.out.println("*****************************");

        System.out.println();

        Scanner scanner = new Scanner(System.in);

        Libro Libro1 = new Libro();
        System.out.println("Detalles Del Libro Por Defecto = ");
        System.out.println();
        System.out.println(Libro1);

        System.out.println("\nIngrese el Titulo del Libro = ");
        String Titulo = scanner.nextLine();
        System.out.println("\nIngrese el Autor del Libro = ");
        String Autor = scanner.nextLine();
        System.out.println("\nIngrese el Numero de Paginas = ");
        int NumeroPaginas = scanner.nextInt();

        scanner.nextLine();

        Libro Libro2 = new Libro(Titulo, Autor, NumeroPaginas);
        System.out.println();
        System.out.println("Detalles del Libro Personalizado = ");
        System.out.println();
        System.out.println(Libro2);
        System.out.println();
        System.out.println();

        try {
            Thread.sleep(2000); // Pausa
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        CuentaBancaria CuentaBancaria1 = new CuentaBancaria();
        System.out.println("Detalles de la Cuenta por Defecto = ");
        System.out.println();
        System.out.println(CuentaBancaria1);

        System.out.println("\nIngrese el Numero de Cuenta = ");
        String NumeroCuenta = scanner.nextLine();
        System.out.println("\nIngrese el Saldo Inicial = ");
        Double Saldo = scanner.nextDouble();

        scanner.nextLine();

        System.out.println("\nIngrese el Tipo de Cuenta (Ahorros, Corriente) = ");
        String TipoCuenta = scanner.nextLine();

        CuentaBancaria CuentaBancaria2 = new CuentaBancaria(NumeroCuenta, Saldo, TipoCuenta);
        System.out.println();
        System.out.println("Detalles de la Cuenta Personalizada = ");
        System.out.println();
        System.out.println(CuentaBancaria2);
        System.out.println();
        System.out.println();


        try {
            Thread.sleep(2000); // Pausa
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        Estudiante Estudiante1 = new Estudiante();
        System.out.println("Detalles del Estudiante (Por Defecto) = ");
        System.out.println();
        System.out.println(Estudiante1);

        System.out.println("\nIngrese El Nombre del Estudiante = ");
        String Nombre = scanner.nextLine();
        System.out.println("\nIngrese la Edad del Estudiante");
        int EdadEstudiante = scanner.nextInt();

        scanner.nextLine();

        System.out.println("\nIngrese el Curso del Estudiante = ");
        String CursoEstudiante = scanner.nextLine();
        Estudiante Estudiante2 = new Estudiante(Nombre, EdadEstudiante, CursoEstudiante);

        System.out.println("Detalles del Estudiante Personalizado = ");
        System.out.println();
        System.out.println(Estudiante2);
        System.out.println();
        System.out.println();

        scanner.close();

        try {
            Thread.sleep(2000); // Pausa
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        System.out.println("Ahora se Mostrarán cada Clase Tanto Por defecto, como Personalizada");

        try {
            Thread.sleep(2000); // Pausa
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Primero los que son Por defecto");

        try {
            Thread.sleep(2000); // Pausa
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println();
        System.out.println(Libro1);
        System.out.println();
        System.out.println(CuentaBancaria1);
        System.out.println();
        System.out.println(Estudiante1);
        System.out.println();

        try {
            Thread.sleep(2000); // Pausa
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Ahora los Personalizados = ");

        try {
            Thread.sleep(2000); // Pausa
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println();
        System.out.println(Libro2);
        System.out.println();
        System.out.println(CuentaBancaria2);
        System.out.println();
        System.out.println(Estudiante2);
        System.out.println();

        try {
            Thread.sleep(2000); // Pausa
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Gracias por elegirnos, Tenga un buen Dia");










    }
}
