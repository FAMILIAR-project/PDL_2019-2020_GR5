package exceptions;

/**
 * 
 * Classe cr�ant une Exception dans le cas o� la page n'est pas dans les langues suivantes :
 * - Anglais 
 * - Fran�ais
 * 
 * @author Charlotte
 *
 */
public class LangueException extends Exception {

	String message;
	
	public LangueException(String message) {
		super();
		this.message = message;
	}
}
