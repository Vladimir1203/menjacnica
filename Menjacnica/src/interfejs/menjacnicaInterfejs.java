package interfejs;

import java.util.Date;

import valuta.Valuta;

public interface menjacnicaInterfejs {
	
	public void dodajKurs(Date dan, double kupovni, double prodajni, double srednji, Valuta v);
	public void obrisiKurs(Date dan, Valuta v);
	public double kursValute(Date dan, Valuta v);
	
}
