import javax.swing.*;
import java.awt.*;

public class DialogConfirmacion extends JDialog{
    private JPanel confirmacion;
    private JLabel mensaje;
    private JPanel botones;
    private JButton aceptarButton;
    private JButton cancelarButton;

    public DialogConfirmacion(JFrame parent){
        super(parent, "Confirmación", true);
        setLayout(new BorderLayout(10,10));

        //Mensaje
        JLabel mensaje = new JLabel("¿Guardar cambios?");
        mensaje.setHorizontalAlignment(SwingConstants.CENTER);
        add(mensaje, BorderLayout.CENTER);

        //Botonera
        JPanel botones = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        botones.add(new JButton("Aceptar"));
        botones.add(new JButton("Cancelar"));
        add(botones, BorderLayout.SOUTH);

        pack();
        setLocationRelativeTo(parent);
    }
}