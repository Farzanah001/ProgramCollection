package fbmessenger;

import java.util.Date;

public class GroupChatTranscript extends Transcript{
    public String groupName;
    public String groupAdmin;
    public String messageInfo;
    Contact contactDetails;


    GroupChatTranscript(String senderName, Date sentDate, String messageType, String messageStatus, int contentID, MessageContent content) {
        super(senderName, sentDate, messageType, messageStatus, contentID, content, chatList);
    }

    @Override
    void loadChat() {
        super.loadChat();
    }
}
