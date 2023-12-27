package classes;
import java.lang.*;
import java.util.*;
import java.io.*;
public class Bookreqexp{
	private File doc;
	private FileWriter dowriter;
	private String bookname,writername,edition;
	//private Scanner sc;
	
	public Bookreqexp()
	{}
	
	public Bookreqexp(String bookname,String writername,String edition)
	{
		this.bookname=bookname;
		this.writername=writername;
		this.edition=edition;
	}
	
	public void setbookname(String bookname){
		this.bookname=bookname;
	}
	
	public void setwritername(String writername){
		this.writername=writername;
	}
	
	public void setedition(String edition){
		this.edition=edition;
	}
	
	public String getbookname(){
		return bookname;
	}
	
	public String getwritername(){
		return writername;
	}
	
	public String getedition(){
		return edition;
	}
	
	public void addDoc()
	{
		try
		{
			doc=new File("data/ReqDoc.txt");
			doc.createNewFile();
			dowriter=new FileWriter(doc,true);
			dowriter.write(getbookname()+"\t");
			dowriter.write(getwritername()+"\t");
			dowriter.write(getedition()+"\n");
			dowriter.flush();
			dowriter.close();
			
		}
		catch(IOException ioe){
			ioe.printStackTrace();
		}	
	}
	
}
