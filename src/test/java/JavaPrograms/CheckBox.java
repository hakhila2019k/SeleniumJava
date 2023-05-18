package JavaPrograms;

import java.awt.Checkbox;

import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class CheckBox {

	public static void main(String[] args) {

		new Checkbox();


	}
	
	 CheckBox()
	{
		JFrame f = new JFrame("check");
		JCheckBox checkBox1 = new JCheckBox("Java");
		checkBox1.setBounds(100,100,50,50);
		JCheckBox checkBox2 = new JCheckBox("Java",true);
		checkBox2.setBounds(100,100,50,50);
		f.add(checkBox1);
		f.add(checkBox2);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
	}

}
