package view;

import java.awt.Color;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

import global.Constants.eLecture.EMovePanel;
import view.Main.ActionHandler;

public class MovePanel2 extends JPanel {
	private static final long serialVersionUID = 1L;

	private JButton rightButton;
	private JButton leftButton;
	private JPanel a;
	private JPanel b;
	private JPanel c;
	private JPanel d;
	private JPanel f;

	
	public MovePanel2(ActionListener actionHandlerR, ActionListener actionHandlerR2) {
		
		this.setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
		
		this.a = new JPanel();
		this.add(a);
		
		this.b = new JPanel();
		this.add(b);
		
		this.rightButton = new JButton(EMovePanel.RB.getString());
		this.rightButton.setActionCommand(EMovePanel.RBN.getString());
		this.rightButton.addActionListener(actionHandlerR);
		this.b.add(this.rightButton);

		this.c = new JPanel();
		this.add(c);
		
		this.d = new JPanel();
		this.add(d);
		
		this.leftButton = new JButton(EMovePanel.LB.getString());
		this.leftButton.setActionCommand(EMovePanel.LBN.getString());
		this.leftButton.addActionListener(actionHandlerR2);
		this.d.add(this.leftButton);
	
	
		this.f = new JPanel();
		this.add(f);

		this.a.setBackground(EMovePanel.C2.getColor());	
		this.b.setBackground(EMovePanel.C2.getColor());	
		this.c.setBackground(EMovePanel.C2.getColor());	
		this.d.setBackground(EMovePanel.C2.getColor());	
		this.f.setBackground(EMovePanel.C2.getColor());	
	
	}

	public void Initialize(String id) {

	}
}