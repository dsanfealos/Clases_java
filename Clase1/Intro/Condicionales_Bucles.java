package Intro;

public class Condicionales_Bucles {
    public static void main(String[] args) {
        //Condicionales
        //if
        int x = 5;
        int y = 3;
        if (x>y){
            System.out.println("X es mayor que y");
        }else if(x == y){
            System.out.println("Son iguales.");
        }else{
            System.out.println("X es menor que y");
        }

        //switch
        int nota = 7;
        switch (nota){
            case 5:
                System.out.println("Aprobado");
                break;
            case 6:
                System.out.println("Bien");
                break;
            case 7, 8:
                System.out.println("Notable");
                break;
            case 9, 10:
                System.out.println("Excelente");
                break;
            default:
                System.out.println("Suspenso");
                break;
        }

        //Bucles
        //while (do)
        boolean dia = true;
        int hora = 14;
        while (dia){
            if (hora >= 20){
                dia = false;
                System.out.println("No es de día, ya son las " + hora);
            }
            if (hora < 20){
                System.out.println("Es de día, puedo gritar, son las " + hora);
            }
            hora++;
        }
        System.out.println("-----------------------");

        //do while
        hora = 14;
        dia = true;
        do {
            if (hora >= 20){
                dia = false;
                System.out.println("No es de día, ya son las " + hora);
            }
            if (hora < 20){
                System.out.println("Es de día, puedo gritar, son las " + hora);
            }
            hora++;
        }while (dia);

        //for
        for (int i = 1; i < 10; i++){
            System.out.println("Tengo " + i + " manzanas.");
        }

        //foreach
        int[] array = {1,2,3,4,5};

        for (int numero: array){
            System.out.println(numero);
        }
    }

}
