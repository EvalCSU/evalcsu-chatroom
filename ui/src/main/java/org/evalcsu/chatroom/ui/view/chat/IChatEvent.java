package org.evalcsu.chatroom.ui.view.chat;

import java.util.Date;

public interface IChatEvent {

    void doEventSendMsg(String userId, String talkId, Integer talkType, String msg, Integer msgType, Date msgDate);

    void doEventAddTalkUser(String userId, String userFriendId);

    void doEventTalkGroup(String userId, String groupId);

    void doEventDelUser(String userId, String talkId);

    void doEventAddUser(String userId, String friendId);
}
