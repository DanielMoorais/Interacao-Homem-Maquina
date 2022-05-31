package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class MontarPedido implements Initializable {

  @FXML
  private Button confirmButton;

  @FXML
  private ImageView backButton;

  @FXML
  private CheckBox refrigeratorCheckbox;

  @FXML
  private CheckBox waterCheckBox;

  @FXML
  private CheckBox toyCarCheckbox;

  @FXML
  private CheckBox glassesCheckBox;

  private Stage stage;
  private Scene scene;
  private Parent root;

  public static boolean items[] = new boolean[4];

  @Override
  public void initialize(URL location, ResourceBundle resources) {

    for (int i = 0; i < 4; i++)
      items[i] = false;

    backButton.setOnMouseClicked(event -> {
      try {
        root = FXMLLoader.load(getClass().getResource("/view/telaPrincipal_view.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
      } catch (Exception e) {
        System.out.println(e.getMessage());
      }
    });

    confirmButton.setOnMouseClicked(event -> {
      try {
        root = FXMLLoader.load(getClass().getResource("/view/conferirPedido_view.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
      } catch (Exception e) {
        System.out.println(e.getMessage());
      }

    });

    refrigeratorCheckbox.setOnAction(event -> {
      items[0] = !items[0];
    });

    waterCheckBox.setOnAction(event -> {
      items[1] = !items[1];
    });

    toyCarCheckbox.setOnAction(event -> {
      items[2] = !items[2];
    });

    glassesCheckBox.setOnAction(event -> {
      items[3] = !items[3];
    });
  }

}
