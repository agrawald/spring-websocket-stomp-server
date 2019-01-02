package au.poc.dj.model;

import lombok.*;

import java.util.Date;

@Setter
@Getter
@ToString
@NoArgsConstructor
public class OutputMessage {
    private String from;
    private String message;
    private String topic;
    private final Date time = new Date();

    public OutputMessage(String from, String message, String topic) {
        this.from = from;
        this.message = message;
        this.topic = topic;
    }
}
