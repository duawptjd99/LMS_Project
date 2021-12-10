package view;

import java.awt.BorderLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.util.Vector;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import controller.CLecture;
import global.Constants.eLecture.ELecturePanel;
import valueibject.VCLecture;

class LecturePanel extends JPanel {
	private static final long serialVersionUID = 1L;

	static Vector<String> rowData = null;
	static int row = 0;
	static int col = 0;
	private CLecture cLecture;
	private Vector<VCLecture> vCLectures;
	private LectureList lectureList;
	Vector rowData2 = new Vector<String>();
	static String bring;

	public LecturePanel() {
		this.setLayout(new BorderLayout());
		this.lectureList = new LectureList();
		JScrollPane scrollpane = new JScrollPane();
		scrollpane.setViewportView(this.lectureList);
		this.add(scrollpane, BorderLayout.CENTER);

		this.lectureList.addMouseListener(new MouseListener() {
			public void mouseClicked(MouseEvent e) {
				row = lectureList.getSelectedRow();
				col = lectureList.getSelectedColumn();
				bring = lectureList.getValueAt(row, 0) + ELecturePanel.pass.getString() + lectureList.getValueAt(row, 1) + ELecturePanel.pass.getString()
						+ lectureList.getValueAt(row, 2) + ELecturePanel.pass.getString() + lectureList.getValueAt(row, 3) + ELecturePanel.pass.getString()
						+ lectureList.getValueAt(row, 4);

			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
			}

		});

	}

	public void initialize(String ID) {

	}

	public void refresh(String fileName) throws IOException {
		this.cLecture = new CLecture();
		this.vCLectures = cLecture.getData(fileName);
		this.lectureList.addRows(this.vCLectures);
	}

	class LectureList extends JTable {
		private static final long serialVersionUID = 1L;

		private DefaultTableModel tableModel;

		public LectureList() {
			Vector<String> header = new Vector<String>();
			for (int i = 1; i < ELecturePanel.values().length-1; i++) {
				header.add(ELecturePanel.values()[i].getString());
			}
			this.tableModel = new DefaultTableModel(header, 0);
			this.setModel(this.tableModel);
		}

		public void addRows(Vector<VCLecture> vCLectures) {
			this.tableModel.setRowCount(0);

			for (VCLecture vCLecture : vCLectures) {
				rowData = new Vector<String>();
				rowData.add(vCLecture.getId());
				rowData.add(vCLecture.getGN());
				rowData.add(vCLecture.getN());
				rowData.add(vCLecture.getGrade());
				rowData.add(vCLecture.gettime());

				this.tableModel.addRow(rowData);

			}

			bring = lectureList.getValueAt(0, 0) +ELecturePanel.pass.getString() + lectureList.getValueAt(0, 1) + ELecturePanel.pass.getString()
					+ lectureList.getValueAt(0, 2) + ELecturePanel.pass.getString() + lectureList.getValueAt(0, 3) + ELecturePanel.pass.getString()
					+ lectureList.getValueAt(0, 4);

			this.getSelectionModel().addSelectionInterval(0, 0);
		}

	}

	public void finish(String id) {
		// TODO 자동 생성된 메소드 스텁
		
	}

}
