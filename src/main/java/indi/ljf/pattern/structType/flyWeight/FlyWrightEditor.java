package indi.ljf.pattern.structType.flyWeight;

import java.awt.Font;
import java.util.*;

/**
 * @author ：ljf
 * @date ：2020/9/7 10:47
 * @description：文本编辑中享元模式的优化
 * @modified By：
 * @version: $ 1.0
 */
class CharacterStyle {
    private Font font;
    private int size;
    private int colorRGB;

    public CharacterStyle(Font font, int size, int colorRGB) {
        this.font = font;
        this.size = size;
        this.colorRGB = colorRGB;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CharacterStyle that = (CharacterStyle) o;
        return size == that.size &&
                colorRGB == that.colorRGB &&
                font.equals(that.font);
    }

    @Override
    public int hashCode() {
        return Objects.hash(font, size, colorRGB);
    }
}

class SimpleCharacter {
    private char c;
    private CharacterStyle characterStyle;

    public SimpleCharacter(char c, CharacterStyle characterStyle) {
        this.c = c;
        this.characterStyle = characterStyle;
    }

    @Override
    public String toString() {
        return "SimpleCharacter{" +
                "c=" + c +
                ", characterStyle=" + characterStyle +
                '}';
    }
}

/**
 * 工厂类实现享元模式
 */

class CharacterStyleFactory {
//    public static final List<CharacterStyle> styles = new ArrayList<>();
    public static final Map<Integer,CharacterStyle> styles = new HashMap<>();

    public static CharacterStyle getStyle(Font font, int size, int colorRGB) {
//        CharacterStyle newStyle = new CharacterStyle(font, size, colorRGB);
//        for (CharacterStyle style : styles) {
//            if (newStyle.equals(style)) {
//                return style;
//            }
//        }
//        styles.add(newStyle);
        int newKey = Objects.hash(font, size, colorRGB);
        CharacterStyle style = styles.get(newKey);
        if (style == null){
            CharacterStyle newStyle = new CharacterStyle(font, size, colorRGB);
            styles.put(newKey,newStyle);
            return newStyle;
        }
        return style;
    }
}

public class FlyWrightEditor {
    private List<SimpleCharacter> chars = new ArrayList<>();

    public void appendCharacter(char c,int size,Font font,int colorRGB){
        SimpleCharacter character = new SimpleCharacter(c, CharacterStyleFactory.getStyle(font, size, colorRGB));
        chars.add(character);
    }

    public String getText(){
        return chars.toString();
    }

    public static void main(String[] args) {
        FlyWrightEditor editor = new FlyWrightEditor();
        editor.appendCharacter('a',14,new Font("default",0,255),255);
        editor.appendCharacter('b',14,new Font("default",0,255),255);
        editor.appendCharacter('c',14,new Font("default",0,255),255);
        System.out.println(editor.getText());
        System.out.println(CharacterStyleFactory.styles.size());
    }
}
