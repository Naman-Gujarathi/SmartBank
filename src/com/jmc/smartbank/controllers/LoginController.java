package com.jmc.smartbank.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import com.jmc.smartbank.models.Model;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginController implements Initializable {
	
	public ChoiceBox acc_selector;
//	public Label payee_address_lbl1;
	public Label payee_address_lbl;
	public TextField payee_fld;
	public TextField password_fld;
	public Button login_btn;
	public Label error_lbl;
	
	
	

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		login_btn.setOnAction(event -> onLogin());

		
	}
	
	private void onLogin() {
		Stage stage = (Stage) login_btn.getScene().getWindow();
		Model.getInstance().getViewFactory().closeStage(stage);
		Model.getInstance().getViewFactory().showClientWindow();
	}

}
