package menjacnica;

import java.util.Date;
import java.util.LinkedList;

import interfejs.menjacnicaInterfejs;
import valuta.Valuta;

public class Menjacnica implements menjacnicaInterfejs {

	@Override
	public void dodajKurs(LinkedList<Valuta> valute, Date dan, double kupovni, double prodajni, double srednji, String naziv, String skraceniNaziv) {
		Valuta v1 = new Valuta();
		v1.setDatum(dan);
		v1.setKupovni(kupovni);
		v1.setProdajni(prodajni);
		v1.setSrednji(srednji);
		v1.setSkraceniNaziv(skraceniNaziv);
		v1.setNaziv(naziv);
		
		valute.add(v1);
	}

	@Override
	public void obrisiKurs(LinkedList<Valuta> valute, Date dan, Valuta v) {
		for(Valuta v1 : valute) {
			if(v1.equals(v))
				valute.remove(v1);
		}
	}

	@Override
	public double kursValute(LinkedList<Valuta> valute, Date dan, Valuta v) {
		for(Valuta v1 : valute) {
			if(v1.equals(v))
				return v1.getSrednji();
		}
		return 0;
	}

}
