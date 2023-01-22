package curso.OperadoresEnJava;

public class operadoresAritmeticos {
    public static void main(String[] args) {
        // No se pueden utilizar mas variables en un var
        // var a = 3, b = 2;
        // Suma:
        int a = 3, b = 2;
        var result1 = a + b;
        System.out.println("result1 = " + result1);
        // Resta:
        result1 = a - b;
        System.out.println("result2 = " + result1);
        // Multiplicacion
        result1 = a * b;
        System.out.println("result3 = " + result1);
        // División:
        result1 = a / b;
        System.out.println("result4 = " + result1); // Imprime un entero por que se definió como var
        var result5 = 3F / b;
        System.out.println("result5 = " + result5);
        // Módulo
        result1 = a % b;
        System.out.println("result6 = " + result1);

        // Ejercicio: Par o Impar
        if (b % 2 == 0)
            System.out.println("Par.");
        else
            System.out.println("Impar.");
    }
}
