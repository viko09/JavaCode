package curso.VariablesTiposPrimitivos;

import java.util.Scanner;

public class inferenciaVaryPrimitivos {
    public static void main(String[] args) {
        // Punto de ruptura: Debe ser en una linea de codigo que pueda ser ejecutada
        // Inferencia de tipos
        // Tipos Primitivos: Numéricos
        var numeroEntero = 10;
        System.out.println("Número entero: " + numeroEntero);

        var numDouble = 0.1;
        System.out.println("Número double: " + numDouble);

        var numFloat = 0.1011F;
        System.out.println("Número Float: " + numFloat);
        // Tipos Primitivos: Char, Strings
        // El tipo char tiene 16 bits lo mismo que un short
        char miChar = 'a';
        System.out.println("Mi elección fué: " + miChar);
        char varCharUnicode = '\u0021';
        System.out.println("Variable con UNICODE: " + varCharUnicode);
        char varCharDecimal = 33;
        System.out.println("Variable con DECIMAL: " + varCharDecimal);
        char varCharSymbol = '!';
        System.out.println("Variable con Símbolo: " + varCharSymbol);

        var varCharUnicode1 = '\u0021';
        System.out.println("Variable con UNICODE: " + varCharUnicode1);
        var varCharDecimal1 = 33; // No se puede con var pq relaciona con un int
        System.out.println("Variable con DECIMAL: " + varCharDecimal1);
        var varCharSymbol1 = '!';
        System.out.println("Variable con Símbolo: " + varCharSymbol1);

        // Un int puede guardar un char pero se convierte a decimal al imprimir
        int variableSym = '!';
        System.out.println("variableSym = " + variableSym);

        int letra = 'a';
        System.out.println("letra = " + letra);

        // Tipo Booleano:
        boolean varBool = true; // Valores de tipo bandera
        System.out.println("varBool = " + varBool);

        if (varBool == true) {
            System.out.println("Verdad");
        } else {
            System.out.println("Falso");
        }
        if (varBool) {
            System.out.println("Verdad");
        } else {
            System.out.println("Falso");
        }

        var edad = 30;
        var adult = edad >= 18;
        if (adult) {
            System.out.println("Mayor de edad");
        } else {
            System.out.println("Menor de edad");
        }

        // Conversiones de Tipos:
        // String to Int
        var edadA = "34";
        var edadB = Integer.parseInt("34");
        System.out.println("edadA = " + edadA);
        System.out.println("edadA = " + (edadA + 1));
        System.out.println("edadB = " + edadB);
        System.out.println("edadB = " + (edadB + 1));

        var valorPi = Double.parseDouble("3.141516");
        System.out.println("valorPi = " + valorPi);

        // Con la clase Scanner y su metodo nextLine regresa un tipo string
        // Pedir valor con Scanner
        var consolita = new Scanner(System.in);
        System.out.println("Escribe tu edad: ");
        edadB = Integer.parseInt(consolita.nextLine());
        System.out.println("Edade = " + edadB);

        // Conversion
        var edadTexto = String.valueOf(10);
        System.out.println("edadTexto = " + edadTexto);

        var character1 = "holas".charAt(2);
        System.out.println("character1 = " + character1);
        var character2 = "holas".charAt(3);
        System.out.println("character2 = " + character2);

        System.out.println("Escribe un caracter: ");
        character1 = consolita.nextLine().charAt(3);

        System.out.println("character1 = " + character1);

    }
}
