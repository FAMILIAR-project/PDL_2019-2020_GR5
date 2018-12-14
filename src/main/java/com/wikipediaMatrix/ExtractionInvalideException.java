package main.java.com.wikipediaMatrix;

/**
 * 
 * Classe creant une Exception dans differents cas d'erreur lors de l'extraction des donnees de la page Wikipedia :
 * - Pas de tableau dans la page
 * 
 * @author Groupe 4
 *
 */
public class ExtractionInvalideException extends Exception{

	String message;
	
	public ExtractionInvalideException(String message) {
		super();
		this.message = message;
	}
}

