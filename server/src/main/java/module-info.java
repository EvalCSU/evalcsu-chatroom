module com.evalcsu.chatroom {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.evalcsu.chatroom to javafx.fxml;
    exports com.evalcsu.chatroom;
}
