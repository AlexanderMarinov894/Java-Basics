package GenerateAPDFByExternalLibrary;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class PrintCards {
	public static void main(String[] args) {
		Document pdf = new Document();
		String[] cards = {"2", "3", "4", "5", "6", "7", "8", 
				 "9", "10", "J", "Q", "K", "A"};
		String[] types = {"\u2663", "\u2665", "\u2660", "\u2666"};
			
		String[] allCards = new String[52];
		int allCardsIndex = 0;
		for (int cardsIndex = 0; cardsIndex < cards.length; cardsIndex++) {
			for (int typesIndex = 0; typesIndex < types.length; typesIndex++) {
				String newElement = cards[cardsIndex] + types[typesIndex];
				allCards[allCardsIndex] = newElement;
				allCardsIndex++;
			}
		}
		
		try {
            BaseFont baseFont = BaseFont.createFont("arialbd.ttf", BaseFont.IDENTITY_H, BaseFont.EMBEDDED);
            Font red = new Font(baseFont, 24, Font.NORMAL, BaseColor.RED);
            Font black = new Font(baseFont,24, Font.NORMAL, BaseColor.BLACK);
            PdfWriter.getInstance(pdf, new FileOutputStream("Playing cards.pdf"));
			pdf.open();
			PdfPTable table = new PdfPTable(4);
            table.setWidthPercentage(50);
            table.getDefaultCell().setFixedHeight(100);
            table.getDefaultCell().setBorderColor(BaseColor.BLACK);
            table.getDefaultCell().setVerticalAlignment(Element.ALIGN_MIDDLE);
            table.getDefaultCell().setHorizontalAlignment(Element.ALIGN_CENTER);
            table.getDefaultCell().setLeading(15f, 0f); //Generating a table
			for (allCardsIndex = 0; allCardsIndex < allCards.length; allCardsIndex++) {
				if ((allCardsIndex == 0) || (allCardsIndex%2 == 0)) {	
					table.addCell(new Paragraph(allCards[allCardsIndex], black));
				} else {
					table.addCell(new Paragraph(allCards[allCardsIndex], red));
				}
			}
			pdf.add(table);
			pdf.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (DocumentException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		if (Desktop.isDesktopSupported()) {
		    try {
		        File playingCards = new File("Playing cards.pdf");
		        Desktop.getDesktop().open(playingCards);
		    } catch (IOException ex) {
		    }
		}
	}
}