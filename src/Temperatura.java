public class Temperatura {
    private double temperartura;

    public Temperatura(){

    }
    public Temperatura(double temperartura) {
        this.temperartura= temperartura;
    }
    public void mostrarTemperaturaCelsius() {
        double conversionCelsius = calcularCelsius(temperartura);
        System.out.println("Temperatura actual en Celsius: " + conversionCelsius+"\n");
    }
    public void mostrarTemperaturaFahrenheit() {
        double conversionFahrenheit = calcularFahrenheit(temperartura);
        System.out.println("Temperatura en Fahrenheit: " + conversionFahrenheit+"\n");
    }

    public double calcularCelsius(double fahrenheita) {
        return (fahrenheita -32)/1.8;
    }
    public double calcularFahrenheit(double celsius) {
        return celsius * 1.8 + 32;
    }

}