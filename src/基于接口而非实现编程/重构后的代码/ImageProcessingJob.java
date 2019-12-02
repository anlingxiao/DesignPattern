package 基于接口而非实现编程.重构后的代码;

import java.awt.*;

/**
 * Created by c06042 on 2019/12/2.
 */
//Image Store 的使用举例
public class ImageProcessingJob {
    private static final String BUCKE_NAME="ai_image_bucket";
    //...省略其他无关代码...

    public void process(){
        Image image=...;//处理图片，并封装为Image对象
        ImageStore imageStore=new PrivateImageStore(...);
        imageStore.upload(image,BUCKE_NAME);
    }
}
