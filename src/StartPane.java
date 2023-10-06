import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;

public class StartPane extends Pane {

    Button singlePlayer = new Button("Single Player");
    Button multiPlayer = new Button("Multi Player");
    Button settings = new Button("Settings");
    Button about = new Button("About");
    Button exit = new Button("Exit");

    Alert alert = new Alert(AlertType.INFORMATION);

    public StartPane() {

        singlePlayer.setPrefSize(240, 40);
        multiPlayer.setPrefSize(240, 40);
        settings.setPrefSize(240, 40);
        about.setPrefSize(240, 40);
        exit.setPrefSize(240, 40);

        singlePlayer.setTranslateX(80);
        singlePlayer.setTranslateY(110);
        multiPlayer.setTranslateX(80);
        multiPlayer.setTranslateY(170);
        settings.setTranslateX(80);
        settings.setTranslateY(230);
        about.setTranslateX(80);
        about.setTranslateY(290);
        exit.setTranslateX(80);
        exit.setTranslateY(350);

        getChildren().add(singlePlayer);
        getChildren().add(multiPlayer);
        getChildren().add(settings);
        getChildren().add(about);
        getChildren().add(exit);

        singlePlayer.setOnAction((Action) -> {
            AppManager.viewPane(AppManager.singlePlayerPane);
        });

        multiPlayer.setOnAction((Action) -> {
            AppManager.viewPane(AppManager.multiPlayerPane);
        });

        settings.setOnAction((Action) -> {
            AppManager.viewPane(AppManager.settingsPane);
        });

        about.setOnAction((Action) -> {
            String str
                    = "This Project Was Done BY :\n\n"
                    + "Ziad Hany 20206824 \n"
                    + "Abdelrahman Mostafa Khater 20206844\n"
                    + "Yasmin Hesham 20192901\n\n"
                    + "© Copyright 2022 - All Rights Reserved";

            alert.setTitle("About Tic Tac Toe");
            alert.setHeaderText("About Tic Tac Toe");
            alert.setContentText(str);
            alert.showAndWait();
        });

        exit.setOnAction((Action) -> {
            System.exit(0);
        });
    }

}
