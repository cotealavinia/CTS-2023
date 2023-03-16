package cts.s02.principii_clean_code.main;


import java.io.FileNotFoundException;
import java.util.List;




import cts.s02.principii_clean_code.clase.Aplicant;
import cts.s02.principii_clean_code.readers.ElevReader;


public class Program {

	public static void main(String[] args) {
		List<Aplicant> listaAplicanti;
		try {
			listaAplicanti = ElevReader.readPupil("elevi.txt");
			for(Aplicant aplicant:listaAplicanti)
				System.out.println(aplicant.toString());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
