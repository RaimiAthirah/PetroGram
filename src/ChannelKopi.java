import javax.swing.*;

public class ChannelKopi extends JFrame {
    private JPanel mainChannel;
    private JTextField textField1;
    private JLabel lblApp;

    public ChannelKopi () {
        setContentPane(mainChannel);
        setTitle("Channel");
        setSize(450,300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        ChannelKopi myFrame = new ChannelKopi();

    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
