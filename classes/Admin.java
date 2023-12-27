package classes;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Admin extends JFrame implements MouseListener,ActionListener{
    JPanel panel;
    JLabel imgback,stapic,repic,reqpic;
    JButton member,bookreq,lgout;
    ImageIcon logo2,logo3,background;
    Font namefont;
    Color buttoncolor;

    public Admin(){
        super("Admin");
        this.setSize(800,600);
        panel=new JPanel();
        panel.setLayout(null);

        namefont=new Font("Cambria",Font.PLAIN,30);
        buttoncolor=new Color(100, 90, 150);

        logo2=new ImageIcon("images/member.png");
        stapic=new JLabel(logo2);
        stapic.setBounds(250,220,120,100);
        panel.add(stapic);

        logo3=new ImageIcon("images/boookreq.png");
        repic=new JLabel(logo3);
        repic.setBounds(420,220,120,100);
        panel.add(repic);

        member=new JButton("Members");
		member.setBounds(250,340,120,40);
		member.addMouseListener(this);
		member.addActionListener(this);
		member.setBackground(buttoncolor);
		panel.add(member);

        bookreq=new JButton("NewBook Req.");
		bookreq.addMouseListener(this);
		bookreq.addActionListener(this);
		bookreq.setBounds(420,340,120,40);
		bookreq.setBackground(buttoncolor);
		panel.add(bookreq);
		
		lgout=new JButton("Log Out");
		lgout.setBounds(550,480,140,40);
		lgout.addMouseListener(this);
		lgout.addActionListener(this);
		lgout.setBackground(buttoncolor);
		panel.add(lgout);

        background=new ImageIcon("images/background.png");
        imgback=new JLabel(background);
        imgback.setBounds(0,0,800,600);
        panel.add(imgback);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.add(panel);
    }
	public void mouseClicked(MouseEvent me){}
	public void mousePressed(MouseEvent me){}
	public void mouseReleased(MouseEvent me){}
	public void mouseEntered(MouseEvent me)
	{
		if(me.getSource()==member)
		{
			member.setBackground(Color.WHITE);
		}
		else if(me.getSource()==lgout)
		{
			lgout.setBackground(Color.WHITE);
		}
		else if(me.getSource()==bookreq)
		{
			bookreq.setBackground(Color.WHITE);

		}
	}
	public void mouseExited(MouseEvent me)
	{
		if(me.getSource()==member)
		{
			member.setBackground(buttoncolor);
		}
		else if(me.getSource()==lgout)
		{
			lgout.setBackground(buttoncolor);
		}
			else if(me.getSource()==bookreq)
		{
			bookreq.setBackground(buttoncolor);
		}
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==member)
		{
			Member m1=new Member();
			m1.setVisible(true);
			this.setVisible(false);
		}
		else if(ae.getSource()==lgout){
			FontPage m1=new FontPage();
			m1.setVisible(true);
			this.setVisible(false);
	}
	else if(ae.getSource()==bookreq)
	{
			AllReqbook m1=new AllReqbook();
			m1.setVisible(true);
			this.setVisible(false);
	}
}
}

