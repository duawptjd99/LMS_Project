package entity;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Vector;

import global.Constants.eDirectory;
import valueibject.VEDirectory;

public class EDirectory {

	private Vector<VEDirectory> vEDirectories;
	public EDirectory() {
		this.vEDirectories = new Vector<VEDirectory>();
	}

	public Vector<VEDirectory> getData(String fileName) {
		try {
			this.vEDirectories.clear();

			File file = new File(eDirectory.getfileName.getString() + fileName);
			Scanner scanner = new Scanner(file);
			while (scanner.hasNext()) {
				VEDirectory vEDirectory = new VEDirectory();
				vEDirectory.readFromFile(scanner);
				this.vEDirectories.add(vEDirectory);
			}
			scanner.close();
			return this.vEDirectories;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}

}
