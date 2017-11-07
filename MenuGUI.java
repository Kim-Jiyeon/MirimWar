package javaproject;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class MenuGUI {
	
	ImageIcon menuback;
	JPanel menuplate;
	
	ImageIcon startbtnimg;
	ImageIcon infobtnimg;
	ImageIcon rankbtnimg;

	JButton startbutton;
	JButton infobutton;
	JButton rankbutton;
	
	
	
	public MenuGUI() {
		
		startbtnimg = new ImageIcon("startbtnimg.png");
		infobtnimg = new ImageIcon("infobtnimg.png");
		rankbtnimg = new ImageIcon("rankbtnimg.png");

		startbutton = new JButton(startbtnimg);
		infobutton = new JButton(infobtnimg);
		rankbutton = new JButton(rankbtnimg);

		startbutton.setBorderPainted(false);
		startbutton.setContentAreaFilled(false);
		startbutton.setFocusPainted(false);

		infobutton.setBorderPainted(false);
		infobutton.setContentAreaFilled(false);
		infobutton.setFocusPainted(false);

		rankbutton.setBorderPainted(false);
		rankbutton.setContentAreaFilled(false);
		rankbutton.setFocusPainted(false);
		
		menuback = new ImageIcon("menuback.jpg");
		menuplate = new JPanel() {
			public void paintComponent(Graphics g) {
				g.drawImage(menuback.getImage(), 0, 0, null);
				setOpaque(false);
				super.paintComponent(g);
			}
		};
		
		menuplate.setLayout(null);

		menuplate.add(startbutton);
		menuplate.add(infobutton);
		menuplate.add(rankbutton);
		
		startbutton.setBounds(550, 570, 250, 100);
		infobutton.setBounds(550, 690, 250, 100);
		rankbutton.setBounds(550, 810, 250, 100);
		
		
		menuplate.setVisible(true);
		MainGUI.frame.add(menuplate);
		
		
		
		startbutton.addMouseListener(new MouseListener() {
			public void mouseEntered(MouseEvent e) {
				startbtnimg = new ImageIcon("startactimg.png");
				startbutton.setIcon(startbtnimg);
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub
				startbtnimg = new ImageIcon("startbtnimg.png");
				startbutton.setIcon(startbtnimg);
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
				startbtnimg = new ImageIcon("startbtnimg.png");
				startbutton.setIcon(startbtnimg);
			}
		});
		
		startbutton.addActionListener(new ActionListener() {
			@Override
			// 팝업창으로 고치기(추후)

			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				menuplate.setVisible(false);
				new StoryGUI();
			}
		});
		
		infobutton.addMouseListener(new MouseListener() {

			public void mouseEntered(MouseEvent e) {
				infobtnimg = new ImageIcon("infoactimg.png");
				infobutton.setIcon(infobtnimg);
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub
				infobtnimg = new ImageIcon("infobtnimg.png");
				infobutton.setIcon(infobtnimg);
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
				infobtnimg = new ImageIcon("infobtnimg.png");
				infobutton.setIcon(infobtnimg);
			}
		});

		infobutton.addActionListener(new ActionListener() {

			@Override
			// 팝업창으로 고치기(추후)
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				menuplate.setVisible(false);
				new HowtoGUI();
			}
		});
		
		rankbutton.addMouseListener(new MouseListener() {
			public void mouseEntered(MouseEvent e) {
				rankbtnimg = new ImageIcon("rankactimg.png");
				rankbutton.setIcon(rankbtnimg);
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub
				rankbtnimg = new ImageIcon("rankbtnimg.png");
				rankbutton.setIcon(rankbtnimg);
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
				rankbtnimg = new ImageIcon("rankbtnimg.png");
				rankbutton.setIcon(rankbtnimg);
			}
		});

		rankbutton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				menuplate.setVisible(false);
				new RankGUI();
			}
		});
	}
}
