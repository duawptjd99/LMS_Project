package view;

import java.awt.BorderLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Vector;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

import controller.CLecture;
import entity.ELecture;
import global.Constants.eLecture.EBasketPanel;
import valueibject.VCLecture;

public class BasketPanel extends JPanel {
	private static final long serialVersionUID = 1L;
	public static Vector<String> saveData = new Vector<String>();
	Vector<String> rowData;
	Vector<String> header;
	static DefaultTableModel tableModel;
	private CLecture cLecture;
	private Vector<VCLecture> vCLectures;
	JTable basketList;
	static int col = 0;
	static int row = 0;
	public static int count = 0;
	static String bring;
	public static String[] saveList = new String[30];

	public BasketPanel() {
		this.setLayout(new BorderLayout());
		this.basketList = new JTable();
		JScrollPane scrollpane = new JScrollPane();
		scrollpane.setViewportView(this.basketList);
		this.add(scrollpane, BorderLayout.CENTER);
		this.basketList.addMouseListener(new MouseListener() {
			public void mouseClicked(MouseEvent e) {
				row = basketList.getSelectedRow();
				col = basketList.getSelectedColumn();
				bring = basketList.getValueAt(row, 0) + "";
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
		this.header = new Vector<String>();
		header.add(EBasketPanel.name.getString());
		this.tableModel = new DefaultTableModel(header, 0);
		this.basketList.setModel(this.tableModel);
		this.basketList.getSelectionModel().addSelectionInterval(0, 0);
		this.basketList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

	}

	public void initialize(String ID) {
			}

	public void finish(String fileName) {
		ELecture eLecture = new ELecture();
		count = this.tableModel.getRowCount();
		eLecture.setData(fileName, saveData);

	}

	public void addRows(String bring) {
		this.rowData = new Vector<String>();
		this.rowData.addElement(bring);
		this.tableModel.addRow(rowData);
		this.saveData.addElement(bring);		
		count++;
	}

	public void removeRows() {
		this.tableModel.removeRow(row);
		this.saveData.remove(row);
		count--;
	}

}