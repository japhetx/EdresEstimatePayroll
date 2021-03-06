package com.japhetx.obelisk;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("/com/japhetx/obelisk/view/Main.fxml"));
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("/com/japhetx/obelisk/view/Main.css").toExternalForm());
			primaryStage.getIcons().add(new Image("/com/japhetx/obelisk/resources/icon.png"));
			primaryStage.setTitle("Edres Construction & Supply");
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
