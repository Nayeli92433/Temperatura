public class Paciente {
    String nombre;
    int edad;
    double temperatura;

    public Paciente(String nombre, int edad, double temperatura) {
        this.nombre = nombre;
        this.edad = edad;
        this.temperatura = temperatura;
    }
    public String getNombre() {
        return nombre;
    }
    public int getEdad() {
        return edad;
    }
    public double getTemperatura() {
        return temperatura;
    }
}
