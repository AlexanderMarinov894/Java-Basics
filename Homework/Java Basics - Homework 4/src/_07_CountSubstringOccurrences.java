import java.util.*;


public class _07_CountSubstringOccurrences {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a text: ");
		String text = input.nextLine().toLowerCase();
		System.out.print("Enter the substring: ");
		String substring = input.next().toLowerCase();
		input.nextLine();
		int count = 0;
		int index = 0;
		
		while ((index = text.indexOf(substring, index)) != -1) {
		    index++;
		    count++;
		}
		System.out.printf("The text contains %d times the substring \"%s\".",count, substring);
    }
}