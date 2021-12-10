package entity;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import valueibject.VEPersonalInfo;

public class EPersonalInfo {

	public VEPersonalInfo getPersonalInfo(String id) {
		VEPersonalInfo vEPersonalInfo = new VEPersonalInfo();

		try {
			File file = new File(global.Constants.EPersonalInfo.getstudentfile.getString());
			Scanner scanner = new Scanner(file);
			while (scanner.hasNext()) {
				vEPersonalInfo.readFromFile(scanner);
				if (vEPersonalInfo.getId().equals(id)) {
					return vEPersonalInfo;
				}
			}
			scanner.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		return null;
	}
}