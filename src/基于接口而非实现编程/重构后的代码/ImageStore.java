package 基于接口而非实现编程.重构后的代码;

import java.awt.*;

/**
 * Created by c06042 on 2019/12/2.
 */
public interface ImageStore {
    String upload(Image image,String bucketName);
    Image download(String url);
}
