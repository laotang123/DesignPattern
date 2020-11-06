package indi.ljf.pattern.behavioralType.visitor.version2;

/**
 * @author ：ljf
 * @date ：2020/11/6 14:39
 * @description：业务逻辑提取出来
 * @modified By：
 * @version: $ 1.0
 */
public class Extractor implements Visitor {

    @Override
    public void visit(PDFFile pdfFile) {
        System.out.println("extract pdf...");
    }

    @Override
    public void visit(PPTFile pptFile) {
        System.out.println("extract ppt...");
    }

    @Override
    public void visit(WordFile wordFile) {
        System.out.println("extract word...");
    }
}
