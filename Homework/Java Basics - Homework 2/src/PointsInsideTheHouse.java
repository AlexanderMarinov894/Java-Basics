import java.util.*;

public class PointsInsideTheHouse {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the first and the second points (separated by space): ");
		double point1 = Double.parseDouble(input.next());
		double point2 = Double.parseDouble(input.next());
		input.nextLine();
		boolean isInTheHouse = triangle(point1, point2) || 
							   figure1(point1, point2) || figure2(point1, point2);
		if (isInTheHouse == true) {
			System.out.printf("The point is inside the house.");
		} else {
			System.out.printf("The point is outside the house.");
		}
	}
	
	public static boolean triangle(double x, double y) {
		boolean isInTheTriangle = false;
		double ax = 12.5;
		double ay = 8.5;
		double bx = 22.5;
		double by = 8.5;
		double cx = 17.5;
		double cy = 3.5;
		double areaABC = ((ax*(by-cy)) + (bx*(cy-ay)) + (cx*(ay-by)))/2;
		if (areaABC < 0) {
			areaABC *= -1;
		}
		double areaABP = ((ax*(by-y)) + (bx*(y-ay)) + (x*(ay-by)))/2;
		if (areaABP < 0) {
			areaABP *= -1;
		}
		double areaBCP = ((x*(by-cy)) + (bx*(cy-y)) + (cx*(y-by)))/2;
		if (areaBCP < 0) {
			areaBCP *= -1;
		}
		double areaACP = ((ax*(y-cy)) + (x*(cy-ay)) + (cx*(ay-y)))/2;
		if (areaACP < 0) {
			areaACP *= -1;
		}
		double test = (areaABP + areaBCP + areaACP);
		if (test == areaABC) {
			isInTheTriangle = true;
		} else {
			isInTheTriangle = false;
		}
		return isInTheTriangle;
	}
	
	public static boolean figure1(double x, double y){
		boolean isInTheFigure = false;
		if ((x>=12.5 && x<=17.5) && (y>=8.5 && y<=13.5)) {
			isInTheFigure = true;
		}
		return isInTheFigure;
	}
	
	public static boolean figure2(double x, double y){
		boolean isInTheFigure = false;
		if ((x>=20 && x<=22.5) && (y>=8.5 && y<=13.5)) {
			isInTheFigure = true;
		}
		return isInTheFigure;
	}
}