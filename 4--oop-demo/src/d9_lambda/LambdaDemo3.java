package d9_lambda;

/**

 Lambda表达式的省略写法 (进一步在Lambda表达式的基础上继续简化)
 1. 参数类型可以省略不写
 2. 如果只有一个参数，参数类型可以省略，同时()也可以省略。
 3. 如果Lambda表达式的方法体代码只有一行代码。可以省略大括号不写，同时要省略分号！
 4. 如果Lambda表达式的方法体代码只有一行代码。可以省略大括号不写。此时，如果这行
    代码是return语句，必须省略return不写，同时也必须省略 ";" 不写。

 */

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Comparator;

public class LambdaDemo3 {
    public static void main(String[] args) {
        Integer[] ages1 = {34,12,42,23};

        /**
         参数一: 被排序的数组 必须是引用类型的元素
         参数二: 匿名内部类对象，代表了一个比较器对象

         Integer o1, Integer o2 代表了数组中的元素两两一组传进来进行比较
         若 o1 - o2 则升序排列
         若 o2 - o1 则降序排列
         */
//        Arrays.sort(ages1, new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o2 - o1; //  降序
//            }
//        });

//        Arrays.sort(ages1, (Integer o1, Integer o2) -> {
//                return o2 - o1; //  降序
//        });


//        Arrays.sort(ages1, ( o1,  o2) -> {
//            return o2 - o1; //  降序
//        });

        Arrays.sort(ages1, ( o1,  o2 ) ->  o2 - o1 );

        System.out.println(Arrays.toString(ages1));

        System.out.println("----------------------------");
        JFrame win = new JFrame("登录界面");
        JButton btn = new JButton("我是一个很大的按钮");
//        btn.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.out.println("有人点我，点我，点我！！");
//            }
//        });

//        btn.addActionListener((ActionEvent e) -> {
//                System.out.println("有人点我，点我，点我！！");
//        });

//        btn.addActionListener(( e) -> {
//            System.out.println("有人点我，点我，点我！！");
//        });

//        btn.addActionListener( e -> {
//            System.out.println("有人点我，点我，点我！！");
//        });

        btn.addActionListener( e -> System.out.println("有人点我，点我，点我！！") );


        win.add(btn);
        win.setSize(400,300);
        win.setVisible(true);
    }
}
