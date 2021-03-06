/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import jfx.shapeengine.Engine;

public class App extends Application {
  boolean gridState = true;

  @Override
  public void start(Stage stage) {
    String javaVersion = System.getProperty("java.version");
    String javafxVersion = System.getProperty("javafx.version");
    StackPane stackPane = new StackPane();

    Engine engine = new Engine(stackPane, 800, 800);
    stackPane.setStyle("-fx-background-color: #ef0911");

    engine.activateGrid(true);

    Scene scene = new Scene(stackPane, 800, 800);
    stage.setScene(scene);
    stage.show();

    stackPane.setOnKeyReleased(evt -> {
      switch (evt.getCode()) {
        case R:
          engine.createInteractiveRectangle();
          break;
        case P:
          engine.createInteractivePolygon();
          break;
        case M:
          engine.toggleMagnetism();
          break;
        case G:
          gridState = !gridState;
          engine.activateGrid(gridState);
          break;
        default :
          break;
      }
    });

  }  

  public static void main(String[] args) {
    launch();
  }

}