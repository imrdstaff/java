import java.awt.*;

public class AwtApp extends Frame
{

	public AwtApp(){
	Label l1,l2;
	Button b1;
	TextField t1,t2;

	l1=new Label("First Name");
	l2=new Label("Last Name");
	b1=new Button("Login");
	t1=new TextField();
	t2=new TextField();

	l1.setBounds(20,80,80,30);
	l2.setBounds(20,150,80,30);
	t1.setBounds(200,80,150,30);
	t2.setBounds(200,150,150,30);
	b1.setBounds(100,220,80,30);

	add(l1);
	add(l2);
	add(t1);
	add(t2);
	add(b1);

	setLayout(null);
	setSize(400,300);
	setVisible(true);
	setTitle("Login Page");

	}



public static void main(String args[])
	{
		AwtApp app = new AwtApp();
	}
}
