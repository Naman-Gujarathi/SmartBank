module SmartBank {
	requires javafx.controls;
	requires javafx.fxml;
	requires java.sql;
	requires org.xerial.sqlitejdbc;
	requires javafx.graphics;
	requires javafx.base;
	
	
	opens com.jmc.smartbank to javafx.graphics, javafx.fxml;
	exports com.jmc.smartbank;
	exports com.jmc.smartbank.controllers;
	exports com.jmc.smartbank.controllers.Admin;
	exports com.jmc.smartbank.controllers.client;
	exports com.jmc.smartbank.models;
	exports com.jmc.smartbank.Views;
	
	
}
