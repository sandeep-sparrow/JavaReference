import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class ShowAFrame {

    public static void main(String args[]) {
    	
        JFrame myFrame = new JFrame();
        String myTitle = "Blank Frame";
        
        final JTextField myfield = new JTextField();
        myfield.setBounds(50, 50, 150, 20);

        JButton mybutton = new JButton("Next");
        mybutton.setBounds(50, 100, 100, 30);
        mybutton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		myfield.setText("Welcome to JFrame");
        	}
        });
        
        myFrame.add(mybutton);
        myFrame.add(myfield);
        
        myFrame.setTitle(myTitle);
        myFrame.setSize(400, 400);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setVisible(true);
        

    }
}
