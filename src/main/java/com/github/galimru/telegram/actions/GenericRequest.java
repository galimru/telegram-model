package com.github.galimru.telegram.actions;

import java.io.Serializable;

public interface GenericRequest<T> extends Serializable {
    String getChatId();
    T setChatId(String chatId);
}
