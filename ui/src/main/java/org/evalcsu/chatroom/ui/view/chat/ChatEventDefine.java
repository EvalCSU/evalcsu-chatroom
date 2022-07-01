package org.evalcsu.chatroom.ui.view.chat;

import javafx.application.Platform;
import javafx.collections.ObservableList;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.MenuItem;
import javafx.scene.control.MultipleSelectionModel;
import javafx.scene.control.TextArea;
import javafx.scene.input.KeyCode;
import javafx.scene.input.MouseButton;
import javafx.scene.layout.Pane;
import org.evalcsu.chatroom.ui.util.CacheUtil;
import org.evalcsu.chatroom.ui.view.chat.data.MessageData;
import org.evalcsu.chatroom.ui.view.chat.element.ElementMessage;
import org.evalcsu.chatroom.ui.view.chat.element.ElementTalk;

import java.awt.*;
import java.awt.event.MouseListener;
import java.util.Date;

public class ChatEventDefine {

    private ChatInit chatInit;
    private IChatEvent chatEvent;
    private IChatMethod chatMethod;

    public ElementTalk elementTalk_group;

    public ChatEventDefine(ChatInit chatInit, IChatEvent chatEvent, IChatMethod chatMethod) {
        this.chatInit = chatInit;
        this.chatEvent = chatEvent;
        this.chatMethod = chatMethod;

        doEventTextSend();
        doEventTouchSend();
    }
    private void doEventTouchSend() {
        chatInit.button_send.setOnMousePressed(event -> {
            doEventSendMsg();
        });
    }

    private void doEventTextSend() {
        chatInit.textArea_input.setOnKeyPressed(event -> {
            if (event.getCode().equals(KeyCode.ENTER)) {
                doEventSendMsg();
            }
        });
    }

    private void doEventSendMsg() {
        TextArea textArea_input = chatInit.$("textArea_input", TextArea.class);
        String msg = textArea_input.getText();
        if (null == msg || "".equals(msg) || "".equals(msg.trim())) {
            return;
        }
        Date msgDate = new Date();
        // 发送消息
        System.out.println("发送消息：" + msg);
        // 发送事件给自己添加消息
        chatMethod.addTalkMsgSend(chatInit.commonId, msg, msgDate);
        // 如果不在下一个 tick 清除, 触发 doEventSendMsg 的 enter 会被保留
        Platform.runLater( () -> {
            textArea_input.clear();
        });

    }

    private void doEventDelUser() {

    }
}
