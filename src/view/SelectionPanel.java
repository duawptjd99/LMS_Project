package view;

import java.io.IOException;

import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;



public class SelectionPanel extends JPanel {
	private static final long serialVersionUID = 1L;

	private DirectoryPanel directoryPanel;
	private LecturePanel lecturePanel;
	public SelectionPanel() {
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

		ListSelectionListener listSelectionListener = new ListSelectionHandler();
		this.directoryPanel = new DirectoryPanel(listSelectionListener);
		this.add(this.directoryPanel);

		this.lecturePanel = new LecturePanel();
		this.add(this.lecturePanel);

		
	}

	public void initialize(String id) {
		this.directoryPanel.initialize(id);
		this.lecturePanel.initialize(id);

	}
	public void finish(String id) {
		this.directoryPanel.finish(id);
		this.lecturePanel.finish(id);
		
	}
	
	private class ListSelectionHandler implements ListSelectionListener {

		@Override
		public void valueChanged(ListSelectionEvent e) {

			try {
				String fileName = directoryPanel.refresh(e.getSource());
				lecturePanel.refresh(fileName);
			} catch (IOException e1) {
				// TODO 자동 생성된 catch 블록
				e1.printStackTrace();
			}

		}
	}

}