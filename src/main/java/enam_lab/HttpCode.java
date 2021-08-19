package enam_lab;

import enam_lab.handlers.Handler;
import enam_lab.handlers.InformationalHandler;
import enam_lab.handlers.RedirectionHandler;
import enam_lab.handlers.SuccessHandler;
import lombok.AllArgsConstructor;
import lombok.SneakyThrows;

@AllArgsConstructor
public enum HttpCode {
    INFORMATIONAL(100, 199, new InformationalHandler()),
    SUCCESS(200, 299, new SuccessHandler()),
    REDIRECTION(300, 399, new RedirectionHandler());

    private final int from;
    private final int to;
    private final Handler handler;


    public void handle() {
        handler.handle();
    }

    private boolean isBelongs(int code) {
        return code >= from && code <= to;
    }

    public static HttpCode getHttpCode(int code) {

        for (HttpCode httpCode: values()) {
            if (httpCode.isBelongs(code)) {
                return httpCode;
            }
        }

        throw new IllegalArgumentException();
    }
}
