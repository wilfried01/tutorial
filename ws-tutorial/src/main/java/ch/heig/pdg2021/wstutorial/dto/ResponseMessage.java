package ch.heig.pdg2021.wstutorial.dto;

public class ResponseMessage {

    private String content;

    public ResponseMessage(String content) {
        this.content = content;
    }

    public ResponseMessage() {
        this("");
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
