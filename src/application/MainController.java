package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MainController {

	@FXML
	private Label lblStatus;
	
	@FXML
	private TextField txtPassword;
	
	@FXML
	private TextField txtUserName;
	
	private void Login(ActionEvent event) {
		
		if (txtUserName.getText().equals("username") && txtPassword.getText().equals("password")) {
			lblStatus.setText("Login Success");
		}else {
			lblStatus.setText("Login Failed");
		}

	}
}
