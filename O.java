import java.awt.*;
import java.awt.event.*;

class O extends Frame implements ActionListener{
	List l;
	Label l1;
	O(){
		l = new List();
		l.setBounds(8,30,300,60);
		l.add("Window");
		l.add("Linux");
		l.add("Unix");
		l.add("Ubantu");
		l.add("Mac");
		add(l);
		setSize(300,300);
		
		l1 = new Label("sidd");
		add(l1);
		l1.setBounds(8,100,100,30);
		l.addActionListener(this);
		
		setLayout(null);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent ae){

		l1.setText(l.getSelectedItem());
		
		
	}
	public static void main(String args[]){
		new O();
	}
}