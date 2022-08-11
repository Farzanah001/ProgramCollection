package fbmessenger;

import java.util.Date;

public class IndividualChatTranscript extends Transcript{

    IndividualChatTranscript(String senderName, Date sentDate, String messageType, String messageStatus, int contentID, MessageContent content) {
        super(senderName, sentDate, messageType, messageStatus, contentID, content, chatList);
    }

    @Override
    void loadChat() {
        super.loadChat();
    }
}
