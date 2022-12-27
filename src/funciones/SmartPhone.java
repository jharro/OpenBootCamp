package cursojavabasico;

public class SmartPhone extends SmartDevice{
    private boolean camara;

    public SmartPhone(){

    }

    public SmartPhone(String nombre, String marca, String color, double precio, boolean camara) {
        super();
        this.camara = camara;
    }

    public boolean isCamara() {
        return camara;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "camara=" + camara +
                '}';
    }
}
