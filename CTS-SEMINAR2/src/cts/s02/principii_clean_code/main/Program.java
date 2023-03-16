package cts.s02.principii_clean_code.main;


import java.io.FileNotFoundException;
import java.util.List;




import cts.s02.principii_clean_code.clase.Aplicant;
import cts.s02.principii_clean_code.readers.AngajatReader;
import cts.s02.principii_clean_code.readers.AplicantReader;


public class Program {

	public static List<Aplicant> citesteAplicanti(AplicantReader reader) throws FileNotFoundException
	{
		List<Aplicant>listaAplicanti=reader.readAplicanti();
		return listaAplicanti;
	}
	public static void main(String[] args) {
		List<Aplicant> listaAplicanti;
		try {
			listaAplicanti = citesteAplicanti(new AngajatReader("angajati.txt"));
			for(Aplicant aplicant:listaAplicanti)
				System.out.println(aplicant.toString());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
