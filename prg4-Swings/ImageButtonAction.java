/*
 4c. Develop a Swing program in Java to display a message “Digital Clock is pressed” or “Hour
Glass is pressed” depending upon the Jbutton with image either Digital Clock or Hour Glass is
pressed by implementing the event handling mechanism with addActionListener( ).
 */
package Swings; 
import javax.swing.*; 
import java.awt.*; 
import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener; 
 
public class ClockUI extends JFrame implements ActionListener { 
 
    private JLabel message; 
    private JButton digitalBtn, hourGlassBtn; 
 
    public ClockUI() { 
        setTitle("Clock Button Example"); 
        setSize(600, 300); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        setLayout(new BorderLayout(20, 20)); 
 
        message = new JLabel("Click a button below", SwingConstants.CENTER); 
        message.setFont(new Font("Arial", Font.BOLD, 20)); 
        add(message, BorderLayout.NORTH); 
 
        JPanel Panel = new JPanel(); 
        Panel.setLayout(new FlowLayout(FlowLayout.CENTER, 50, 10)); 
        ImageIcon digitalIcon = new ImageIcon("C:\\Users\\Samay\\eclipse-workspace\\Swings\\src\\Clock.png"); 
        ImageIcon hourGlassIcon = new ImageIcon("C:\\Users\\Samay\\eclipse-workspace\\Swings\\src\\Hourglass.png"); 
 
        digitalBtn = new JButton(digitalIcon); 
        hourGlassBtn = new JButton(hourGlassIcon); 
        digitalBtn.addActionListener(this); 
        hourGlassBtn.addActionListener(this); 
        Panel.add(digitalBtn); 
        Panel.add(hourGlassBtn); 
        add(Panel, BorderLayout.CENTER); 
        setVisible(true); 
    } 
 
    @Override 
    public void actionPerformed(ActionEvent e) { 
        if (e.getSource() == digitalBtn) { 
            message.setText("You have pressed the digital Button!"); 
        } else if (e.getSource() == hourGlassBtn) { 
            message.setText("You have pressed hour_glass Button!"); 
        } 
    } 
 
    public static void main(String[] args) { 
        new ClockUI(); 
    } 
} 