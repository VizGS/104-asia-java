import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Fuck extends JFrame {

	private JButton FuckExit=new JButton("Exit");
	private JButton FuckPush=new JButton("Push");
	private JLabel Fuckyou=new JLabel();
	private Container ass;
	private String str="®×Push«ö¶s¦¸¼Æ";
	private int a=0;
	
	public Fuck(){
		yourmother();
	}
	
	private void yourmother(){
		ass=this.getContentPane();
		this.setBounds(150,100,600,400);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		ass.setLayout(null);
		
		Fuckyou.setBounds(50,70,250,25);
		Fuckyou.setText(str+a);
		ass.add(Fuckyou);
		
		FuckPush.setBounds(50,100,80,25);
		ass.add(FuckPush);
		FuckPush.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent b){
				a++;
				Fuckyou.setText(str+a);				
			}
		});
		
		FuckExit.setBounds(50,150,80,25);
		ass.add(FuckExit);
		FuckExit.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent b){
				System.exit(0);
			}
		});
	}
}
