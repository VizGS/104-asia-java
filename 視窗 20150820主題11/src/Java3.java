import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
public class Java3 extends JFrame  {

	private static JTextField Fuck=new JTextField("0");
	private JPanel Fuckyou=new JPanel();
    private JPanel Fuckyou2=new JPanel();
    private JPanel Fuckyou3=new JPanel();
	private Container ass;
	private JButton cn,a,b,c,d,e,f,g,h, i,  j,  k, l,  m,  n,  o,  p ,q;
	               //0,%,+,-,*,/,←,√,(,x2,log,sin,cos,tan,cot,sec,csc,)
    private  long num;
    private  byte op;
	private JButton ab[]=new JButton[12];
	public Java3(){
		yourmother();
	}
	private void yourmother(){
		
		ass=this.getContentPane();
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setBounds(450,250,500,400);
		ass.setLayout(new BorderLayout(5,5));
		Fuck.setBackground(Color.pink);
		Fuck.setEditable(false);
		Fuck.setHorizontalAlignment(JTextField.RIGHT);
		Fuck.setFont(new Font("Times New Roman",Font.BOLD,32));
		ass.add(Fuck,BorderLayout.NORTH);
		
		Fuckyou.setLayout(new GridLayout(5,3,3,3));
		ass.add(Fuckyou,BorderLayout.CENTER);
		
		f=new JButton("←");
		Fuckyou.add(f);
		f.setFont(new Font("Times New Roman",Font.BOLD,28));		
		
		g=new JButton("√");
		Fuckyou.add(g);
		g.setFont(new Font("Times New Roman",Font.BOLD,28));
		g.addActionListener(new Java4());
		
		cn=new JButton("C");
		Fuckyou.add(cn);
		cn.setFont(new Font("Times New Roman",Font.BOLD,28));
		cn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				Fuck.setText("0");
			}
		});
		
		for(int i=9;i>0;i--){
			ab[i]=new JButton(Integer.toString(i));
			ab[i].setOpaque(true);
			ab[i].setHorizontalAlignment(JButton.CENTER);
			ab[i].setFont(new Font("Times New Roman",Font.BOLD,28));
			ab[i].addActionListener(new Java4());
			Fuckyou.add(ab[i]);
		}
		
		ab[0]=new JButton(Integer.toString(0));
		Fuckyou.add(ab[0]);
		ab[0].setFont(new Font("Times New Roman",Font.BOLD,28));
		ab[0].addActionListener(new Java4());
		
		ab[10]=new JButton("=");
		Fuckyou.add(ab[10]);
		ab[10].setFont(new Font("Times New Roman",Font.BOLD,28));
		
		ab[11]=new JButton(".");
		Fuckyou.add(ab[11]);
		ab[11].setFont(new Font("Times New Roman",Font.BOLD,28));
		ab[11].addActionListener(new Java4());
		
		Fuckyou2.setLayout(new GridLayout(5,1,3,3));
		ass.add(Fuckyou2,BorderLayout.EAST);
		
		a=new JButton("%");
		Fuckyou2.add(a);
		a.setFont(new Font("Times New Roman",Font.BOLD,25));
		a.addActionListener(new Java4());
		
		b=new JButton("+");
		Fuckyou2.add(b);
		b.setFont(new Font("Times New Roman",Font.BOLD,25));
		b.addActionListener(new Java4());
		
		c=new JButton("-");
		Fuckyou2.add(c);
		c.setFont(new Font("Times New Roman",Font.BOLD,25));
		c.addActionListener(new Java4());
		
		d=new JButton("×");
		Fuckyou2.add(d);
		d.setFont(new Font("Times New Roman",Font.BOLD,25));
		d.addActionListener(new Java4());
		
		e=new JButton("÷");
		Fuckyou2.add(e);
		e.setFont(new Font("Times New Roman",Font.BOLD,25));
		e.addActionListener(new Java4());
		
		
		Fuckyou3.setLayout(new GridLayout(5,2,3,3));
		ass.add(Fuckyou3,BorderLayout.WEST);
		
		h=new JButton("(");
		Fuckyou3.add(h);
		h.setFont(new Font("Times New Roman",Font.BOLD,25));
		h.addActionListener(new Java4());
		
		q=new JButton(")");
		Fuckyou3.add(q);
		q.setFont(new Font("Times New Roman",Font.BOLD,25));
		q.addActionListener(new Java4());
		
		i=new JButton("x²");
		Fuckyou3.add(i);
		i.setFont(new Font("Times New Roman",Font.BOLD,25));
				
		j=new JButton("log");
		Fuckyou3.add(j);
    	j.setFont(new Font("Times New Roman",Font.BOLD,25));
    	j.addActionListener(new Java4());
    	
		k=new JButton("sin");
		Fuckyou3.add(k);
		k.setFont(new Font("Times New Roman",Font.BOLD,25));
		
		l=new JButton("cos");
		Fuckyou3.add(l);
		l.setFont(new Font("Times New Roman",Font.BOLD,25));
		
		m=new JButton("tan");
		Fuckyou3.add(m);
		m.setFont(new Font("Times New Roman",Font.BOLD,25));
		
		n=new JButton("cot");
		Fuckyou3.add(n);
		n.setFont(new Font("Times New Roman",Font.BOLD,25));
		
		o=new JButton("sec");
		Fuckyou3.add(o);
		o.setFont(new Font("Times New Roman",Font.BOLD,25));
		
		p=new JButton("csc");
		Fuckyou3.add(p);
		p.setFont(new Font("Times New Roman",Font.BOLD,25));
		
	}

	public static class Java4 implements ActionListener {
		public void actionPerformed(ActionEvent ae){
			JButton asshole=(JButton)ae.getSource();
			if(Fuck.getText().equals("0")){
			Fuck.setText("");
		}
		Fuck.setText(Fuck.getText()+asshole.getText());
		
	}

		
		}

}