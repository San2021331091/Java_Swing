import javax.swing.*;
import java.awt.*;

public class TextAreaDemo extends JFrame {

    private Container c;
    private JTextArea jt;

    private Font f;

    TextAreaDemo(){


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100,50,900,600);
        this.setTitle("Text Area Demo");
        setResizable(false);
        initComponents();


    }


    public void initComponents(){

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.PINK);
        jt = new JTextArea("What's your comment");
        jt.setBounds(150,50,600,200);
        jt.setBackground(Color.RED);
        jt.setForeground(Color.white);
        f = new Font("Aerial",Font.BOLD|Font.ITALIC,20);
        jt.setFont(f);
        c.add(jt);

    }
    public static void main(String [] args){


        TextAreaDemo frame = new TextAreaDemo();
        frame.setVisible(true);






    }







}
