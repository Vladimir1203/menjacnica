package menjacnica;

import java.util.Date;

import interfejs.menjacnicaInterfejs;
import valuta.Valuta;

public class Menjacnica implements menjacnicaInterfejs {

	@Override
	public void dodajKurs(Date dan, double kupovni, double prodajni, double srednji, Valuta v) {

	}

	@Override
	public void obrisiKurs(Date dan, Valuta v) {

	}

	@Override
	public double kursValute(Date dan, Valuta v) {
		return 0;
	}

}
