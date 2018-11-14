import javax.swing.JFrame;
public class Myframe extends JFrame
{

    private static final int WIDTH = 400;
    private static final int HEIGHT = 300;
    public Myframe(String title)
    {
       setTitle(title);
       setSize(WIDTH,HEIGHT);
       setLocationRelativeTo(null);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       setVisible(true);
       
       
       
    }
    
    public void paintLine()
    {
        panel = new LineDemoPanel();
        add(panel);
        setVisible(true); 
    }
    private static MyPanel panel;
    public static void main(String[] args)
    {
       Myframe frame = new Myframe("Hello");
       frame.paintLine();
    }

}
