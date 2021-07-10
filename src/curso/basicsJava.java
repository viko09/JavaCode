package curso;

import java.util.Scanner;

public class basicsJava {
    public static void main(String[] args) {
        System.out.println("Hola mundito :)");
    /* Variables:
        Variables primitivas
            Enteros y flotantes (int and float)
     */
    // Declaramos e imprimimos una variable
        int myIntVar = 4;
        System.out.println(myIntVar);
    // Una vez definida una variable se puede usar sin declarar y se puede modificar
        myIntVar = 5;
        System.out.println(myIntVar);
        System.out.println("------------------------------------------");
/*
Atajos:
sout + tab: auto escribe la funcion para imprimir texto
Ctrl + click: nos lleva a la definición de la variable
 */
    // Variable cadena
        String myStringVar = "Saludos";
        System.out.println(myStringVar);

        myStringVar = "Adios";
        System.out.println(myStringVar);
        System.out.println("------------------------------------------");
        /* Uso de la palabra reservada var:
        var - infiere que variable usar
         */

        var myVar_two = 20;
        System.out.println(myVar_two);
        
        var myString_two = "Este es una linea";
        System.out.println("myString_two = " + myString_two);
// soutv : concatenar cadenas
        System.out.println("------------------------------------------");
        /*
        REGLAS PARA DEFINIR UNA VARIABLE EN JAVA
            el primer caracter puede ser: a-z
            el primer caracter NO puede ser: A-Z, no usar numeros al inicio, no usar acentos
            no se usan palabras reservadas
         */

        var user = "Victor";
        var degree = "Licenciado";

        var union = user + " " + degree;
        System.out.println("union = " + union);
        System.out.println("------------------------------------------");
        // Suma de enteros (varibles)
        var i = 3;
        var j = 18;
        System.out.println("i + j = " + (i + j)); // Modifica la prioridad de la evaluacion
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        // Contexto cadena *
        System.out.println(i + j + user);
        System.out.println(user + i + j); //* Contexto cadena

        System.out.println("------------------------------------------");
// Caracteres especiales
        var nombre = "Adriana";
        System.out.println("New Line: \n" + nombre); // \n da un salto de línea en la consola
        System.out.println("Tab: \t" + nombre);
        System.out.println("Retroceso: \b\b" + nombre);
        System.out.println("Comilla Simple: '" + nombre + "'");
        System.out.println("Comilla Doble: \"" +nombre + "\"");
        System.out.println("------------------------------------------");

    // Clase Scanner en Java
        System.out.println("Escribe tu nombre: ");
        Scanner console = new Scanner(System.in);
        var userNew = console.nextLine();
        System.out.println("userNew = " + userNew);

        System.out.println("Escribe tu grado actual: ");
        var Degree = console.nextLine();
        System.out.println("Degree = " + Degree + " " + userNew);
        System.out.println("------------------------------------------");

    // Ejercicio de entrada y salida de información:

        System.out.println("Ingrese el título del libro: ");
        Scanner inputOne = new Scanner(System.in);
        var bookTitle = inputOne.nextLine();

        System.out.println("Ingrese el nombre del autor: ");
        var bookAuthor = inputOne.nextLine();
        System.out.println("El Título del Libro es: " + bookTitle);
        System.out.println("El Autor del Libro es: " + bookAuthor);
        System.out.println(bookTitle + " fué escrito por " + bookAuthor);
        System.out.println("------------------------------------------");

        /*
         Tipos Primitivos en Java:

            byte: 8 bits
            short: 16 bits
            int: 32 bits
            long: 64 bits
         */

        // TIPO BYTE

        byte numeroByte = 10;
        // byte numeroByte = (byte) 1099; // Estamos obligando a convertir un numero de tipo entero a byte
        System.out.println("numeroByte = " + numeroByte);
        System.out.println("valor minimo byte: " + Byte.MIN_VALUE);
        System.out.println("valor máximo byte: " + Byte.MAX_VALUE);


        // TIPO SHORT

        short numeroShort = 10000;
        System.out.println("numeroShort = " + numeroShort);
        // short numeroShort2 = (short)32769; // Estamos obligando a convertir un numero de tipo entero a short
        System.out.println("valor minimo short: " + Short.MIN_VALUE);
        System.out.println("valor máximo short: " + Short.MAX_VALUE);

        // TIPO INT

        int numeroInt = 1000000000;
        System.out.println("numeroInt = " + numeroInt);

        // int numeroInt = (int)28484295927581954; Esto no resuelve el problema esta vez

        // int numeroInt = (int)2847421848672856275L; // Esto ya resuelve el problema que se tenia */
        System.out.println("valor minimo int: " + Integer.MIN_VALUE);
        System.out.println("valor máximo int: " + Integer.MAX_VALUE);


        // TIPO LONG

        long numeroLong = 1000000000;
        System.out.println("numeroLong = " + numeroLong);
        /* long numeroLong = (long)28484295927581954; // Esto no resuelve el problema esta vez
        long numeroLong = (long)2847421848672856275 D o F; // Esto ya resuelve el problema que se tenia */
        System.out.println("valor minimo long: " + Long.MIN_VALUE);
        System.out.println("valor máximo long: " + Long.MAX_VALUE);

/*
         Tipos Primitivos en Java:

            float: 32 bits
            double: 64 bits
         */

        // TIPO FLOAT

        // float numeroFloat = 10.0F;
        // float numeroFloat = (float)10.0; valida y sin perdida de precision pero dentro de los limites
        float numeroFloat = 1000000000;
        System.out.println("numeroFloat = " + numeroFloat);
        System.out.println("valor minimo float: " + Float.MIN_VALUE);
        System.out.println("valor máximo float: " + Float.MAX_VALUE);

        // TIPO DOUBLE

        double numeroDouble = 1000000000;
        System.out.println("numeroDouble = " + numeroDouble);
        System.out.println("valor minimo double: " + Double.MIN_VALUE);
        System.out.println("valor máximo double: " + Double.MAX_VALUE);
    }
}