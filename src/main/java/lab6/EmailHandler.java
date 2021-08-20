package lab6;

import lab6.handlers.ErrorEmailHandler;
import lab6.handlers.FriendEmailHandler;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum EmailHandler {
    ERROR_EMAIL_HANDLER(0, new ErrorEmailHandler()),
    FRIEND_EMAIL_HANDLER(1, new FriendEmailHandler());
    
    private final int id;
    
    private final lab6.handlers.EmailHandler handler;
    
    public static EmailHandler getEmailHandler(int type) {
        for (EmailHandler t : values()) {
            if (t.id == type) {
                return t;
            }
        }

        throw new RuntimeException("This type is not supported");
    }

    public void handle(MailInfo info) {
        handler.handleEmail(info);
    }
    
}
