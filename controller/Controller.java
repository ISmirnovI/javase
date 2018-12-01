package sample.controller;
        import javafx.beans.property.SimpleStringProperty;
        import javafx.fxml.FXML;
        import javafx.scene.control.TextField;
        import javafx.scene.text.Text;
public class MCController {
    @FXML
    private Text errMsg;
    SimpleStringProperty signInError = new SimpleStringProperty();

    @FXML
    public void initialize() {
        System.out.println("Controller's ready. Let's bind some components");
        errMsg.textProperty().bind(signInError);
    }

    public class Controller {
        public void onMCIsClick() {
            System.out.println("Кнопка MC нажата.");
        }

        public void onMPlusIsClick() {
            System.out.println("Кнопка MC+ нажата.");
        }

        public void onMMinusIsClick() {
            System.out.println("Кнопка MC- нажата.");
        }

        public void onMRIsClick() {
            System.out.println("Кнопка MR нажата.");
        }

        public void onCIsClick() {
            System.out.println("Кнопка C нажата.");
        }

        public void onPlusMinusIsClick() {
            System.out.println("Кнопка + - нажата.");
        }

        public void onDivisionIsClick() {
            System.out.println("Кнопка / нажата.");
        }

        public void onMultiplyIsClick() {
            System.out.println("Кнопка X нажата.");
        }

        public void on7IsClick() {
            System.out.println("Кнопка 7 нажата.");
        }

        public void on8IsClick() {
            System.out.println("Кнопка 8 нажата.");
        }

        public void on9IsClick() {
            System.out.println("Кнопка 9 нажата.");
        }

        public void onMinusIsClick() {
            System.out.println("Кнопка - нажата.");
        }

        public void on4IsClick() {
            System.out.println("Кнопка 4 нажата.");
        }

        public void on5IsClick() {
            System.out.println("Кнопка 5 нажата.");
        }

        public void on6IsClick() {
            System.out.println("Кнопка 6 нажата.");
        }

        public void onPlusIsClick() {
            System.out.println("Кнопка + нажата.");
        }

        public void on1IsClick() {
            System.out.println("Кнопка 1 нажата.");
        }

        public void on2IsClick() {
            System.out.println("Кнопка 2 нажата.");
        }

        public void on3IsClick() {
            System.out.println("Кнопка 3 нажата.");
        }

        public void onPointIsClick() {
            System.out.println("Кнопка . нажата.");
        }

        public void on0IsClick() {
            System.out.println("Кнопка 0 нажата.");
        }

        public void onEqualIsClick() {
            System.out.println("Кнопка = нажата.");
        }
    }
}