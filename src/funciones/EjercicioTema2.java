package cursojavabasico;

public class EjercicioTema2 {
    public static void main(String[] args) {

            double precioInicial=1000;
        System.out.println("Precio + IVA - > "+calculaIVA(precioInicial));
    }

    public static double calculaIVA(double precio){
        return precio+(precio*0.019);
    }
}
