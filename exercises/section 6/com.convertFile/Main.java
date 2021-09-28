package com.convertFile;

import java.io.IOException;
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) throws IOException {
		
		String firstFile = JOptionPane.showInputDialog("Path and file name (.txt)");
		String lastFile = JOptionPane.showInputDialog("Path and new csv filename");
		
		Convert2CSV convert = new Convert2CSV(firstFile, lastFile);
		
		convert.convert();

	}

}
