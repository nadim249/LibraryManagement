package classes;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Booksmenu extends JFrame implements MouseListener,ActionListener {
    JPanel panel;
    JLabel imgback,bk1,bk2,bk3,bk4,bk5,bk6;
    JButton btn1,btn2,btn3,btn4,backbtn,dt1,dt2,dt3,dt4,dt5,dt6;
    ImageIcon background,book1,book2,book3,book4,book5,book6;
    Font namefont;
    Color buttoncolor;


    public Booksmenu(){
        super("Book Menu");
        this.setSize(800,600);
        panel=new JPanel();
        panel.setLayout(null);
        namefont=new Font("Cambria",Font.PLAIN,30);
        buttoncolor=new Color(132, 203, 243);

        btn1=new JButton("IT BOOKS");
		btn1.setBounds(100,0,130,40);
		btn1.addMouseListener(this);
		btn1.addActionListener(this);
		btn1.setBackground(buttoncolor);
		panel.add(btn1);

        btn2=new JButton("PROGRAMING");
		btn2.setBounds(260,0,130,40);
		btn2.addMouseListener(this);
		btn2.addActionListener(this);
		btn2.setBackground(buttoncolor);
		panel.add(btn2);

        btn3=new JButton("EEE BOOKS");
		btn3.setBounds(415,0,130,40);
		btn3.addMouseListener(this);
		btn3.addActionListener(this);
		btn3.setBackground(buttoncolor);
		panel.add(btn3);

        btn4=new JButton("OTHERS");
		btn4.setBounds(570,0,130,40);
		btn4.addMouseListener(this);
		btn4.addActionListener(this);
		btn4.setBackground(buttoncolor);
		panel.add(btn4);
		
		backbtn=new JButton("Back");
		backbtn.setBounds(620,520,140,40);
		backbtn.addMouseListener(this);
		backbtn.addActionListener(this);
		backbtn.setBackground(buttoncolor);
		panel.add(backbtn);
		
        book1=new ImageIcon("images/cam.jpg");
        bk1=new JLabel(book1);
        bk1.setBounds(50,90,200,150);
        panel.add(bk1);
		
        dt1=new JButton(" Details");
		dt1.setBounds(60,245,180,40);
		dt1.addMouseListener(this);
		dt1.addActionListener(this);
		dt1.setBackground(buttoncolor);
		panel.add(dt1);
		
        book2=new ImageIcon("images/ee.jpg");
        bk2=new JLabel(book2);
        bk2.setBounds(270,90,200,150);
        panel.add(bk2);
		
        dt2=new JButton("Details");
		dt2.setBounds(280,245,180,40);
		dt2.addMouseListener(this);
		dt2.addActionListener(this);
		dt2.setBackground(buttoncolor);
		panel.add(dt2);
		
        book3=new ImageIcon("images/it.jpg");
        bk3=new JLabel(book3);
        bk3.setBounds(490,90,200,150);
        panel.add(bk3);
		
        dt3=new JButton("Details");
		dt3.setBounds(500,245,180,40);
		dt3.addMouseListener(this);
		dt3.addActionListener(this);
		dt3.setBackground(buttoncolor);
		panel.add(dt3);
		
        book4=new ImageIcon("images/java.jpg");
        bk4=new JLabel(book4);
        bk4.setBounds(50,300,200,150);
        panel.add(bk4);
		
        dt4=new JButton("Details");
		dt4.setBounds(60,460,180,40);
		dt4.addMouseListener(this);
		dt4.addActionListener(this);
		dt4.setBackground(buttoncolor);
		panel.add(dt4);
		
        book5=new ImageIcon("images/phy.jpg");
        bk5=new JLabel(book5);
        bk5.setBounds(270,300,200,150);
        panel.add(bk5);
		
        dt5=new JButton("Details");
		dt5.setBounds(280,460,180,40);
		dt5.addMouseListener(this);
		dt5.addActionListener(this);
		dt5.setBackground(buttoncolor);
		panel.add(dt5);
		
        book6=new ImageIcon("images/pi.jpg");
        bk6=new JLabel(book6);
        bk6.setBounds(490,300,200,150);
        panel.add(bk6);
		
        dt6=new JButton("Details");
		dt6.setBounds(500,460,180,40);
		dt6.addMouseListener(this);
		dt6.addActionListener(this);
		dt6.setBackground(buttoncolor);
		panel.add(dt6);
		



        background=new ImageIcon("images/background.png");
        imgback=new JLabel(background);
        imgback.setBounds(0,40,800,600);
        panel.add(imgback);



        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.add(panel);
    }
	
	public void mouseClicked(MouseEvent me){}
	public void mousePressed(MouseEvent me){}
	public void mouseReleased(MouseEvent me){}
		
	public void mouseEntered(MouseEvent me)
	{
    if(me.getSource()==backbtn)
    {
       backbtn.setBackground(Color.WHITE);
    }
	else if(me.getSource()==dt1)
	{
		dt1.setBackground(Color.WHITE);
	}
	else if(me.getSource()==dt2)
	{
		dt2.setBackground(Color.WHITE);
	}
	else if(me.getSource()==dt3)
	{
		dt3.setBackground(Color.WHITE);
	}
	else if(me.getSource()==dt4)
	{
		dt4.setBackground(Color.WHITE);
	}
	else if(me.getSource()==dt5)
	{
		dt5.setBackground(Color.WHITE);
	}
	else if(me.getSource()==dt6)
	{
		dt5.setBackground(Color.WHITE);
	}
	
	//menubar
	else if(me.getSource()==btn1)
	{
		btn1.setBackground(Color.WHITE);
	}
	else if(me.getSource()==btn2)
	{
		btn2.setBackground(Color.WHITE);
	}
	else if(me.getSource()==btn3)
	{
		btn3.setBackground(Color.WHITE);
	}
	else if(me.getSource()==btn4)
	{
		btn4.setBackground(Color.WHITE);
	}
	
	}
	
    
    
     public void mouseExited(MouseEvent me)
    {
    if(me.getSource()==backbtn)
    {
        backbtn.setBackground(buttoncolor);
    }
    else if(me.getSource()==dt1)
    {
        dt1.setBackground(buttoncolor);
    }
    else if(me.getSource()==dt2)
    {
        dt2.setBackground(buttoncolor);
    }
    else if(me.getSource()==dt3)
    {
        dt3.setBackground(buttoncolor);
    }
    else if(me.getSource()==dt4)
    {
        dt4.setBackground(buttoncolor);
    }
    else if(me.getSource()==dt5)
    {
        dt5.setBackground(buttoncolor);
    }
    else if(me.getSource()==dt6)
    {
        dt6.setBackground(buttoncolor);
    }
	//menubar
    else if(me.getSource()==btn1)
    {
        btn1.setBackground(buttoncolor);
    }
    else if(me.getSource()==btn2)
    {
        btn2.setBackground(buttoncolor);
    }
   
    else if(me.getSource()==btn3)
    {
        btn3.setBackground(buttoncolor);
    }
   
    else if(me.getSource()==btn4)
    {
        btn4.setBackground(buttoncolor);
    }
   
   
     }
    public void actionPerformed(ActionEvent ae)
    {
    if(ae.getSource()==backbtn)
    {
         Home h1=new Home();
        h1.setVisible(true);
        this.setVisible(false);

    }
    else if(ae.getSource()==dt1)
    {
		Bkmenudt1 bkm1=new Bkmenudt1();
		bkm1.setVisible(true);
		this.setVisible(false);
    
    }
    else if(ae.getSource()==dt2)
    {
		Bkmenudt2 bkm1=new Bkmenudt2();
		bkm1.setVisible(true);
		this.setVisible(false);
    }
    else if(ae.getSource()==dt3)
    {
		Bkmenudt3 bkm1=new Bkmenudt3();
		bkm1.setVisible(true);
		this.setVisible(false);
    }
    else if(ae.getSource()==dt4)
    {
		Bkmenudt4 bkm1=new Bkmenudt4();
		bkm1.setVisible(true);
		this.setVisible(false);
    
    
    }
    else if(ae.getSource()==dt5)
    {
		Bkmenudt5 bkm1=new Bkmenudt5();
		bkm1.setVisible(true);
		this.setVisible(false);
    
    
    }
    else if(ae.getSource()==dt6)
    {
		Bkmenudt6 bkm1=new Bkmenudt6();
		bkm1.setVisible(true);
		this.setVisible(false);
    }
	//menubar
    else if(ae.getSource()==btn1)
    {
		Itbook bkm1=new Itbook();
		bkm1.setVisible(true);
		this.setVisible(false);
    }
    else if(ae.getSource()==btn2)
    {
		Progra bkm1=new Progra();
		bkm1.setVisible(true);
		this.setVisible(false);
    }
    else if(ae.getSource()==btn3)
    {
		EEbook bkm1=new EEbook();
		bkm1.setVisible(true);
		this.setVisible(false);
    }
    else if(ae.getSource()==btn4)
    {
		Otherbk bkm1=new Otherbk();
		bkm1.setVisible(true);
		this.setVisible(false);
    }
}
    }

