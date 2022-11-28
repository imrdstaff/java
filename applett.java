import java.applet.Applet;
import java.awt.*;

public class applett extends Applet
{
	public void paint(Graphics g)
	{
		g.setColor(Color.black);
		g.fillRect(50,300,300,100);
		g.drawLine(200,50,50,200);
	}
}