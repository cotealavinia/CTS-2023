package cts.s02.principii_clean_code.readers;

import java.io.FileNotFoundException;
import java.util.List;

import cts.s02.principii_clean_code.clase.Aplicant;

public abstract class AplicantReader {
	protected String fileName;
	
	public AplicantReader(String fileName) {
		super();
		this.fileName = fileName;
	}
	
	public abstract List<Aplicant> readAplicanti() throws FileNotFoundException;

}
