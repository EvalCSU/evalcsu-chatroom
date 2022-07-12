package org.evalcsu.chatroom.ui.view.chat;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import org.evalcsu.chatroom.ui.util.CacheUtil;
import org.evalcsu.chatroom.ui.util.UITool;
import org.evalcsu.chatroom.ui.view.UIObject;
import org.evalcsu.chatroom.ui.view.chat.element.ElementTalk;

import java.io.IOException;
import java.util.Objects;

public abstract class ChatInit extends UIObject {

    private static final String CHAT_GROUP = "/chat/fxml/demo.fxml";
    public String userId;
    public String userName;
    public String userHead;

    public IChatEvent chatEvent;
    public String commonId, serverId;

    public VBox vbox_user_input;
    public ScrollPane pane_message;
    public Pane pane_talk, pane_user;
    public ListView listView_user, listView_message;
    public Button button_emoji;
    public MenuButton menuButton_talk;
    public HBox hbox_buttons;
    public TextArea textArea_input;
    public HBox hbox_send;
    public Button button_send;

    ChatInit(IChatEvent chatEvent){
        try {
            root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource(CHAT_GROUP)));
        } catch (IOException e) {
            e.printStackTrace();
        }

        Scene scene = new Scene(root);
        setScene(scene);

        initController();
        initLayout();
        initView();
        initEventDefine();
    }

    private void initController() {
        vbox_user_input = $("vbox_user_input", VBox.class);
        pane_message = $("pane_message", ScrollPane.class);
        pane_talk = $("pane_talk", Pane.class);
        listView_user = $("listView_user", ListView.class);
        button_emoji = $("button_emoji", Button.class);
        menuButton_talk = $("menuButton_talk", MenuButton.class);
        hbox_buttons = $("hbox_buttons", HBox.class);
        textArea_input = $("textArea_input", TextArea.class);
        hbox_send = $("hbox_send", HBox.class);
        button_send = $("button_send", Button.class);

        listView_message = new ListView<Pane>();
        UITool.bindWidthWith((Region) listView_message,(Region) pane_message, 1.0);
        pane_message.setContent(listView_message);

        serverId = "00000";
        ElementTalk elementTalk_group = new ElementTalk(serverId);
        CacheUtil.talkMap.put(serverId, elementTalk_group);
        commonId = serverId;
    }

    public Parent root() {
        return super.root;
    }

    private void initLayout() {
        UITool.bindWidthWith((Region) listView_message, (Region) pane_message, 1.0);
        UITool.bindHeightWith((Region) listView_message, (Region)  pane_message, 1.0);
    }
}
