import javax.swing.*;

public class HelloWorld extends JFrame{
    private JPanel panel1;
    private JLabel olamundo;

    public HelloWorld(String title){
        super(title);
        pack();

        setContentPane(panel1);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String args[]){
        new HelloWorld("Hello World").setVisible(true);
    }
}
