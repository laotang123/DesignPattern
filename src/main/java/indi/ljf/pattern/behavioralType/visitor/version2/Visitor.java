package indi.ljf.pattern.behavioralType.visitor.version2;

/**
 * @author ：ljf
 * @date ：2020/11/6 16:37
 * @description：访问者接口，业务逻辑的上层接口
 * @modified By：
 * @version: $ 1.0
 */
public interface Visitor {

    void visit(PDFFile pdfFile);

    void visit(PPTFile pptFile);

    void visit(WordFile wordFile);
}
