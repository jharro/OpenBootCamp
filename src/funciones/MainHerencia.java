package herencia;

public class MainHerencia {

    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setEdad(20);
        cliente.setNombre("Juan");
        cliente.setTelefono("3106782134");
        cliente.setCredito(45.98);
        System.out.println("Datos del cliente\n");
        System.out.println(cliente.getEdad()+"\n"+cliente.getNombre()+"\n"+cliente.getTelefono()+"\n"+
                cliente.getCredito());

        Trabajador trabajador=new Trabajador();
        trabajador.setSalario(7850.4);
        System.out.println("Salario del trabajador");
        System.out.println(trabajador.getSalario());
    }

    public static class Persona{
        private int edad;
        private String nombre;
        private String telefono;

        public Persona(){}

        public int getEdad() {
            return edad;
        }

        public void setEdad(int edad) {
            this.edad = edad;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getTelefono() {
            return telefono;
        }

        public void setTelefono(String telefono) {
            this.telefono = telefono;
        }
    }

    public static class Cliente extends Persona{
        double credito;

        public Cliente(){}

        public double getCredito() {
            return credito;
        }

        public void setCredito(double credito) {
            this.credito = credito;
        }
    }

    public static class Trabajador extends Persona{
        private double salario;

        public Trabajador(){}

        public double getSalario() {
            return salario;
        }

        public void setSalario(double salario) {
            this.salario = salario;
        }
    }
}
