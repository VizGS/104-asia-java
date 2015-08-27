import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Java3 extends JFrame {

	private static JTextField Fuck = new JTextField("0");
	private JPanel Fuckyou = new JPanel();
	private JPanel Fuckyou2 = new JPanel();
	private JPanel Fuckyou3 = new JPanel();
	private Container ass;
	private static double num;
	private static double abc;
	private static byte op;
	private static JButton ab[] = new JButton[20];
	private static JButton ab2[] = new JButton[12];
	private static boolean dot = false;
	// Button
	String str[] = { "←", "√", "C", "±", "7", "8", "9", "×", "4", "5", "6",
			"÷", "1", "2", "3", "-", "0", ".", "=", "+" };
	String str2[] = { "sinh", "sin", "cos", "cosh", "tan", "cot", "tanh",
			"sec", "csc", "x³", "log", "x²" };

	public Java3() {
		yourmother();
	}

	private void yourmother() {

		// 視窗設定
		ass = this.getContentPane();
		this.setTitle("工程計算機  Ver.0.1.0  by吳秉鴻");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setBounds(450, 250, 600, 400);
		ass.setLayout(new BorderLayout(5, 5));
		// 顯示器螢幕
		Fuck.setBackground(Color.pink);
		Fuck.setEditable(false);
		Fuck.setHorizontalAlignment(JTextField.RIGHT);
		Fuck.setFont(new Font("Times New Roman", Font.BOLD, 32));
		ass.add(Fuck, BorderLayout.NORTH);
		// ass的Center中放入Fuckyou_GridLayout
		Fuckyou.setLayout(new GridLayout(1, 2, 3, 3));
		ass.add(Fuckyou, BorderLayout.CENTER);
		// Fuckyou2放入Fuckyou的左盤
		Fuckyou2.setLayout(new GridLayout(4, 3, 3, 3));
		Fuckyou.add(Fuckyou2);
		// Fuckyou3放入Fuckyou的右盤
		Fuckyou3.setLayout(new GridLayout(5, 4, 3, 3));
		Fuckyou.add(Fuckyou3);
		// Fcukyou2_JButton的設定
		for (int k = 0; k < 12; k++) {
			ab2[k] = new JButton(str2[k]);
			ab2[k].setOpaque(true);
			ab2[k].setHorizontalAlignment(JButton.CENTER);
			ab2[k].setFont(new Font("Times New Roman", Font.BOLD, 28));
			ab2[k].setBackground(Color.WHITE);
			Fuckyou2.add(ab2[k]);
		}
		ab2[1].addActionListener(new Java4());
		ab2[2].addActionListener(new Java4());
		// Fuckyou3_JButton的設定
		for (int i = 0; i < 20; i++) {
			ab[i] = new JButton(str[i]);
			ab[i].setOpaque(true);
			ab[i].setHorizontalAlignment(JButton.CENTER);
			ab[i].setFont(new Font("Times New Roman", Font.BOLD, 28));
			Fuckyou3.add(ab[i]);
		}
		// 小數點設定
		ab[17].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				String str = Fuck.getText();
				int len = str.length();
				if (dot) {
					Fuck.setText(str.substring(0, len - 1));
				}
				dot = true;
			}
		});
		// CN的歸零
		ab[2].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				Fuck.setText("0");
				dot = false;
			}
		});
		// 刪除倒退鍵
		ab[0].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				String str = Fuck.getText();
				String str2 = str.substring(0, str.length() - 1);
				str = str2;
				Fuck.setText(str);
				if (Fuck.getText().equals("")) {
					Fuck.setText("0");
				}
			}
		});
		// 根號
		ab[1].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				num = Double.parseDouble(Fuck.getText());
				double a = Math.sqrt(num);
				String str = String.valueOf(a);
				String[] data = str.split("\\.");
				double n = Double.parseDouble(data[1]);
				if (n == 0) {
					Fuck.setText(data[0]);
				} else {
					Fuck.setText(Double.toString(a));
				}
			}
		});
		// 數字的正負
		ab[3].addActionListener(new ActionListener() {
			int a = 0;

			public void actionPerformed(ActionEvent ae) {
				if (Fuck.getText().equals("0")) {
					a = 2;
				}
				switch (a) {
				case 0:
					String str3 = (char) 45 + Fuck.getText();
					Fuck.setText(str3);
					a++;
					break;
				case 1:
					String str = Fuck.getText();
					String str2 = str.substring(1, str.length());
					str = str2;
					Fuck.setText(str);
					a--;
					break;
				case 2:
					Fuck.setText("0");
					a = 0;
					break;
				}
			}
		});
		// +,-,*,/
		ab[19].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				if (!Fuck.getText().equals("")) {
					op = 1;
					num = Double.parseDouble(Fuck.getText());
					Fuck.setText("");
				}
			}
		});
		ab[15].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				if (!Fuck.getText().equals("")) {
					op = 2;
					num = Double.parseDouble(Fuck.getText());
					Fuck.setText("");
				}
			}
		});
		ab[11].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				if (!Fuck.getText().equals("")) {
					op = 3;
					num = Double.parseDouble(Fuck.getText());
					Fuck.setText("");
				}
			}
		});
		ab[7].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				if (!Fuck.getText().equals("")) {
					op = 4;
					num = Double.parseDouble(Fuck.getText());
					Fuck.setText("");
				}
			}
		});
		// sin
		ab2[1].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				num = Double.parseDouble(Fuck.getText());
				double a = Math.sin(num / (180 / Math.PI));
				Fuck.setText(Double.toString(a));
			}
		});
		// cos
		ab2[2].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				num = Double.parseDouble(Fuck.getText());
				if (num == 90) {
					Fuck.setText("0.0");
				} else {
					double a = Math.cos(num / (180 / Math.PI));
					Fuck.setText(Double.toString(a));
				}
			}
		});
		// tan
		ab2[4].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				num = Double.parseDouble(Fuck.getText());
				if (num == 90 || num == 270) {
					Fuck.setText("No  answer");
				} else if (num == 180) {
					Fuck.setText("0");
				} else {
					double a = Math.tan(num / (180 / Math.PI));
					Fuck.setText(Double.toString(a));
				}
			}

		});
		// cot
		ab2[5].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				num = Double.parseDouble(Fuck.getText());
				if (num == 90 || num == 270) {
					Fuck.setText("No  answer");
				} else if (num == 180) {
					Fuck.setText("0");
				} else {
					double a = Math.tan(num / (180 / Math.PI));
					Fuck.setText(Double.toString(1 / a));
				}
			}
		});
		// sec
		ab2[7].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				num = Double.parseDouble(Fuck.getText());
				if (num == 90) {
					Fuck.setText("0.0");
				} else {
					double a = Math.cos(num / (180 / Math.PI));
					Fuck.setText(Double.toString(1 / a));
				}
			}
		});
		// csc
		ab2[8].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				num = Double.parseDouble(Fuck.getText());
				double a = Math.sin(num / (180 / Math.PI));
				Fuck.setText(Double.toString(1 / a));
			}
		});
		// sinh
		ab2[0].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				num = Double.parseDouble(Fuck.getText());
				double a = Math.sinh(num);
				Fuck.setText(Double.toString(a));
			}
		});
		// cosh
		ab2[3].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				num = Double.parseDouble(Fuck.getText());
				double a = Math.cosh(num);
				Fuck.setText(Double.toString(a));
			}
		});
		// tanh
		ab2[6].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				num = Double.parseDouble(Fuck.getText());
				double a = Math.tanh(num);
				Fuck.setText(Double.toString(a));
			}
		});
		// x³
		ab2[9].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				num = Double.parseDouble(Fuck.getText());
				double a = Math.pow(num, 3);
				String str = String.valueOf(a);
				String[] data = str.split("\\.");
				double n = Double.parseDouble(data[1]);
				if (n == 0) {
					Fuck.setText(data[0]);
				} else {
					Fuck.setText(Double.toString(a));
				}
			}
		});
		// log
		ab2[10].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				num = Double.parseDouble(Fuck.getText());
				double a = Math.log10(num);
				String str = String.valueOf(a);
				String[] data = str.split("\\.");
				double n = Double.parseDouble(data[1]);
				if (n == 0) {
					Fuck.setText(data[0]);
				} else {
					Fuck.setText(Double.toString(a));
				}
			}
		});
		// x²
		ab2[11].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				num = Double.parseDouble(Fuck.getText());
				double a = Math.pow(num, 2);
				String str = String.valueOf(a);
				String[] data = str.split("\\.");
				double n = Double.parseDouble(data[1]);
				if (n == 0) {
					Fuck.setText(data[0]);
				} else {
					Fuck.setText(Double.toString(a));
				}
			}
		});
		// =
		ab[18].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				if (Fuck.getText().equals("")) {
					abc = num;
				} else {
					abc = Double.parseDouble(Fuck.getText());
				}

				Double a = 0.0;
				switch (op) {
				case 1:
					a = (num + abc);
					break;
				case 2:
					a = (num - abc);
					break;
				case 3:
					a = (num / abc);
					break;
				case 4:
					a = (num * abc);
					break;
				default:
					num = 0;
				}
				String str = String.valueOf(a);
				String[] data = str.split("\\.");
				double n = Double.parseDouble(data[1]);
				if (n == 0) {
					Fuck.setText(data[0]);
				} else {
					Fuck.setText(Double.toString(a));
				}

			}
		});
		// Fuckyou3_JButton放入Java4
		for (int j = 4; j < 7; j++) {
			ab[j].addActionListener(new Java4());
		}
		for (int k = 8; k < 11; k++) {
			ab[k].addActionListener(new Java4());
		}
		for (int m = 12; m < 15; m++) {
			ab[m].addActionListener(new Java4());
		}
		ab[16].addActionListener(new Java4());
		ab[17].addActionListener(new Java4());
	}

	public static class Java4 implements ActionListener {
		public void actionPerformed(ActionEvent ae) {
			JButton asshole = (JButton) ae.getSource();
			if (Fuck.getText().equals("0") && asshole.getText() != ".") {
				Fuck.setText("");
				Fuck.setText(Fuck.getText() + asshole.getText());
			} else {
				Fuck.setText(Fuck.getText() + asshole.getText());
			}
		}
	}
}