package fbmessenger;

import java.util.ArrayList;
import java.util.Date;

public class Transcript extends Messages {

    static ArrayList<Messages> chatList=new ArrayList<>();
    void loadChat(){

    }
    Transcript(String senderName, Date sentDate, String messageType, String messageStatus, int contentID, MessageContent content,ArrayList<Messages> chatList) {
        super(senderName, sentDate, messageType, messageStatus, contentID, content);
    }
}
