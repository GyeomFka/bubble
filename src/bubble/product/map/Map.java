package bubble.product.map;

import lombok.Getter;

import javax.swing.*;

@Getter
public class Map {

    private JLabel jLabel;

    public Map() {
        this.jLabel = new JLabel(new ImageIcon("image/backgroundMap.png"));
    }
}
