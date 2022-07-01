package org.evalcsu.chatroom.ui.view.chat;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.Region;
import javafx.stage.Stage;
import org.evalcsu.chatroom.ui.util.CacheUtil;
import org.evalcsu.chatroom.ui.util.UITool;
import org.evalcsu.chatroom.ui.view.chat.element.ElementTalk;

public class ChatView {

    private ChatInit chatInit;
    private IChatEvent chatEvent;

    public ChatView(ChatInit chatInit, IChatEvent chatEvent) {
        this.chatInit = chatInit;
        this.chatEvent = chatEvent;

        initLayout();
        initTalkSelect();
    }

    private void initTalkSelect() {
        MenuItem menuItem_talk = new MenuItem("所有人");
        chatInit.menuButton_talk.getItems().add(0, menuItem_talk);
        menuItem_talk.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                chatInit.menuButton_talk.setText("所有人");
                chatInit.textArea_input.setPromptText("发送给："+"所有人");
                chatInit.commonId = chatInit.serverId;
            }
        });
    }

    private void initLayout() {
        //make layout responsive

//        chatInit.widthProperty().addListener((obs,oldVal,newVal) -> {
//            chatInit.vbox_main.setMinWidth((Double) newVal);
//            chatInit.vbox_main.setMaxWidth((Double) newVal);
//        });

        UITool.bindWidthWith((Region) chatInit.vbox_main, (Stage) chatInit, 1.0);


        chatInit.vbox_main.widthProperty().addListener((obs,oldVal,newVal) -> {
            Double newWidth = (Double) newVal / 3;
            chatInit.pane_message.setMinWidth(newWidth*2);
            chatInit.pane_message.setMaxWidth(newWidth*2);
            chatInit.listView_user.setMinWidth(newWidth);
            chatInit.listView_user.setMaxWidth(newWidth);
        });

        chatInit.pane_message.widthProperty().addListener((obs,oldVal,newVal) -> {
            Double newWidth = (Double) newVal;
            chatInit.listView_message.setMinWidth(newWidth);
            chatInit.listView_message.setMaxWidth(newWidth);
        });
    }

//    void setContentPaneBox(String id, String name, Node node) {
//        // 填充对话列表
//        Pane content_pane_box = chatInit.$("content_pane_box", Pane.class);
//        content_pane_box.setUserData(id);
//        content_pane_box.getChildren().clear();
//        content_pane_box.getChildren().add(node);
//        // 对话框名称
//        Label info_name = chatInit.$("content_name", Label.class);
//        info_name.setText(name);
//    }
}
