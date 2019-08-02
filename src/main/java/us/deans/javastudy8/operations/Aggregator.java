package us.deans.javastudy8.operations;

import java.awt.List;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import us.deans.javastudy8.base.BaseOperation;

public class Aggregator extends BaseOperation {

	private static String test_file = "data_set_01.csv";
	
	Map<Integer, String> map_in1 = new HashMap<Integer, String>();
	Map<Integer, List> map_out = new HashMap<Integer, List>();
	
	public void start() {
		run();
	}
	
	private void run() {
		System.out.println("ok. whatever...");
		try {
			
			BufferedReader reader = getReader();
			
			String line;
			while ((line = reader.readLine()) != null) {
				String[] column = line.split("\t");
				Integer clientId = Integer.parseInt(column[1]);
				
				map_in1.put(clientId, column[3]);
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private BufferedReader getReader() throws FileNotFoundException {
		File file = new File(getClass().getClassLoader().getResource(test_file).getFile());
		FileReader f_reader = new FileReader(file);
		BufferedReader b_reader = new BufferedReader(f_reader);
		return b_reader;
	}
	
	
	
}
