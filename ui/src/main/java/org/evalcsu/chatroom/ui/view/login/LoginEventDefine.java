package org.evalcsu.chatroom.ui.view.login;

public class LoginEventDefine {
    private LoginInit loginInit;
    private ILoginEvent loginEvent;
    private ILoginMethod loginMethod;

    public LoginEventDefine(LoginInit loginInit, ILoginEvent loginEvent, ILoginMethod loginMethod) {
        this.loginInit = loginInit;
        this.loginEvent = loginEvent;
        this.loginMethod = loginMethod;
    }

    private void EventLogin() {
        loginInit.login_button.addActionListener(event -> {
            loginEvent.loginCheck(loginInit.userId.getText());
        });
    }
}
