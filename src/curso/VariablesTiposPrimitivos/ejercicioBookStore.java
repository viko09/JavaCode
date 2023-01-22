package curso.VariablesTiposPrimitivos;

import java.util.Scanner;

public class ejercicioBookStore {
    public static void main(String[] args) {
        System.out.println("Proporciona el nombre: ");
        Scanner inputOne = new Scanner(System.in);
        String bookTitle = inputOne.nextLine();

        System.out.println("Proporciona el id: ");
        Scanner inputTwo = new Scanner(System.in);
        int bookId = Integer.parseInt(inputTwo.nextLine());

        System.out.println("Proporciona el precio: ");
        Scanner precio = new Scanner(System.in);
        double costo = precio.nextDouble();

        System.out.println("Proporciona el envio gratuito: ");
        System.out.println((costo>499));

        System.out.println(bookTitle + " #" + bookId);
        System.out.println("Precio: $"+ costo);

        System.out.println("Envio Gratuito: "+ (costo>499));

        // -----------SOLUCION DEL CURSO----------------
        Scanner scanner = new Scanner(System.in);
        System.out.println("Proporciona el nombre:");
        String nombre = scanner.nextLine();
        System.out.println("Proporciona el id:");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Proporciona el precio:");
        double prezio = Double.parseDouble(scanner.nextLine());
        System.out.println("Proporciona el envio gratuito:");
        boolean envioGratuito = Boolean.parseBoolean(scanner.nextLine());

        System.out.println(nombre + " #" + id);
        System.out.println("Precio: $" + prezio);
        System.out.println("Envio Gratuito: " + envioGratuito);
    }
}
