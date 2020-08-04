package indi.ljf.practice.programToInterface;

/**
 * @author ：ljf
 * @date ：Created in 2020/8/2 8:52
 * @description：处理图片类
 * @modified By：
 * @version: 1.0
 */
public class ImageProcessJob {
    private static final String BUCKET_NAME="ai_images_bucket";

    public void doProcess(){
        Image image = new Image();
        AliyunImageStore aliyunImageStore = new AliyunImageStore();
        String token = aliyunImageStore.generateAccessToken();
        aliyunImageStore.createBucketIfNotExisting(BUCKET_NAME);
        aliyunImageStore.uploadToAliyun(image,BUCKET_NAME,token);
    }

    public static void main(String[] args) {
        ImageProcessJob imageProcessJob = new ImageProcessJob();
        imageProcessJob.doProcess();
    }
}
