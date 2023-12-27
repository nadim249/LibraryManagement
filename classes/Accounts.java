package classes;
import java.lang.*;
import java.util.*;
import java.io.*;
public class Accounts 
{	private File doc;
	private FileWriter docwriter;
	private String name,id,phn,pass;
	private Scanner sc;
	public Accounts()
	{}
	public Accounts(String name,String id,String pass,String phn)
	{
		this.name=name;
		this.id=id;
		this.pass=pass;
		this.phn=phn;
	}
	public void setname(String name)
	{
		this.name=name;
	}
	public void setid(String id)
	{
		this.id=id;
	}
	public void setpass(String pass)
	{
		this.pass=pass;
	}
	public void setphn(String phn)
	{
		this.phn=phn;
	}
	
	public String getname()
	{
		return name;
	}
	public String getid()
	{
		return id;
	}
	public String getpass()
	{
		return pass;
	}
	public String getphn()
	{
		return phn;
	}
	
	public void addDoc()
	{	
		try
		
		{
			doc= new File("data/Studata.txt");
			doc.createNewFile();
			docwriter=new FileWriter(doc,true);
			docwriter.write(getname()+"\t");
			docwriter.write(getid()+"\t");
			docwriter.write(getpass()+"\t");
			docwriter.write(getphn()+"\n");
			docwriter.flush();
			docwriter.close();

		}
		catch(IOException ioe)
		{
			ioe.printStackTrace();
		}
	}
	public boolean getAccount(String id,String pass)
	{
		boolean flag=false;
		doc=new File("data/Studata.txt");
		try
		{
			sc=new Scanner(doc);
			while(sc.hasNextLine())
			{
				String line=sc.nextLine();
				String []value=line.split("\t");
				if(value[1].equals(id) && value[2].equals(pass))
				{
					flag=true;
				}
			}
		}
		catch(IOException ioe)
		{
			ioe.printStackTrace();
		}
		return flag;
	}
	
}