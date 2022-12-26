package funciones;

public class ParteDos {
    public static void main(String[] args) {
        Coche miCoche=new Coche();

       miCoche.incrementarPuertas();
        miCoche.incrementarPuertas();
        miCoche.incrementarPuertas();
        miCoche.incrementarPuertas();
        System.out.println(miCoche.nroPuertas);
    }

    public static class Coche{
        public int nroPuertas;

        public void incrementarPuertas(){
            this.nroPuertas++;
        }

    }
}
