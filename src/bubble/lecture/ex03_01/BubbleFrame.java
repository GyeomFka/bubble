package bubble.lecture.ex03_01;

import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class BubbleFrame extends JFrame {

    private JLabel backgroundMap;

    private Player player;

    public BubbleFrame() {
        initObject();
        initSetting();
        initListener();
    }

    private void initListener() {
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println(e.getKeyCode());
                switch (e.getKeyCode()) {
                    case KeyEvent.VK_LEFT:
                        player.left();
                        break;
                    case KeyEvent.VK_RIGHT:
                        player.right();
                        break;
                    case KeyEvent.VK_UP:
                        player.up();
                        break;
                }
            }
        });
    }

    private void initObject() {
        setContentPane(new JLabel(new ImageIcon("image/backgroundMap.png")));
        add(new Player());
    }

    private void initSetting() {
        setSize(1000, 640);
        setLayout(null); //absolute layout -> 자유롭게 그리기 가능
        setLocationRelativeTo(null); //가운데 배치
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //창 종료 시 run -> stop
        setVisible(true);
    }
}
