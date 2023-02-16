package classes;
import javax.swing.JFrame;

public class main {
    public static void main(String[] args) {
    	Map maze = new Map(100,100);
        Player player = new Player(100, 100, 5, 50);
        JFrame frame = new JFrame();
        
        frame.setSize(500, 500);
        frame.pack();
        frame.add(player);
        frame.setVisible(true);
        
    }
}