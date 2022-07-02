package org.evalcsu.chatroom.ui.util;
import javafx.scene.layout.Region;
import javafx.stage.Stage;

public class UITool {
    public static void bindWidthWith(Region observer, Region listener, Double multiplier) {
        listener.widthProperty().addListener( (obs,oldVal,newVal)-> {
            observer.setMinWidth((Double) newVal*multiplier);
            observer.setMaxWidth((Double) newVal*multiplier);
        });
    }
    public static void bindWidthWith(Region observer, Stage listener, Double multiplier) {
        listener.widthProperty().addListener( (obs,oldVal,newVal)-> {
            observer.setMinWidth((Double) newVal*multiplier);
            observer.setMaxWidth((Double) newVal*multiplier);
        });
    }
    public static void bindHeightWith(Region observer, Region listener, Double multiplier) {
        listener.heightProperty().addListener( (obs,oldVal,newVal)-> {
            observer.setMinHeight((Double) newVal*multiplier);
            observer.setMaxHeight((Double) newVal*multiplier);
        });
    }
    public static void bindHeightWith(Region observer, Stage listener, Double multiplier) {
        listener.heightProperty().addListener( (obs,oldVal,newVal)-> {
            observer.setMinHeight((Double) newVal*multiplier);
            observer.setMaxHeight((Double) newVal*multiplier);
        });
    }
}
