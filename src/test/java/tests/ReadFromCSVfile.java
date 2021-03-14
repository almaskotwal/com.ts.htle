package tests;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.testng.annotations.Test;


public class ReadFromCSVfile {

	@Test
	public void readFromCSV() throws IOException {
		
		String filePath = "C:\\rtlWS\\com.ts.htle\\src\\test\\resources\\inputData\\addresses.csv";
		String line ="";
		BufferedReader buffer = new BufferedReader(new FileReader(filePath));
		while((line = buffer.readLine()) !=null) {
			String[] values = line.split(",");
			System.out.println("Name: " + values[0] + ", Zip code: " + values[5]);// prints comma separated specific indices
		}
		
	}
	
}
