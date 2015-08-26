import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Java3 extends JFrame {

	private static JTextField Fuck = new JTextField("0");
	private JPanel Fuckyou = new JPanel();
	private JPanel Fuckyou2 = new JPanel();
	private JPanel Fuckyou3 = new JPanel();
	private Container ass;
	private static long num;
	private static byte op;
	private static JButton ab[] = new JButton[20];
	private static JButton ab2[] = new JButton[15];
	private static boolean dot = false;
	// Button
	String str[] = { "←", "√", "C", "±", "7", "8", "9", "×", "4", "5", "6",
			"÷", "1", "2", "3", "-", "0", ".", "=", "+" };
	String str2[] = { "sinh", "(", ")", "cosh", "sin", "cos", "tanh", "tan",
			"cot", "Exp", "sec", "csc", "Mod", "log", "x²", };

	public Java3() {
		yourmother();
	}

	private void yourmother() {

		// 視窗設定
		ass = this.getContentPane();
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
		Fuckyou2.setLayout(new GridLayout(5, 2, 3, 3));
		Fuckyou.add(Fuckyou2);
		// Fuckyou3放入Fuckyou的右盤
		Fuckyou3.setLayout(new GridLayout(5, 4, 3, 3));
		Fuckyou.add(Fuckyou3);
		// Fcukyou2_JButton的設定
		for (int k = 0; k < 15; k++) {
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
		// Fuckyou3_JButton放入Java4
		for (int j = 4; j < 20; j++) {
			ab[j].addActionListener(new Java4());
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
	}

	public static class Java4 implements ActionListener {
		public void actionPerformed(ActionEvent ae) {
			JButton asshole = (JButton) ae.getSource();
			if (asshole.getText().equals("+") || asshole.getText().equals("-")
					|| asshole.getText().equals("×")
					|| asshole.getText().equals("÷")) {
				Fuck.setText(Fuck.getText());
			} else if (Fuck.getText().equals("0") && asshole.getText() != ".") {
				Fuck.setText("");
				Fuck.setText(Fuck.getText() + asshole.getText());
			} else {
				Fuck.setText(Fuck.getText() + asshole.getText());
			}

			// String mustSplitString=Fuck.getText();
			// String[] AfterSplit = mustSplitString.split("+ - × ÷");
			long abc = 0;

			if (asshole.getText().equals("+")) {
				abc = Long.parseLong(Fuck.getText());
				op = 1;
				Fuck.setText(Fuck.getText());
				
//				Fuck.setText("");
//				Fuck.setText(Fuck.getText() + asshole.getText());
			} 
			if (asshole == ab[15]) {
				abc = Long.parseLong(Fuck.getText());
				Fuck.setText(Fuck.getText());
				op = 2;
			}  
			if (asshole == ab[11]) {
				abc = Long.parseLong(Fuck.getText());
				Fuck.setText(Fuck.getText());
				op = 3;
			} 
			if (asshole == ab[7]) {
				abc = Long.parseLong(Fuck.getText());
				Fuck.setText(Fuck.getText());
				op = 4;
			} 
			Fuck.setText("");
			Fuck.setText(Fuck.getText() + asshole.getText());
			if (asshole == ab[18]) {
				num = Integer.parseInt(Fuck.getText());
				switch (op) {

				case 1:
					num += abc;
					break;
				case 2:
					num -= abc;
					break;
				case 3:
					num *= abc;
					break;
				case 4:
					num /= abc;
					break;
				default:
					num = 0;
				}
				Fuck.setText(Long.toString(num));
			}
		}

	}

}