package curso.OperadoresEnJava;

public class operadoresAsignacion {
    public static void main(String[] args) {
        int a = 3, b = 2, c = a + 5 - b;
        System.out.println("c = " + c);
        // Asignación: = , ==
        float niuB = 3.5F;
        System.out.println("b = " + niuB);
        // Composición
        a += 1; // a = a + 1
        System.out.println("a = " + a);
        a += 3; // a = a + 3
        System.out.println("a = " + a);
        a -= 1; // a = a - 1
        System.out.println("a = " + a);
        // *= , /= , %=
    }
}
