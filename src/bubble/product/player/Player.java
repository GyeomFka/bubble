package bubble.product.player;

import javax.swing.*;

public class Player implements Action {

    private int x;
    private int y;
    private ImageIcon playerR, playerL;

    public Player() {
        this.playerR = new ImageIcon("image/playerR.png");
        this.playerL = new ImageIcon("image/playerL.png");
        this.x = 55;
        this.y = 535;
    }

    @Override
    public void left() {

    }

    @Override
    public void right() {

    }

    @Override
    public void up() {

    }

    @Override
    public void down() {

    }
}
