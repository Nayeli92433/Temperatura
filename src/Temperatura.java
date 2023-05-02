public class Temperatura {
    private double temperartura;

    public Temperatura(double temperartura) {
        this.temperartura= temperartura;
    }
    public void mostrarTemperaturaCelsius() {
        Temperatura.CalcularTemperatura operacion= new Temperatura.CalcularTemperatura();
        double conversionCelsius = operacion.calcularCelsius(temperartura);
        System.out.println("Temperatura actual en Celsius: " + conversionCelsius+"\n");
    }
    public void mostrarTemperaturaFahrenheit() {
        Temperatura.CalcularTemperatura operacion= new Temperatura.CalcularTemperatura();
        double conversionFahrenheit = operacion.calcularFahrenheit(temperartura);
        System.out.println("Temperatura en Fahrenheit: " + conversionFahrenheit+"\n");
    }

        private class CalcularTemperatura {
            public double calcularCelsius(double fahrenheita) {
                return (fahrenheita -32)/1.8;
            }
            public double calcularFahrenheit(double celsius) {
                return celsius * 1.8 + 32;
            }
    }
}