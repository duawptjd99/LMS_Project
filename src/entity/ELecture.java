package entity;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.Vector;

import global.Constants.eLecture;
import valueibject.VELecture;
import view.BasketPanel;

public class ELecture {
	public static String[] rows = new String[50];
	public static int a = 0;
	private Vector<VELecture> vELectures;

	public ELecture() {
		this.vELectures = new Vector<VELecture>();
	}

	public Vector<VELecture> getData(String fileName) throws FileNotFoundException {
		try {
			File fileInput = new File(eLecture.getfileName.getString() + fileName);
			Scanner scanner = new Scanner(fileInput);
			this.vELectures.clear();

			while (scanner.hasNext()) {
				VELecture vELecture = new VELecture();
				vELecture.readFromFile(scanner);
				this.vELectures.add(vELecture);
			}
			scanner.close();
			return this.vELectures;
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
		return null;
	}

	public void setData(String fileName, Vector<String> saveData) {

		BufferedWriter fileWriter;
		try {
			fileWriter = new BufferedWriter(new FileWriter(fileName + eLecture.et.getString(), true));
			for (int i = 0; i <BasketPanel.count; i++) {
				fileWriter.write(saveData.elementAt(i) + eLecture.eline.getString());
			}
			fileWriter.close();

		} catch (IOException e) {
			// TODO 자동 생성된 catch 블록
			e.printStackTrace();
		}
	}
}