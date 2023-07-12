
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



class Gui extends JFrame{
	JPanel p;
	JLabel l1,l2,l3,l4;
	JButton b1,b2,b3,b4,b5;
	JTextField t1,t2;
	
	class A implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			try {
				String s1=t1.getText();
				String s2=t2.getText();
				int n1=Integer.parseInt(s1);
				int n2=Integer.parseInt(s2);
				int n=n1+n2;
				l4.setText(String.valueOf(n));
//				l4.setText(n+"");//allowed
			}catch (NumberFormatException ex) {
				JOptionPane.showMessageDialog(null, "Invalid Number!");
			}
		}
	}
	class B implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			try {
				String s1=t1.getText();
				String s2=t2.getText();
				int n1=Integer.parseInt(s1);
				int n2=Integer.parseInt(s2);
				int n=n1-n2;
				l4.setText(String.valueOf(n));
//				l4.setText(n+"");//allowed
			}catch (NumberFormatException ex) {
				JOptionPane.showMessageDialog(null, "Invalid Number!");
			}
		}
	}
	
	Gui(){
		setTitle("Mini Calci");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setSize(400,300);
		setLocationRelativeTo(null);
		getContentPane().setBackground(Color.DARK_GRAY);
		setLayout(null);
		
		p=new JPanel();
		p.setLayout(null);
		p.setBackground(Color.YELLOW);
		p.setBounds(30,20,325,170);
		add(p);
		
		Font font1=new Font(Font.MONOSPACED,Font.BOLD, 20);
		Font font2=new Font(Font.SANS_SERIF,Font.BOLD, 16);
		
		l1=new JLabel("Enter 1st No:");
		l1.setFont(font2);
		l1.setBounds(20,20,100,30);
		p.add(l1);
		t1=new JTextField();
		t1.setForeground(Color.RED);
		t1.setFont(font1);
		t1.setBounds(140,20,150,30);
		p.add(t1);
		l2=new JLabel("Enter 2nd No:");
		l2.setFont(font2);
		l2.setBounds(20,60,110,30);
		p.add(l2);
		t2=new JTextField();
		t2.setForeground(Color.RED);
		t2.setFont(font1);
		t2.setBounds(140,60,150,30);
		p.add(t2);
		
		b1=new JButton("+");
		b1.addActionListener(new A());//Registration of Source with Listener
		b1.setFont(font1);
		b1.setBounds(20,110,50,40);
		b1.setForeground(Color.WHITE);
		b1.setBackground(Color.BLACK);
		p.add(b1);
		b2=new JButton("-");
		b2.addActionListener(new B());//Registration of Source with Listener
		b2.setFont(font1);
		b2.setBounds(75,110,50,40);
		b2.setForeground(Color.WHITE);
		b2.setBackground(Color.BLACK);
		p.add(b2);
		b3=new JButton("*");
		b3.setFont(font1);
		b3.setBounds(130,110,50,40);
		b3.setForeground(Color.WHITE);
		b3.setBackground(Color.BLACK);
		p.add(b3);
		b4=new JButton("/");
		b4.setFont(font1);
		b4.setBounds(185,110,50,40);
		b4.setForeground(Color.WHITE);
		b4.setBackground(Color.BLACK);
		p.add(b4);
		b5=new JButton("%");
		b5.setFont(font1);
		b5.setBounds(240,110,50,40);
		b5.setForeground(Color.WHITE);
		b5.setBackground(Color.BLACK);
		p.add(b5);
		
		l3=new JLabel("Answer:");
		l3.setFont(font2);
		l3.setForeground(Color.WHITE);
		l3.setBounds(30,210,80,30);
		add(l3);
		l4=new JLabel("--------");
		l4.setHorizontalAlignment(JLabel.CENTER);
		l4.setFont(font2);
		l4.setForeground(Color.YELLOW);
		l4.setBounds(140,210,200,30);
		add(l4);
	}
}
public class MiniCalci {
	public static void main(String[] args) {
		Gui g=new Gui();
		g.setVisible(true);
	}
}