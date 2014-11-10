/**
 * 
 */
package de.daniel.einleser;

/**
 * Interface, was ermöglicht Zahlen oder String einzulesen aus einer Console
 * @author Daniel
 * @since 1.6
 * @version 1.0
 * @see Einleserimp
 */
public interface Einleser
{
	/**
	 * Liest einen belibige Integerzahl ein.
	 * @return Integer
	 * @see de.daniel.einleser.Einleserimp#Stringeinleser()
	 */
	public int Zahleinleser();
	/**
	 * Liest einen bliebigen String ein.
	 * @return String
	 * @see de.daniel.einleser.Einleserimp#Stringeinleser()
	 */
	public String Stringeinleser();

}
