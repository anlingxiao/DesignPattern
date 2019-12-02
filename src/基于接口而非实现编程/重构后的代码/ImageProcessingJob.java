package 基于接口而非实现编程.重构后的代码;

import java.awt.*;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;

/**
 * Created by c06042 on 2019/12/2.
 */
//Image Store 的使用举例
public class ImageProcessingJob {
    private static final String BUCKET_NAME="ai_image_bucket";
    //...省略其他无关代码...

    public void process(){
        Image image= new Image() {
            @Override
            public int getWidth(ImageObserver imageObserver) {
                return 0;
            }

            @Override
            public int getHeight(ImageObserver imageObserver) {
                return 0;
            }

            @Override
            public ImageProducer getSource() {
                return null;
            }

            @Override
            public Graphics getGraphics() {
                return null;
            }

            @Override
            public Object getProperty(String s, ImageObserver imageObserver) {
                return null;
            }
        };//处理图片，并封装为Image对象
        ImageStore imageStore=new PrivateImageStore();
        imageStore.upload(image,BUCKET_NAME);
    }
}
