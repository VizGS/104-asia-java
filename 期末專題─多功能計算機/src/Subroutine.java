import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Subroutine extends JFrame {

	private static JTextField JTF = new JTextField("0");
	private JPanel Jpanel1 = new JPanel();
	private JPanel Jpanel2 = new JPanel();
	private JPanel Jpanel3 = new JPanel();
	private Container container;
	private static double num;
	private static int fu = 0, a = 0;
	private static byte op = 0;
	private static String sum, b, c;
	private static boolean bo = true;
	private static JButton ab[] = new JButton[20];
	private static JButton ab2[] = new JButton[12];
	private static boolean dot = false;
	// Button
	String str[] = { "←", "√", "C", "±", "7", "8", "9", "×", "4", "5", "6", "÷", "1", "2", "3", "-", "0", ".", "=",
			"+" };
	String str2[] = { "sinh", "sin", "cos", "cosh", "tan", "cot", "tanh", "sec", "csc", "x³", "log", "x²" };

	public Subroutine() {
		MainMethod();
	}

	private void MainMethod() {

		// 視窗設定
		container = this.getContentPane();
		this.setTitle("多功能數字計算機    Ver.1.2.1    by第一組：吳秉鴻，林峻仕，陳映勳，徐紹恩");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setBounds(450, 250, 600, 400);
		container.setLayout(new BorderLayout(5, 5));
		// 顯示器螢幕
		JTF.setBackground(Color.pink);
		JTF.setEditable(false);
		JTF.setHorizontalAlignment(JTextField.RIGHT);
		JTF.setFont(new Font("Times New Roman", Font.BOLD, 32));
		container.add(JTF, BorderLayout.NORTH);
		// container的Center中放入Jpanel1_GridLayout
		Jpanel1.setLayout(new GridLayout(1, 2, 3, 3));
		container.add(Jpanel1, BorderLayout.CENTER);
		// Jpanel2放入Jpanel1的左盤
		Jpanel2.setLayout(new GridLayout(4, 3, 3, 3));
		Jpanel1.add(Jpanel2);
		// Jpanel3放入Jpanel1的右盤
		Jpanel3.setLayout(new GridLayout(5, 4, 3, 3));
		Jpanel1.add(Jpanel3);
		// Jpanel2_JButton的設定
		for (int k = 0; k < 12; k++) {
			ab2[k] = new JButton(str2[k]);
			ab2[k].setOpaque(true);
			ab2[k].setHorizontalAlignment(JButton.CENTER);
			ab2[k].setFont(new Font("Times New Roman", Font.BOLD, 28));
			ab2[k].setBackground(Color.WHITE);
			Jpanel2.add(ab2[k]);
		}
		// Jpanel3_JButton的設定
		for (int i = 0; i < 20; i++) {
			ab[i] = new JButton(str[i]);
			ab[i].setOpaque(true);
			ab[i].setHorizontalAlignment(JButton.CENTER);
			ab[i].setFont(new Font("Times New Roman", Font.BOLD, 28));
			Jpanel3.add(ab[i]);
		}
		// 小數點設定
		ab[17].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				String str = JTF.getText();
				int len = str.length();
				if (dot) {
					JTF.setText(str.substring(0, len - 1));
				}
				dot = true;
			}
		});
		// CN的歸零
		ab[2].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				JTF.setText("0");
				sum = "";
				b = "";
				c = "";
				fu = 0;
				op = 0;
				dot = false;
			}
		});
		// 刪除倒退鍵
		ab[0].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				String str = JTF.getText();
				String str2 = str.substring(0, str.length() - 1);
				str = str2;
				JTF.setText(str);
				if (JTF.getText().equals("")) {
					JTF.setText("0");
				}
			}
		});
		// 根號
		ab[1].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				num = Double.parseDouble(JTF.getText());
				double a = Math.sqrt(num);
				String str = String.valueOf(a);
				String[] data = str.split("\\.");
				double n = Double.parseDouble(data[1]);
				if (n == 0) {
					JTF.setText(data[0]);
					b = "";
					c = "";
					fu = 0;
					sum = data[0];
				} else {
					JTF.setText(Double.toString(a));
					b = "";
					c = "";
					fu = 0;
					sum = Double.toString(a);
				}
			}
		});
		// 數字的正負
		ab[3].addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent ae) {
				if (JTF.getText().equals("0")) {
					a = 1;
				}
				switch (a) {
				case 0:
					double e = 0 - Double.parseDouble(JTF.getText());
					String str3 = String.valueOf(e);
					JTF.setText(str3);
					String[] data = str3.split("\\.");
					double n = Double.parseDouble(data[1]);
					if (n == 0) {
						JTF.setText(data[0]);
						sum = data[0];
					} else {
						JTF.setText(Double.toString(a));
						sum = Double.toString(a);
					}
					break;
				case 1:
					JTF.setText("0");
					a = 0;
					break;
				}
			}
		});
		// +,-,*,/
		ab[19].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				if (!JTF.getText().equals("")) {
					op = 1;
					bo = false;
					sum = sum + "+";
				}
			}
		});
		ab[15].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				if (!JTF.getText().equals("")) {
					op = 2;
					bo = false;
					sum = sum + "-";
				}
			}
		});
		ab[7].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				if (!JTF.getText().equals("")) {
					op = 3;
					bo = false;
				}
			}
		});
		ab[11].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				if (!JTF.getText().equals("")) {
					op = 4;
					bo = false;
				}
			}
		});
		// sin
		ab2[1].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				num = Double.parseDouble(JTF.getText());
				double a = Math.sin(num / (180 / Math.PI));
				JTF.setText(Double.toString(a));
				b = "";
				c = "";
				fu = 0;
				sum = Double.toString(a);
			}
		});
		// cos
		ab2[2].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				num = Double.parseDouble(JTF.getText());
				if (num == 90) {
					JTF.setText("0.0");
					b = "";
					c = "";
					fu = 0;
					sum = "0.0";
				} else {
					double a = Math.cos(num / (180 / Math.PI));
					JTF.setText(Double.toString(a));
					b = "";
					c = "";
					fu = 0;
					sum = Double.toString(a);
				}
			}
		});
		// tan
		ab2[4].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				num = Double.parseDouble(JTF.getText());
				if (num == 90 || num == 270) {
					JTF.setText("No  answer");
					b = "";
					c = "";
					fu = 0;
					sum = "";
				} else if (num == 180) {
					JTF.setText("0");
					b = "";
					c = "";
					fu = 0;
					sum = "0";
				} else {
					double a = Math.tan(num / (180 / Math.PI));
					JTF.setText(Double.toString(a));
					b = "";
					c = "";
					fu = 0;
					sum = Double.toString(a);
				}
			}

		});
		// cot
		ab2[5].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				num = Double.parseDouble(JTF.getText());
				if (num == 90 || num == 270) {
					JTF.setText("No  answer");
					b = "";
					c = "";
					fu = 0;
					sum = "";
				} else if (num == 180) {
					JTF.setText("0");
					b = "";
					c = "";
					fu = 0;
					sum = "0";
				} else {
					double a = Math.tan(num / (180 / Math.PI));
					JTF.setText(Double.toString(1 / a));
					b = "";
					c = "";
					fu = 0;
					sum = Double.toString(1 / a);
				}
			}
		});
		// sec
		ab2[7].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				num = Double.parseDouble(JTF.getText());
				if (num == 90) {
					JTF.setText("0.0");
					b = "";
					c = "";
					fu = 0;
					sum = "0.0";
				} else {
					double a = Math.cos(num / (180 / Math.PI));
					JTF.setText(Double.toString(1 / a));
					b = "";
					c = "";
					fu = 0;
					sum = Double.toString(1 / a);
				}
			}
		});
		// csc
		ab2[8].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				num = Double.parseDouble(JTF.getText());
				double a = Math.sin(num / (180 / Math.PI));
				JTF.setText(Double.toString(1 / a));
				b = "";
				c = "";
				fu = 0;
				sum = Double.toString(1 / a);
			}
		});
		// sinh
		ab2[0].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				num = Double.parseDouble(JTF.getText());
				double a = Math.sinh(num);
				JTF.setText(Double.toString(a));
				b = "";
				c = "";
				fu = 0;
				sum = Double.toString(a);
			}
		});
		// cosh
		ab2[3].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				num = Double.parseDouble(JTF.getText());
				double a = Math.cosh(num);
				JTF.setText(Double.toString(a));
				b = "";
				c = "";
				fu = 0;
				sum = Double.toString(a);
			}
		});
		// tanh
		ab2[6].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				num = Double.parseDouble(JTF.getText());
				double a = Math.tanh(num);
				JTF.setText(Double.toString(a));
				b = "";
				c = "";
				fu = 0;
				sum = Double.toString(a);
			}
		});
		// x³
		ab2[9].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				num = Double.parseDouble(JTF.getText());
				double a = Math.pow(num, 3);
				String str = String.valueOf(a);
				String[] data = str.split("\\.");
				double n = Double.parseDouble(data[1]);
				if (n == 0) {
					JTF.setText(data[0]);
					b = "";
					c = "";
					fu = 0;
					sum = data[0];
				} else {
					JTF.setText(Double.toString(a));
					b = "";
					c = "";
					fu = 0;
					sum = Double.toString(a);
				}
			}
		});
		// log
		ab2[10].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				num = Double.parseDouble(JTF.getText());
				double a = Math.log10(num);
				String str = String.valueOf(a);
				String[] data = str.split("\\.");
				double n = Double.parseDouble(data[1]);
				if (n == 0) {
					JTF.setText(data[0]);
					b = "";
					c = "";
					fu = 0;
					sum = data[0];
				} else {
					JTF.setText(Double.toString(a));
					b = "";
					c = "";
					fu = 0;
					sum = Double.toString(a);
				}
			}
		});
		// x²
		ab2[11].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				num = Double.parseDouble(JTF.getText());
				double a = Math.pow(num, 2);
				String str = String.valueOf(a);
				String[] data = str.split("\\.");
				double n = Double.parseDouble(data[1]);
				if (n == 0) {
					JTF.setText(data[0]);
					b = "";
					c = "";
					fu = 0;
					sum = data[0];
				} else {
					JTF.setText(Double.toString(a));
					b = "";
					c = "";
					fu = 0;
					sum = Double.toString(a);
				}
			}
		});
		// =
		ab[18].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {

				int e = 0;
				for (int i = 0; i < sum.length(); i++) {
					if (String.valueOf(sum.charAt(0)).equals("-")) {
						sum = "0" + sum;
					}
					if (String.valueOf(sum.charAt(i)).equals("+")) {
						if (fu == 1) {
							b = String.valueOf(Double.parseDouble(c) + Double.parseDouble(b));
						} else if (fu == 2) {
							b = String.valueOf(Double.parseDouble(c) - Double.parseDouble(b));
						}
						c = b;
						b = "";
						e--;
						fu = 1;
					} else if (String.valueOf(sum.charAt(i)).equals("-")) {
						if (fu == 1) {
							b = String.valueOf(Double.parseDouble(c) + Double.parseDouble(b));
						} else if (fu == 2) {
							b = String.valueOf(Double.parseDouble(c) - Double.parseDouble(b));
						}
						c = b;
						b = "";
						e--;
						fu = 2;
					} else {
						if (e == 0) {
							b = String.valueOf(sum.charAt(i));
							e++;
						} else {
							b += String.valueOf(sum.charAt(i));
						}
					}
				}
				String str = "";

				if (fu == 1) {
					str = String.valueOf(Double.parseDouble(c) + Double.parseDouble(b));
				} else if (fu == 2) {
					str = String.valueOf(Double.parseDouble(c) - Double.parseDouble(b));
				} else {
					str = b;
				}

				String[] data = str.split("\\.");
				double n = Double.parseDouble(data[1]);
				if (n == 0) {
					JTF.setText(data[0]);
				} else {
					JTF.setText(str);
				}

				sum = str;
				b = "";
				c = "";
				fu = 0;
			}
		});
		// Jpanel3_JButton放入Java4
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
			JButton Jbtn = (JButton) ae.getSource();

			if (JTF.getText().equals("0")) {
				sum = Jbtn.getText();
			} else {
				if (op == 3) {
					String a = String.valueOf(Double.parseDouble(JTF.getText()) * Double.parseDouble(Jbtn.getText()));
					if (sum.indexOf("+") + sum.indexOf("-") < 0) {
						sum = a;
					} else {
						sum = sum.substring(0, sum.length() - 1) + a;
					}
				} else if (op == 4) {
					String a = String.valueOf(Double.parseDouble(JTF.getText()) / Double.parseDouble(Jbtn.getText()));
					if (sum.indexOf("+") + sum.indexOf("-") < 0) {
						sum = a;
					} else {
						sum = sum.substring(0, sum.length() - 1) + a;
					}
				} else if (op == 1 || op == 2) {
					sum = sum + Jbtn.getText();
				} else {
					sum = sum + Jbtn.getText();
				}

			}

			if (bo == false) {
				JTF.setText("");
				bo = true;
			}

			if (JTF.getText().equals("0") && Jbtn.getText() != "." || JTF.getText().equals("No  answer")) {
				JTF.setText("");
				JTF.setText(JTF.getText() + Jbtn.getText());
			} else {
				JTF.setText(JTF.getText() + Jbtn.getText());
			}

		}
	}
}