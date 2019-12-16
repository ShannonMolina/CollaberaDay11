package sets;
import java.io.*;
import java.util.*;
public class FileIOTest {

	public static void main(String[] args) throws FileNotFoundException, IOException{
	//	File file = new File("inputText");
	//	FileReader fileReader = new FileReader(file);
		BufferedReader bufReader = new BufferedReader(new FileReader("inputText"));
		PrintWriter pw = new PrintWriter("inputText2");
		Set<String> h_set = new HashSet<String>();
		String str;
		
		str = bufReader.readLine();
		while (str!=null) {
			if(h_set.add(str)) {
				pw.println(str); //Because we are reading and printing line by line, the
								// contents are being printed in the order they go in	
								// but the hash set is unordered
			}
			str = bufReader.readLine();			
		}
		bufReader.close();
		pw.flush();
		pw.close();
		

	}

}
