package org.evalcsu.chatroom.ui.view.chat;

import java.io.IOException;
import java.util.Date;

public interface IChatMethod {

    /**
     * 聊天页面展示
     */
    void chatShow();

    void addUserInfo(String userId, String userName, String userHead);

    /**
     * 添加新成员
     * @param talkId
     * @param talkName
     * @param talkHead
     */
    void addTalk(String talkId, String talkName, String talkHead);

    void addTalkGroupMsgReceive(String talkId, String userId, String userName, String userHead, String msg, Date msgDate);

    void addTalkPersonMsgReceive(String talkId, String userId, String userName, String userHead, String msg, Date msgDate);

    void addTalkMsgSend(String talkId, String msg, Date msgData);

    void addTalkUser(String userFriendId, String userName, String userFriendHead) throws IOException;
}
