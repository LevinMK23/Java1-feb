package lesson8;

import java.awt.GridLayout;
import java.awt.HeadlessException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GameWindow extends JFrame {

    private static final ImageIcon def = new ImageIcon("def.png");
    private static final ImageIcon o = new ImageIcon("o.png");
    private static final ImageIcon x = new ImageIcon("x.png");

    private final JButton[][] map;

    public GameWindow() throws HeadlessException {
        setSize(360, 360);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        GridLayout layout = new GridLayout(3,3);
        JPanel panel = new JPanel(layout);
        map = new JButton[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                JButton button = new JButton();
                button.setIcon(def);
                button.addActionListener(a -> {
                    button.setIcon(x);
                    showWinnerDialog("Вы победили");
                    // TODO: 04.03.2021 check victory
                    movePc();
                    // TODO: 04.03.2021 check victory
                    // TODO: 04.03.2021 может быть ничья!!!
                });
                panel.add(button);
                map[i][j] = button;
            }
        }
        add(panel);
        setResizable(false);
        setVisible(true);
    }

    private void showWinnerDialog(String result) {
        new WinnerDialog(this, result);
    }

    private void movePc() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (map[i][j].getIcon().equals(def)) {
                    map[i][j].setIcon(o);
                    return;
                }
            }
        }
    }

    public static void main(String[] args) {
        new GameWindow();
    }
}
