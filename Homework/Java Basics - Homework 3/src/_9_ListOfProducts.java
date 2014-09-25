import java.util.ArrayList;
import java.util.Collections;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
 
 
public class _9_ListOfProducts {
 
	public static void main(String[] args) {
	    BufferedReader read = null;
	    BufferedWriter write = null;
	    ArrayList<Products> products = new ArrayList<Products>();
 
	    try {
        String currentLine;
        read = new BufferedReader(new FileReader("Input09.txt"));
 
        while ((currentLine = read.readLine()) != null) {
        	String[] splitLine = currentLine.split(" ");
            products.add(new Products(splitLine[0], Double.parseDouble(splitLine[1])));
        }
        
        Collections.sort(products);
                       
        write = new BufferedWriter(new FileWriter("Output09.txt"));
        
        for(Products product : products){
    	write.write(product.getProduct() + " " + (double) product.getPrice() + "\r\n");
        }
           
        write.close();
	    
	    } catch (Exception e) {
            System.err.println("Error!" + e);
        } finally {
        	try {
        		if (read != null){
        			read.close();
        			System.out.println("READY!!!");
                }
            } catch (IOException e) {
            	System.err.println("Error!" + e);
            }
        }
	}
}