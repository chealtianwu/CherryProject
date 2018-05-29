import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainFrame extends JFrame{
	public MainFrame() {
		super();
		setTitle("自动出题批改系统");
		setSize(800, 600);
		setLocation(300, 400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JPanel jPanel = new JPanel();
		jPanel.setLayout(mgr);
	}
}
