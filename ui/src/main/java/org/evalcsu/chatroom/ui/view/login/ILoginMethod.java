package org.evalcsu.chatroom.ui.view.login;

public interface ILoginMethod {

    /**
     * 登录窗口展示
     */
    void loginShow();

    /**
     * 登录失败
     */
    void loginError();

    /**
     * 登录成功
     */
    void loginSuccess();
}
