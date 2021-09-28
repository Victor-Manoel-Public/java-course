package com.convertFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Convert2CSV {

	private String initialFile;
	private String endFile;

	public Convert2CSV(String initialFile, String endFile) {
		super();
		this.initialFile = initialFile;
		this.endFile = endFile;
	}

	public String getInitialFile() {
		return initialFile;
	}

	public String getEndFile() {
		return endFile;
	}

	public void convert() throws IOException {
		// find first file
		File firstFile = new File(this.getInitialFile());
		File lastFile = new File(this.getEndFile());

		// create csv file
		if (!lastFile.exists()) {
			lastFile.createNewFile();
		}

		// first file to read
		FileInputStream file2read = new FileInputStream(firstFile);

		// read lines from file 1
		Scanner sc = new Scanner(file2read, "utf-8");
		FileWriter writer = new FileWriter(lastFile);

		while (sc.hasNext()) {

			String line = sc.nextLine();

			if (!line.isEmpty()) {
				writer.write(line + "\n");
			}

		}

		writer.close();
		sc.close();

		JOptionPane.showMessageDialog(null, "File converted successfully.");

	}

}
