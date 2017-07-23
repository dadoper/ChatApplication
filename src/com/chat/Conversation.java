package com.chat;


import java.util.List;

public class Conversation {
    private long conversationId;
    private List<String> messasges;

    public long getConversationId() {
        return conversationId;
    }

    public void setConversationId(long conversationId) {
        this.conversationId = conversationId;
    }

    public List<String> getMessasges() {
        return messasges;
    }

    public void setMessasges(List<String> messasges) {
        this.messasges = messasges;
    }
}
