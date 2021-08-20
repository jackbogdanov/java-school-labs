package lab6;

import lab6.handlers.EmailHandler;
import lab6.handlers.ErrorEmailHandler;
import lab6.handlers.FriendEmailHandler;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum EmailType {
    ERROR_EMAIL(0, new ErrorEmailHandler()),
    FRIEND_EMAIL(1, new FriendEmailHandler());
    
    private final int id;
    
    private final EmailHandler handler;
    
    public static EmailType getEmailType(int type) {
        for (EmailType t :
                values()) {
            
        }
    }
    
}
