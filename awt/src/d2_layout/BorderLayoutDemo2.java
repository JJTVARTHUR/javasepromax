package d2_layout;

import java.awt.*;

/**
     注意事项：1. 当向使用 BorderLayout 布局管理器的容器中添加组件时，需要指定要添加到哪个区域中。
                如果没有指定添加到哪个区域中，则默认添加到中间区域中；
             2. 如果向同一个区域中添加多个组件时，后放入的组件会覆盖先放入的组件；
 */
public class BorderLayoutDemo2 {
    public static void main(String[] args) {

        Frame frame = new Frame("这里测试BorderLayout");

        // 1. 给Frame设置BorderLayout布局管理器
        frame.setLayout(new BorderLayout(30,10));

        // 2. 往frame的指定区域添加组件
        frame.add(new Button("北侧按钮"),BorderLayout.NORTH);
        frame.add(new Button("南侧按钮"),BorderLayout.SOUTH);

        // frame.add(new Button("中间按钮"),BorderLayout.CENTER);
        // frame.add(new TextField("测试文本框"));

        Panel p = new Panel();
        p.add(new Button("中间按钮"));
        p.add(new TextField("测试文本框"));

        frame.add(p);
        frame.pack();
        frame.setVisible(true);
    }
}
