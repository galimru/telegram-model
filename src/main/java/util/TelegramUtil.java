package util;

import com.github.galimru.telegram.model.Message;
import com.github.galimru.telegram.model.Update;
import com.github.galimru.telegram.model.User;

public class TelegramUtil {

    public static Message getMessage(Update update) {
        return update.getCallbackQuery() != null
                ? update.getCallbackQuery().getMessage()
                : update.getMessage();
    }

    public static String getText(Update update) {
        return getMessage(update).getText();
    }

    public static User getFrom(Update update) {
        return getMessage(update).getFrom();
    }
}
