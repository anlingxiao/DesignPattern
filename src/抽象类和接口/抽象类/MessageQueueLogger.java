package 抽象类和接口.抽象类;

import java.io.IOException;
import java.util.logging.Level;

/**
 * Created by c06042 on 2019/12/2.
 */
public class MessageQueueLogger extends Logger {
    private MessageQueueClient msgQueueClient;
    public MessageQueueLogger(String name, boolean enabled, Level minPermittedLevel, MessageQueueClient msgQueueClient) {
        super(name, enabled, minPermittedLevel);
        this.msgQueueClient=msgQueueClient;
    }

    @Override
    protected void doLog(Level level, String message) throws IOException {
        //格式化 level和message ，输出到消息中间件
        msgQueueClient.send("...");
    }
}
