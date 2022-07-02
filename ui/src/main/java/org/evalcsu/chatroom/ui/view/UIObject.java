package org.evalcsu.chatroom.ui.view;

import javafx.scene.Parent;
import javafx.stage.Stage;

public abstract class UIObject extends Stage {

    protected Parent root;

    /**
     *
     * @param id 透过 id 找到指定的页面元素实例
     * @param clazz 透过 clazz 指定还回的实例类型
     * @return 指定 id 对应的元素实例
     * @param <T>
     */
    public <T> T $(String id, Class<T> clazz) {
        return (T) root.lookup("#" + id);
    }

    /**
     * 初始化窗口
     */
    public abstract void initView();

    /**
     * 初始化事件定义
     */
    public abstract void initEventDefine();
}
