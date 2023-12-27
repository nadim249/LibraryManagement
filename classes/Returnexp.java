package classes;
import java.lang.*;
import java.util.*;
import java.io.*;
public class Returnexp{
	private File docr;
	private FileWriter docwriter;
	private String bookid,dateid;
	
	
	public Returnexp()
	{}
	
	public Returnexp(String bookid,String dateid)
	{
		this.bookid=bookid;
		this.dateid=dateid;
	}
	
	public void setbookid(String bookid){
		this.bookid=bookid;
	}
	
	public void setdateid(String dateid){
		this.dateid=dateid;
	}
	
	public String getbookid(){
		return bookid;
	}
	
	public String getdateid(){
		return dateid;
	}
	
	
	public void addDoc1()
	{
		try
		{
			docr=new File("data/ReturnDoc.txt");
			docr.createNewFile();
			docwriter=new FileWriter(docr,true);
			docwriter.write(getbookid()+"\t");
			docwriter.write(getdateid()+"\n");
			docwriter.flush();
			docwriter.close();
			
		}
		catch(IOException ioe){
			ioe.printStackTrace();
		}	
	}
	
}
