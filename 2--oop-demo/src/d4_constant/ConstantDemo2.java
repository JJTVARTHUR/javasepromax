package d4_constant;

import javax.swing.*;
import java.awt.event.ActionEvent;

/**

 常量：
 1.常量是使用了public static final修饰的成员变量，必须有初始化值，而且执行的过程中其值不能被改变。
 2.常量的作用和好处：可以用于做系统的配置信息，方便程序的维护，同时也能提高可读性。

 常量命名规范：英文单词全部大写，多个单词下划线连接起来。 SCHOOL_NAME  LOGIN_NAME;

 常量的执行原理
 1.在编译阶段会进行"宏替换"，把使用常量的地方全部替换成真实的字面量。
 2.这样做的好处是让使用常量的程序的执行性能与直接使用字面量是一样的。

 目标: 常量的其他作用，做信息标志和信息分类（其实也是一种配置形式）

 */

public class ConstantDemo2 {
    public static final int UP = 1; // 上
    public static final int DOWN = 2; // 下
    public static final int LEFT = 3; // 左
    public static final int RIGHT = 4; // 右

    public static void main(String[] args) {
        // 1、创建一个窗口对象（桌子）
        JFrame win = new JFrame();
        // 2、创建一个面板对象（桌布）
        JPanel panel = new JPanel();
        // 3、把桌布垫在桌子上
        win.add(panel);
        // 4、创建四个按钮对象
        JButton btn1 = new JButton("上");
        JButton btn2 = new JButton("下");
        JButton btn3 = new JButton("左");
        JButton btn4 = new JButton("右");
        // 5、把按钮对象添加到桌布上去
        panel.add(btn1);
        panel.add(btn2);
        panel.add(btn3);
        panel.add(btn4);
        // 6、显示窗口
        win.setLocationRelativeTo(null);
        win.setSize(300,400);
        win.setVisible(true);


        btn1.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                move(UP) ; // 让玛丽往上跳
            }
        });
        btn2.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                move(ConstantDemo2.DOWN) ; // 让玛丽往下跳
            }
        });
        btn3.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                move(LEFT) ; // 让玛丽往左跑
            }
        });
        btn4.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                move(RIGHT) ; // 让玛丽往右跑
            }
        });
    }

    public static void move(int flag){
        // 控制玛丽移动
        switch (flag) {
            case UP:
                System.out.println("玛丽往上飞了一下~~");
                break;
            case DOWN:
                System.out.println("玛丽往下蹲一下~~");
                break;
            case LEFT:
                System.out.println("玛丽往左跑~~");
                break;
            case RIGHT:
                System.out.println("玛丽往→跑~~");
                break;
        }
    }
}
