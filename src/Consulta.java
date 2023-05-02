import java.util.Scanner;

public class Consulta {
    Scanner scanner= new Scanner(System.in);

    public  void consultaPacientes(Paciente[]pacientes){
        System.out.println("\n-----------------------------------------------");
        System.out.println("\t\t\tCONSULTA DE PACIENTES");
        System.out.println("-----------------------------------------------");

        for (Paciente paciente : pacientes) {
            System.out.println("\tDATOS DEL PACIENTE");
            System.out.println("-"+paciente.nombre+ "\tEdad: "+ paciente.edad+ "\tTemperatura: "+ paciente.temperatura);
            System.out.println("En que grado desea consultar la temperarura \n [1].-Celcius\n [2].-Fahrenheit");
            int valor= scanner.nextInt();
            if (valor==1){
                Temperatura temperatura= new Temperatura(paciente.temperatura);
                temperatura.mostrarTemperaturaCelsius();
            }
            else {
                Temperatura temperatura= new Temperatura(paciente.temperatura);
                temperatura.mostrarTemperaturaFahrenheit();
            }
            System.out.println("-------------------------------------------------------------------");
        }
    }
}
