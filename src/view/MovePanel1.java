package view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

import global.Constants.eLecture.EMovePanel;

public class MovePanel1 extends JPanel {
	private static final long serialVersionUID = 1L;

	private JButton rightButton;
	private JButton leftButton;
	private JPanel a;
	private JPanel b;
	private JPanel c;
	private JPanel d;
	private JPanel f;
	
	public MovePanel1(ActionListener actionHandler, ActionListener actionHandler2) {
		
		this.setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
	
		this.a = new JPanel();
		this.add(a);

		this.b = new JPanel();
		this.add(b);
		
		
		this.leftButton = new JButton(EMovePanel.RB.getString());
		this.leftButton.setActionCommand(EMovePanel.RBN.getString());
		this.leftButton.addActionListener(actionHandler);

		this.b.add(this.leftButton);

		this.c = new JPanel();
		this.add(c);
		
		this.d = new JPanel();
		this.add(d);
		
		this.leftButton = new JButton(EMovePanel.LB.getString());
		this.leftButton.setActionCommand(EMovePanel.LBN.getString());
		this.leftButton.addActionListener(actionHandler2);
		this.d.add(this.leftButton);
	
	
		this.f = new JPanel();
		this.add(f);

		this.a.setBackground(EMovePanel.C1.getColor());	
		this.b.setBackground(EMovePanel.C1.getColor());	
		this.c.setBackground(EMovePanel.C1.getColor());	
		this.d.setBackground(EMovePanel.C1.getColor());	
		this.f.setBackground(EMovePanel.C1.getColor());	

	}

	public void Initialize(String id) {

	}

}
