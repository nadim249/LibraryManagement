package classes;
import java.lang.*;
import java.util.*;
public class Memberlist
{
	private String name,id,pass,phn;
	public static ArrayList<Memberlist>members=new ArrayList<>();
	public Memberlist(){}
	public Memberlist(String name,String id,String pass,String phn)
	{
		this.name=name;
		this.id=id;
		this.pass=pass;
		this.phn=phn;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void setId(String id)
	{
		this.id=id;
	}
	public void setPass(String pass)
	{
		this.pass=pass;
	}
	public void setPhn(String phn)
	{
		this.phn=phn;
	}
	
    public String getName()
	{
		return name;
	}
	 public String getId()
	{
		return id;
	}
	 public String getPass()
	{
		return pass;
	}
	 public String getPhn()
	{
		return phn;
	}
    
}