package de.daniel.einleser;

import java.util.Scanner;


/**
 * Implementiert das Interface Einleser
 * @author Daniel
 * @since 1.6
 * @version 1.5
 * @see Einleser
 */
public class Einleserimp implements Einleser
{
	/**
	 * Liest einen String ein
	 * @see de.daniel.einleser.Einleser#Zahleinleser()
	 * @return Interger
	 * @throws java.lang.NumberFormatException
	 */
	public int Zahleinleser()
	{
		
		Scanner sc = new Scanner(System.in);
		int z;
		while (true)
		{
			try
			{
				String line = sc.next();
				sc.close();
				z = Integer.parseInt(line);
				break;
			}
			catch (java.lang.NumberFormatException e)
			{
				System.out.println("Fehler 06: Kein Integer! Nochmal versuchen");
			}
		}
		return z;
	}
	/**
	 * Liest einen beliebigen String ein.
	 * @see de.daniel.einleser.Einleser#Stringeinleser()
	 * @return String
	 */
	public String Stringeinleser()
	{
		Scanner sc = new Scanner(System.in);
		return sc.nextLine();
	}

}
