package org.evalcsu.chatroom.ui.util;

import org.evalcsu.chatroom.ui.view.chat.element.ElementTalk;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class CacheUtil {

    public static Map<String, ElementTalk> talkMap = new ConcurrentHashMap<String, ElementTalk>(16);
}
