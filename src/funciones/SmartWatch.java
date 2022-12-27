package cursojavabasico;

public class SmartWatch extends SmartDevice{
    private String resolucion;

    public SmartWatch(){}

    public SmartWatch(String nombre, String marca, String color, double precio,String resolucion) {
        super();
        this.resolucion = resolucion;
    }

    public String getResolucion() {
        return resolucion;
    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "resolucion='" + resolucion + '\'' +
                '}';
    }
}
