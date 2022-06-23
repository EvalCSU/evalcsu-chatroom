package org.evalcsu.chatroom.ui.view.login;

public interface ILoginEvent {

    /**
     * 登录验证
     * @param userId
     */
    void loginCheck(String userId);
}
