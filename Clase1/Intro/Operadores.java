package Intro;

public class Operadores {
    public static void main(String[] args) {
        //Basicos
        int x = 5;
        int y = 3;

        int resultado = 0;

        resultado = x + y;
        resultado = x - y;
        resultado = x * y;
        resultado = x / y;
        resultado = x % y;  //modulo

        //Sobre sí mismos
         x++;   // Es igual a x = x+1
         y--;

         //Comparación
        boolean comparacion = false;
        comparacion = x == y;
        comparacion = x < y;
        comparacion = x > y;
        comparacion = x <= y;
        comparacion = x != y;
    }

}
