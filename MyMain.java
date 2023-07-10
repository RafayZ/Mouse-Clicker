import javax.swing.*;

public class MyMain {
    public static void main(String[] args) { //creating JFrame object
        JFrame jf = new JFrame();
        jf.setSize(500,500);
        jf.add(new MyComponent());
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);
    }
}
