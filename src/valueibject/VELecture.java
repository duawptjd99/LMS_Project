package valueibject;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class VELecture {
	private String id;
	private String GN;
	private String N;
	private String Grade;
	private String time;

	public void readFromFile(Scanner scanner) {
		// TODO 자동 생성된 메소드 스텁
		this.id = scanner.next();
		this.GN = scanner.next();
		this.N = scanner.next();
		this.Grade = scanner.next();
		this.time = scanner.next();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getGN() {
		return GN;
	}

	public void setGN(String GN) {
		this.GN = GN;
	}

	public String getN() {
		return N;
	}

	public void setN(String N) {
		this.N = N;
	}

	public String getGrade() {
		return Grade;
	}

	public void setGrade(String Grade) {
		this.Grade = Grade;
	}

	public String gettime() {
		return time;
	}

	public void settime(String time) {
		this.time = time;
	}


}
