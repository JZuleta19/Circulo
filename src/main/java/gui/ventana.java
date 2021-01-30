
package gui;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
/**
 *
 * @author etaf
 */
public class ventana extends JFrame {
 public ventana() {
        iniciar();
    }
    JLabel lblRadio, lblPerimetro, lblArea;
    JTextField txtRadio, txtAltura, txtPerimetro, txtArea;
    JButton btnCalcular;
    JPanel pElementos;

    public void iniciar() {
        setSize(250,200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        lblRadio = new JLabel("Radio: ");
        txtRadio = new JTextField(6);        
        btnCalcular = new JButton("Calcular");
        btnCalcular.addMouseListener(new Calcular());
        lblPerimetro = new JLabel("Perimetro ");
        txtPerimetro = new JTextField(20); 
        txtPerimetro.setForeground(Color.blue);
        txtPerimetro.setEditable(false);
        lblArea = new JLabel("Area ");
        txtArea = new JTextField(20);
        txtArea.setForeground(Color.blue);
        txtArea.setEditable(false);
        pElementos = new JPanel();
        pElementos.setBackground(Color.LIGHT_GRAY);
        pElementos.add(lblRadio);
        pElementos.add(txtRadio);
        pElementos.add(btnCalcular);
        pElementos.add(lblPerimetro);
        pElementos.add(txtPerimetro);
        pElementos.add(lblArea);
        pElementos.add(txtArea);
        setContentPane(pElementos);
        
        setVisible(true);
    }
    public class Calcular extends MouseAdapter {

        double radio, alt, per, area;

        public void mouseClicked(MouseEvent mEvent) {
            radio = Double.parseDouble(txtRadio.getText());            
            per = 2*Math.PI*radio;
            area = Math.PI*(radio*radio);
            txtPerimetro.setText(String.valueOf(per));
            txtArea.setText(String.valueOf(area));
        }
    }   
}
