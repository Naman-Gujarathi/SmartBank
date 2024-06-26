package com.jmc.smartbank.Views;

import com.jmc.smartbank.controllers.client.ClientController;
import com.jmc.smartbank.models.Model;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class ViewFactory {
	private final StringProperty clientSelectedMenuItem;
	private AnchorPane dashboardView;
	private AnchorPane transactionsView;
	private AnchorPane accountsView;
	
	
	public ViewFactory() {
		this.clientSelectedMenuItem = new SimpleStringProperty("");
	}
	
	public StringProperty getClientSelectedMenuItem() {
		return clientSelectedMenuItem;
	}
	
	public AnchorPane getDashboardView() {
		if (dashboardView == null) {
			try {
				dashboardView = new FXMLLoader(getClass().getResource("/resources/fxml/client/Dashboard.fxml")).load();
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		return dashboardView;
	}
	
	public AnchorPane getTransactionsView() {
		if (transactionsView == null) {
			try {
				transactionsView = new FXMLLoader(getClass().getResource("/resources/fxml/client/Transactions.fxml")).load();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return transactionsView;
	}
	
	
	public AnchorPane getAccountsView() {
		
		if(accountsView == null) {
			try {
				accountsView = new FXMLLoader(getClass().getResource("/resources/fxml/client/Accounts.fxml")).load();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		return accountsView;
		
	}
	
	public void showLoginWindow() {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/resources/fxml/Login.fxml"));
		Scene scene = null;
		try {
			scene = new Scene(loader.load());
		}catch (Exception e) {
			e.printStackTrace();
		}
		Stage stage = new Stage();
		stage.setScene(scene);
		stage.setTitle("Smart Bank");
		stage.show();
		
	}
	
	
	public void showClientWindow() { 
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/resources/fxml/client/Client.fxml"));
		ClientController clientController = new ClientController();
		loader.setController(clientController);
		createStage(loader);
		
	}
	
	private void createStage(FXMLLoader loader) {
		Scene scene = null;
		try {
			scene = new Scene(loader.load());
		}catch (Exception e) {
			e.printStackTrace();
		}
		Stage stage = new Stage();
		stage.setScene(scene);
		stage.setTitle("Smart Bank");
		stage.show();
		
		
	}	
	
	public void closeStage(Stage stage) {
		
		stage.close();
	}
}
	
	
	

