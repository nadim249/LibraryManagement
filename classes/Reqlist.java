package classes;
import java.lang.*;
import java.util.*;
public class Reqlist
{
	private String bookname,writername,edition;
	public static ArrayList<Reqlist>reuests=new ArrayList<>();
	public Reqlist(){}
	public Reqlist(String bookname,String writername,String edition)
	{
		this.bookname=bookname;
		this.writername=writername;
        this.edition=edition;
	}
	public void setBookName(String bookname)
	{
		this.bookname=bookname;
	}
	public void setWriternname(String writername)
	{
		this.writername=writername;
	}
	public void setEdition(String edition)
	{
		this.edition=edition;
	}

	
    public String getBookName()
	{
		return bookname;
	}
	 public String getWritername()
	{
		return writername;
	}
	 public String getEdition()
	{
		return edition;
	}
}