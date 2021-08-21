package ui;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import model.SafeBox;

public class SafeBoxControllerGUI {
	
	// Atributos ventana 1

	@FXML
	private TextField txtPasswordD1;

	@FXML
	private TextField txtPasswordD2;

	@FXML
	private TextField txtPasswordD3;

	@FXML
	private TextField txtPasswordD5;

	@FXML
	private TextField txtPasswordD4;

	@FXML
	private TextField txtPasswordD6;
	
    @FXML
    private Label lblError;

    
	private Stage mainStage;

	public Stage getMainStage() {
		return this.mainStage;
	}

	public void setMainStage(Stage mainStage) {
		this.mainStage = mainStage;
	}
	
	SafeBox safeBox = new SafeBox();

	// Métodos ventana 1

	@FXML
	public void enterButton(ActionEvent event) throws IOException {
		try {
			String stringPasswordD1 = txtPasswordD1.getText();
			int passwordD1 = Integer.parseInt(stringPasswordD1);

			String stringPasswordD2 = txtPasswordD2.getText();
			int passwordD2 = Integer.parseInt(stringPasswordD2);

			String stringPasswordD3 = txtPasswordD3.getText();
			int passwordD3 = Integer.parseInt(stringPasswordD3);

			String stringPasswordD4 = txtPasswordD4.getText();
			int passwordD4 = Integer.parseInt(stringPasswordD4);

			String stringPasswordD5 = txtPasswordD5.getText();
			int passwordD5 = Integer.parseInt(stringPasswordD5);

			String stringPasswordD6 = txtPasswordD6.getText();
			int passwordD6 = Integer.parseInt(stringPasswordD6);

			if (safeBox.checkPassword(passwordD1, passwordD2, passwordD3, passwordD4, passwordD5, passwordD6) == true) {
				FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("SafeBox2.fxml"));
				fxmlLoader.setController(this);
				Parent root = fxmlLoader.load();
				Scene scene = new Scene(root);

				mainStage.setScene(scene);
				mainStage.show();
			} else {
				lblError.setText("Error. Contraseña inválida");
			}

		} catch (NumberFormatException ex) {
			lblError.setText("Error. La contraseña solo acepta carácteres numéricos");
		}

	}
	
	//--------------------------------------------------------------------------------------------------------
	// Atributos ventana 2
	@FXML
	private TextArea txtAreaContent;

	// Métodos ventana 2

	@FXML
	public void changePassword1(ActionEvent event) throws IOException {
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("SafeBox3.fxml"));
		fxmlLoader.setController(this);
		Parent root = fxmlLoader.load();
		Scene scene = new Scene(root);

		mainStage.setScene(scene);
		mainStage.show();	

	}

	@FXML
	public void closeSafeBox(ActionEvent event) throws IOException {
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("SafeBox1.fxml"));
		fxmlLoader.setController(this);
		Parent root = fxmlLoader.load();
		Scene scene = new Scene(root);

		mainStage.setScene(scene);
		mainStage.show();
	}
	
	//---------------------------------------------------------------------------------------------------------
	// Atributos ventana 3
	@FXML
	private TextField txtCurrentPassD1;

	@FXML
	private TextField txtCurrentPassD2;

	@FXML
	private TextField txtCurrentPassD3;

	@FXML
	private TextField txtCurrentPassD5;

	@FXML
	private TextField txtCurrentPassD4;

	@FXML
	private TextField txtCurrentPassD6;

	@FXML
	private TextField txtNewPassD1;

	@FXML
	private TextField txtNewPassD2;

	@FXML
	private TextField txtNewPassD3;

	@FXML
	private TextField txtNewPassD5;

	@FXML
	private TextField txtNewPassD4;

	@FXML
	private TextField txtNewPassD6;
	
    @FXML
    private Label lblErrorCurrentPass;

    @FXML
    private Label lblSuccessfulChange;

	// Metodos ventana 3

	@FXML
	public void changePassword2(ActionEvent event) {
		try {
			String stringCurrentPassD1 = txtCurrentPassD1.getText();
			int currentPassD1 = Integer.parseInt(stringCurrentPassD1);

			String stringCurrentPassD2 = txtCurrentPassD2.getText();
			int currentPassD2 = Integer.parseInt(stringCurrentPassD2);

			String stringCurrentPassD3 = txtCurrentPassD3.getText();
			int currentPassD3 = Integer.parseInt(stringCurrentPassD3);

			String stringCurrentPassD4 = txtCurrentPassD4.getText();
			int currentPassD4 = Integer.parseInt(stringCurrentPassD4);

			String stringCurrentPassD5 = txtCurrentPassD5.getText();
			int currentPassD5 = Integer.parseInt(stringCurrentPassD5);

			String stringCurrentPassD6 = txtCurrentPassD6.getText();
			int currentPassD6 = Integer.parseInt(stringCurrentPassD6);

			if (safeBox.checkPassword(currentPassD1, currentPassD2, currentPassD3, currentPassD4, currentPassD5,
					currentPassD6) == true) {

				String StringnewPassD1 = txtNewPassD1.getText();
				int newPassD1 = Integer.parseInt(StringnewPassD1);
				safeBox.setPasswordD1(newPassD1);

				String StringnewPassD2 = txtNewPassD2.getText();
				int newPassD2 = Integer.parseInt(StringnewPassD2);
				safeBox.setPasswordD2(newPassD2);

				String StringnewPassD3 = txtNewPassD3.getText();
				int newPassD3 = Integer.parseInt(StringnewPassD3);
				safeBox.setPasswordD3(newPassD3);

				String StringnewPassD4 = txtNewPassD4.getText();
				int newPassD4 = Integer.parseInt(StringnewPassD4);
				safeBox.setPasswordD4(newPassD4);

				String StringnewPassD5 = txtNewPassD5.getText();
				int newPassD5 = Integer.parseInt(StringnewPassD5);
				safeBox.setPasswordD5(newPassD5);

				String StringnewPassD6 = txtNewPassD6.getText();
				int newPassD6 = Integer.parseInt(StringnewPassD6);
				safeBox.setPasswordD6(newPassD6);

				lblSuccessfulChange.setText("¡Cambio de contraseña exitoso!");
				lblErrorCurrentPass.setText("");

			} else {
				lblErrorCurrentPass.setText("Error. Actual contraseña incorrecta.");
			}

		} catch (NumberFormatException ex) {
			lblErrorCurrentPass.setText("Error. La contraseña debe estar en carácteres numéricos.");
		}
	}

	@FXML
	public void closeSafeBox2(ActionEvent event) throws IOException {
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("SafeBox1.fxml"));
		fxmlLoader.setController(this);
		Parent root = fxmlLoader.load();
		Scene scene = new Scene(root);

		mainStage.setScene(scene);
		mainStage.show();
	}

}
