import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class _7_DaysBetweenTwoDates {
	public static void main(String[] args) throws ParseException {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		System.out.print("Enter the first date (dd-MM-yy): ");
		String inputDate1 = input.nextLine();
		System.out.print("Enter the second date (dd-MM-yy): ");
		String inputDate2 = input.nextLine();
		diff(dateFormat, inputDate1, inputDate2);
	}
	
	public static void diff(SimpleDateFormat dateFormat, String inputDate1, String inputDate2) throws ParseException{
	    Date date1 = dateFormat.parse(inputDate1);
	    Date date2 = dateFormat.parse(inputDate2);
	    long difference = date2.getTime() - date1.getTime();
	    System.out.printf("There are %d days between %s and %s.", TimeUnit.DAYS.convert(difference, TimeUnit.MILLISECONDS), 
	    														  inputDate1, inputDate2);
	}
}