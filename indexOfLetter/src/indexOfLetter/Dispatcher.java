package indexOfLetter;
public class Dispatcher {
	public static void main(String[] args) {
		String s = "Aba_ aaA a, ���� ��� ������), �� �� ������ �� �� ��������... -----> � <----- a";
		int index = 0;
		for(;;) {
			index = s.indexOf("a", index);
			if(index == -1) break;
			else {
				System.out.println(index);
				index++;
			}
		}
	}
}
