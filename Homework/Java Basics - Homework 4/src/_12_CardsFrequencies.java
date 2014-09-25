import java.util.*;

public class _12_CardsFrequencies {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.print("Enter cards face and suit (on one line separated by space): ");
		String cardsInput = input.nextLine();
		String[] cards = cardsInput.split("[♥♣♦♠ ]+");
		int value = 0;
		Map<String,Integer> cardsList = new LinkedHashMap<>();
		
		for (String card : cards) {
			value = cardsList.getOrDefault(card, value);
			cardsList.put(card, value+1);
		}
		
		System.out.println("The results are: ");
		double cardsNumber = cards.length;
		for (Map.Entry<String, Integer> card : cardsList.entrySet()) {
			double persentage = card.getValue()/cardsNumber;
			System.out.printf("%s -> %.2f%%\n",card.getKey(), persentage*100);
			
		}
	}
}