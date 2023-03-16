package cts.s02.principii_clean_code.main;


import java.io.FileNotFoundException;
import java.util.List;



import cts.s02.principii_clean_code.clase.Angajat;
import cts.s02.principii_clean_code.readers.AngajatReader;


public class Program {

	public static void main(String[] args) {
		List<Angajat> listaAngajati;
		try {
			listaAngajati = AngajatReader.readAngajati("angajati.txt");
			for(Angajat angajat:listaAngajati)
				System.out.println(angajat.toString());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
