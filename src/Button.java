import javax.swing.*;
import java.awt.*;

public class Button extends JButton {
    Button(int x, int y, int width, int height, String text, Color color) {
        setter(x, y, width, height, text, color);
    }

    Button(int x, int y, int width, int height, String text, Color color, Image image) {
        setter(x, y, width, height, text, color);

        ImageIcon icon = new ImageIcon(image);
        image = icon.getImage().getScaledInstance(200, 100, Image.SCALE_DEFAULT);
        icon = new ImageIcon(image);
        this.setIcon(icon);
    }

    private void setter(int x, int y, int width, int height, String text, Color color) {
        this.setBounds(x, y, width, height);
        this.setFocusable(true);
        this.setVisible(true);
        this.setText(text);
        this.setHorizontalTextPosition(JButton.CENTER);
        this.setVerticalTextPosition(JButton.CENTER);
        this.setFont(new Font("Century", Font.PLAIN, 24));
        this.setForeground(Color.BLACK);
        this.setEnabled(true);
        this.setBackground(color);//if you add an image for background of button comment this line
        this.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1, true));
    }
}