package lab6.handlers;

import lab6.MailInfo;

public class FriendEmailHandler implements EmailHandler{
    @Override
    public void handleEmail(MailInfo info) {
        System.out.println("Happy Birthdate mail was sent " + info.getContext());
    }
}
