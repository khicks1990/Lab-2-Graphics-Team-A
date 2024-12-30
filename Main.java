import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Circle;
import javafx.scene.paint.Color;

public class Main extends Application
{
   public static void main(String[] args)
   {
      launch(args);
   }

   @Override
   public void start(Stage primaryStage)
   {
      // Constants for the scene size
      final double SCENE_WIDTH = 410.0;
      final double SCENE_HEIGHT = 300.0;



      // Add the shapes to a Pane.
      Pane pane = new Pane(YOUR SHAPES HERE);

      // Create a Scene and display it.
      Scene scene = new Scene(pane, SCENE_WIDTH, SCENE_HEIGHT);
      primaryStage.setScene(scene);
      primaryStage.show();
   }
}