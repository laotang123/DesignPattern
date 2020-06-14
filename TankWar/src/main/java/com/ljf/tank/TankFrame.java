package com.ljf.tank;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @author ：ljf
 * @date ：2020/6/13 18:27
 * @description：TODO
 * @modified By：
 * @version: $ 1.0
 */
public class TankFrame extends Frame {
    int x = 200, y = 200;

    public TankFrame() {
        setTitle("Tank War");
        setSize(800, 600);
        addKeyListener(new MyKeyListener());
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        setVisible(true);

    }

    @Override
    public void paint(Graphics g) {
        g.fillRect(x, y, 100, 100);

    }

    class MyKeyListener extends KeyAdapter {
        /**
         * 键盘按下键，移动窗口
         * @param e
         */
        @Override
        public void keyPressed(KeyEvent e) {
            x += 30;
            repaint();
        }

        @Override
        public void keyReleased(KeyEvent e) {
            System.out.println("key released");
        }
    }
}
