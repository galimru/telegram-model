package com.github.galimru.telegram.util;

import com.github.galimru.telegram.objects.CallbackQuery;
import com.github.galimru.telegram.objects.Message;
import com.github.galimru.telegram.objects.Update;
import com.github.galimru.telegram.objects.User;

import java.util.Optional;

public class TelegramUtil {

    public static Optional<Message> getMessage(Update update) {
        return Optional.ofNullable(update.getMessage());
    }

    public static Optional<String> getText(Update update) {
        return getMessage(update)
                .map(Message::getText);
    }

    public static Optional<CallbackQuery> getCallbackQuery(Update update) {
        return Optional.ofNullable(update.getCallbackQuery());
    }

    public static Optional<String> getCallbackData(Update update) {
        return getCallbackQuery(update)
                .map(CallbackQuery::getData);
    }

    public static Optional<User> getFrom(Update update) {
        if (getCallbackQuery(update).isPresent()) {
            return getCallbackQuery(update).map(CallbackQuery::getFrom);
        } else {
            return getMessage(update).map(Message::getFrom);
        }
    }
}
