package classes;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Congratulation extends JFrame implements ActionListener
{
	JPanel panel;
	JButton back;
	JLabel FrameTitle,logol,im1;
    JLabel imageLabel;	
	ImageIcon image,logo,im;
	Color mycolor,buttoncolor;

	public Congratulation()
	{
		super("Congratulation");
		this.setSize(800,600);
		panel= new JPanel();
		panel.setLayout(null);

		mycolor=new Color(254,245,235);
		buttoncolor=new Color(246,219,192);	
	
	
	
		back=new JButton("Back");
		back.setBounds(420,370,100, 25);
		back.addActionListener(this);
		back.setBackground(buttoncolor);
		panel.add(back);
	
		logo=new ImageIcon("images/logo.png");
		logol=new JLabel(logo);
		logol.setBounds(20,180,200,200);
		panel.add(logol);
		
		im=new ImageIcon("images/cong.png");
		im1=new JLabel(im);
		im1.setBounds(200,200,500,167);
		panel.add(im1);	
		
		image=new ImageIcon("images/bg3.jpg");
		imageLabel=new JLabel(image);
		imageLabel.setBounds(0,0,800,600);
		panel.add(imageLabel);
		this.add(panel);
}
public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==back)
{
     Booksmenu h1=new Booksmenu();
    h1.setVisible(true);
    this.setVisible(false);
}}
}