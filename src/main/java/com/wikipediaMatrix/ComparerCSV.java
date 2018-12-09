package com.wikipediaMatrix;

/**
 * Classe permettant de recuperer dse statistiques sur les deux methodes de recuperation de table wikipedia,
 * afin de determiner laquelle est la meilleure.
 * @author mathi & thomas
 *
 */
public class ComparerCSV {

	private Donnee_Html html;
	private Donnee_Wikitable wikitable;
	private long tempsExeHtml;
	private long tempsExeWikitable;
	private int tablesHtml;
	private int tablesWikitext;
	private int lignesHtml;
	private int lignesWikitable;
	private int colonnesHtml;
	private int colonnesWikitable;
	
	/**
	 * Constructure de ComparerCSV, a instancier pour chaque pgaage wikipedia
	 * @param html l'objet gerant le parsing du html au csv
	 * @param wikitable l'objet gerant le parsing du wikitext au csv
	 */
	public ComparerCSV(Donnee_Html html, Donnee_Wikitable wikitable) {
		this.html = html;
		this.wikitable = wikitable;
	}

	/**
	 * Recupere des statistiques sur les deux modes d'extraction - Wikitext & HTML - 
	 * das l'optique de determier lequel est le meilleur.
	 */
	public void informationsExtraction() {
		this.tempsExeHtml = html.getTime();
		this.tempsExeWikitable = wikitable.getTime();
		this.lignesHtml = html.getLignesEcrites();
		this.lignesWikitable = wikitable.getLignesEcrites();
		this.colonnesHtml = html.getColonnesEcrites();
		this.colonnesWikitable = wikitable.getColonnesEcrites();
		this.tablesHtml = html.getNbTableaux(this.html.getHtml());
		this.tablesWikitext = wikitable.getNbTableaux(this.wikitable.getContenu());
	}
	
	public Donnee_Html getHtml() throws ResultatEstNullException {
		if(html == null) throw new ResultatEstNullException("tablesHtml n'est pas de type int");
		return html;
	}

	public Donnee_Wikitable getWikitable() throws ResultatEstNullException {
		if(wikitable == null) throw new ResultatEstNullException("tablesHtml n'est pas de type int");
		return wikitable;
	}

	public long getTempsExeHtml() throws ResultatEstNullException {
		if(tempsExeHtml != (int)tempsExeHtml) throw new ResultatEstNullException("tempsExeHtml n'est pas de type long");
		return tempsExeHtml;
	}

	public long getTempsExeWikitable() throws ResultatEstNullException {
		if(tempsExeWikitable != (int)tempsExeWikitable) throw new ResultatEstNullException("tempsExeWikitable n'est pas de type long");
		return tempsExeWikitable;
	}

	public int getLignesHtml() throws ResultatEstNullException {
		if(lignesHtml != (int)lignesHtml) throw new ResultatEstNullException("lignesHtml n'est pas de type int");
		return lignesHtml;
	}

	public int getLignesWikitable() throws ResultatEstNullException {
		if(lignesWikitable != (int)lignesWikitable) throw new ResultatEstNullException("lignesWikitable n'est pas de type int");
		return lignesWikitable;
	}

	public int getColonnesHtml() throws ResultatEstNullException {
		if(colonnesHtml != (int)colonnesHtml) throw new ResultatEstNullException("colonnesHtml n'est pas de type int");
		return colonnesHtml;
	}

	public int getColonnesWikitable() throws ResultatEstNullException {
		if(colonnesWikitable != (int)colonnesWikitable) throw new ResultatEstNullException("colonnesWikitable n'est pas de type int");
		return colonnesWikitable;
	}

	public int getTablesHtml() throws ResultatEstNullException {
		if(tablesHtml != (int)tablesHtml) throw new ResultatEstNullException("tablesHtml n'est pas de type int");
		return tablesHtml;
	}

	public int getTablesWikitable() throws ResultatEstNullException {
		if(tablesWikitext != (int)tablesWikitext) throw new ResultatEstNullException("tablesWikitext n'est pas de type int");
		return tablesWikitext;
	}
}
