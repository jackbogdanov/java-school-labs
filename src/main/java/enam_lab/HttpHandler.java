package enam_lab;

public class HttpHandler {

    public void handleHttpCode(int httpCode) {
        HttpCode.getHttpCode(httpCode).handle();
    }


    public static void main(String[] args) {
        HttpHandler httpHandler = new HttpHandler();

        httpHandler.handleHttpCode(222);
    }
}
