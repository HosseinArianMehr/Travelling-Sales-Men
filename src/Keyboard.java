import java.awt.event.*;

public class Keyboard implements KeyListener {
    Pointer sw, selectTurn;

    Keyboard(Pointer sw, Pointer selectTurn) {
        this.sw = sw;
        this.selectTurn = selectTurn;
    }

    @Override
    public void keyTyped(KeyEvent e) {

        if (sw.prt == 4) if (e.getKeyChar() == 'b') if (Panel.player_1_chose != -1 && Panel.player_2_chose != -1) {
            sw.prt = 2;
        }

        if (sw.prt == 4 && e.getKeyChar() == '1') selectTurn.prt = 1;
        if (sw.prt == 4 && e.getKeyChar() == '2') selectTurn.prt = 2;
    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}