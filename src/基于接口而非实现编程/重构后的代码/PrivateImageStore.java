package 基于接口而非实现编程.重构后的代码;

import java.awt.*;

/**
 * Created by c06042 on 2019/12/2.
 */
//上传下载流程改变：私有云不需要支持 access token
public class PrivateImageStore implements ImageStore {
    @Override
    public String upload(Image image, String bucketName) {
        createBucketIfNotExisting(bucketName);
        //...上传图片到私有云...
        //...返回图片的url...
        return null;
    }

    @Override
    public Image download(String url) {
        //...从私有云下载图片
        return null;
    }

    private void createBucketIfNotExisting(String bucketName){
        //...创建bucket...
        //...失败会抛出异常...
    }
}
