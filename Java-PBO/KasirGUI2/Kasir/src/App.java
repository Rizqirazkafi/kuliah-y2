import javax.swing.*;


public class App {
    JFrame frame;
    App(){
    }
    public static void main(String[] args) throws Exception {
        JFrame frame;
        frame = new JFrame();
        JButton button1 = new JButton("Clickme");
        button1.setBounds(0,30,100,30);
        frame.add(button1);
        frame.setSize(450,200);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        new App();
        

    }
}
