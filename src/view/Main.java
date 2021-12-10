package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

	// component
	private LoginDialog loginDialog;
	private MainFrame mainFrame;
	// association

	public Main() {
		// child window
		ActionHandler actionHandler = new ActionHandler();
		this.loginDialog = new LoginDialog(actionHandler);
		this.loginDialog.setVisible(true);

	}

	private void loginOK() {
		ActionLGHandler actionLGHandler = new ActionLGHandler();
		String id = loginDialog.validateUser();
		if (id != null) {
			loginDialog.dispose();
			this.mainFrame = new MainFrame(actionLGHandler);
			this.mainFrame.setVisible(true);
			this.mainFrame.initialize(id);
		}
	}

	private void initialize() {
		this.loginDialog.initialize();
	}

	private void loginCancel() {
		loginDialog.cancel();
		loginDialog.dispose();
	}

	class ActionHandler implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent actionEvent) {
			if (actionEvent.getActionCommand().equals("OK")) {
				loginOK();
			} else if (actionEvent.getActionCommand().equals("Cancel")) {
				loginCancel();
			}
		}
	}
	class ActionLGHandler implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			mainFrame.dispose();
			Main main = new Main();
		}
		
	}
	public static void main(String[] args) {
		Main main;
		main = new Main();
	}
}
