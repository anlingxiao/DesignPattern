package 基于接口而非实现编程;

import java.awt.*;

/**
 * Created by c06042 on 2019/12/2.
 */
public class AliyunImageStore {
    //...省略属性 构造函数等
    public void createBucketIfNotExisting(String bucketName){
        //...创建bucket代码逻辑
        //...失败会抛出异常
    }
    public String generateAccessToken(){
        //...根据accesskey/secrectken等生成access token
        return null;
    }
    public String uploadToAliyun(Image image,String bucketName,String accessToken){
        //...上传图片到阿里云
        //...返回图片存储在阿里云上的地址
        return null;
    }
    public Image downloadFromAliyun(String url,String accessToken){
        //...从阿里云下载图片
        return null;
    }
}
