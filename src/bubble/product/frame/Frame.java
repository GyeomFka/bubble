package bubble.product.frame;

import bubble.product.map.Map;
import bubble.product.player.Player;

import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {

    private Map map;
    private Player player;

    public Frame() {
        this.map = new Map();
        setContentPane(map.getJLabel());

        this.player = new Player();


        configFrame();
    }

    private void configFrame() {
        setSize(1000, 640);
        setLayout(null); //absolute layout -> 자유롭게 그리기 가능
        setLocationRelativeTo(null); //가운데 배치
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //창 종료 시 run -> stop
        setVisible(true);
    }
}
