import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
/**
 * Write a description of class Boton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Boton extends JButton
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Boton
     */
    
    public Boton()
    {
       setText("");
       repaint();
    }
    
    public Boton(int x)
    {
        // initialise instance variables
        setText("");
        setFont(new Font("Arial", Font.BOLD, 64));
        setBackground(java.awt.Color.white);
        setContentAreaFilled(true); 
        
        this.x = x;

    }
       
    public int getX(){
        return x;
    }
    

    
}
