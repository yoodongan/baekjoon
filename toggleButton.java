import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame {
	MyFrame(){
		setTitle("문제 풀기");
		setSize(300,400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container cp = getContentPane();
		cp.setLayout(null);
		JButton jb = new JButton("Action");
		jb.setLocation(50, 50);
		jb.setSize(100, 30);
		jb.setBackground(Color.yellow);
		cp.add(jb);
		jb.addActionListener(new MyActionLi());
		
	}

	public static void main(String[] args) {
		new MyFrame();
		
	}
}

class MyActionLi implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton jb = (JButton)e.getSource();
		if(jb.getText() == "Action") {
			jb.setText("액션");
		}
		else {
			jb.setText("Action");
		}
	}
	
}




