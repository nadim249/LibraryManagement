package classes;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Contribution extends JFrame implements MouseListener,ActionListener
{
	JPanel panel;
	JButton back;
	JLabel imageLabel;
	ImageIcon image;
	Font f1;
	Color mycolor,buttoncolor;
	
	
	public Contribution()
	{
		super("Contribution");
		this.setSize(800,600);
		panel= new JPanel();
		panel.setLayout(null);
		
		mycolor=new Color(254,245,235);
		buttoncolor=new Color(246,219,192);
		
		f1 = new Font("Times New Roman", Font.PLAIN,30); 
		
        back=new JButton("Back");
		back.setBounds(320,500,120,40);
		back.addMouseListener(this);
		back.addActionListener(this);
		back.setBackground(buttoncolor);
		panel.add(back);
		
        image = new ImageIcon("images/cont.jpg");
		imageLabel = new JLabel(image);
		imageLabel.setBounds(0,0,800,450);
		panel.add(imageLabel);
		
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.add(panel);
	
	}

	public void mouseClicked(MouseEvent me){}
	public void mousePressed(MouseEvent me){}
	public void mouseReleased(MouseEvent me){}
	public void mouseEntered(MouseEvent me)
	{

		 if(me.getSource()==back)
		{
			back.setBackground(Color.WHITE);
		}
		
	}
	public void mouseExited(MouseEvent me)
	{
		 if(me.getSource()==back)
		{
			back.setBackground(buttoncolor);
		}
	}
	public void actionPerformed(ActionEvent ae)
	{
		  if(ae.getSource()==back)
		   {
			FontPage s=new FontPage();
			s.setVisible(true);
			this.setVisible(false);
		   }
	   	}
	
}