package pruebacombo;

        import javax.swing.*;
        import java.awt.*;
        import java.awt.event.ActionEvent;
        import java.awt.event.ActionListener;

public class PruebaJComboBox {


    private JTextField tf;
    private JComboBox combo;
    private JFrame v;


    public void ejecutar() {

        // Creacion del JTextField
        tf = new JTextField(20);

        // Creacion del JComboBox y añadir los items.
        combo = new JComboBox();
        combo.addItem("uno");
        combo.addItem("dos");
        combo.addItem("tres");

        // Accion a realizar cuando el JComboBox cambia de item seleccionado.
        combo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf.setText(combo.getSelectedItem().toString());
            }
        });

        // Creacion de la ventana con los componentes
        v = new JFrame();
        v.getContentPane().setLayout(new FlowLayout());
        v.getContentPane().add(combo);
        v.getContentPane().add(tf);
        v.pack();
        v.setVisible(true);
        v.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }


}
