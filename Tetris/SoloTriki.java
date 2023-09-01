import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
/**
 * Write a description of class JFTriki here.
 * 
 * @author (Claudia Yamile Gomez) 
 * @version (0.1)
 */
public class SoloTriki extends JFrame implements ActionListener
{
    // instance variables - replace the example below with your own
    private JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b0;

    private JPanel p1;
    
    private Triqui triqui;

    /**
     * Constructor for objects of class JFTriki
     */
    public SoloTriki()
    {
        // initialise instance variables
        setTitle("Juego de Triqui");
        setVisible(true);
        setSize(400,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);//para que se cierre al salir
        setResizable(false);//no se puede cambiar de tamaño la ventana
        setLayout(new GridLayout(1,1));
        
        
        p1=new JPanel();
        p1.setSize(300,300);
        p1.setBackground(Color.white); 
        p1.setLayout(new GridLayout(3,3));
        
        
        b1=new Boton (0);
        p1.add(b1);
        b2=new Boton (1);
        p1.add(b2);
        b3=new Boton (2);
        p1.add(b3);
        b4=new Boton (3);
        p1.add(b4);
        b5=new Boton (4);
        p1.add(b5);
        b6=new Boton (5);
        p1.add(b6);
        
        b7=new Boton (6);
        p1.add(b7);
        b8=new Boton (7);
        p1.add(b8);
        b9=new Boton (8);
        p1.add(b9);
        
        add(p1);
       

        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        
        triqui = new Triqui();
        
        p1.repaint();
        
       
    }

    public void actionPerformed(ActionEvent evento){
        Boton b = (Boton)evento.getSource();
        if (b.getText().equals("")){
            String marca = triqui.getMarca();
            b.setText(marca);
            String msg = triqui.marcar(b.getX());   
            if (!msg.equals("")){
                JOptionPane.showMessageDialog(null, "Juego terminado.  " + msg);
            }
        }
    }

}
