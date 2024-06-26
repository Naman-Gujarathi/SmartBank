package com.jmc.smartbank.controllers.client;

import java.net.URL;
import java.util.ResourceBundle;

import com.jmc.smartbank.models.Model;

import javafx.fxml.Initializable;
import javafx.scene.control.Button;


public class ClientMenuController implements Initializable {
	public Button dashboard_btn;
	public Button transaction_btn;
	public Button accounts_btn;
	public Button profile_btn;
	public Button logout_btn;
	public Button report_btn;
	@Override
	public void initialize(URL url, ResourceBundle resourceBundle) {
		addListners();
	}
	
	private void addListners() {
		dashboard_btn.setOnAction(event -> onDashboard());
		transaction_btn.setOnAction(event -> onTransactions());
		accounts_btn.setOnAction(event -> onAccounts());
	}
	
	private void onDashboard() {
		Model.getInstance().getViewFactory().getClientSelectedMenuItem().set("Dashboard");
		
	}
	
	private void onTransactions() {
		Model.getInstance().getViewFactory().getClientSelectedMenuItem().set("Transactions");
		
	}
	private void onAccounts() {
		Model.getInstance().getViewFactory().getClientSelectedMenuItem().set("Accounts");
		
	}
	
	

}
