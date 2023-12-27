package classes;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StudentSignup extends JFrame implements MouseListener,ActionListener
{
	JPanel panel;
	JButton signup,back;
	JLabel FrameTitle,logol; 
	JLabel name; 
	JLabel id;
	JLabel phone;
	JLabel password, confirmpassword;
	JTextField namefield;
	JTextField idfield;
	JTextField phonefield;
	JPasswordField passwordfield, confirmpasswordfield;
	JLabel imageLabel;
	ImageIcon image,logo;
	JRadioButton r1;
	Font f1, f2, f3;
	Color mycolor,buttoncolor;
	
	
	public StudentSignup()
	{
		super("Student Signup");
		this.setSize(800,600);
		panel= new JPanel();
		panel.setLayout(null);
		
		mycolor=new Color(254,245,235);
		buttoncolor=new Color(246,219,192);
		
		f1 = new Font("Times New Roman", Font.PLAIN,30); 
		f2 = new Font("Times New Roman", Font.PLAIN,50);
		f3 = new Font("Times New Roman", Font.ITALIC,30); 
		
		
		name= new JLabel("Name*");
		name.setForeground(Color.white);
		name.setBounds(250, 60, 150, 25);
		panel.add(name);
		
		namefield=new JTextField();
		namefield.setBounds(250,85,150,25);
		panel.add(namefield);
		
		phone= new JLabel("Phone*");
		phone.setForeground(Color.white);
		phone.setBounds(250, 125, 150, 25);
		panel.add(phone);
		
		phonefield=new JTextField();
		phonefield.setBounds(250,150,150,25);
		panel.add(phonefield);
		
		id= new JLabel("User ID");
		id.setForeground(Color.white);
		id.setBounds(250,190,150,25);
		panel.add(id);
		
		idfield=new JTextField();
		idfield.setBounds(250,215,150,25);
		panel.add(idfield);
		
		
		password= new JLabel("Password*");
		password.setForeground(Color.white);
		password.setBounds(250,260,150,25);
		panel.add(password);
		
		passwordfield=new JPasswordField();
		passwordfield.setBounds(250,285,150,25);
		passwordfield.setEchoChar('*');
		panel.add(passwordfield); 
		
		
		confirmpassword= new JLabel("Confirm Password*");
		confirmpassword.setForeground(Color.white);
		confirmpassword.setBounds(250,325,150,25);
		panel.add(confirmpassword);
		
		confirmpasswordfield=new JPasswordField();
		confirmpasswordfield.setBounds(250,350,150,25);
		confirmpasswordfield.setEchoChar('*');
		panel.add(confirmpasswordfield);
		
		r1 = new JRadioButton("I agree with the terms and conditions");
		r1.setBounds(200, 390, 300, 20);
		r1.setBackground(mycolor);
		
		panel.add(r1);
		
        signup=new JButton("Register");
		signup.setBounds(275,420,100,25);
		signup.addMouseListener(this);
		signup.addActionListener(this);
		signup.setBackground(buttoncolor);
		panel.add(signup);
		
		
		back=new JButton("Back");
		back.setBounds(275,450,100, 25);
		back.addMouseListener(this);
		back.addActionListener(this);
		back.setBackground(buttoncolor);
		panel.add(back);
		
		logo=new ImageIcon("images/logo.png");
		logol=new JLabel(logo);
		logol.setBounds(20,110,200,200);
		panel.add(logol);
		
        image = new ImageIcon("images/home.jpg");
		imageLabel = new JLabel(image);
		imageLabel.setBounds(0,0,800,600);
		panel.add(imageLabel);
		
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.add(panel);
	
	}

	public void mouseClicked(MouseEvent me){}
	public void mousePressed(MouseEvent me){}
	public void mouseReleased(MouseEvent me){}
	public void mouseEntered(MouseEvent me)
	{
		if(me.getSource()==signup)
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
		if(me.getSource()==signup)
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
		if(ae.getSource()==signup)
		{
			String name1=namefield.getText();
			String id1=idfield.getText();
		    String password1=passwordfield.getText();
			String phone1=phonefield.getText();
			
			Memberlist ml=new Memberlist(name1,id1,password1,phone1);
			Memberlist.members.add(ml);
			
						Accounts acc=new Accounts();
			
		if(name1.isEmpty()||id1.isEmpty()||password1.isEmpty()||phone1.isEmpty())
						{
							JOptionPane.showMessageDialog(null,"Fill up the form");
						}
			
						else if(acc.getAccount(id1,password1)==true)
						{
							JOptionPane.showMessageDialog(null,"id already taken");
						}
						else 
						{
							Accounts acc1=new Accounts(name1,id1,password1,phone1);
							acc1.addDoc();
				JOptionPane.showMessageDialog(null,"Successfully Registered");
							LoginAsStudent l1=new LoginAsStudent();
							l1.setVisible(true);
							this.setVisible(false);
						}}
		
		 else if(ae.getSource()==back)
		   {
			LoginAsStudent s=new LoginAsStudent();
			s.setVisible(true);
			this.setVisible(false);
		   }
	   	}
	
}