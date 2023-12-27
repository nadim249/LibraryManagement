package classes;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class It3 extends JFrame implements MouseListener,ActionListener
 {
    JPanel panel;
    JLabel imgback,bookimg,bookname,writername,bookid;
    JButton rentbt,back;
    ImageIcon logo1,background;
    Font namefont;
    Color buttoncolor;
    public It3(){
        super("Book Details");
        this.setSize(800,600);
        panel=new JPanel();
        panel.setLayout(null);
		
        namefont=new Font("Cambria",Font.PLAIN,22);
        buttoncolor=new Color(132, 203, 243);
		
        bookname=new JLabel("Name: Cyber Security ");
        bookname.setBounds(450,130,330,50);
		bookname.setFont(namefont);
        panel.add(bookname);
		
        bookname=new JLabel("WriterName: Brian Walker");
        bookname.setBounds(450,190,330,50);
		bookname.setFont(namefont);
        panel.add(bookname);
		
        bookname=new JLabel("Book ID: 1113");
        bookname.setBounds(450,260,330,50);
		bookname.setFont(namefont);
        panel.add(bookname);

        logo1=new ImageIcon("images/it3.jpg");
        bookimg=new JLabel(logo1);
        bookimg.setBounds(30,50,400,450);
        panel.add(bookimg);

        rentbt=new JButton("RENT");
		rentbt.setBounds(460,380,130,40);
		rentbt.addMouseListener(this);
		rentbt.addActionListener(this);
		rentbt.setBackground(buttoncolor);
		panel.add(rentbt);
		
        back=new JButton("BACK");
		back.setBounds(620,380,130,40);
		back.addMouseListener(this);
		back.addActionListener(this);
		back.setBackground(buttoncolor);
		panel.add(back);




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
    if(me.getSource()==back)
    {
       back.setBackground(Color.WHITE);
    }
	else if(me.getSource()==rentbt)
	{
		rentbt.setBackground(Color.WHITE);
	}
    }
	
    public void mouseExited(MouseEvent me)
   {
   if(me.getSource()==back)
   {
       back.setBackground(buttoncolor);
   }
   else if(me.getSource()==rentbt)
   {
	rentbt.setBackground(buttoncolor);
    }
   }
   
   public void actionPerformed(ActionEvent ae)
   {
   if(ae.getSource()==back)
   {
        Itbook h1=new Itbook();
       h1.setVisible(true);
       this.setVisible(false);
   }
   else if(ae.getSource()==rentbt)
   {
	   Rent rn1=new Rent();
	   rn1.setVisible(true);
	   this.setVisible(false);
    }
   }
}
