package org.evalcsu.chatroom.ui.view.login;

import org.evalcsu.chatroom.ui.view.chat.IChatMethod;

public class LoginController extends LoginInit implements ILoginMethod {

    private IChatMethod chat;
    private LoginView loginView;
    private LoginEventDefine loginEventDefine;

    public LoginController(ILoginEvent loginEvent) {
        super(loginEvent);
    }

    @Override
    public void initView() {
        loginView = new LoginView(this, loginEvent);
    }

    @Override
    public void initEventDefine() {
        loginEventDefine = new LoginEventDefine(this, loginEvent, this);
    }

    @Override
    public void loginShow() {
        super.show();
    }

    @Override
    public void loginError() {
        System.out.println("登陆失败，执行提示操作");
    }

    @Override
    public void loginSuccess() {
        System.out.println("登陆成功，执行跳转操作");
        close();;
    }
}
