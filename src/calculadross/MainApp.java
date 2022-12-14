package calculadross;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class MainApp extends Application {

	@Override
	public void start(Stage primaryStage) {
		try {

			Parent root = FXMLLoader.load(getClass().getResource("view/calcu.fxml"));
	        primaryStage.setTitle("Calculadross");
	        primaryStage.getIcons().add(new Image("file:resources/images/icon_calculatros.png"));
	        primaryStage.setScene(new Scene(root, 325, 535));
	        primaryStage.setResizable(false);
	        primaryStage.show();

		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
