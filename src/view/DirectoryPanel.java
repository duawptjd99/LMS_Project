package view;

import java.util.Vector;

import javax.swing.BoxLayout;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionListener;

import controller.CDirectory;
import global.Constants.eDirectory;
import valueibject.VCDirectory;

class DirectoryPanel extends JPanel {
	private DirectoryList directoryList1;
	private DirectoryList directoryList2;
	private DirectoryList directoryList3;

	public DirectoryPanel(ListSelectionListener listSelectionListener) {
		this.setLayout(new BoxLayout(this, BoxLayout.X_AXIS));

		JScrollPane scrollpane;

		scrollpane = new JScrollPane();
		this.directoryList1 = new DirectoryList();
		scrollpane.setViewportView(this.directoryList1);
		this.add(scrollpane);
		this.directoryList1.addListSelectionListener(listSelectionListener);

		scrollpane = new JScrollPane();
		this.directoryList2 = new DirectoryList();
		scrollpane.setViewportView(this.directoryList2);
		this.add(scrollpane);
		this.directoryList2.addListSelectionListener(listSelectionListener);

		scrollpane = new JScrollPane();
		this.directoryList3 = new DirectoryList();
		scrollpane.setViewportView(this.directoryList3);
		this.add(scrollpane);
		this.directoryList3.addListSelectionListener(listSelectionListener);

	}

	public void initialize(String id) {
		this.refresh(null);
		this.directoryList1.initialize();
		this.directoryList2.initialize();
		this.directoryList3.initialize();

	}

	public String refresh(Object source) {
		String fileName = null;
		if (source == null) {
			this.directoryList1.refresh(eDirectory.fileName.getString());
			fileName = this.directoryList1.getSelectedFile();
			this.directoryList2.refresh(fileName);
			fileName = this.directoryList2.getSelectedFile();
			this.directoryList3.refresh(fileName);
			fileName = this.directoryList3.getSelectedFile();
		} else if (source.equals(this.directoryList1)) {
			fileName = this.directoryList1.getSelectedFile();
			this.directoryList2.refresh(fileName);
			fileName = this.directoryList2.getSelectedFile();
			this.directoryList3.refresh(fileName);
			fileName = this.directoryList3.getSelectedFile();
		} else if (source.equals(this.directoryList2)) {
			fileName = this.directoryList2.getSelectedFile();
			this.directoryList3.refresh(fileName);
			fileName = this.directoryList3.getSelectedFile();
		} else if (source.equals(this.directoryList3)) {
			fileName = this.directoryList3.getSelectedFile();
		}
		return fileName;
	}

	private class DirectoryList extends JList<String> {

		private Vector<String> listData;
		private Vector<VCDirectory> vCDirectories;
		private CDirectory cDirectory;

		public DirectoryList() {
			this.listData = new Vector<String>();
			this.setListData(this.listData);
			this.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

			this.cDirectory = new CDirectory(eDirectory.fileName.getString());

			CDirectory cDirectory = new CDirectory(eDirectory.fileName.getString());
			Vector<VCDirectory> vCDirectories = cDirectory.getData(eDirectory.fileName.getString());
			for (VCDirectory vCDirectory : vCDirectories) {
				this.listData.add(vCDirectory.getText());
			}

		}

		public void initialize() {
			// TODO 자동 생성된 메소드 스텁

		}

		public String getSelectedFile() {
			String fileName = this.vCDirectories.get(this.getSelectedIndex()).getFileName();
			return fileName;
		}

		public void refresh(String fileName) {

			this.vCDirectories = cDirectory.getData(fileName);
			this.listData.clear();
			for (VCDirectory vCDirectory : vCDirectories) {
				this.listData.add(vCDirectory.getText());
			}
			this.setSelectedIndex(0);
			this.updateUI();

		}


	}

	public void finish(String id) {
		// TODO 자동 생성된 메소드 스텁
		
	}

}