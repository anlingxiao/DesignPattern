package 基于接口而非实现编程;

import java.awt.*;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;

/**
 * Created by c06042 on 2019/12/2.
 */
public class ImageProcessingJob {
    private static final String BUCKET_NAME="ai_image_bucket";

    public void process(){
        Image image=new Image() {
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
        }; //处理图片，并封装为Image对象
        AliyunImageStore imageStore=new AliyunImageStore(/*省略参数*/);
        imageStore.createBucketIfNotExisting(BUCKET_NAME);
        String accessToken=imageStore.generateAccessToken();
        imageStore.uploadToAliyun(image,BUCKET_NAME,accessToken);
    }
}
