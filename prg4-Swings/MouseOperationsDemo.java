/*
 4d.Develop a simple swing program for illustrating mouse operations such as mouse down, up
double click , single click with help of a button
 */
 
import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*; 
 
public class MouseOperationsDemo extends JFrame { 
 
 JButton clickButton; 
  JLabel messageLabel; 
 
    public MouseOperationsDemo() { 
        setTitle("Mouse Operations"); 
        setSize(400, 200); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
//        setLayout(new BorderLayout(10, 10)); 

        JPanel Panel = new JPanel(); 
        clickButton = new JButton("Click Me!"); 
        clickButton.setFont(new Font("Arial", Font.BOLD, 16)); 
       Panel.add(clickButton); 
        messageLabel = new JLabel(" ", SwingConstants.CENTER); 
        messageLabel.setFont(new Font("Arial", Font.BOLD, 14)); 
 
        add(Panel, BorderLayout.CENTER); 
        add(messageLabel, BorderLayout.SOUTH); 
        clickButton.addMouseListener(new MouseAdapter() { 
            @Override 
            public void mousePressed(MouseEvent e) { 
                messageLabel.setText("Mouse Down on Button"); 
            } 
 
            @Override 
            public void mouseReleased(MouseEvent e) { 
                messageLabel.setText("Mouse Up on Button"); 
            } 
 
            @Override 
            public void mouseClicked(MouseEvent e) { 
                if (e.getClickCount() == 2) { 
                    messageLabel.setText("Double Click on Button"); 
                } else { 
                    messageLabel.setText("Single Click on Button"); 
                } 
            } 
        }); 
 
        setVisible(true); 
    } 
 
    public static void main(String[] args) { 
         new MouseOperationsDemo(); 
    } 
} 
