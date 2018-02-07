package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana extends JFrame{
    private JLabel etiqueta;
    private JTextField campo;
    private JButton jugar;
    private JDialog d;
    private JLabel mensaje;

    public Ventana(){
        super("Juego de Numeros");
        etiqueta = new JLabel("Ingresa un Numero :");
        campo = new JTextField(5);
        jugar = new JButton("Jugar");
        mensaje = new JLabel("");

        d = new JDialog(this);
        d.setSize(300,150);

        //Objeto que se encarga de acomodar los componentes en el Layout
        FlowLayout f = new FlowLayout();
        setLayout(f);
        add(etiqueta);
        add(campo);
        add(jugar);
        d.add(mensaje);

        jugar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jugar();
            }
        });
    }
    private void jugar(){
        String valor = campo.getText();
        int numero = Integer.parseInt(valor);
        numero ++;
        mensaje.setText("Mi numero es : "+numero+ " Te Gane!!!");
        d.setVisible(true);

    }

}
