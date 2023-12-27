package classes;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class LoginAsStudent extends JFrame implements MouseListener,ActionListener
{	JPanel panel;
	JLabel user,pass,imgl,logol;
	JTextField userf;
	JPasswordField passf;
	JButton log,signup,back;
	ImageIcon background,logo;
	Font namefont;
	Color buttoncolor;
	public LoginAsStudent()
	{
		super("Login As Student");
		this.setSize(800,600);
		panel=new JPanel();
		panel.setLayout(null);
		
		namefont=new Font("Cambria", Font.PLAIN, 30);
		
		buttoncolor=new Color(246,219,192);
		
		
		user=new JLabel("User ID");
		user.setForeground(Color.white);
		user.setBounds(250,200,100,25);
		panel.add(user);
		
		userf=new JTextField();
		userf.setBounds(250,225,200,25);
		panel.add(userf);
		
		pass=new JLabel("Password");
		pass.setForeground(Color.white);
		pass.setBounds(250,265,100,25);
		panel.add(pass);
		
		passf=new JPasswordField();
		passf.setBounds(250,290,200,25);
		passf.setEchoChar('*');
		panel.add(passf);
		
		log=new JButton("Login");
		log.setBounds(250,340,80,25);
		log.addMouseListener(this);
		log.addActionListener(this);
		log.setBackground(buttoncolor);
		panel.add(log);
		
		signup=new JButton("Signup");
		signup.setBounds(365,340,80,25);
		signup.addMouseListener(this);
		signup.addActionListener(this);
		signup.setBackground(buttoncolor);
		panel.add(signup);
		
		back=new JButton("Back");
		back.setBounds(300,400,110,25);
		back.addMouseListener(this);
		back.addActionListener(this);
		back.setBackground(buttoncolor);
		panel.add(back);
		
		logo=new ImageIcon("images/logo.png");
		logol=new JLabel(logo);
		logol.setBounds(50,180,200,200);
		panel.add(logol);
		
		background=new ImageIcon("images/home.jpg");
		imgl=new JLabel(background);
		imgl.setBounds(0,0,800,600);
		panel.add(imgl);
		
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		this.add(panel);
	}
	


	public void mouseClicked(MouseEvent me){}
	public void mousePressed(MouseEvent me){}
	public void mouseReleased(MouseEvent me){}
	public void mouseEntered(MouseEvent me)
	{
		if(me.getSource()==log)
		{
			log.setBackground(Color.WHITE);
		}
		else if(me.getSource()==signup)
		{
			signup.setBackground(Color.WHITE);
		}
		else if(me.getSource()==back)
		{
			back.setBackground(Color.WHITE);
		}
	}
	public void mouseExited(MouseEvent me)
	{
		if(me.getSource()==log)
		{
			log.setBackground(buttoncolor);
		}
		else if(me.getSource()==signup)
		{
			signup.setBackground(buttoncolor);
		}
		else if(me.getSource()==back)
		{
			back.setBackground(buttoncolor);
		}
	}
	public void actionPerformed(ActionEvent ae)
	{
		if (ae.getSource()==signup)
		{
		StudentSignup s1 =new StudentSignup();
		s1.setVisible(true);
		this.setVisible(false);
		}
		else if(ae.getSource()==log)
		{
			String user=userf.getText();
			String pass=passf.getText();
	
			Accounts acc=new Accounts();
			
			if(acc.getAccount(user,pass)==true)
			{
				Home doc1=new Home();
				doc1.setVisible(true);
				this.setVisible(false);
			}
			else 
			{
				JOptionPane.showMessageDialog(null,"account not found");
			}
		}
		else if (ae.getSource()==back){
			FontPage f1=new FontPage();
			f1.setVisible(true);
			this.setVisible(false);
			
		}
		
	}
}