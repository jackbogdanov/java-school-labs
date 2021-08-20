package lab6.handlers;

import lab6.MailInfo;

public class ErrorEmailHandler implements EmailHandler{
    @Override
    public void handleEmail(MailInfo info) {
        System.out.println("Welcome mail was sent " + info.getContext());
    }
}
