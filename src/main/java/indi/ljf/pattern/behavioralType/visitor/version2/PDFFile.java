package indi.ljf.pattern.behavioralType.visitor.version2;

/**
 * @author ：ljf
 * @date ：2020/11/6 14:08
 * @description：将pdf文件转为txt
 * @modified By：
 * @version: $ 1.0
 */
public class PDFFile extends ResourceFile {
    public PDFFile(String filePath) {
        super(filePath);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }


}
