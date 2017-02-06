package wordSearch;
import java.util.Scanner;
import java.io.*;
public class Dispatcher {
	public static void main(String[] args) throws IOException {
		EntranceParamatery ep = new EntranceParamatery();
		ReadFile rf = new ReadFile(); 
		FindWord fw = new FindWord(); 
		ep.initialisation();
		String line = rf.read(ep.address);
		switch(ep.regime) {
		case"default":
			System.out.println(fw.defaultRegime(ep.word, line));
			break;
		case"advanced":
			System.out.println(fw.advancedRegime(ep.word, line));
			break;
			default:
				System.out.println("Entering failed");
				break;
		}
	}
}

class EntranceParamatery {
	String address;
	String word;
	String regime;
	void initialisation() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter address !");
		address = sc.nextLine();
		System.out.println("Enter word !");
		word = sc.nextLine();
		System.out.println("Enter regime (default or advanced) !");
		regime = sc.nextLine();
		sc.close();
	}
}
class ReadFile {
	String text;
	String read(String address) throws IOException {
		File file = new File(address);
		if(!file.exists()) { 
			System.out.println("Ваш файл не створений");
		} else {
			FileReader fr = new FileReader(file); 
			BufferedReader br = new BufferedReader(fr); 
			text = br.readLine();
			br.close();
		}
		return text;
	}
}
class FindWord {
	int defaultRegime(String w, String l) {
		int index = 0;
		int counter = 0;
		for(;;) {
			index = l.indexOf(w, index);
			if(index == -1) break;
			else {
				index++;
				counter++;
			}
		}
		return counter;
	}
	
	int advancedRegime(String w, String l) {
		String str [] = l.split(" ");
		int counter = 0;
		for(String s : str) if(s.equals(w)||s.equals(w+".")||s.equals(w+",")) counter++;
		return counter;
	}
}