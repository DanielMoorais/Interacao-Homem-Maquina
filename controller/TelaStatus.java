package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class TelaStatus implements Initializable {

  @FXML
  private ImageView backImg;

  private Stage stage;
  private Scene scene;
  private Parent root;

  @Override
  public void initialize(URL location, ResourceBundle resources) {
    backImg.setOnMouseClicked(event -> {
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

  }

}
