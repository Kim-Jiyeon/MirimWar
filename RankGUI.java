package javaproject;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class RankGUI {
	
	ImageIcon backimg;
	JButton backbutton;
	
	ImageIcon rankback;
	JPanel rankplate;
	
	public RankGUI() {
		rankback = new ImageIcon("rankback.jpg");
		rankplate = new JPanel() {
			public void paintComponent(Graphics g) {
				g.drawImage(rankback.getImage(), 0, 0, null);
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
				rankplate.setVisible(false);
				new MenuGUI();
			}

		});
		
		rankplate.setLayout(null);
		backbutton.setBounds(10, 10, 70, 70);
		rankplate.add(backbutton);
		MainGUI.frame.add(rankplate);
		
	}
}
