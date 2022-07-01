package org.evalcsu.chatroom.ui;

import javafx.stage.Stage;
import org.evalcsu.chatroom.ui.view.chat.ChatController;
import org.evalcsu.chatroom.ui.view.chat.IChatEvent;
import org.evalcsu.chatroom.ui.view.chat.IChatMethod;
import org.evalcsu.chatroom.ui.view.login.ILoginEvent;
import org.evalcsu.chatroom.ui.view.login.ILoginMethod;
import org.evalcsu.chatroom.ui.view.login.LoginController;

import java.util.Date;

public class Application extends javafx.application.Application {

    @Override
    public void start(Stage stage) throws Exception {
        IChatMethod start = new ChatController(new IChatEvent() {
            @Override
            public void doEventSendMsg(String userId, String talkId, Integer talkType, String msg, Integer msgType, Date msgDate) {

            }

            @Override
            public void doEventAddTalkUser(String userId, String userFriendId) {

            }

            @Override
            public void doEventTalkGroup(String userId, String groupId) {

            }

            @Override
            public void doEventDelUser(String userId, String talkId) {

            }

            @Override
            public void doEventAddUser(String userId, String friendId) {

            }
        });
        start.chatShow();
        start.addUserInfo("1111","2222","aaaa");
        start.addUserInfo("1111","3333","aaaa");
        start.addUserInfo("1112","4444","aaaa");
        start.addUserInfo("111","6666","aaaa");
        start.addUserInfo("1112","4444","aaaa");
        start.addUserInfo("111","6666","aaaa");
        start.addUserInfo("1112","4444","aaaa");
        start.addUserInfo("111","6666","aaaa");
        start.addTalk("1111","2222","aaaa");
        start.addTalk("1112","444","aaaa");
        start.addTalkMsgSend("1112","asdasdasd", new Date());
        start.addTalkPersonMsgReceive("1112","444444", "zxczxcz","","", new Date());
        start.addTalkGroupMsgReceive("1112","111", "aaaaa", "d", "aaaaaaaaa",new Date());
        start.addTalkMsgSend("1112","111", new Date());
        start.addTalkMsgSend("1112","11111111111", new Date());
        start.addTalkMsgSend("00000","00000", new Date());
        start.addTalkMsgSend("1111","111", new Date());

    }

//    @Override
//    public void start(Stage stage) throws Exception {
//        ILoginMethod start = new LoginController(userId -> {});
//        start.loginShow();
//    }

    public static void main(String[] args) {
        launch(args);
    }
}
