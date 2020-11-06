package indi.ljf.pattern.behavioralType.visitor.version2;

/**
 * @author ：ljf
 * @date ：2020/11/6 14:39
 * @description：文件压缩
 * @modified By：
 * @version: $ 1.0
 */
public class Compressor implements Visitor {

    @Override
    public void visit(PDFFile pdfFile) {
        System.out.println("compress pdf...");
    }

    @Override
    public void visit(PPTFile pptFile) {
        System.out.println("compress ppt...");
    }

    @Override
    public void visit(WordFile wordFile) {
        System.out.println("compress word...");
    }
}
