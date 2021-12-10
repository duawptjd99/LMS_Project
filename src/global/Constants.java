package global;

import java.awt.Color;

public class Constants {
	public static enum ETMainFrame {
		eTitle("수강신청"), eimage("1.JPG");

		private String value;

		private ETMainFrame(String value) {
			this.value = value;
		}

		public String getString() {
			return this.value;
		}

		public int getint() {
			return Integer.parseInt(this.value);
		}
	}

	public static enum EGMainFrame {
		eWidth("800"), eHeight("600"), eColor(Color.CYAN);
		private String value;
		private Color valueC;

		private EGMainFrame(String value) {
			this.value = value;
		}

		private EGMainFrame(Color valueC) {
			this.valueC = valueC;
		}

		public String getString() {
			return this.value;
		}

		public int getint() {
			return Integer.parseInt(this.value);
		}

		public Color getColor() {
			return this.valueC;

		}
	}

	public static enum ELoginDialog {

		getLoginfile("data/login.txt"), enameLabel("아이디"), epasswordLabel("비밀번호"), eokButton("OK"), ecancelButton(
				"Cancel"), eimage("1.JPG"), ewidth("300"), eHeight("200"), eLoginX("틀렸습니다."), eLoginX2("로그인 실패");

		private String value;

		private ELoginDialog(String value) {
			this.value = value;
		}

		public String getString() {
			return this.value;
		}

		public int getint() {
			return Integer.parseInt(this.value);
		}
	}

	public static enum EPersonalInfo {
		getstudentfile("data/student.txt"), eLbinsaPostfix("님 안녕하세요"), eBtinfo("개인정보"), eBtlogout("로그아웃");

		private String value;

		private EPersonalInfo(String value) {
			this.value = value;
		}

		public String getString() {
			return this.value;
		}

		public int getInt() {
			return Integer.parseInt(this.value);
		}
	}

	public static enum EPersonalFrame {
		eimage("2.png");
		
		private String value;

		private EPersonalFrame(String value) {
			this.value = value;
		}

		public String getString() {
			return this.value;
		}

		public int getInt() {
			return Integer.parseInt(this.value);
		}
	}

	public static enum eDirectory {
		fileName2("englishYG"), fileName("root"), getfileName("directory/");

		private String value;

		private eDirectory(String value) {
			this.value = value;
		}

		public String getString() {
			return this.value;
		}

		public int getInt() {
			return Integer.parseInt(this.value);
		}
	}

	public static enum eLecture {
		getfileName("directory/"), eline("\n"), et(".txt");
		private String value;

		private eLecture(String value) {
			this.value = value;
		}

		public String getString() {
			return this.value;
		}

		public int getInt() {
			return Integer.parseInt(this.value);
		}

		public static enum ELecturePanel {
			serialVersionUID("1"), ID("강좌번호"), name("강좌명"), professorName("담당교수"), credit("학점"), time("시간"), pass(
					" / ");

			private String value;

			private ELecturePanel(String value) {
				this.value = value;
			}

			public String getString() {
				return this.value;
			}

			public int getInt() {
				return Integer.parseInt(this.value);
			}
		}

		public static enum EBasketPanel {
			serialVersionUID("1"), name("강좌명");

			private String value;

			private EBasketPanel(String value) {
				this.value = value;
			}

			public String getString() {
				return this.value;
			}

			public int getInt() {
				return Integer.parseInt(this.value);
			}
		}

		public static enum EMovePanel {
			LBN("LeftButton"), RBN("RightButton"), LB("<"), RB(">"), C1(Color.pink), C2(Color.yellow);

			private String value;
			private Color valueC;

			private EMovePanel(String value) {
				this.value = value;
			}

			private EMovePanel(Color valueC) {
				this.valueC = valueC;
			}

			public Color getColor() {
				return this.valueC;

			}

			public String getString() {
				return this.value;
			}

			public int getInt() {
				return Integer.parseInt(this.value);
			}
		}
	}
}
