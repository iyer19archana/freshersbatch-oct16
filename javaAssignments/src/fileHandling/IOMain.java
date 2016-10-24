package fileHandling;
import java.io.*;


public class IOMain {
	
public static void main(String args[]) throws Exception
	{
	
	File file = new File("D:/freshtraining/freshersbatch-oct16/abc.txt");
	FileOutputStream fos = new FileOutputStream(file);
	String strData="hello world";
	fos.write(strData.getBytes());
	fos.flush();
	fos.close();
	
	FileInputStream fis = new FileInputStream(file);
	StringBuilder sb = new StringBuilder("");
	/*int i = 0;
	do {
	i = fis.read();
	if(i != -1)
	sb.append((char)i);
	}
	while(i != -1); // -1 represents end of file (EOF)
	System.out.println("File contents: "+ sb);
	fis.close();
	*/
	File f1=new File("pqr.txt");
	
	FileOutputStream fo=new FileOutputStream(f1);
	int j=0;
	do
	{	
	j=fis.read();
	fo.write(j);
	}while(j!=-1);
	fo.flush();
	fo.close();
	StringBuilder s=new StringBuilder("");
	FileInputStream fi=new FileInputStream(f1);
	int i = 0;
	do {
	i = fi.read();
	if(i != -1)
	sb.append((char)i);
	}
	while(i != -1); // -1 represents end of file (EOF)
	System.out.println("File contents: "+ sb);
	fis.close();
	
	

}
}
