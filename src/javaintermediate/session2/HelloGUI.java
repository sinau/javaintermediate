package javaintermediate.session2;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class HelloGUI extends JFrame {
	
	private static final long serialVersionUID = 1L;

	private JButton button;
	private JTextField textField;

	public HelloGUI() {
		setLayout(new FlowLayout());
		button = new JButton("OK");
		textField = new JTextField(20);
		
		button.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {	
				setTitle(textField.getText());
				JOptionPane.showMessageDialog(null, textField.getText(), "Message", JOptionPane.INFORMATION_MESSAGE);
			}
		});

		add(button);
		add(textField);
		setTitle("Hello Gui");
		setSize(500, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		HelloGUI hello = new HelloGUI();
		hello.setVisible(true);
	}
	
}
