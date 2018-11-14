import java.awt.Color;
import java.awt.Graphics;
public class RectangleDemoPanel extends MyPanel
{

    public RectangleDemoPanel()
    {
        super();
    }
    
    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        
        int startX = 10;
        int startY =30;
        
        int endX = 180;
        int endY = 200;
        
        g.drawRect(startX, startY, endX, endY);
        
        startX+=30;
        startY+=30;
        
        endX +=40;
        endY +=40;
        
        g.fillRect(startX, startY, endX, endY);
    } 

}
