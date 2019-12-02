package 抽象类和接口.抽象类;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.logging.Level;

/**
 * Created by c06042 on 2019/12/2.
 */
//抽象类的子类：输出日志到文件
public class FileLogger extends Logger{
    private Writer fileWriter;

    public FileLogger(String name, boolean enabled, Level minPermittedLevel, String filePath) throws IOException {
        super(name, enabled, minPermittedLevel);
        this.fileWriter=new FileWriter(filePath);
    }

    @Override
    protected void doLog(Level level, String message) throws IOException {
        //格式化level和message，输出到日志文件
        fileWriter.write("...");
    }
}
