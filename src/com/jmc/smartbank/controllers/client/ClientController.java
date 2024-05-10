package com.jmc.smartbank.controllers.client;

import java.net.URL;
import java.util.ResourceBundle;

import com.jmc.smartbank.models.Model;

import javafx.fxml.Initializable;
import javafx.scene.layout.BorderPane;

public class ClientController implements Initializable {

	public BorderPane client_parent;
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		Model.getInstance().getViewFactory().getClientSelectedMenuItem().addListener((observableValue, oldVal, newVal) -> {
	        switch (newVal) {
	            case "Transactions" -> client_parent.setCenter(Model.getInstance().getViewFactory().getTransactionsView());
	            case "Accounts" -> client_parent.setCenter(Model.getInstance().getViewFactory().getAccountsView());    
	            default -> client_parent.setCenter(Model.getInstance().getViewFactory().getDashboardView());
	        }
	    });
	}

}
