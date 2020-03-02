package interfejs;

import java.util.Date;
import java.util.LinkedList;

import valuta.Valuta;

public interface menjacnicaInterfejs {
	
	public void dodajKurs(LinkedList<Valuta> valute, Date dan, double kupovni, double prodajni, double srednji, String naziv, String skraceniNaziv);
	public void obrisiKurs(LinkedList<Valuta> valute, Date dan, Valuta v);
	public double kursValute(LinkedList<Valuta> valute, Date dan, Valuta v);
	
}
