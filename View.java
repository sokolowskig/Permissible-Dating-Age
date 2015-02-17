
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 * The class manages the main GUI.
 * 
 * @author (CJ Graven) 
 * @version (2/11/15)
 */

@SuppressWarnings("serial")
public class View extends JFrame implements ActionListener
{

    JLabel info;
    JTextField input;
    JButton go;
    
    public View()
    {
        setLayout(new FlowLayout());
        
        info = new JLabel("What's Your Age?");
        info.setSize(20, 20);
        add(info);
        
        input = new JTextField(20);
        input.setEditable(true);
        add(input);
        
        go = new JButton("Search Matches");
        go.setSize(20, 20);
        go.addActionListener(this);
        add(go);
        
    }
    
	//Will throw many errors
	//TODO fix
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        Object cause = e.getSource();
        
        if(cause==go)
        {
           double f = Double.parseDouble(input.getText());
       
           int d = (int) Math.floor(f);
           
           if(model.getHighest(d)==0||model.getHighest(d)==0)
           {
        	   
        	  DatingAges gui = new DatingAges("Sorry, but "+d+" is out of your league.", "");
        	  gui.setSize(300, 200);
        	  gui.setDefaultCloseOperation(1);
           	  gui.setVisible(true);
           }
           else
           {
        	   String g = "The oldest person you can date is "+ model.getHighest( d) ;
        	   String h = "The youngest person you can date is " + model.getLowest( d);
            
            	DatingAges gui = new DatingAges(g, h);
            	gui.setSize(300, 200);
            	gui.setDefaultCloseOperation(1);
            	gui.setVisible(true);
           }
            
        }
    }
    
}
