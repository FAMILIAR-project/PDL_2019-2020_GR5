package exceptions;

/**
 * 
 * Classe cr�ant une Exception dans diff�rents cas d'erreur lors de l'extraction des donn�es de la page Wikip�dia :
 * - Pas de tableaux dans la page
 * 
 * @author Charlotte
 *
 */
public class ExtractionInvalideException extends Exception{

	String message;
	
	public ExtractionInvalideException(String message) {
		super();
		this.message = message;
	}
}

