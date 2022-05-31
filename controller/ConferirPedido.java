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
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class ConferirPedido implements Initializable {

  @FXML
  private ImageView backButton;

  @FXML
  private Button confirmButton;

  @FXML
  private VBox pedidoVbox;

  private Stage stage;
  private Scene scene;
  private Parent root;
  private ImageView img[] = new ImageView[4];
  private String str[] = new String[4];

  @Override
  public void initialize(URL location, ResourceBundle resources) {

    backButton.setOnMouseClicked(event -> {
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

    confirmButton.setOnAction(event -> {
      try {
        root = FXMLLoader.load(getClass().getResource("/view/enderecoDeEntrega_view.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
      } catch (Exception e) {
        System.out.println(e.getMessage());
      }
    });


    img[0] = new ImageView("/images/conferirPedido/geladeiraBrastemP.png");
    img[1] = new ImageView("/images/conferirPedido/aguaDesidratada.png");
    img[2] = new ImageView("/images/conferirPedido/carroInfantil.png");
    img[3] = new ImageView("/images/conferirPedido/oculos.png");

    img[0].setFitHeight(100d);
    img[0].setFitWidth(100d);
    img[1].setFitHeight(100d);
    img[1].setFitWidth(100d);
    img[2].setFitHeight(100d);
    img[2].setFitWidth(100d);
    img[3].setFitHeight(100d);
    img[3].setFitWidth(100d);

    str[0] = "Geladeira Brastemp";
    str[1] = "Agua Desidratada";
    str[2] = "Carro Infantil";
    str[3] = "Oculos";

    for (int i = 0; i < 4; i++) {
      if (MontarPedido.items[i]) {
        HBox hbox = new HBox(8);
        Label label = new Label(str[i]);
        label.setTextFill(Color.color(0, 0, 0));
        hbox.getChildren().addAll(img[i],label);
        pedidoVbox.getChildren().addAll(hbox);
      }
    }
  }

}
