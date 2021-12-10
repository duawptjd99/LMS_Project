package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controller.CLogin;
import global.Constants.ELoginDialog;

public class LoginDialog extends JDialog {
	private static final long serialVersionUID = 1L;

	// components
	private JLabel nameLabel;
	private JTextField nameText;
	private JLabel passwordLabel;
	private JTextField passwordText;
	private JButton okButton;
	private JButton cancelButton;
	// associations
	private CLogin cLogin;

	public LoginDialog(ActionListener actionHandler) {
		// attributes
		this.setSize(ELoginDialog.ewidth.getint(),ELoginDialog.eHeight.getint());
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		this.setBackground(Color.green);
		// components
		ImageIcon img = new ImageIcon(ELoginDialog.eimage.getString());
        this.setIconImage(img.getImage());
		this.setLayout(new FlowLayout());

		JPanel panel1 = new JPanel();
		nameLabel = new JLabel(ELoginDialog.enameLabel.getString());
		panel1.add(nameLabel);
		nameText = new JTextField(15);
		panel1.add(nameText);
		this.add(panel1);

		JPanel panel2 = new JPanel();
		passwordLabel = new JLabel(ELoginDialog.epasswordLabel.getString());
		panel2.add(passwordLabel);
		passwordText = new JTextField(15);
		panel2.add(passwordText);
		this.add(panel2);

		JPanel panel3 = new JPanel();
		okButton = new JButton(ELoginDialog.eokButton.getString());
		okButton.addActionListener(actionHandler);
		okButton.setActionCommand(ELoginDialog.eokButton.getString());
		panel3.add(okButton);

		cancelButton = new JButton(ELoginDialog.ecancelButton.getString());
		cancelButton.addActionListener(actionHandler);
		cancelButton.setActionCommand(ELoginDialog.ecancelButton.getString());
		panel3.add(cancelButton);
		this.add(panel3);
		
		this.setVisible(true);
	}

	public void initialize() {
		// TODO 자동 생성된 메소드 스텁

	}

	public String validateUser() {
		String ID = nameText.getText();
		String password = passwordText.getText();

		this.cLogin = new CLogin();
		boolean result = cLogin.valudateUser(ID, password);
		if (result) {
			return ID;
		} else {
			JOptionPane.showMessageDialog(this,ELoginDialog.eLoginX.getString(),ELoginDialog.eLoginX2.getString(), JOptionPane.INFORMATION_MESSAGE);
			return null;
		}
	}

	public void cancel() {
	}

}
