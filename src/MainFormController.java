import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;

import java.util.ArrayList;
import java.util.Arrays;

public class MainFormController {
    public ComboBox<String> cmbLanguages;
    public TextField txtSelectedLanguage;

    /*ArrayList<String> myLanguagesList = new ArrayList<>(
            Arrays.asList("Java","Php","C#","Kotlin","Ruby")
    );*/

    public void initialize(){
        /*ObservableList<String> obList = FXCollections.observableArrayList(myLanguagesList);
        cmbLanguages.setItems(obList);*/
        cmbLanguages.getItems().addAll(
            "Java","C#","Php","Kotlin","Ruby"
        );

        cmbLanguages.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            txtSelectedLanguage.setText(newValue);
        });
    }

    public void onKeyReleasedOnAction(KeyEvent keyEvent) {
    }
}
