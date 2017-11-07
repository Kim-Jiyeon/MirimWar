package javaproject;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class HowtoGUI {

	ImageIcon backimg;
	JButton backbutton;

	ImageIcon howtoimg;
	JPanel howtoplate;
	
	public HowtoGUI() {
		
		howtoimg = new ImageIcon("howto.jpg");
		howtoplate = new JPanel() {
			public void paintComponent(Graphics g) {
				g.drawImage(howtoimg.getImage(), 0, 0, null);
				setOpaque(false); // 투명하게
				super.paintComponent(g);
			}
		};
		
		backimg = new ImageIcon("back.png");
		backbutton = new JButton(backimg);
		backbutton.setBorderPainted(false);
		backbutton.setContentAreaFilled(false);
		backbutton.setFocusPainted(false);
		backbutton.addMouseListener(new MouseListener() {
			public void mouseEntered(MouseEvent e) {
				backimg = new ImageIcon("backact.png");
				backbutton.setIcon(backimg);
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub
				backimg = new ImageIcon("back.png");
				backbutton.setIcon(backimg);
			}

			@Override
			public void mouseClicked(MouseEvent arg0) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mousePressed(MouseEvent arg0) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub
				backimg = new ImageIcon("back.png");
				backbutton.setIcon(backimg);
			}
		});
		
		backbutton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				howtoplate.setVisible(false);
				new MenuGUI();
			}

		});
		
		howtoplate.setLayout(null);
		backbutton.setBounds(10, 10, 70, 70);
		howtoplate.add(backbutton);
		MainGUI.frame.add(howtoplate);
		
	}
}
