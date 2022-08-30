package d9_abstract_template;

/**

 抽象类：模板方法模式
 1.提高了代码的复用性。
 2.模板方法已经定义了通用结构，模板方法不能确定的部分定义成
   抽象方法，交给子类实现，因此，使用者只需要关心自己需要实
   现的功能即可。

 模板方法建议使用 final修饰
 1.模板方法是给子类直接使用的，不是让子类重写的。
 2.一旦子类重写了模板方法，则模板方法就失效了，因此，加上final后可以
   防止子类重写了模板方法，这样更安全，专业。

 */
public class Test {
    public static void main(String[] args) {
        // 理解模板方法模式的思想和使用步骤
        StudentChild s1 = new StudentChild();
        s1.write();

        StudentMiddle s2 = new StudentMiddle();
        s2.write();
    }
}
