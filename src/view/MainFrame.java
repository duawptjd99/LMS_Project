package view;

import java.awt.BorderLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

import global.Constants.EGMainFrame;
import global.Constants.ETMainFrame;

public class MainFrame extends JFrame {

	private PersonalInfo personalInfo;
	private Registration registration;
	private String id;

	// constructor
	public MainFrame(ActionListener actionLGHandler) {

		// attributes
		this.setTitle(ETMainFrame.eTitle.getString());
		this.setSize(EGMainFrame.eWidth.getint(), EGMainFrame.eHeight.getint());
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// components
		WindowListener windowHandler = new WindowHandler();
		this.addWindowListener(windowHandler);
		LayoutManager layoutManager = new BorderLayout();
		this.setLayout(layoutManager);
		ImageIcon img = new ImageIcon(ETMainFrame.eimage.getString());
        this.setIconImage(img.getImage());


		this.personalInfo = new PersonalInfo(actionLGHandler);
		this.personalInfo.setBackground(EGMainFrame.eColor.getColor());
		this.add(this.personalInfo, BorderLayout.NORTH);
		
		this.registration = new Registration();
		this.add(this.registration, BorderLayout.CENTER);

	}

	public void initialize(String id) {

		this.personalInfo.initialize(id);
		this.registration.initialize(id);
	}

	public void finish() throws IOException {
		this.id = "save";
		// this.personalInfo.finish(this.id);
		this.registration.finish(this.id);
	}

	private class WindowHandler implements WindowListener {

		@Override
		public void windowActivated(WindowEvent arg0) {
		}

		@Override
		public void windowClosed(WindowEvent arg0) {
		}

		@Override
		public void windowClosing(WindowEvent arg0) {
			try {
				finish();
			} catch (IOException e) {
				// TODO 자동 생성된 catch 블록
				e.printStackTrace();
			}
		}

		@Override
		public void windowDeactivated(WindowEvent arg0) {
		}

		@Override
		public void windowDeiconified(WindowEvent arg0) {
		}

		@Override
		public void windowIconified(WindowEvent arg0) {
		}

		@Override
		public void windowOpened(WindowEvent arg0) {
		}
	}

}