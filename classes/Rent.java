package classes;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import javax.swing.border.Border;
import java.awt.event.*;

public class Rent extends JFrame implements MouseListener,ActionListener {
    JPanel panel;
    JLabel BooId,Duration,stbtn,imgback;
    JTextField Boo1;
    JComboBox<String> Dur1;
    JButton submit,back;
    ImageIcon background;
    Font namefont;
    Color buttoncolor;
    public Rent(){
        super("Book Rent");
        this.setSize(800,600);
        panel=new JPanel();
        panel.setLayout(null);

        namefont=new Font("Cambria",Font.BOLD,35);
        buttoncolor=new Color(91, 192, 222);

        BooId = new JLabel(" BOOK ID:");
        BooId.setBounds(200, 200, 200, 35);
		BooId.setFocusable(false);
        panel.add(BooId);

        Boo1 = new JTextField();
        Boo1.setBounds(300, 200, 200, 35);
        panel.add(Boo1);

        Duration = new JLabel(" DURATION:");
        Duration.setBounds(200, 260, 200, 35);
		Duration.setFocusable(false);
        panel.add(Duration);

        submit=new JButton("Submit");
		submit.setBounds(300,300,110,40);
		submit.addMouseListener(this);
		submit.addActionListener(this);
		submit.setBackground(buttoncolor);
		panel.add(submit);
		
        back=new JButton("BACK");
		back.setBounds(420,300,110,40);
		back.addMouseListener(this);
		back.addActionListener(this);
		back.setBackground(buttoncolor);
		panel.add(back);

         String durations[] = {"7 days", "5 days"};
        Dur1=new JComboBox<>(durations);
        Dur1.setBounds(300,260,200,35);
        panel.add(Dur1);



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
	else if(me.getSource()==submit)
	{
		submit.setBackground(Color.WHITE);
	}
    }
	
    public void mouseExited(MouseEvent me)
   {
   if(me.getSource()==back)
   {
       back.setBackground(buttoncolor);
   }
   else if(me.getSource()==submit)
   {
	submit.setBackground(buttoncolor);
    }
   }
   
   public void actionPerformed(ActionEvent ae)
   {
   if(ae.getSource()==back)
   {
        Booksmenu h1=new Booksmenu();
       h1.setVisible(true);
       this.setVisible(false);
   }
   else if(ae.getSource()==submit)
   {
	   
	String bookid1=Boo1.getText();
	String Duration1=(String)Dur1.getSelectedItem();

	
	if(bookid1.isEmpty()||Duration1.isEmpty())
	{
		JOptionPane.showMessageDialog(null,"Fill up all");
	}
	else{
		RentAc renp1=new RentAc(bookid1,Duration1);
		renp1.addDoc2();
		JOptionPane.showMessageDialog(null,"Successfully Rented");
		Boo1.setText("");
		Congratulation c1=new Congratulation();
		c1.setVisible(true);
       this.setVisible(false);
		
	}
    }
   }
   
    }

