package indi.ljf.pattern.behavioralType.memorandum;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author ：ljf
 * @date ：2020/11/10 14:01
 * @description：解析命令行参数 输入文本时追加到内存中
 * 输入:list 展示数据
 * 输入:undo 撤销上一个操作
 * @modified By：
 * @version: $ 1.0
 */
public class ParseCommand {
    public static void read() {
        Scanner sc = new Scanner(System.in);
        String showStr = "";
        String next;
        ArrayList<Integer> strLengths = new ArrayList<>();//保存每一个输入字符串的长度
        strLengths.add(0);

        int curIndex = 0;//当前数组索引
        int endIndex = showStr.length();

        while (true) {
            next = sc.next();
            if (next.equals(":list")) {
                System.out.println(showStr);
            } else if (next.equals(":undo")) {
                if (curIndex < 0) {
                    System.out.println("没有可撤销的操作");
                    continue;
                }
                endIndex -= strLengths.get(curIndex);
                curIndex -= 1;
                showStr = showStr.substring(0, endIndex);
            } else {
                int length = next.length();
                curIndex += 1;
                endIndex += length;
                strLengths.add(length);
                showStr += next;
            }
        }
    }

    public static void main(String[] args) {
        String value = "abcd";
        System.out.println(value.substring(0, 2));
        read();
    }
}
