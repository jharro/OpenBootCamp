package cursojavabasico;

public class EjercicioTema3 {
    public static void main(String[] args) {
        String[] nombres = {"Pedro", "Ana", "Ricardo", "Laura"};
        System.out.println("Imprimiendo texto concatenado");
        for (int i = 0; i < nombres.length; i++) {
            System.out.println("Valor en posición "+i+" : "+nombres[i]);
        }
    }
}
