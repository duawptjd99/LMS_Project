package view;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.BoxLayout;
import javax.swing.JPanel;

public class Registration extends JPanel {
	private static final long serialVersionUID = 1L;
	private SelectionPanel selectionPanel;
	private MovePanel1 movePanel1;
	private BasketPanel basketPanel;
	private MovePanel2 movePanel2;
	private resultPanel resultPanel;
	private JPanel a;
	private JPanel b;
	String bring2;
	String bring;

	public Registration() {
		this.setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		this.selectionPanel = new SelectionPanel();
		this.add(this.selectionPanel);

		this.a = new JPanel();
		this.add(a);
		a.setLayout(new BorderLayout());

		this.b = new JPanel();
		this.add(b);
		b.setLayout(new BorderLayout());

		ActionListener actionHandler = new ActionHandler();
		ActionListener actionHandler2 = new ActionHandler2();
		ActionListener actionHandlerR = new ActionHandlerR();
		ActionListener actionHandlerR2 = new ActionHandlerR2();
		this.movePanel1 = new MovePanel1(actionHandler, actionHandler2);
		this.a.add(this.movePanel1, BorderLayout.WEST);

		this.basketPanel = new BasketPanel();
		this.a.add(this.basketPanel, BorderLayout.CENTER);

		this.movePanel2 = new MovePanel2(actionHandlerR, actionHandlerR2);
		this.b.add(this.movePanel2, BorderLayout.WEST);

		this.resultPanel = new resultPanel();
		this.b.add(this.resultPanel, BorderLayout.CENTER);
	}

	public void initialize(String id) {
		this.movePanel1.Initialize(id);
		this.basketPanel.initialize(id);
		this.movePanel2.Initialize(id);
		this.resultPanel.initialize(id);
		this.selectionPanel.initialize(id);
	}

	public void finish(String id) throws IOException {
		this.selectionPanel.finish(id);
		this.basketPanel.finish(id + "basket");
		this.resultPanel.finish(id + "result");
	}

	class ActionHandler implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent arg0) {
			LecturePanel lecturePanel = new LecturePanel();
			basketPanel.addRows(lecturePanel.bring);
		}

	}

	class ActionHandler2 implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent arg0) {
			basketPanel.removeRows();
		}
	}

	class ActionHandlerR implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent arg0) {
			String bring = basketPanel.bring;
			if(bring == null) {
				bring = LecturePanel.bring;
			}
			resultPanel.addRows(bring);
		}

	}

	class ActionHandlerR2 implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent arg0) {
			resultPanel.removeRows();
		}
	}

}
