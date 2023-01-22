package curso.OperadoresEnJava;

public class operadoresUnarios {
    public static void main(String[] args) {
        // Operador: -
        var a = 3;
        var b = -a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        // Operador: Negación
        var c = true;
        var d = !c; // Invertir True a False
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        // Incremento
        // 1. Preincremento: lleva el simbolo antes de la variable
        var e = 3;
        var f = ++e; // primero se incrementa la variable e y luego se usa el valor (++ solo aumenta 1)
        System.out.println("e = " + e);
        System.out.println("f = " + f);
        // 2. Postincremento: lleva el simbolo despues de la variable
        var g = 5;
        var h = g++; // primero se usa el valor de g y luego se incrementa (++ solo aumenta 1)
        System.out.println("g = " + g);
        System.out.println("h = " + h);
        // Decremento
        // 1. Predecremento: lleva el simbolo antes de la variable
        var i= 2;
        var j = --i; // primero se decrementa la variable i y luego se usa el valor j (-- solo resta 1)
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        // 2. Postdecremento: lleva el simbolo despues de la variable
        var k = 5;
        var l = k--; // primero se usa el valor de k y luego se decrementa (-- solo resta 1)
        System.out.println("k = " + k);
        System.out.println("l = " + l);
    }
}
