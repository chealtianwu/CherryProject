import java.awt.Container;
import java.awt.Panel;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainFrame extends JFrame{
	SecondPanel secondPanel;
	FirstPanel firstPanel;
	MainFrame() {
		
		setTitle("自动出题批改系统");
		setSize(800, 600);
		setLocation(300, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		secondPanel = new SecondPanel();
		firstPanel = new FirstPanel(secondPanel);
		add(firstPanel);
		setVisible(true);
	}
	public static void main(String[] args) {
		MainFrame mainFrame = new MainFrame();
	}
}
