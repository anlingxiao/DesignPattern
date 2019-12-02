package 抽象类和接口.抽象类;

import java.io.IOException;
import java.util.logging.Level;

/**
 * Created by c06042 on 2019/12/2.
 */
//抽象类
public abstract class Logger {
    private String name;
    private boolean enabled;
    private Level minPermittedLevel;

    public Logger(String name,boolean enabled,Level minPermittedLevel){
        this.name=name;
        this.enabled=enabled;
        this.minPermittedLevel=minPermittedLevel;
    }

    public void log(Level level,String message) throws IOException {
        boolean loggable=enabled&&(minPermittedLevel.intValue()<=level.intValue());
        if (!loggable) return;
        doLog(level,message);
    }

    protected abstract void doLog(Level level,String message) throws IOException;
}
