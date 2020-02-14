package edu.rom.tamagotchi;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Circle;

public class StartTemplate {
    private VBox vBox;
    private HBox hBox;
    private Label text;
    private Circle circle[] = new Circle[4];
    private String urlPets[] = {
            "images/1_Lion/1_Lion_logo.png",
            "images/3_Duck/1_Duck_logo.png",
            "images/3_Simpson/1_Homer_logo.png",
            "images/4_Terminator/1_Terminator_logo.png"
    };

    public StartTemplate() {
        vBox = new VBox(15);
        hBox = new HBox(15);
        text = new Label();

        text.setText("Выберите персонажа");

        for (int i = 0; i < urlPets.length; i++) {
            circle[i] = new Circle(80);
            circle[i].setStroke(Color.BLACK);
            circle[i].setFill(new ImagePattern(new Image(getClass().getResource(urlPets[i]).toExternalForm())));
        }

        vBox.setAlignment(Pos.CENTER);
        hBox.getChildren().addAll(circle);
        hBox.setAlignment(Pos.CENTER);
        vBox.getChildren().addAll(text, hBox);
    }

    public Circle[] getCircle() {
        return circle;
    }

    public VBox render() {
        return vBox;
    }
}
