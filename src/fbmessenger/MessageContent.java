package fbmessenger;


public class MessageContent {

    MessageContent() {

    }

    MessageContent(int content) {
        if(content==(MessageType.TEXT.ordinal()+1)){
            Text txt=new Text();
            txt.getText();
        }
        else if(content==(MessageType.IMAGE.ordinal()+1)){
            Image img=new Image();
            img.getImage();
        }
        else if (content==(MessageType.AUDIO.ordinal()+1)) {
            Audio ado=new Audio();
            ado.getAudio();
        }
        else if(content==(MessageType.VIDEO.ordinal()+1)){
            Video vdo=new Video();
            vdo.getVideo();
        }
        else if(content==(MessageType.STICKER.ordinal()+1)){
            Sticker sticker=new Sticker();
            sticker.getSticker();
        }
        else if(content==(MessageType.GIF.ordinal()+1)){
            Gif gif=new Gif();
            gif.getGif();
        }
    }
}
