package gameThatCould;

import java.awt.Canvas;

public class Game extends Canvas implements Runnable {

	
	private static final long serialVersionUID = -2013250714229622034L;
	
	//setting up the size of the game window  
	public static final int WIDTH = 640, HEIGHT = WIDTH / 12 * 9;
	
	private Thread thread;
	private boolean running = false;
	
	
	public Game()
	{
		new Window(WIDTH, HEIGHT, "Jesse's First Game Chea Yeah", this);
	}

	public synchronized void start()
	{
		thread = new Thread(this);
		thread.start();
		running = true;
	}
	
	public synchronized void stop()
	{
		try {
			thread.join();
			running = false;
		}catch(Exception j) {
			j.printStackTrace();
		}
	}
	
	
	public void run()
	{
		long lastTime = System.nanoTime();
		double ns = 1000000000 / amountOfTicks;
		double delta = 0;
		long timer = System.currentTimeMillis();
		int frames = 0;
		while(running)
		{
			long now = System.nanoTime();
			delta += (now - lastTime) / ns;
			lastTime = now;
			while(delta >= 1)
			{
				tick();
				delta--;
			}
			if(running)
				render();
			frames++;
			
			if(System.currentTimeMillis() - timer > 1000)
			{
				
			}
		}
	}
	
	// a main?
	public static void main(String[] args)
	{
		new Game();
	}

}
