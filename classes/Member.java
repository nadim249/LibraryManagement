package classes;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.table.*;

public class Member extends JFrame implements MouseListener,ActionListener
{
    JPanel panel;
    JLabel imgback;
    JButton back,deletebtn,addbtn;
    ImageIcon background;
	JTable table;
	DefaultTableModel model;
    Font namefont;
    Color buttoncolor;
	JScrollPane scroll;

    public Member(){
        super("Member List");
        this.setSize(800,600);
        panel=new JPanel();
        panel.setLayout(null);

        namefont=new Font("Cambria",Font.PLAIN,30);
        buttoncolor=new Color(100, 90, 150);

        createTable();
		
        back=new JButton("Back");
		back.addMouseListener(this);
		back.addActionListener(this);
		back.setBounds(100,450,120,40);
		back.setBackground(buttoncolor);
		panel.add(back);

        deletebtn=new JButton("Delete");
		deletebtn.setBounds(260,450,120,40);
		deletebtn.addMouseListener(this);
		deletebtn.addActionListener(this);
		deletebtn.setBackground(buttoncolor);
		panel.add(deletebtn);

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
		String []column={"Name","User ID","Password","Phone"};
		model= new DefaultTableModel(column,0);
		for(int i=0;i<Memberlist.members.size();i++)
		{
			Memberlist ml=Memberlist.members.get(i);
			Object[] members1={ml.getName(),ml.getId(),ml.getPass(),ml.getPhn()};
			model.addRow(members1);
		}
		table = new JTable(model);
		
		table.getTableHeader().setFont(namefont);
		table.setBounds(100,20,600,300);
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
		else if(me.getSource()==deletebtn){
			deletebtn.setBackground(Color.WHITE);

		}
	}
	public void mouseExited(MouseEvent me)
	{
		
		 if(me.getSource()==back)
		{
			back.setBackground(buttoncolor);
		}
		else if(me.getSource()==deletebtn)
		{
			deletebtn.setBackground(buttoncolor);
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
		else if(ae.getSource()==deletebtn)
		{

			int j=table.getSelectedRow();
			if(j!=-1)
			{
				Memberlist.members.remove(j);
				model.setRowCount(0);
				JOptionPane.showMessageDialog(null,"User removed");
				for(int i=0;i<Memberlist.members.size();i++)
				{
					Memberlist ml=Memberlist.members.get(i);
					Object[] members1={ml.getName(),ml.getId(),ml.getPass(),ml.getPhn()};
					model.addRow(members1);
				}
			}
			else
			{
				JOptionPane.showMessageDialog(null,"User is not selected");
			}


		}
	}
}

