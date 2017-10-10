package com.github.galimru.telegram.util;

import com.github.galimru.telegram.objects.CallbackQuery;
import com.github.galimru.telegram.objects.Message;
import com.github.galimru.telegram.objects.Update;
import com.github.galimru.telegram.objects.User;
import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.*;

public class TelegramUtilTest {

    private static final String EXPECTED_VALUE = "EXPECTED_VALUE";

    @Test
    public void testGetCallbackQuery() {
        Optional<CallbackQuery> callbackQuery = TelegramUtil.getCallbackQuery(new Update()
                .setCallbackQuery(new CallbackQuery()));
        assertTrue(callbackQuery.isPresent());
        callbackQuery = TelegramUtil.getCallbackQuery(new Update());
        assertFalse(callbackQuery.isPresent());
    }

    @Test
    public void testGetCallbackData() {
        Optional<String> callbackData = TelegramUtil.getCallbackData(new Update()
                .setCallbackQuery(new CallbackQuery()
                        .setData(EXPECTED_VALUE)));
        assertTrue(callbackData.isPresent());
        assertEquals(callbackData.get(), EXPECTED_VALUE);
        callbackData = TelegramUtil.getCallbackData(new Update());
        assertFalse(callbackData.isPresent());
    }

    @Test
    public void testGetMessage() {
        Optional<Message> message = TelegramUtil.getMessage(new Update()
                .setMessage(new Message()));
        assertTrue(message.isPresent());
        message = TelegramUtil.getMessage(new Update());
        assertFalse(message.isPresent());
    }

    @Test
    public void testGetText() {
        Optional<String> text = TelegramUtil.getText(new Update()
                .setMessage(new Message().setText(EXPECTED_VALUE)));
        assertTrue(text.isPresent());
        text = TelegramUtil.getText(new Update());
        assertFalse(text.isPresent());
    }

    @Test
    public void testGetFrom() {
        Optional<User> from = TelegramUtil.getFrom(new Update()
                .setMessage(new Message().setFrom(new User().setFirstName(EXPECTED_VALUE))));
        assertTrue(from.map(User::getFirstName).isPresent());
        assertEquals(EXPECTED_VALUE, from.map(User::getFirstName).get());
        from = TelegramUtil.getFrom(new Update()
                .setCallbackQuery(new CallbackQuery().setFrom(new User().setFirstName(EXPECTED_VALUE))));
        assertTrue(from.map(User::getFirstName).isPresent());
        assertEquals(EXPECTED_VALUE, from.map(User::getFirstName).get());
        from = TelegramUtil.getFrom(new Update());
        assertFalse(from.isPresent());
    }

}
