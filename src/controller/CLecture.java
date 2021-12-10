package controller;

import java.io.IOException;
import java.util.Vector;

import entity.ELecture;
import valueibject.VCLecture;
import valueibject.VELecture;

public class CLecture {
	private ELecture eLecture;
	private Vector<VCLecture> vCLectures;

	public CLecture() {
		this.eLecture = new ELecture();
	}

	public Vector<VCLecture> getData(String fileName) throws IOException {
		Vector<VELecture> vELectures = this.eLecture.getData(fileName); // vED���� ������ ������ vCD�� ���� ���̴�
		this.vCLectures = new Vector<VCLecture>();

		for (VELecture vELecture : vELectures) {
			VCLecture vCLecture = new VCLecture();
			vCLecture.setId(vELecture.getId());
			vCLecture.setGN(vELecture.getGN());
			vCLecture.setN(vELecture.getN());
			vCLecture.setGrade(vELecture.getGrade());
			vCLecture.settime(vELecture.gettime());
			this.vCLectures.add(vCLecture);
		}
		return this.vCLectures;
	}

}
