package valueibject;

import java.util.Scanner;

import entity.EDirectory;

public class VEDirectory {
	private String id;
	private String text;
	private String fileName;
	
	public void readFromFile(Scanner scanner) {
		// TODO 자동 생성된 메소드 스텁
		this.id = scanner.next();
		this.text = scanner.next();
		this.fileName = scanner.next();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

}

