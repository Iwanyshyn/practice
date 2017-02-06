package inFileOutFile;
import java.io.*; 
public class General {
	public static void main(String[] args) throws IOException {
		File file1 = new File("C:/Java/MyProjects/inFileOutFile/src/inFileOutFile/newFile1");
		if(!file1.exists()) { 
			System.out.println("Ваш файл не створений"); 
		} else { 
			FileReader fr = new FileReader(file1); 
			BufferedReader br = new BufferedReader(fr); 
			String s = br.readLine();
			br.close();
			s = new StringBuffer(s).reverse().toString();
			File file2 = new File("C:/Java/MyProjects/inFileOutFile/src/inFileOutFile/newFile2"); 
			file2.createNewFile(); 
			PrintWriter out = new PrintWriter(file2.getAbsoluteFile()); 
			out.print(s); 
			out.close(); 
			out.flush();
		}
	}
}