package classes;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Progra extends JFrame implements MouseListener,ActionListener{
    JPanel panel;
    JLabel imgback,bk1,bk2,bk3,bk4,bk5,bk6;
    JButton backbtn,dt1,dt2,dt3,dt4,dt5,dt6;
    ImageIcon background,book1,book2,book3,book4,book5,book6;
    Font namefont;
    Color buttoncolor;


    public Progra(){
        super("Programing BOOKS");
        this.setSize(800,600);
        panel=new JPanel();
        panel.setLayout(null);
        namefont=new Font("Cambria",Font.PLAIN,30);
        buttoncolor=new Color(132, 203, 243);
		
		backbtn=new JButton("Back");
		backbtn.setBounds(620,520,140,40);
		backbtn.addMouseListener(this);
		backbtn.addActionListener(this);
		backbtn.setBackground(buttoncolor);
		panel.add(backbtn);
	
		book1=new ImageIcon("images/pg.png");
        bk1=new JLabel(book1);
        bk1.setBounds(10,150,766,252);
        panel.add(bk1);
		
		dt1=new JButton(" Details");
		dt1.setBounds(50,420,100,40);
		dt1.addMouseListener(this);
		dt1.addActionListener(this);
		dt1.setBackground(buttoncolor);
		panel.add(dt1);
		
		 dt2=new JButton("Details");
		dt2.setBounds(260,420,100,40);
		dt2.addMouseListener(this);
		dt2.addActionListener(this);
		dt2.setBackground(buttoncolor);
		panel.add(dt2);
		
		
        dt3=new JButton("Details");
		dt3.setBounds(460,420,100,40);
		dt3.addMouseListener(this);
		dt3.addActionListener(this);
		dt3.setBackground(buttoncolor);
		panel.add(dt3);
		
		dt4=new JButton("Details");
		dt4.setBounds(650,420,100,40);
		dt4.addMouseListener(this);
		dt4.addActionListener(this);
		dt4.setBackground(buttoncolor);
		panel.add(dt4);	

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
	}
   
   public void actionPerformed(ActionEvent ae)
   {
   if(ae.getSource()==backbtn)
   {
       Booksmenu h1=new Booksmenu();
       h1.setVisible(true);
       this.setVisible(false);
	   
     }

    else if(ae.getSource()==dt1)
    {
		Pg1 bkm1=new Pg1();
		bkm1.setVisible(true);
		this.setVisible(false);
    
      }
    else if(ae.getSource()==dt2)
    {
		Pg2 bkm1=new Pg2();
		bkm1.setVisible(true);
		this.setVisible(false);
    }
    else if(ae.getSource()==dt3)
    {
		Pg3 bkm1=new Pg3();
		bkm1.setVisible(true);
		this.setVisible(false);
    }
    else if(ae.getSource()==dt4)
    {
		Pg4 bkm1=new Pg4();
		bkm1.setVisible(true);
		this.setVisible(false);
    }	   

   }
   
 }
	
