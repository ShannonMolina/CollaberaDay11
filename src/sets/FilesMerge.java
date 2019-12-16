package sets;
import java.io.*;
import java.util.HashSet;
import java.util.Set;
public class FilesMerge {

	public static void main(String[] args) throws IOException {
		BufferedReader bufReader1 = new BufferedReader(new FileReader("file1"));
		BufferedReader bufReader2 = new BufferedReader(new FileReader("file2"));
		PrintWriter pw = new PrintWriter("file3");
		String str1, str2;

//		Set<String> h_set1 = new HashSet<String>();
//		Set<String> h_set2 = new HashSet<String>();
//		Set<String> h_set3 = new HashSet<String>();		
		
		str1 = bufReader1.readLine();
		str2 = bufReader2.readLine();

		while ((str1 != null) || (str2 != null)) {
			if(str1!=null) {
				pw.println(str1); 
				str1 = bufReader1.readLine();			
			} 
//			if(str1!= null && h_set1.add(str1)) {		// if we want to ignore duplicates
//				pw.println(str1); 
//			}
			if(str2!=null) {
				pw.println(str2); 
				str2 = bufReader2.readLine();			
			}
//			if(str2!= null && h_set2.add(str2)) {		// if we want to ignore duplicates
//				pw.println(str2); 
//			}
		}		
		
//		Merge h_set1 and h_set2 into h_set3		
//		h_set3.addAll(h_set1);
//		h_set3.addAll(h_set2);
//		pw.println(h_set3);
		
		bufReader1.close();
		bufReader2.close();
		pw.flush();
		pw.close();

	}

}
