package d1_collection_set;

import java.util.HashSet;
import java.util.Set;

/**
      ����ϣ��Set������Ϊ����������ͬ�Ķ������ظ��ģ�Ӧ����д�����hashCode��equals����

      Ŀ�꣺��Set���ϰ��ظ����ݵĶ���ȥ��һ����ȥ�ظ���
 */
public class SetDemo3 {
    public static void main(String[] args) {
        // Set����ȥ�ظ�ԭ�����жϹ�ϣֵ������Ĵ洢λ���Ƿ���ͬ ���ж�equals
        Set<Student> sets = new HashSet<>();

        Student s1 = new Student("���", 20, '��');
        Student s2 = new Student("���", 20, '��');
        Student s3 = new Student("����", 21, '��');
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());

        sets.add(s1);
        sets.add(s2);
        sets.add(s3);

        System.out.println(sets);
    }
}
