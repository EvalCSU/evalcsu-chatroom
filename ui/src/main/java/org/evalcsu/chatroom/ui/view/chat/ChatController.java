package org.evalcsu.chatroom.ui.view.chat;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.Pane;
import org.evalcsu.chatroom.ui.util.CacheUtil;
import org.evalcsu.chatroom.ui.util.Ids;
import org.evalcsu.chatroom.ui.view.chat.data.MessageData;
import org.evalcsu.chatroom.ui.view.chat.element.ElementMessage;
import org.evalcsu.chatroom.ui.view.chat.element.ElementTalk;

import java.io.IOException;
import java.util.Date;

public class ChatController extends ChatInit implements IChatMethod {

    private ChatView chatView;
    private ChatEventDefine chatEventDefine;

    public ChatController(IChatEvent chatEvent) {
        super(chatEvent);
    }

    @Override
    public void initView() {
        chatView = new ChatView(this, chatEvent);
    }

    @Override
    public void initEventDefine() {
        chatEventDefine = new ChatEventDefine(this, chatEvent, this);
    }

    @Override
    public void chatShow() {
        super.show();
    }

    @Override
    public void addUserInfo(String userId, String userName, String userHead) {
        super.userId = userId;
        super.userName = userName;
        super.userHead = userHead;

        addTalkUser(userId,userName,userHead);
    }

    @Override
    public void addTalk(String talkId, String talkName, String talkHead) {
        ElementTalk elementTalk = CacheUtil.talkMap.get(talkId);
        if (elementTalk != null) {
            Node node_talk = menuButton_talk.lookup("#"+Ids.ElementTalkId.createTalkPaneId(talkId));
            if (node_talk == null) {
                menuButton_talk.getItems().add(0, new MenuItem(elementTalk.toString()));
            }
            return;
        }

        elementTalk = new ElementTalk(talkId, talkName, talkHead);
        CacheUtil.talkMap.put(talkId, elementTalk);

        MenuItem menuItem_talk = new MenuItem(talkName);
        menuButton_talk.getItems().add(1, menuItem_talk);

        menuItem_talk.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                menuButton_talk.setText(talkName);
                textArea_input.setPromptText("发送给："+talkName);
                commonId = talkId;
            }
        });
    }

    @Override
    public void addTalkGroupMsgReceive(String GroupId, String userId, String userName, String userHead, String msg, Date msgDate) {
        ElementTalk talkElement = CacheUtil.talkMap.get(GroupId);
        ListView<Pane> listView = talkElement.messageList();
        Pane left = new ElementMessage().message(userName, userHead, msg);
        listView.getItems().add(left);
        listView_message.getItems().add(left);
        listView_message.scrollTo(left);
    }

    @Override
    public void addTalkPersonMsgReceive(String talkId, String userId, String userName, String userHead, String msg, Date msgDate) {
        ElementTalk elementTalk = CacheUtil.talkMap.get(talkId);
        ListView<Pane> list_message = elementTalk.messageList();
        MessageData messageData = (MessageData) list_message.getUserData();
        Pane pane_receive = new ElementMessage().message(messageData.getName(), messageData.getHead(), msg);

        list_message.getItems().add(pane_receive);
        listView_message.getItems().add(pane_receive);
        listView_message.scrollTo(pane_receive);
    }

    @Override
    public void addTalkMsgSend(String talkId, String msg, Date msgData) {
        ElementTalk elementTalk = CacheUtil.talkMap.get(talkId);
        ListView<Pane> listView = elementTalk.messageList();
        Pane send = new ElementMessage().message(userName, userHead, msg);
        listView.getItems().add(send);
        listView_message.getItems().add(send);
        listView_message.scrollTo(send);
    }

    @Override
    public void addTalkUser(String userId, String userName, String userHead) {

        pane_user = new ElementTalk(userId, userName, userHead).pane();

        pane_user.setOnMouseClicked(mouseEvent -> {
            if (mouseEvent.getClickCount() == 2) {
                addTalk(userId, userName, userHead);
            }
        });

        listView_user.getItems().add(pane_user);
    }

}
