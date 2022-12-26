package condicional;

public class EjercicioTema4 {
    public static void main(String[] args) {
        int numeroIf=0;
        if (numeroIf == 0) {
            System.out.println("Es igual a 0");

        } else if (numeroIf>0) {
            System.out.println("Es mayor que 0");
        } else{
            System.out.println("Es menor que 0");
        }

        //While
        int numeroWhile=0;
        while (numeroWhile<3){
            numeroWhile++;
            System.out.println(numeroWhile);

        }
        //do while
        numeroWhile=3;
        do {
            System.out.println(numeroWhile);
            numeroWhile++;

        }while(numeroWhile<3);
    //for
        for (int numeroFor=0;numeroFor<=3;numeroFor++){
            System.out.println(numeroFor);
        }
        String estacion="verano";
        switch (estacion){
            case "primavera":
                System.out.println("ESTAMOS EN PRIMAVERA");
                break;
            case "verano":
                System.out.println("ESTAMOS EN VERANO");
                break;
            case "invierno":
                System.out.println("ESTAMOS EN INVIERNO");
                break;
            case "otoño":
                System.out.println("ESTAMOS EN OTOÑO");
                break;
            default:
                System.out.println("Estación no válida");
        }
    }
}
