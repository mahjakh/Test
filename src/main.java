
public class main {

	public static void main(String[] args) {
		InputOutput io = new InputOutput();
		Sort sort = new Sort();
		int size = io.size;
		int[] array = io.getinput();
		array = sort.BubbleSort(array);
		io.print(array);

	}
}
