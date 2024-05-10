package com.jmc.smartbank;


import com.jmc.smartbank.models.Model;

import javafx.application.*;

import javafx.stage.Stage;

public class App extends Application{
	
	@Override
	public void start(Stage stage) {
		Model.getInstance().getViewFactory().showLoginWindow();
		
		
	}

}
