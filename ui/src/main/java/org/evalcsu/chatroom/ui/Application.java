package org.evalcsu.chatroom.ui;

import javafx.stage.Stage;
import org.evalcsu.chatroom.ui.view.login.ILoginEvent;
import org.evalcsu.chatroom.ui.view.login.ILoginMethod;
import org.evalcsu.chatroom.ui.view.login.LoginController;

public class Application extends javafx.application.Application {

    @Override
    public void start(Stage stage) throws Exception {
        ILoginMethod start = new LoginController(userId -> {
            System.out.println(userId);
        });
        start.loginShow();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
