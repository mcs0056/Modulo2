import javax.swing.*;
import java.awt.*;

public class GestorUsuarios extends JFrame{
    private JPanel VentanaPr;
    private JPanel superior;
    private JPanel nav;
    private JPanel form;
    private JPanel preview;
    private JPanel botonera;
    private JLabel titulo;
    private JButton Dashboard;
    private JButton Usuarios;
    private JButton Informes;
    private JButton Ajustes;
    private JButton Ayuda;
    private JLabel nombre;
    private JTextField nombreField;
    private JTextField emailField;
    private JLabel email;
    private JLabel rol;
    private JComboBox rolBox;
    private JLabel activo;
    private JCheckBox activox1;
    private JLabel notas;
    private JScrollPane scrollNotas;
    private JTextArea textAreaNotas;
    private JTabbedPane tabs;
    private JScrollPane scrollResumen;
    private JTextArea textAreaResumen;
    private JScrollPane scrollLogs;
    private JTextArea textAreaLogs;
    private JButton cancelar;
    private JButton limpiar;
    private JButton guardar;


    public GestorUsuarios(){
        setTitle("Gestor de Usuarios");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800,600);
        setLocationRelativeTo(null);

        //Panel Principal con BorderLayout
        JPanel VentanaPr = new JPanel(new BorderLayout(10,10));
        setContentPane(VentanaPr);

        //HEADER
        JPanel superior = new JPanel(new FlowLayout(FlowLayout.LEFT));
        ImageIcon originalIcon = new ImageIcon("C:/Users/Usuario1/IdeaProjects/Modulo2/src/images/usuario.png");
        Image img = originalIcon.getImage().getScaledInstance(25,25, Image.SCALE_SMOOTH);
        ImageIcon icon = new ImageIcon(img);
        JLabel titulo = new JLabel("Gestor de usuarios", icon, JLabel.LEFT);
        titulo.setFont(new Font("Arial", Font.BOLD, 18));
        superior.add(titulo);
        VentanaPr.add(superior, BorderLayout.NORTH);

        //NAVEGACIÓN
        JPanel nav = new JPanel(new GridLayout(5,1,0,5));
        String[] botones = {"Dasboard","Usuarios", "Informes", "Ajustes","Ayuda"};
        for(String txt : botones){
            nav.add(new JButton(txt));
        }
        VentanaPr.add(nav, BorderLayout.WEST);

        //Formulario
        JPanel form = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5,5,5,5);
        gbc.anchor = GridBagConstraints.WEST;

        //Nombre
        gbc.gridx=0; gbc.gridy=0;
        form.add(new JLabel("Nombre"), gbc);
        gbc.gridx=1; gbc.fill=GridBagConstraints.HORIZONTAL; gbc.weightx=1;
        form.add(new JTextField(), gbc);

        //Email
        gbc.gridx=0; gbc.gridy=1; gbc.fill=GridBagConstraints.NONE; gbc.weightx=0;
        form.add(new JLabel("Email:"), gbc);
        gbc.gridx=1; gbc.fill=GridBagConstraints.HORIZONTAL; gbc.weightx=1;
        form.add(new JTextField(), gbc);

        //Rol
        gbc.gridx=0; gbc.gridy=2; gbc.fill=GridBagConstraints.NONE; gbc.weightx=0;
        form.add(new JLabel("Rol:"), gbc);
        gbc.gridx=1; gbc.fill=GridBagConstraints.HORIZONTAL;
        form.add(new JComboBox<>(new String[]{"Admin","Editor","Invitado"}), gbc);

        //Activo
        gbc.gridx=0; gbc.gridy=3;
        form.add(new JLabel("Activo:"), gbc);
        gbc.gridx=1;
        form.add(new JCheckBox(), gbc);

        //Notas
        gbc.gridx=0; gbc.gridy=4; gbc.gridwidth=1; gbc.weighty=0;
        form.add(new JLabel("Notas:"), gbc);
        gbc.gridx=1; gbc.weighty=1; gbc.fill=GridBagConstraints.BOTH;
        form.add(new JScrollPane(new JTextArea()), gbc);

        VentanaPr.add(form, BorderLayout.CENTER);

        //PREVISUALIZACIÓN
        JPanel preview = new JPanel(new BorderLayout());
        preview.setPreferredSize(new Dimension(260,0));
        JTabbedPane tabs = new JTabbedPane();
        tabs.add("Resumen", new JScrollPane(new JTextArea("Resumen...",5,20)));
        tabs.add("Logs", new JScrollPane(new JTextArea("Logs...",5,20)));
        preview.add(tabs, BorderLayout.CENTER);

        VentanaPr.add(preview, BorderLayout.EAST);

        //BOTONERA
        JPanel botonera = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        botonera.add(new JButton("Cancelar"));
        botonera.add(new JButton("Limpiar"));
        JButton guardar = new JButton("Guardar");
        guardar.addActionListener(e-> {
            DialogConfirmacion dialog = new DialogConfirmacion(this);
            dialog.pack();
            dialog.setVisible(true);
        });
        botonera.add(guardar);
        getRootPane().setDefaultButton(guardar);

        VentanaPr.add(botonera, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(()->new GestorUsuarios().setVisible(true));
    }
}
