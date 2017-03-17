package pack;
import java.io.*;
import java.util.*;
import org.apache.*;
import org.apache.commons.lang3.StringUtils;

/**
 * @author Wawrzyniec
 *
 */
public class Main {
/**
 * @param args
 */
public static void main (String[] args)
{
	Scanner scanner=new Scanner(System.in); 
	while(true)
	{
	System.out.println("0-czytanie z konsoli");
	System.out.println("1-czytanie z pliku 'dane_kalkulator.txt'");
	System.out.println("2-koniec pracy programu");
	int wybor=Integer.parseInt(scanner.nextLine());
	
	if(wybor==2)
	{
		System.out.println("Koniec pracy.");
		scanner.close();
		break;
	}
	Kalkulator kalkulator=new Kalkulator(wybor);
	try {
		kalkulator.start();
	} catch (FileNotFoundException e) {
		 System.err.println("File does not exist");
	}
	}//while
}
}
