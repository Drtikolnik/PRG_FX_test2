package com.example.prg_fx_testik;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 500, 300);
        scene.getStylesheets().add(HelloApplication.class.getResource("style.css").toExternalForm());
        BorderPane root = new BorderPane();
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }
}
