package org.evalcsu.chatroom.ui.view.login;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import org.evalcsu.chatroom.ui.view.UIObject;

import java.awt.*;
import java.io.IOException;

public abstract class LoginInit extends UIObject {

    private static final String LOGIN= "/fxml/login/login.fxml";
    private static final String ICON="/img/icons8-flying-duck-100.png";
    protected ILoginEvent loginEvent;

    @FXML
    public TextField userId;
    @FXML
    public Button login_button;

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

        initView();
        initEventDefine();
    }

}
