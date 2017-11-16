package com.japhetx.obelisk;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class MainController {

	@FXML
	public Button btnEstimateShow;

	@FXML
	public Button btnPayrollShow;

	public void estimateShowSignIn(ActionEvent event) throws Exception{
		Stage primaryStage = new Stage();
		Parent root = FXMLLoader.load(getClass().getResource("/com/japhetx/obelisk/view/EstimateSignIn.fxml"));
		Scene scene = new Scene(root);
		scene.getStylesheets().add(getClass().getResource("/com/japhetx/obelisk/view/EstimateSignIn.css").toExternalForm());
		primaryStage.getIcons().add(new Image("/com/japhetx/obelisk/resources/icon.png"));
		primaryStage.setTitle("Construction Cost Estimate");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public void payrollShowSignIn(ActionEvent event) throws Exception{
		Stage primaryStage = new Stage();
		Parent root = FXMLLoader.load(getClass().getResource("/com/japhetx/obelisk/view/PayrollSignIn.fxml"));
		Scene scene = new Scene(root);
		scene.getStylesheets().add(getClass().getResource("/com/japhetx/obelisk/view/PayrollSignIn.css").toExternalForm());
		primaryStage.getIcons().add(new Image("/com/japhetx/obelisk/resources/icon.png"));
		primaryStage.setTitle("Payroll Management System");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
