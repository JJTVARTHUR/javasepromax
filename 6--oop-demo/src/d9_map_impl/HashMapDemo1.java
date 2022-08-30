package d9_map_impl;

import d1_collection_set.Student;
import java.util.HashMap;
import java.util.Map;

/**
      Map������ϵ:
                          Map
             /             |            \
        HashMap        HashTable        ...
         /                  |               \
      LinkedHashMap    properties        TreeMap

      ˵��:
      1. ʹ������Map������HashMap
      2. �ص�����HashMap��linkedHashMap��TreeMap�������ĺ�����⡣

      HashMap���ص�:
      1. HashMap��Map�����һ��ʵ���ࡣ�ص㶼���ɼ������ģ����� ���ظ� ������
      2. ����hashCode������equals������֤����Ψһ�������Ҫ�洢�����Զ��������Ҫ��дhashCode��equals����
      3. û�ж�����Ҫѧϰ�����з�����ֱ��ʹ��Map����ķ����Ϳ����ˡ����ڹ�ϣ����ɾ�Ĳ�����ܶ��Ϻá�
      4. HashMap��HashSet�ײ�ԭ����һģһ���ģ����ǹ�ϣ��ṹ��ֻ��HashMap��ÿ��Ԫ�ذ�������ֵ����
      ʵ���ϣ�Setϵ�м��ϵĵײ����Mapʵ�ֵģ�ֻ��Set�����е�Ԫ��ֻҪ�����ݣ���Ҫֵ���ݶ���

      public HashSet(){
        map = new HashMap<>();
      }
 */

public class HashMapDemo1 {
    public static void main(String[] args) {
        // Map�����Ǹ��ݼ�ȥ���ظ�Ԫ��
        Map<Student, String> maps = new HashMap<>();

        Student s1 = new Student("���", 20, 'm');
        Student s2 = new Student("���", 20, 'm');
        Student s3 = new Student("����", 21, 'm');

        maps.put(s1, "����");
        maps.put(s2, "�Ϻ�");
        maps.put(s3, "����");

        System.out.println(maps);
    }
}
