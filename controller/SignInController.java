package signIn.controller;

import javafx.beans.property.SimpleStringProperty;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class SignInController {
    @FXML
    private TextField id;
    @FXML
    private TextField pass;
    @FXML
    private Text errMsg;
    SimpleStringProperty signInError = new SimpleStringProperty();

    @FXML
    public void initialize() {
        System.out.println("Controller's ready. Let's bind some components");
        errMsg.textProperty().bind(signInError);
    }

    public void onSignInIsClick() {
        System.out.println("Кнопка войти нажата");
    }

}
