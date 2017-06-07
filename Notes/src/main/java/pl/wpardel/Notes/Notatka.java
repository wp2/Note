package pl.wpardel.Notes;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;



@XmlRootElement(name="Notatki")
public class Notatka
{
	private int id;
	
	private String tagi;
	
	private String tytul;
	
	private String tresc;
	
	public Notatka(){}

	public Notatka(int id, String tagi, String tytul, String tresc) {
		super();
		this.id = id;
		this.tagi = tagi;
		this.tytul = tytul;
		this.tresc = tresc;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTagi() {
		return tagi;
	}

	public void setTagi(String tagi) {
		this.tagi = tagi;
	}

	public String getTytul() {
		return tytul;
	}

	public void setTytul(String tytul) {
		this.tytul = tytul;
	}

	public String getTresc() {
		return tresc;
	}

	public void setTresc(String tresc) {
		this.tresc = tresc;
	}
	
	
}
