package ua.niurhechev.sportswear.endpoints;

import javax.websocket.OnMessage;
import javax.websocket.server.ServerEndpoint;

@ServerEndpoint("/brands-view")
public class ShopChatEndpoint {
    @OnMessage
    public String messageReceiver(String message) {
        return message;
    }
}
