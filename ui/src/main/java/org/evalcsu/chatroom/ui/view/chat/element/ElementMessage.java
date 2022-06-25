package org.evalcsu.chatroom.ui.view.chat.element;

import javafx.fxml.FXMLLoader;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.control.Label;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;

import java.io.File;
import java.io.IOException;

public class ElementMessage {

    private static final String PANE_MESSAGE_RECEIVE = "/chat/fxml/message.fxml";
    private static final String PANE_MESSAGE_SEND = "/fxml/chat/message_send.fxml";

    private Label label_userName;
    private ImageView imageView_userHead;
    private TextFlow textFlow_message;

    public Pane message(String userName, String userHead, String msg) {
        Image image = new Image(new File(userHead).toURI().toString());

        Pane pane_receive = null;
        try {
            pane_receive = FXMLLoader.load(getClass().getResource(PANE_MESSAGE_RECEIVE));
        } catch (IOException e) {
            e.printStackTrace();
        }

        label_userName = (Label) pane_receive.lookup("#label_userName");
        label_userName.setText(userName);

        imageView_userHead = (ImageView) pane_receive.lookup("#imageView_userHead");
        imageView_userHead.setImage(image);

        textFlow_message = (TextFlow) pane_receive.lookup("#textFlow_message");
        textFlow_message.getChildren().add(new Text(msg));

        return pane_receive;
    }

}
