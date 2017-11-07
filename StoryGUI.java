package javaproject;

import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class StoryGUI {

	ImageIcon storyback;
	JPanel storyplate;
	
	public StoryGUI() {
		
		storyback = new ImageIcon("story.jpg");
		storyplate = new JPanel() {
			public void paintComponent(Graphics g) {
				g.drawImage(storyback.getImage(), 0, 0, null);
				setOpaque(false); // 투명하게
				super.paintComponent(g);
			}
		};
		
		storyplate.setFocusable(true);
		storyplate.requestFocusInWindow();
		storyplate.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				String enter = e.getKeyText(e.getKeyCode());
				if (enter == "Enter") {
					storyplate.setVisible(false);
					new GameGUI();
				}
				
			}
		});
			
		MainGUI.frame.add(storyplate);
	}
}
