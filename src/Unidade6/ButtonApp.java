package Unidade6;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


@SuppressWarnings("serial")
public class ButtonApp extends JFrame implements ActionListener,WindowListener{

	public static void main(String[] args) {
		
		ButtonApp frame = new ButtonApp();
		frame.setTitle("Aplicação");
		
		frame.setSize(350, 250);
		Container cont = frame.getContentPane();
		cont.setLayout(new FlowLayout());
		JButton botao = new JButton("Isto é um botão");
		botao.addActionListener(frame);
		cont.add(botao);
		frame.addWindowListener(frame);
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent evento) {
		JOptionPane.showConfirmDialog(null, evento.getActionCommand().toString());
	}

	//Métodos add com WindowListener
	@Override
	public void windowActivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent arg0) {
		JOptionPane.showMessageDialog(null, "Encerrando a Aplicação");
		System.exit(0);
		
	}

	@Override
	public void windowDeactivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowOpened(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
