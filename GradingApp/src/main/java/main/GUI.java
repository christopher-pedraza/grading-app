package main;

import constants.*;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JMenuBar;


//https://github.com/dhatim/fastexcel

public class GUI {
	public static void main(String[] args) {
		setup();
	}

	private static void setup() {
		createMainWindow();
		JMenuBar menuBar = createMenuBar();
		
	}

	private static void createMainWindow() {
		JFrame frame = new JFrame(Constants.GUI.FRAME_NAME);

		Dimension screenDimensions = Toolkit.getDefaultToolkit().getScreenSize();
		int height = (int) (screenDimensions.getHeight() / Constants.GUI.FRAME_REDUCTION);
		int width = (int) (screenDimensions.getWidth() / Constants.GUI.FRAME_REDUCTION);

		frame.setSize(width, height);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setVisible(true);
	}
	
	private static JMenuBar createMenuBar() {
		JMenuBar menuBar = new JMenuBar();
		
		return menuBar;
	}

}
