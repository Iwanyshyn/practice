package triangleOfPascal;
import java.io.IOException;
import java.util.Scanner;
public class Dispatcher {
	public static void main(String[] args) throws IOException {
		Data d = new Data();
		LineCounter lc = new LineCounter();
		Display dp = new Display();
		d.initialisation();
		d.line = lc.counter(d.numberOfLine);
		dp.show(d.line);
	}
}

class Data {
	int numberOfLine;
	int line[];
	void initialisation() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of line !");
		numberOfLine = (sc.nextInt());
		line = new int[numberOfLine];
		sc.close();
	}
}

class LineCounter {
	int factorial(int n) {
		int factorial = 1;
		for(int i=1; i<=n; i++) {
			factorial *= i;
		}
		return factorial;
	}
	int[] counter(int n) {
		int line[] = new int[n];
		for(int i=0; i<n; i++) {
			line[i] = factorial(n-1) / (factorial(i) * factorial((n-1) - i));
		}
		return line;
	}
}

class Display {
	void show(int[] line) {
		for(int i : line) System.out.print(i + " ");
	}
}