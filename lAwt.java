import java.awt.*;
import java.awt.event.*;

class A extends Frame implements TextListener {
	Label l;
	TextField tf;
	
	lAwt(){
		
		tf = new TextField();
		tf.setBounds(80,30,300,60);
		add(tf);
		
		
		l = new Label();
		l.setBounds(50,120,80,30);
		add(l);
		
		tf.addTextListener(this);
		
		setSize(300,300);
		setLayout(null);
		setVisible(true);
	}
	public void textValueChanged(TextEvent te){
		l.setText(tf.getText());
	}
	public static void main(String args[]){
			new A();
	}
}