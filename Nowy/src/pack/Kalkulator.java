package pack;
import java.io.*;
import java.util.*;
import java.util.Scanner;

import org.apache.commons.lang3.StringUtils;

/**
 * @author Wawrzyniec
 *
 */
/**
 * @author Wawrzyniec
 *
 */
public class Kalkulator {	
	public int opcja;
	
	/**
	 * @throws FileNotFoundException
	 */
	public void start() throws FileNotFoundException
	{

		if(opcja==0)
			{
			System.out.println("Wybrano odczyt z konsoli \nNapisz 'koniec' aby wyjsc do menu.");
			Scanner scanner=new Scanner(System.in);
			String odczyt;
			while(true)
			{
			odczyt=scanner.nextLine();
			String[]podzielony=StringUtils.splitByCharacterType(odczyt);
			for(String i:podzielony)
				System.out.println(i);
			int wynik=0,i=0,liczba1=0,liczba2=0;
			if(odczyt.contains("koniec"))
			{
				System.out.println("Wyjscie do menu.");
				break;
			}
			if(StringUtils.isNumeric(podzielony[i]))//jesli mam liczbe1
			{
				wynik=liczba1=Integer.parseInt(podzielony[i]);
				i=i+2;
			}

			while(i<podzielony.length)
			{

				
				if(StringUtils.isNumeric(podzielony[i]))//jesli mam liczbe2
				{
					liczba2=Integer.parseInt(podzielony[i]);
					i=i-1;//cofam...
					
				}
				if(StringUtils.contains(podzielony[i],"+"))//...i sprawdzam znak pomiedzy liczbami
				{
					wynik+=liczba2;
					i+=3;
				}
				else
				if(StringUtils.contains(podzielony[i],"-"))//...i sprawdzam znak pomiedzy liczbami
				{
					wynik-=liczba2;
					i+=3;
				}
				else
				if(StringUtils.contains(podzielony[i],"*"))//...i sprawdzam znak pomiedzy liczbami
				{
					wynik*=liczba2;
					i+=3;
				}
				else
				if(StringUtils.contains(podzielony[i],"/"))//...i sprawdzam znak pomiedzy liczbami
				{
					wynik/=liczba2;
					i+=3;
				}
			}
			System.out.println("Wynik od lewej do prawej to:"+wynik);
		}//while
				
		
			}
		else
			if(opcja==1)
			{
				System.out.println("Wybrano czytanie z pliku.");
				File plik=new File("dane_kalkulator.txt");
				Scanner scanner=new Scanner(plik);
				String odczyt;
				while(true)
				{
				odczyt=scanner.nextLine();
				String[]podzielony=StringUtils.splitByCharacterType(odczyt);
				for(String i:podzielony)
					System.out.println(i);
				int wynik=0,i=0,liczba1=0,liczba2=0;
				if(StringUtils.isNumeric(podzielony[i]))//jesli mam liczbe1
				{
					wynik=liczba1=Integer.parseInt(podzielony[i]);
					i=i+2;
				}

				while(i<podzielony.length)
				{

					
					if(StringUtils.isNumeric(podzielony[i]))//jesli mam liczbe2
					{
						liczba2=Integer.parseInt(podzielony[i]);
						i=i-1;//cofam...
						
					}
					if(StringUtils.contains(podzielony[i],"+"))//...i sprawdzam znak pomiedzy liczbami
					{
						wynik+=liczba2;
						i+=3;
					}
					else
					if(StringUtils.contains(podzielony[i],"-"))//...i sprawdzam znak pomiedzy liczbami
					{
						wynik-=liczba2;
						i+=3;
					}
					else
					if(StringUtils.contains(podzielony[i],"*"))//...i sprawdzam znak pomiedzy liczbami
					{
						wynik*=liczba2;
						i+=3;
					}
					else
					if(StringUtils.contains(podzielony[i],"/"))//...i sprawdzam znak pomiedzy liczbami
					{
						wynik/=liczba2;
						i+=3;
					}
				}
				System.out.println("Wynik od lewej do prawej to:"+wynik);
				if(scanner.hasNextLine()==false)
				{
					System.out.println("Brak dalszych danych. Koniec pracy.");
					scanner.close();
					break;
				}

			}//while
		
			}
		
	}//start()
	
	
	/**
	 * @param opcja
	 */
	public Kalkulator(int opcja)
	{
		this.opcja=opcja;
	}
	
}//public class Kalkulator
