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
import javafx.stage.Stage;

public class MainController implements Initializable {

  @FXML
  private Button startButton;
  @FXML
  private Button statusButton;

  private Stage stage;
  private Scene scene;
  private Parent root;

  @Override
  public void initialize(URL location, ResourceBundle resources) {

    startButton.setOnAction(event -> {
      try {
        root = FXMLLoader.load(getClass().getResource("/view/montarPedido_view.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
      } catch (Exception e) {
        System.out.println(e.getMessage());
      }
    });

    statusButton.setOnAction(event -> {
      try {
        root = FXMLLoader.load(getClass().getResource("/view/telaStatus_view.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
      } catch (Exception e) {
        System.out.println(e.getMessage());
      }
    });

  }

}
