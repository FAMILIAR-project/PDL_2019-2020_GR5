package exceptions;

/**
 * 
 * Classe cr�ant une Exception dans diff�rents cas d'erreur d'URL :
 * - URL d'une page inexistante
 * - URL inexistante
 * 
 * @author Charlotte
 *
 */
public class UrlInvalideException extends Exception{

	String message;
	
	public UrlInvalideException(String message) {
		super();
		this.message = message;
	}
}

