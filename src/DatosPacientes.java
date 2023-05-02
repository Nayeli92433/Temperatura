public class DatosPacientes {
    Consulta consulta= new Consulta();
    public void pacientes() {
        Paciente paciente1 = new Paciente("Ana Lopez",23,34);
        Paciente paciente2 = new Paciente("Laura Hernandez",30,56);
        Paciente paciente3 = new Paciente("Jesus Santiago",21,23);
        Paciente paciente4 = new Paciente("Leon Guzman",15,41);
        Paciente paciente5 = new Paciente("Sara Ramirez",54,26);

        Paciente[] pacientes= {paciente1,paciente2,paciente3,paciente4,paciente5};
        consulta.consultaPacientes(pacientes);

    }
}
