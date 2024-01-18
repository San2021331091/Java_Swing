import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class jTextField extends JFrame {

private ImageIcon icon;
private Container container;
private JTextField tf1,tf2;
      jTextField(){


          setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          setBounds(100,50,1400,600);
          setTitle("Text Field");
          initComponents();

      }

      public void initComponents(){

          icon = new ImageIcon(Objects.requireNonNull(getClass().getResource("win.png")));
          container = this.getContentPane();
          container.setLayout(null);
          container.setBackground(Color.RED);
          setIconImage(icon.getImage());
          tf1 = new JTextField("Hi unicorn");
          tf1.setBounds(200,50,250,50);
          container.add(tf1);
          tf2 = new JTextField();
          tf2.setBounds(200,110,250,50);
          container.add(tf2);


      }
    public static void main(String [] args){


        jTextField frame = new jTextField();
        frame.setVisible(true);








    }





}
