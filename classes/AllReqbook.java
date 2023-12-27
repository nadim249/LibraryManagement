package classes;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.table.*;

public class AllReqbook extends JFrame implements MouseListener,ActionListener
{
    JPanel panel;
    JLabel imgback;
    JButton back;
    ImageIcon background;
	JTable table;
	DefaultTableModel model;
    Font namefont;
    Color buttoncolor;
	JScrollPane scroll;

    public AllReqbook(){
        super("Book Req List");
        this.setSize(800,600);
        panel=new JPanel();
        panel.setLayout(null);

        namefont=new Font("Cambria",Font.PLAIN,30);
        buttoncolor=new Color(100, 90, 150);

        createTable();
		
        back=new JButton("Back");
		back.addMouseListener(this);
		back.addActionListener(this);
		back.setBounds(300,500,120,40);
		back.setBackground(buttoncolor);
		panel.add(back);


        background=new ImageIcon("images/background.png");
        imgback=new JLabel(background);
        imgback.setBounds(0,0,800,600);
        panel.add(imgback);
		

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.add(panel);
    }
	
	public void createTable()
	{
		String []column={"BookName","WriterName","Edition"};
		model= new DefaultTableModel(column,0);
		for(int i=0;i<Reqlist.reuests.size();i++)
		{
			Reqlist rl=Reqlist.reuests.get(i);
			Object[] reuests1={rl.getBookName(),rl.getWritername(),rl.getEdition()};
			model.addRow(reuests1);
		}
		table = new JTable(model);
		
		table.getTableHeader().setFont(namefont);
		table.setBounds(10,10,600,300);
		table.setRowHeight(30);
		table.setBackground(new Color(255,153,51));
		table.setSelectionBackground(new Color(255,153,51));
		
		scroll=new JScrollPane(table);
		scroll.setBounds(30,100,600,300);
		panel.add(scroll);
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
			Admin a1=new Admin();
			a1.setVisible(true);
			this.setVisible(false);
		}
	
}
}

