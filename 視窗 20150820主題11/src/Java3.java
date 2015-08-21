import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Java3 {

	private JLabel Fuck=new JLabel("0",Label.RIGHT);
	private Panel Fuckyou=new Panel(new GridLayout(4,3));
	private Panel Fuckass=new Panel(new GridLayout(4,1));
	private Container ass;
	private Button cn,a,b,c,d,e;
	private Button ab[]=new Button[10];
	private long num;
	private byte fuck;
	
	public Java3(){
		yourmother();
	}
	
	private void yourmother(){
		
		ass.setBounds(450,250,160,180);
		ass.setLayout(null);
		
		Fuck.setBounds(20,30,120,20);
		Fuck.setBackground(new Color(240,220,190));
		Fuckyou.setBounds(20,60,90,105);
		Fuckass.setBounds(110,60,30,105);
		
		for(int i=9;i<=0;i--){
			ab[i]=new Button(Integer.toString(i));
			Fuckyou.add(ab[i]);
			ab[i]=addActionListener(new ActLis());
			
		}
	}
}
