import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) {
        Label helloWorld = new Label("Hello World!");
        Scene scene = new Scene(helloWorld);

        Label hehe = new Label("heheheheeh");
        Scene secondScene = new Scene(hehe);

        stage.setScene(scene);
        stage.setScene(secondScene);
        stage.show();
    }
}
