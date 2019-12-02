package 基于接口而非实现编程.重构后的代码;

import java.awt.*;

/**
 * Created by c06042 on 2019/12/2.
 */
public class AliyunImageStore implements ImageStore{

    @Override
    public String upload(Image image, String bucketName) {
        createBucketIfNotExisting(bucketName);
        String accessToken=generateAccessToken();
        //...上传图片到阿里云...
        //...返回图片在阿里云上的地址(url)...
        return null;
    }

    @Override
    public Image download(String url) {
        String accessToken=generateAccessToken();
        //...从阿里云下载图片...
        return null;
    }

    private void createBucketIfNotExisting(String bucketName){
        //...创建bucket...
        //...失败会抛出异常...
    }
    private String generateAccessToken() {
        //...根据accesskey/secrectkey等生成access token
        return null;
    }
}
