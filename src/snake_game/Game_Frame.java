package snake_game;

import javax.swing.JFrame;

public class Game_Frame extends JFrame{
	Game_Frame(){
		
		Game_Panel panel = new Game_Panel();
		this.add(panel);
		
//		or we can do this 
//		this.add(new Game_Panel());
//		And this will be the same thing. This is a shortcut.
		
		this.setTitle("Snake");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.pack();
		this.setVisible(true);
		this.setLocationRelativeTo(null);
	}
}
