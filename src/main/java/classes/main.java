package classes;
import javax.swing.JFrame;

public class main {
    public static void main(String[] args) {
        Player player = new Player(100, 100, 5, 50);
        JFrame frame = new JFrame();
        frame.add(player);
        frame.setSize(500, 500);
        frame.pack();
        frame.setVisible(true);
    }
}