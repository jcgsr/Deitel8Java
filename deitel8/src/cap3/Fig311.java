package cap3;

import javax.swing.JOptionPane;

public class Fig311 {

	public static void main(String[] args) {
		// 16.11.2020 Susi dormiu no hostpital e eu vi Simone ontem
		
		JOptionPane.showMessageDialog(null, "Welcome to Java");
		
		String name = JOptionPane.showInputDialog("What's your name?");
		
		String msg = String.format("Welcome %s, to Java Programming!", name);
		
		JOptionPane.showMessageDialog(null, msg);

	}

}
