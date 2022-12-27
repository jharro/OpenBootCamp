package cursojavabasico;

public class SmartDevice {
    private String nombre;
    private String marca;
    private String color;
    private double precio;

    SmartDevice(){}

    public SmartDevice(String nombre, String marca, String color, double precio) {
        this.nombre = nombre;
        this.marca = marca;
        this.color = color;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public String getMarca() {
        return marca;
    }

    public String getColor() {
        return color;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "SmartDevice{" +
                "nombre='" + nombre + '\'' +
                ", marca='" + marca + '\'' +
                ", color='" + color + '\'' +
                ", precio=" + precio +
                '}';
    }
}
