package fibonacciNumbers;
public class Dispatcher {
	public static void main(String[] args) {
		Index i = new Index(Integer.parseInt(args[0]));
		new Display().display(i.index, new Calculation().calculatioOfNumber(i.index));
	}
}
class Index {
	int index;
	Index(int i) {
		index = i;
	}
}
class Calculation {
	int calculatioOfNumber(int index) {
		int result[] = new int[index];
		if(index < 2) return 0;
		else {
			result[0] = 0;
			result[1] = 1;
			for(int i = 2; i < index; i++) {
				result[i] = result[i-2] + result[i-1];
			}
			return result[index - 1];
		}
	}
}
class Display {
	void display(int index, int result) {
		System.out.println("Fibonacci number with index " + index + " = " + result);
	}
}