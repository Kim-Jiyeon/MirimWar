package javaproject;

import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class GameGUI {

	ImageIcon gameback;
	JPanel gameplate;
	
	public GameGUI() {
		gameback = new ImageIcon("gameback.jpg");
		gameplate = new JPanel() {
			public void paintComponent(Graphics g) {
				g.drawImage(gameback.getImage(), 0, 0, null);
				setOpaque(false); // 투명하게
				super.paintComponent(g);
			}
		};
		gameplate.setLayout(null);

		MainGUI.frame.add(gameplate);
		
		new PlayGame();
	}
}
