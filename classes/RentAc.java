package classes;
import java.lang.*;
import java.util.*;
import java.io.*;
public class RentAc{
	private File docrent;
	private FileWriter doccwriter;
	private String bookid,dur;
	
	
	public RentAc()
	{}
	
	public RentAc(String bookid,String dur)
	{
		this.bookid=bookid;
		this.dur=dur;
	}
	
	public void setbookid(String bookid)
	{
		this.bookid=bookid;
	}
	
	public void setdur(String dur){
		this.dur=dur;
	}
	
	public String getbookid(){
		return bookid;
	}
	
	public String getdur(){
		return dur;
	}
	
	
	public void addDoc2()
	{
		try
		{
			docrent=new File("data/RentDoc.txt");
			docrent.createNewFile();
			doccwriter=new FileWriter(docrent,true);
			doccwriter.write(getbookid()+"\t");
			doccwriter.write(getdur()+"\n");
			doccwriter.flush();
			doccwriter.close();
			
		}
		catch(IOException ioe){
			ioe.printStackTrace();
		}	
	}
	
}
