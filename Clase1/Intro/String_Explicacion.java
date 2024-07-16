package Intro;

public class String_Explicacion {
    public static void main(String[] args) {
        String texto = "Este es mi texto";
        String texto2 = "este es mi texto";
        //Longitud
        System.out.println(texto.length());
        //Igual
        System.out.println(texto.equals(texto2));
        //Ignorar mayúsculas
        System.out.println(texto.equalsIgnoreCase(texto2));
        //Encontrar caracter
        System.out.println(texto.charAt(5));
        System.out.println(texto.lastIndexOf('e'));
        //Cortar
        System.out.println(texto.substring(8,10));

    }
}
