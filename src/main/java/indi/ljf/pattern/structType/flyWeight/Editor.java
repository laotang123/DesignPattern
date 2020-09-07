package indi.ljf.pattern.structType.flyWeight;

import java.awt.Font;
import java.util.ArrayList;
import java.util.List;

/**
 * @author ：ljf
 * @date ：2020/9/7 10:37
 * @description：结构型模型中的享元模式: 对象的共享
 * 原始版本
 * @modified By：
 * @version: $ 1.0
 */
class ComplexCharacter extends AbstractCharacter {
    private Font font;
    private int size;
    private int colorRGB;

    public ComplexCharacter(char c, Font font, int size, int colorRGB) {
        this.c = c;
        this.font = font;
        this.size = size;
        this.colorRGB = colorRGB;
    }
}

public class Editor {
    private List<ComplexCharacter> chars = new ArrayList<>();

    public void appendCharacter(char c, Font font, int size, int colorRGB) {
        ComplexCharacter character = new ComplexCharacter(c, font, size, colorRGB);
        chars.add(character);
    }
}
