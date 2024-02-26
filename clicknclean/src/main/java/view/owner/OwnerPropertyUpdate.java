package view.owner;

import view.Window;
import java.io.File;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;

class OwnerPropertyUpdate {
    public OwnerPropertyUpdate(Window window) {
        System.out.println("OwnerPropertyUpdate constructor");

        Scene scene = new Scene(new VBox(), 800, 600);
        scene.getStylesheets()
        .add("file:///" + new File("src/main/css/style.css").getAbsolutePath().replace("\\", "/"));
        window.setScene(scene);
    }
}
