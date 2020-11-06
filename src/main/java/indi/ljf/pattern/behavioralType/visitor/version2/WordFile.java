package indi.ljf.pattern.behavioralType.visitor.version2;

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
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
