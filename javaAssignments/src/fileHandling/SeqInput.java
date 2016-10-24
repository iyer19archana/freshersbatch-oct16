package fileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.SequenceInputStream;

public class SeqInput {

	public static void main(String[] args) throws Exception {
		FileInputStream f1=new FileInputStream("D:/freshtraining/freshersbatch-oct16/abcde.txt");
		FileInputStream f2= new FileInputStream("D:/freshtraining/freshersbatch-oct16/abc.txt");
		
		SequenceInputStream seq=new SequenceInputStream(f1,f2);
		int i;
		
		while((i=seq.read())!=-1)
		{
			System.out.print((char)i);
		}
	}

}
