package classes;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Home extends JFrame implements MouseListener,ActionListener
 {
    JPanel panel;
    JLabel imgback,book,rebook,reqbook;
    JButton books,returnbtn,reqnewbutton,lgout;
    ImageIcon logo1,logo3,logo4,background;
    Font namefont;
    Color buttoncolor;
    public Home(){
        super("Home");
        this.setSize(800,600);
        panel=new JPanel();
        panel.setLayout(null);

        namefont=new Font("Cambria",Font.PLAIN,30);
        buttoncolor=new Color(132, 203, 243);

        logo1=new ImageIcon("images/bookslogo.png");
        book=new JLabel(logo1);
        book.setBounds(180,220,120,100);
        panel.add(book);


        logo3=new ImageIcon("images/return.png");
        rebook=new JLabel(logo3);
        rebook.setBounds(340,220,120,100);
        panel.add(rebook);

        logo4=new ImageIcon("images/boookreq.png");
        reqbook=new JLabel(logo4);
        reqbook.setBounds(500,220,120,100);
        panel.add(reqbook);

        books=new JButton("BOOKS");
		books.setBounds(180,340,120,40);
		books.addMouseListener(this);
		books.addActionListener(this);
		books.setBackground(buttoncolor);

		panel.add(books);

        returnbtn=new JButton("Return");
		returnbtn.setBounds(340,340,120,40);
		returnbtn.addMouseListener(this);
		returnbtn.addActionListener(this);
		returnbtn.setBackground(buttoncolor);
		panel.add(returnbtn);

        reqnewbutton=new JButton("NewBook Req");
		reqnewbutton.setBounds(500,340,120,40);
		reqnewbutton.addMouseListener(this);
		reqnewbutton.addActionListener(this);
		reqnewbutton.setBackground(buttoncolor);
		panel.add(reqnewbutton);

        lgout=new JButton("Log Out");
		lgout.setBounds(600,480,120,40);
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
	public void mouseEntered(MouseEvent me){
		
    if(me.getSource()==books)
    {
        books.setBackground(Color.WHITE);
    }
    else if(me.getSource()==returnbtn)
    {
        returnbtn.setBackground(Color.WHITE);
    }
    else if(me.getSource()==reqnewbutton)
    {
        reqnewbutton.setBackground(Color.WHITE);
    }
	}
	
    
    
public void mouseExited(MouseEvent me)
{
    if(me.getSource()==books)
    {
        books.setBackground(buttoncolor);
    }
    else if(me.getSource()==returnbtn)
    {
        returnbtn.setBackground(buttoncolor);
    }
    else if(me.getSource()==reqnewbutton)
    {
        reqnewbutton.setBackground(buttoncolor);
    }
}
public void actionPerformed(ActionEvent ae)
{
    if(ae.getSource()==books)
    {
        Booksmenu bm1=new Booksmenu();
        bm1.setVisible(true);
        this.setVisible(false);

    }
    else if(ae.getSource()==returnbtn)
    {
       Returnmenu r1=new Returnmenu();
        r1.setVisible(true);
        this.setVisible(false);
    }
    else if(ae.getSource()==reqnewbutton)
    {
        RequestBook reqb1=new RequestBook();
        reqb1.setVisible(true);
        this.setVisible(false);
    }
    else if(ae.getSource()==lgout){
        FontPage f1=new FontPage();
        f1.setVisible(true);
        this.setVisible(false);
    }
}

 
 }
