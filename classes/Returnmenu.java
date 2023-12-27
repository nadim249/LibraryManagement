package classes;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Returnmenu extends JFrame implements MouseListener,ActionListener{
    JPanel panel;
    JLabel imgback,bookid,Dateid;
    JTextField boofii,datefi;
    ImageIcon background;
    JButton confirmbtn,backbtn2;
     Font namefont;
    Color buttoncolor;

    public Returnmenu(){
        super("Return Menu");
        this.setSize(800,600);
        panel=new JPanel();
        panel.setLayout(null);

        namefont=new Font("Cambria",Font.PLAIN,30);
        buttoncolor=new Color(132, 203, 243);

        bookid = new JLabel(" BOOK ID :");
        bookid.setBounds(200, 200, 200, 35);
		bookid.setFocusable(false);
        panel.add(bookid);

        boofii = new JTextField();
        boofii.setBounds(300, 200, 200, 35);
        panel.add(boofii);

        Dateid = new JLabel(" DATE : ");
        Dateid.setBounds(200, 260, 200, 35);
		Dateid.setFocusable(false);
        panel.add(Dateid);

        datefi = new JTextField();
        datefi.setBounds(300, 260, 200, 35);
        panel.add(datefi);

        confirmbtn=new JButton("Confirm");
		confirmbtn.setBounds(300,300,110,40);
		confirmbtn.addMouseListener(this);
		confirmbtn.addActionListener(this);
		confirmbtn.setBackground(buttoncolor);
		panel.add(confirmbtn);
		
		backbtn2=new JButton("Back");
		backbtn2.setBounds(440,300,110,40);
		backbtn2.addMouseListener(this);
		backbtn2.addActionListener(this);
		backbtn2.setBackground(buttoncolor);
		panel.add(backbtn2);

        



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
		
    
    if(me.getSource()==backbtn2)
    {
       backbtn2.setBackground(Color.WHITE);
    }
	 else if(me.getSource()==confirmbtn)
	    {
		confirmbtn.setBackground(Color.WHITE);
		}
	}
	
    
    
public void mouseExited(MouseEvent me)
{
	if(me.getSource()==confirmbtn)
	    {
		confirmbtn.setBackground(buttoncolor);
		}
		else if(me.getSource()==backbtn2)
    {
        backbtn2.setBackground(buttoncolor);
    }
   
}
public void actionPerformed(ActionEvent ae)
{
	 if(ae.getSource()==confirmbtn)
	 {
		String bookid1=boofii.getText();
		String dateid1=datefi.getText();
	
		
		if(bookid1.isEmpty()||dateid1.isEmpty())
		{
			JOptionPane.showMessageDialog(null,"Fill up all");
		}
		else{
			Returnexp rexp1=new Returnexp(bookid1,dateid1);
			rexp1.addDoc1();
			JOptionPane.showMessageDialog(null,"Successfully returned");
			boofii.setText("");
			datefi.setText("");
			Home h1=new Home();
        h1.setVisible(true);
        this.setVisible(false);
			
		}
		
	}
    else if(ae.getSource()==backbtn2)
    {
         Home h1=new Home();
        h1.setVisible(true);
        this.setVisible(false);

    }
    
    }
    
}
