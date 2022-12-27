package cursojavabasico;

public class MainSmart {
    public static void main(String[] args) {
        SmartDevice smartDevice= new SmartDevice("Iphone 8","KoKo","Azul",450);
        SmartPhone smartPhone= new SmartPhone("SmartPhone 1","Gato","Negro",700.6,true);
        SmartWatch smartWatch=new SmartWatch("Smart Watch","Lucky","Negro",900,"Full HD");

        System.out.println(smartDevice.toString());
        System.out.println(smartPhone.toString());
        System.out.println(smartWatch.toString());
    }
}
