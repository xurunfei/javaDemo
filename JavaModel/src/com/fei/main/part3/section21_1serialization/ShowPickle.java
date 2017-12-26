package com.fei.main.part3.section21_1serialization;

import java.awt.*;
import java.awt.event.*;
import java.beans.*;

/**
 * 这个类可以被用来显示事先被串行化的 TextField 对象
 * 个人备注(在使用pickleMaker时,生成的.ser文件没有编译到编译目录,
 * 可能导致showPickle读取出来为空,这时候将文件复制到编译目录即可)
 */
class ShowPickle extends Frame {
    /**
     * 此构造子创建一个 frame 视窗， 将其布局改为 FlowLayout，
     * 并将传入的 TextField 并行化， 然后加到视窗上
     */
    ShowPickle(String serComponent) {
        /*
        * 调用超类的构造子， 加上一个监听器对象，
        * 以便监听视窗的关闭事件。
        */
        super("Show Pickle");
        addWindowListener(new win());
        setLayout(new FlowLayout());

        /**
         * 将串行化的 TextField 对象实例化
         * 如果找不到串行化的对象，
         * 则显示一个普通的 TextField
         */
        TextField text;
        try {
            text = (TextField) Beans.instantiate(
                    null, serComponent);
        } catch (Exception e) {
            System.out.println(e);
            text = new TextField();
        }
        add(text);
    }

    /**
     * 这个方法创建一个 Frame 对象， 显示并行化后的 TextField 对象
     */
    public static void main(String[] args) {
        Frame frame = new ShowPickle("mytextfield");
        frame.pack();
        frame.setVisible(true);
    }

    /**
     * 这个内部类提供了监听功能， 以便在接到操作系统传来
     * 的关闭窗口的事件时， 将应用程序结束掉
     */
    class win extends WindowAdapter {
        public void windowClosing(WindowEvent evt) {
            Frame frame = (Frame) evt.getSource();
            frame.setVisible(false);
            frame.dispose();
            System.exit(0);
        }
    }
}