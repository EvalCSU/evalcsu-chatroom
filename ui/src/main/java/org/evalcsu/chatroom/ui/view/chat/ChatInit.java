package org.evalcsu.chatroom.ui.view.chat;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.Pane;
import org.evalcsu.chatroom.ui.util.CacheUtil;
import org.evalcsu.chatroom.ui.view.UIObject;
import org.evalcsu.chatroom.ui.view.chat.element.ElementTalk;

import java.io.IOException;

public abstract class ChatInit extends UIObject {

    private static final String CHATGROUP= "/chat/fxml/demo.fxml";

    public String userId;
    public String userName;
    public String userHead;

    public IChatEvent chatEvent;
    public String commonId, serverId;

    public ScrollPane pane_message;
    public Pane pane_talk, pane_user;
    public ListView listView_user, listView_message;
    public Button button_emoji;
    public MenuButton menuButton_talk;
    public TextArea textArea_input;
    public Label label_send, label_user;

    ChatInit(IChatEvent chatEvent){
        try {
            root = FXMLLoader.load(getClass().getResource(CHATGROUP));
        } catch (IOException e) {
            e.printStackTrace();
        }

        Scene scene = new Scene(root);
        setScene(scene);
        setResizable(false);

        initController();
        initView();
        initEventDefine();
    }

    private void initController() {
        pane_message = $("pane_message", ScrollPane.class);
        pane_talk = $("pane_talk", Pane.class);
        listView_user = $("listView_user", ListView.class);
        button_emoji = $("button_emoji", Button.class);
        menuButton_talk = $("menuButton_talk", MenuButton.class);
        textArea_input = $("textArea_input", TextArea.class);
        label_send = $("label_send", Label.class);

        listView_message = new ListView<Pane>();
        pane_message.setContent(listView_message);

        serverId = "00000";
        ElementTalk elementTalk_group = new ElementTalk(serverId);
        CacheUtil.talkMap.put(serverId, elementTalk_group);
        commonId = serverId;
    }

    public Parent root() {
        return super.root;
    }
}
