package classes;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class FontPage extends JFrame implements MouseListener,ActionListener
{
	JPanel panel;
	JLabel bgl,logol;
	JRadioButton login,loginA;
	ImageIcon bg,logo;
	Color mycolor,buttoncolor;
	JButton next,cont;
	ButtonGroup option;
	Font myfont;
	public FontPage()
	{
		super("Font Page");
		this.setSize(800,600);
		panel=new JPanel();
		panel.setLayout(null);
		
		option=new ButtonGroup();
		myfont=new Font("",Font.PLAIN,15);
		mycolor=new Color(254,245,235);
		buttoncolor=new Color(246,219,192);
		
		login=new JRadioButton("Login As Student");
		login.setBounds(250,220,190,25);
		option.add(login);
		login.addMouseListener(this);
		login.addActionListener(this);
		login.setFont(myfont);
		panel.add(login);
		
		loginA=new JRadioButton("Login As Admin");
		loginA.setBounds(250,270,190,25);
		option.add(loginA);
		loginA.addMouseListener(this);
		loginA.addActionListener(this);
		loginA.setFont(myfont);
		panel.add(loginA);
		
		next=new JButton("Next");
		next.setBounds(300,320,130,40);
		next.setBackground(buttoncolor);
		next.addMouseListener(this);
		next.addActionListener(this);
		panel.add(next);
		
		
		cont=new JButton("Contribution");
		cont.setBounds(300,450,130,40);
		cont.setBackground(buttoncolor);
		cont.addMouseListener(this);
		cont.addActionListener(this);
		panel.add(cont);
		
		logo=new ImageIcon("images/logo.png");
		logol=new JLabel(logo);
		logol.setBounds(50,180,200,200);
		panel.add(logol);
		
		bg=new ImageIcon("images/home.jpg");
		bgl=new JLabel(bg);
		bgl.setBounds(0,0,800,600);
		panel.add(bgl);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		this.add(panel);
}
	
	public void mouseClicked(MouseEvent me){}
	public void mousePressed(MouseEvent me){}
	public void mouseReleased(MouseEvent me){}
	public void mouseEntered(MouseEvent me)
	{
		if(me.getSource()==next)
		{
			next.setBackground(Color.WHITE);
		}
		else if(me.getSource()==cont)
		{
			cont.setBackground(Color.WHITE);
		}
	}
	
	public void mouseExited(MouseEvent me)
	{
		if(me.getSource()==next)
		{
			next.setBackground(buttoncolor);
		}
		if(me.getSource()==cont)
		{
			cont.setBackground(buttoncolor);
		}
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if(login.isSelected())
		{
			if(ae.getSource()==next)
			{
				LoginAsStudent la1=new LoginAsStudent();
				la1.setVisible(true);
				this.setVisible(false);
			}
		}
		else if(loginA.isSelected())
		{
			if(ae.getSource()==next)
			{
				LoginAsAdmin su1=new LoginAsAdmin();
				su1.setVisible(true);
				this.setVisible(false);
			}
			
		}
		else if(ae.getSource()==cont)
		{
			Contribution su1=new Contribution();
			su1.setVisible(true);
			this.setVisible(false);
		}
		
	}
}
