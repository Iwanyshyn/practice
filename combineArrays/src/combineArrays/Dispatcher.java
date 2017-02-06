package combineArrays;
import java.util.*;
public class Dispatcher {
	public static void main(String[] args) {
		Array a = new Array();
		Action ac = new Action();
		a.buffer = ac.combine(a.array1, a.array2);
		a.buffer = ac.sort(a.buffer);
		a.result = ac.multiplicity(a.buffer, a.result);
		new Display().display(a.result);
	}
}
class Array {
	int array1[] = {10, -32, 5, 100, 22};
	int array2[] = {9, -18, 10, -32, 5, 8, 32, 100};
	int buffer[];
	int result[];
}
class Action {
	Array a = new Array();
	int length = a.array1.length + a.array2.length;
	int array0[] = new int[length];
		int[] combine(int a1[], int a2[]) {
		int counter = 0;
		for(int i = 0; i < length; i++) {
			if(i < a1.length) array0[i] = a1[i];
			else array0[i] = a2[counter++];
		}
		return array0;
	}
	int[] sort(int b[]) {
		Arrays.sort(b);
		return b;
	}
	int[] multiplicity(int b[], int r[]) {
		int counter = 0;
		for(int x : b) if(x%5 != 0) counter++;
		r = new int [counter];
		counter = 0;
		for(int x : b) if(x%5 != 0) {
			r[counter] = x;
			counter++;
		}
		return r;
	}
}
class Display {
	void display(int r[]) {
		System.out.print("Result: ");
		for(int x : r) System.out.print(x + " ");
	}
}