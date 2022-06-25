package org.evalcsu.chatroom.ui.view.chat.data;

public class MessageData {

    private String talkId;
    private String talkName;
    private String talkHead;

    public MessageData(String talkId, String talkName, String talkHead){
        this.talkId = talkId;
        this.talkName = talkName;
        this.talkHead = talkHead;
    }

    public String getId() {
        return talkId;
    }

    public String getName() {
        return talkName;
    }

    public String getHead() {
        return talkHead;
    }


}
