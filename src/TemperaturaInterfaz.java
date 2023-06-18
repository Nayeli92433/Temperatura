import javax.swing.*;
import java.awt.*;

public class TemperaturaInterfaz {
    private JFrame frame = new JFrame();
    private JTextField gradosCelsius;
    private JButton convertirButton;
    private JTextField gradosFarenheit;
    private JButton convertirButton1;
    private JPanel contenedor;
    private JLabel result1;
    private JLabel result2;
    private JButton limpiar1;
    private JButton limpiar2;
    private Temperatura temperatura = new Temperatura();

    public TemperaturaInterfaz(){
        setupFrame();
        frame.add(contenedor);
        addActionListeners();
    }
    private void setupFrame() {
        frame.setTitle("Temperatura");
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setSize(500, 200);
    }
    private void addActionListeners(){
        convertirButton.addActionListener(e -> {
            String grados = gradosCelsius.getText();
            double grados2 = Double.parseDouble(grados);
            double grados3 = temperatura.calcularFahrenheit(grados2);
            result1.setText(String.valueOf(grados3));
            gradosCelsius.setText("");
        });
        convertirButton1.addActionListener(e -> {
            String grados = gradosFarenheit.getText();
            double grados2 = Double.parseDouble(grados);
            double grados3 = temperatura.calcularCelsius(grados2);
            result2.setText(String.valueOf(grados3));
            gradosFarenheit.setText("");
        });
        limpiar1.addActionListener(e -> {
            result1.setText("0");
        });
        limpiar2.addActionListener(e->{
            result2.setText("0");
        });
    }
}
