import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Form
{
	public static void main(String[] args)
	{
		Gui ob=new Gui();
	}
}
class Gui extends JFrame
{
	JLabel l1,l2;
	JTextField t1,t2;
	JButton b1;
	Gui()
	{
		l1=new JLabel("enter ur email");
		t1=new JTextField(20);
		l2=new JLabel("create password");
		t2=new JTextField(20);
		b1=new JButton("click me!");
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(b1);
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
	