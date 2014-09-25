import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class _8_SumNumbersFromATextFile {
	public static void main(String[] args) {
		try {
			Scanner file = new Scanner(new File("Input.txt"));
			readFromFile(file);
		} catch (FileNotFoundException e) {
			System.err.println("Error: Missing file!");
		}
	}
	
	public static void readFromFile(Scanner file){
		int sum = 0;
		int i = 0;
		
		while (true) {
			try {
				sum += file.nextInt();
			} catch (Exception e) {
				break;
			}
		}
		
		System.out.printf("The sum of the numbers in Input.txt is %d.", sum);
	}
}