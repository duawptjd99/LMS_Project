package view;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controller.CPersonalInfo;
import global.Constants.EPersonalFrame;
import global.Constants.EPersonalInfo;
import valueibject.VCPersonalInfo;

public class PersonalInfo extends JPanel {
	private static final long serialVersionUID = 1L;

	private JLabel lbinsa;
	private JLabel lbinsaPostfix;
	private JButton btinfo;
	private JButton btlogout;
	private JLabel time;

	public PersonalInfo(ActionListener actionLGHandler) {

		Calendar cld = Calendar.getInstance();
		int year = cld.get(Calendar.YEAR);
		int month = (cld.get(Calendar.MONTH) + 1);
		int day = cld.get(Calendar.DATE);
		int hour_1 = cld.get(Calendar.HOUR);
		int hour_2 = cld.get(Calendar.HOUR_OF_DAY);
		int minute = cld.get(Calendar.MINUTE);
		int second = cld.get(Calendar.SECOND);
		this.time = new JLabel("접속시간:"+year + "." + month + "." + day + " " + hour_2 + ":" + minute + ":" + second);
		this.add(time);

		this.lbinsa = new JLabel();
		this.add(this.lbinsa);
		this.lbinsaPostfix = new JLabel(EPersonalInfo.eLbinsaPostfix.getString());
		this.add(this.lbinsaPostfix);
		this.btinfo = new JButton(EPersonalInfo.eBtinfo.getString());
		this.add(this.btinfo);
		ActionListener actionPerHandler = new ActionPerHandler();
		this.btinfo.addActionListener(actionPerHandler);
		this.btlogout = new JButton(EPersonalInfo.eBtlogout.getString());
		this.add(this.btlogout);
		this.btlogout.addActionListener(actionLGHandler);
	}

	public void initialize(String id) {
		this.showPersonalInfo(id);

	}

	public void showPersonalInfo(String id) {
		CPersonalInfo cPersonalInfo = new CPersonalInfo();
		VCPersonalInfo vPersonalInfo = cPersonalInfo.getPersonalInfo(id);
		this.lbinsa.setText(vPersonalInfo.getName());

	}

	class ActionPerHandler implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			PersonalFrame personalFrame = new PersonalFrame();
		}

	}
}

class PersonalFrame extends JFrame {

	private Container con;
	private JLabel lb;
	ImageIcon im = new ImageIcon(EPersonalFrame.eimage.getString());

	public PersonalFrame() {
		this.setSize(995, 500);

		lb = new JLabel(im, JLabel.CENTER);
		lb.setVerticalTextPosition(JLabel.CENTER);
		lb.setHorizontalTextPosition(JLabel.RIGHT);
		this.add(lb);
		this.setLocationRelativeTo(null);

		this.setVisible(true);

	}
}
