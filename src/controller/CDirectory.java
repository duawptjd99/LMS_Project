package controller;

import java.util.Vector;

import entity.EDirectory;
import valueibject.VCDirectory;
import valueibject.VEDirectory;

public class CDirectory {

	private EDirectory eDirectory;
	private Vector<VCDirectory> vCDirectories;

	public CDirectory(String fileName) {
		this.eDirectory = new EDirectory();

	}

	public Vector<VCDirectory> getData(String fileName) {
		Vector<VEDirectory> vEDirectories = this.eDirectory.getData(fileName);
		this.vCDirectories = new Vector<VCDirectory>();

		for (VEDirectory vEDirectory : vEDirectories) {
			VCDirectory vCDirectory = new VCDirectory();
			vCDirectory.setId(vEDirectory.getId());
			vCDirectory.setText(vEDirectory.getText());
			vCDirectory.setFileName(vEDirectory.getFileName());
			this.vCDirectories.add(vCDirectory);
		}

		return this.vCDirectories;
	}

}
