package gameThatCould;

import java.awt.Canvas;

public class Game extends Canvas implements Runnable {

	
	private static final long serialVersionUID = -2013250714229622034L;
	
	//setting up the size of the game window  
	public static final int WIDTH = 640, HEIGHT = WIDTH / 12 * 9;
	
	public Game()
	{
		new Window(WIDTH, HEIGHT, "Jesse's First Game Chea Yeah", this);
	}

	public synchronized void start()
	{
		
	}
	
	public void run()
	{
		
	}
	
	// a main?
	public static void main(String[] args)
	{

		
	}

}
