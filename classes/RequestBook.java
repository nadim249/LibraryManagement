package classes;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class RequestBook extends JFrame implements MouseListener,ActionListener
{
    JPanel panel;
    JLabel imgback,bookName,writerName,Edition;
    JTextField boofi,writerfi,edifi;
    ImageIcon background;
    JButton backbt,conbtn;
     Font namefont;
    Color buttoncolor;

    public RequestBook()
	{
        super("Book Request");
        this.setSize(800,600);
        panel=new JPanel();
        panel.setLayout(null);

        namefont=new Font("Cambria",Font.PLAIN,30);
        buttoncolor=new Color(132, 203, 243);

        bookName = new JLabel(" BOOK NAME :");
        bookName.setBounds(200, 200, 200, 35);
		bookName.setFocusable(false);
        panel.add(bookName);

        boofi = new JTextField();
        boofi.setBounds(305, 200, 200, 35);
        panel.add(boofi);

        writerName = new JLabel(" WRITER NAME : ");
        writerName.setBounds(200, 260, 200, 35);
		writerName.setFocusable(false);
        panel.add(writerName);

        writerfi = new JTextField();
        writerfi.setBounds(305, 260, 200, 35);
        panel.add(writerfi);

        Edition = new JLabel(" EDITION : ");
        Edition.setBounds(200, 320, 200, 35);
		Edition.setFocusable(false);
        panel.add(Edition);

        edifi = new JTextField();
        edifi.setBounds(305, 320, 200, 35);
        panel.add(edifi);

        conbtn=new JButton("Confirm");
		conbtn.setBounds(300,370,110,40);
		conbtn.addMouseListener(this);
		conbtn.addActionListener(this);
		conbtn.setBackground(buttoncolor);
		panel.add(conbtn);
		
		backbt=new JButton("Back");
		backbt.setBounds(440,370,110,40);
		backbt.addMouseListener(this);
		backbt.addActionListener(this);
		backbt.setBackground(buttoncolor);
		panel.add(backbt);

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
	   if(me.getSource()==conbtn)
	    {
		conbtn.setBackground(Color.WHITE);
		}
	else if(me.getSource()==backbt)
		{
       backbt.setBackground(Color.WHITE);
		}
	}
	   
	public void mouseExited(MouseEvent me)
	{
    if(me.getSource()==conbtn)
	{
		conbtn.setBackground(buttoncolor);
	}
    else if(me.getSource()==backbt)
    {
        backbt.setBackground(buttoncolor);
    }
   
}
	public void actionPerformed(ActionEvent ae)
	{
    if(ae.getSource()==conbtn){
		String bookName1=boofi.getText();
		String writerName1=writerfi.getText();
		String Edition1=edifi.getText();
			
		
		//Bookreqexp brexp=new Bookreqexp();
		
		if(bookName1.isEmpty()||writerName1.isEmpty()||Edition1.isEmpty())
		{
			JOptionPane.showMessageDialog(null,"Fill up all");
		}
		else{
			Reqlist rl=new Reqlist(bookName1,writerName1,Edition1);
			Reqlist.reuests.add(rl);
			
			Bookreqexp brexp1=new Bookreqexp(bookName1,writerName1,Edition1);
			brexp1.addDoc();
			JOptionPane.showMessageDialog(null,"Successfully requested for Book");
			boofi.setText("");
			writerfi.setText("");
			edifi.setText("");
			Home h1=new Home();
        h1.setVisible(true);
        this.setVisible(false);
			
		}
		
	}
	else if(ae.getSource()==backbt)
    {
         Home h1=new Home();
        h1.setVisible(true);
        this.setVisible(false);

    }
    
    }
    
}
