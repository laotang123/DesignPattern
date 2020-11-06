package indi.ljf.pattern.behavioralType.visitor.version2;

/**
 * @author ：ljf
 * @date ：2020/11/6 14:12
 * @description：将ppt文件转为txt格式
 * @modified By：
 * @version: $ 1.0
 */
public class PPTFile extends ResourceFile {
    public PPTFile(String filePath) {
        super(filePath);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

}
