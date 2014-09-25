import java.util.*;

import com.sun.xml.internal.ws.util.StringUtils;

public class _5_AngleUnitConverter {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of queries: ");
		int queries = Integer.parseInt(input.nextLine());
		ArrayList<String> results = new ArrayList<String>();
		double number = 0;
		String measure = "null";
		
		for (int i = 1; i <= queries; i++) {
			System.out.print("Enter a value(value + \"deg\"/\"rad\"): ");
			number = Double.parseDouble(input.next());
			measure = input.next();
			input.nextLine();
			if (measure.equals("deg")) {
				results.add(degreesToRadians(number));
			} else if (measure.equals("rad")) {
				results.add(radiansToDegrees(number));
			}
		}
		
		printResults(results);
		
	}
	
	public static String degreesToRadians(double degrees){
		double resultNumber = Math.toRadians(degrees);
		resultNumber = roundToSix(resultNumber, 6);
		String result = String.valueOf(resultNumber + " " + "rad");
		return result;
	}
	
	public static String radiansToDegrees(double radians){
		double resultNumber = Math.toDegrees(radians);
		resultNumber = roundToSix(resultNumber, 6);
		String result = String.valueOf(resultNumber + " " + "deg");
		return result;
	}
	
	public static double roundToSix(double value, int places) {
	    if (places < 0) {
	    	throw new IllegalArgumentException();
	    }
	    long factor = (long) Math.pow(10, places);
	    value = value * factor;
	    long tmp = Math.round(value);
	    return (double) tmp / factor;
	}
	
	public static void printResults(ArrayList<String> results){
		System.out.println("\nThe results are: ");
		for (String result : results) {
			System.out.println(result);
		}
	}
}