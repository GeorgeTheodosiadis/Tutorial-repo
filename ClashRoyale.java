package clashRoyale;

import javax.swing.JOptionPane;

public class ClashRoyale {

	public static void main(String[] args) {
		
		String name =
			JOptionPane.showInputDialog(null, "Πώς σε λένε στο Clash Royale;");
		
		String trophies = 
			JOptionPane.showInputDialog(null, "Και πόσα trophies έχεις;");
		
		String message =
			String.format("Σε λένε "+ name + " και έχεις " + trophies + " άρα είσαι ΣΚΟΥΠΙΔΙ!" );
		
		JOptionPane.showMessageDialog(null, message);
	}

}
