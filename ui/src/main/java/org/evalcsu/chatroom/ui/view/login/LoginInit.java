package org.evalcsu.chatroom.ui.view.login;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import org.evalcsu.chatroom.ui.view.UIObject;

import java.io.IOException;

public abstract class LoginInit extends UIObject {

    private static final String LOGIN= "/fxml/login/demo.fxml";
    private static final String ICON="/img/icons8-flying-duck-100.png";
    protected ILoginEvent loginEvent;

    public TextField textField_userId;
    public Button button_login;

    LoginInit(ILoginEvent loginEvent){
        this.loginEvent = loginEvent;
        try {
            root = FXMLLoader.load(getClass().getResource(LOGIN));
        } catch (IOException e) {
            e.printStackTrace();
        }

        Scene scene = new Scene(root);
        setScene(scene);
        setResizable(false);
        this.getIcons().add(new Image(ICON));

        initController();
        initView();
        initEventDefine();
    }

    private void initController() {
        textField_userId = $("textField_userId", TextField.class);
        button_login = $("button_login", Button.class);
    }

}
