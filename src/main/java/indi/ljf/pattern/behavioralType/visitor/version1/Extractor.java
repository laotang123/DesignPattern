package indi.ljf.pattern.behavioralType.visitor.version1;

/**
 * @author ：ljf
 * @date ：2020/11/6 14:39
 * @description：业务逻辑提取出来
 * @modified By：
 * @version: $ 1.0
 */
public class Extractor {
    public void extract2txt(WordFile wordFile){
        /*...*/
        System.out.println("extract txt from word file...");
    }

    public void extract2txt(PPTFile pptFile){
        /*...*/
        System.out.println("extract txt from ppt file...");
    }

    public void extract2txt(PDFFile pdfFile){
        /*...*/
        System.out.println("extract txt from pdf file...");
    }
}
