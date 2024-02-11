import javax.swing.*;
import java.awt.event.*;

public class Frame extends JFrame implements ActionListener {
    private static Frame instance = new Frame();

    JMenuBar menuBar = new JMenuBar();
    JMenu fileMenu = new JMenu("File");
    JMenuItem newGameItem = new JMenuItem("New Game");
    JMenuItem saveItem = new JMenuItem("Save");
    JMenuItem exitItem = new JMenuItem("Exit");

    Panel panel;

    public static Frame getInstance() {
        return instance;
    }

    private Frame() {

        panel = new Panel();

        this.setTitle("Travelling Salesman");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(panel);
        this.pack();
        this.setSize(1514, 810);
        this.setResizable(false);
        this.setLocationRelativeTo(null);//load frame in the center of screen instead the top corner
        this.setLayout(null);
        ImageIcon imageIcon = new ImageIcon("img/logo.png");//change icon of frame(top left)
        this.setIconImage(imageIcon.getImage());

        newGameItem.addActionListener(this);
        saveItem.addActionListener(this);
        exitItem.addActionListener(this);

        fileMenu.add(newGameItem);
        fileMenu.add(saveItem);
        fileMenu.add(exitItem);

        menuBar.add(fileMenu);

        this.setJMenuBar(menuBar);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == newGameItem) {
            //panel.newGame();
            System.out.println(1);
        }
        if (e.getSource() == saveItem) {
            System.out.println(1);
        }
        if (e.getSource() == exitItem) {
            System.exit(0);
        }
    }
}