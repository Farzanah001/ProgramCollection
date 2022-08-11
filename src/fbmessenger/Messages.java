package fbmessenger;

import java.util.Date;

public class Messages extends MessageContent {
    public String senderName;//username of sender
    public Date sentDate;//date&time
    public String messageType;
    public String messageStatus;
    public int contentID;
    MessageContent content;
    Messages(String senderName, Date sentDate, String messageType, String messageStatus, int contentID,MessageContent content){
        this.senderName=senderName;
        this.sentDate=sentDate;
        this.messageType=messageType;
        this.messageStatus=messageStatus;
        this.contentID=contentID;
        content=new MessageContent(contentID);
    }

}
