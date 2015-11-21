
import java.awt.EventQueue;

public class program {
	
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				
					GUI_Calculator frame = new GUI_Calculator();
					frame.setVisible(true);
	
			}
		});	
	}
}
