package org.evalcsu.chatroom.ui.view.chat.element;

import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import org.evalcsu.chatroom.ui.util.Ids;
import org.evalcsu.chatroom.ui.view.chat.data.MessageData;

import java.io.File;
import java.io.IOException;

public class ElementTalk {

    protected static final String PANE_USER= "/chat/fxml/user.fxml";

    private Pane pane_user;
    private ImageView imageView_userHead;
    private Label label_user;
    private Button button_delete;

    private ListView<Pane> messageList;

    public ElementTalk(String serverId) {
        messageList = new ListView<>();
        messageList.setId(Ids.ElementTalkId.createMessageListId(serverId));
    }

    public ElementTalk(String talkId, String userName, String userHead) {
        Image image = new Image(new File(userHead).toURI().toString());

        try {
            pane_user = FXMLLoader.load(getClass().getResource(PANE_USER));
        } catch (IOException e) {
            e.printStackTrace();
        }
        pane_user.setId(Ids.ElementTalkId.createMessageListId(talkId));

        label_user = (Label) pane_user.lookup("#label_user");
        label_user.setText(userName);

        imageView_userHead = (ImageView) pane_user.lookup("#imageView_user");
        imageView_userHead.setImage(image);

        button_delete = (Button) pane_user.lookup("#button_delete");

        messageList = new ListView<>();
        messageList.setId(Ids.ElementTalkId.createMessageListId(talkId));
        messageList.setUserData(new MessageData(talkId, userName, userHead));
    }


    public Pane pane() {
        return pane_user;
    }

    public ListView<Pane> messageList() {
        return messageList;
    }
}
