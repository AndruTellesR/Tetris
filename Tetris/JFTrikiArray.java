import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
/**
 * Write a description of class JFTriki here.
 * 
 * @author (Claudia Yamile Gomez) 
 * @version (0.1)
 */
public class JFTrikiArray extends JFrame implements ActionListener
{
    // instance variables - replace the example below with your own
    private JButton[] b = new JButton[9];
    private JLabel etiq1, etiq2;
    private JTextField jug1, jug2;
    private JPanel p1,p2;
    
    private Triqui triqui;

    /**
     * Constructor for objects of class JFTriki
     */
    public JFTrikiArray()
    {
        // initialise instance variables
        setTitle("Juego de Triqui");
        setVisible(true);
        setSize(600,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);//para que se cierre al salir
        setResizable(false);//no se puede cambiar de tamaño la ventana
        setLayout(new GridLayout(1,2));
        
        
        p1=new JPanel();
        p1.setSize(300,300);
        p1.setBackground(Color.white); 
        p1.setLayout(new GridLayout(3,3));
        
        p2=new JPanel();
        p2.setSize(200,300);
        p2.setBackground(Color.red); 
        p2.setLayout(new GridLayout(1,2));
        
        for (int i = 0; i<9; i++){
            b[i]=new Boton (i);
            b[i].addActionListener(this);
            p1.add(b[i]);
            
        }
        
        add(p1);
        add(p2);
        triqui = new Triqui();
        
        p1.repaint();
       
    }

    public void actionPerformed(ActionEvent evento){
        Boton b = (Boton)evento.getSource();
        String marca = triqui.getMarca();
        b.setText(marca);
        triqui.marcar(b.getX());
        
    }

}