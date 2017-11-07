package javaproject;

import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.BufferedInputStream;
import java.io.FileInputStream;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainGUI {
	
	static JFrame frame = new JFrame("�̸�����");
	static Clip clip;
	ImageIcon mainback;
	JPanel mainplate;
	
	public MainGUI() {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mainback = new ImageIcon("mainback.jpg");
		mainplate = new JPanel() {
			public void paintComponent(Graphics g) {
				g.drawImage(mainback.getImage(), 0, 0, null);
				setOpaque(false); // �����ϰ�
				super.paintComponent(g);
			}
		};
		
		frame.add(mainplate);
		frame.setSize(1320, 1060);
		frame.setVisible(true);
		Main_Sound("¯��.wav");
		
		mainplate.setFocusable(true);
		mainplate.requestFocusInWindow();

		mainplate.addKeyListener(new KeyAdapter() {
			public void keyPressed
			(KeyEvent e) {
				System.out.println("Ű������");
				String enter = e.getKeyText(e.getKeyCode());
				if (enter == "Enter") {
					System.out.println("����Ű");
					mainplate.setVisible(false);
					new MenuGUI();
				}
			}
		});
		
	}
	
	public static void Main_Sound(String Sound) {
		  try{
			  AudioInputStream ais = AudioSystem.getAudioInputStream(new BufferedInputStream(new FileInputStream(Sound)));
			  
			  clip = AudioSystem.getClip();
			  clip.open(ais);
			  clip.start();
			  //Thread.sleep(clip.getMicrosecondLength()/1000);
			  }catch(Exception e){
			   e.printStackTrace();
			  }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MainGUI();
	}
}
