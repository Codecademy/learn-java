import javax.swing.*;

public class BoringWindow extends JFrame {

   public static void main(String[] args) {

      JFrame f = new BoringWindow();
      
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      f.setSize(300, 200);
      f.setVisible(true);
      
   }
}