package indi.ljf.practice.programToInterface;

import java.util.Random;

/**
 * @author ：ljf
 * @date ：Created in 2020/8/2 8:10
 * @description：面向接口编程，默认阿里云的图片上传业务
 * @modified By：
 * @version: 1.0
 */

class Image {
    private int wide;
    private int height;

    public Image() {
        this.wide = 300;
        this.height = 300;
    }

    public Image(int wide, int height) {
        this.wide = wide;
        this.height = height;
    }

    public int getWide() {
        return wide;
    }

    public void setWide(int wide) {
        this.wide = wide;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Image{" +
                "wide=" + wide +
                ", height=" + height +
                '}';
    }
}

public class AliyunImageStore {

    public AliyunImageStore() {

    }

    /**
     * 根据bucketName创建Image对应的阿里云目录
     *
     * @param bucketName
     */
    public void createBucketIfNotExisting(String bucketName) {
        System.out.println("create bucket successfully...");
    }


    /**
     * 生成图片上传对应的token
     *
     * @return
     */
    public String generateAccessToken() {
        Random random = new Random();
        String result = random.ints(10).toString();
        return result;
    }

    /**
     * 将图片上传阿里云，返回图片在阿里云对应的目录
     *
     * @param image
     * @param bucketName
     * @param accessToken
     * @return
     */
    public String uploadToAliyun(Image image, String bucketName, String accessToken) {
        System.out.println("携带token：" + accessToken + "图片：" + image + "上传成功！");
        return "http//aliyun/a.jpg";
    }

    public Image downLoadFromAliyun(String url, String accessToken) {
        return new Image();
    }


}
