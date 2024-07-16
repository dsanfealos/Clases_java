package Intro;

public class Arrays {

    public static void main(String[] args) {
        String[] colores = {"azul", "rojo", "amarillo", "verde"};
        String[] coches = new String[5];

        System.out.println("El segundo color es " + colores[1]);
        //Ver
        for (String color:colores){
            System.out.println(color);
        }

        for (int i = 0; i < colores.length; i++){
            System.out.println(colores[i]);
        }
        System.out.println("---------------------------");

        //Cambiar o asignar valores
        colores[0] = "morado";
        for (String color:colores){
            System.out.println(color);
        }
        System.out.println("---------------------------");

        //Matriz inversa
        for (int i = colores.length-1; i >= 0; i--){
            System.out.println(colores[i]);
        }
    }



}
