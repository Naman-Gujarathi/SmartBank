package com.jmc.smartbank.controllers.client;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class AccountsController implements Initializable {
	public Label ch_acc_num;
	public Label transaction_limit;
	public Label ch_acc_date;
	public Label ch_acc_bal;
	public Label sv_acc_num;
	public Label withdrawal_limit;
	public Label sv_acc_date;
	public Label sv_acc_bal;
	public TextField amount_to_sv;
	public Button trans_to_sv_btn;
	public TextField amount_to_ch;
	public Button trans_to_cv_btn;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
		
		
	}

}
