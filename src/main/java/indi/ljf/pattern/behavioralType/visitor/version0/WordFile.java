package indi.ljf.pattern.behavioralType.visitor.version0;

/**
 * @author ：ljf
 * @date ：2020/11/6 14:09
 * @description：将word文件转为txt文件
 * @modified By：
 * @version: $ 1.0
 */
public class WordFile extends ResourceFile {
    public WordFile(String filePath) {
        super(filePath);
    }

    @Override
    public void extract2txt() {
        /*...*/
        System.out.println("extract txt from word file...");
    }
}
