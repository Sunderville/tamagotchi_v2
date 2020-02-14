package edu.rom.tamagotchi;

import edu.rom.tamagotchi.domain.*;
import edu.rom.tamagotchi.domain.Terminator;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    Scene scene;
    Pet pet;
    private StartTemplate startTemplate = new StartTemplate();
    private SecondTemplate secondTemplate = new SecondTemplate();

    @Override
    public void start(Stage window) throws Exception {
        scene = new Scene(startTemplate.render());

        startTemplate.getCircle()[0].setOnMouseClicked(event -> {
            initPet("lion");
            scene.setRoot(secondTemplate.render());
        });
        startTemplate.getCircle()[1].setOnMouseClicked(event -> {
            initPet("duck");
            scene.setRoot(secondTemplate.render());
        });
        startTemplate.getCircle()[2].setOnMouseClicked(event -> {
            initPet("homer");
            scene.setRoot(secondTemplate.render());
        });
        startTemplate.getCircle()[3].setOnMouseClicked(event -> {
            initPet("terminator");
            scene.setRoot(secondTemplate.render());
        });

        window.setTitle("Tamagotchi");
        window.setWidth(800);
        window.setHeight(640);
        window.setScene(scene);
        window.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
    public void initPet(String type) {
        if(type.equalsIgnoreCase("duck")) {
            pet = new Duck();
        } else if(type.equalsIgnoreCase("lion")) {
            pet = new Lion();
        } else if(type.equalsIgnoreCase("homer")) {
            pet = new Homer();
        } else if(type.equalsIgnoreCase("terminator")) {
            pet = new Terminator();
        }
    }
}
