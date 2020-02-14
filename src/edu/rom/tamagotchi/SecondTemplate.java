package edu.rom.tamagotchi;

import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;


public class SecondTemplate {
    private VBox vBox;
    private HBox hBox;
    private Button buttons[] = {
            new Button(),
            new Button(),
            new Button(),
            new Button()
    };
    private Rectangle rect;

    public SecondTemplate() {
        vBox = new VBox(15);
        hBox = new HBox(15);
        rect = new Rectangle(800.0, 540.0, new ImagePattern(new Image(getClass().getResource("images/Background1.png").toExternalForm())));


        for(Button value : buttons) {
            value.setText("Button");
        }

        hBox.getChildren().addAll(buttons);
        vBox.getChildren().addAll(rect, hBox);

    }
    public VBox render() {
        return  vBox;
    }
}
