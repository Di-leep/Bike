package dileep;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReading {
	public static void main(String args[]) throws IOException {
		
		File file = new File("C:\\TextFolder\\Annotation.txt");
		FileReader fr= new FileReader(file);
		int temp =0;
		
		while((temp=fr.read())!=-1) {
			System.out.print((char)(temp));
		}
		System.out.println(temp);
	}

}
