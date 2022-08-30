package d5_map;

import java.util.*;

/**
      Map���ϸ�����ʹ��:
      1. Map������һ��˫�м��ϣ�ÿ��Ԫ�ذ�����������
      2. Map���ϵ�ÿ��Ԫ�صĸ�ʽ��key=value(��ֵ��Ԫ��)
      3. Map����Ҳ����Ϊ"��ֵ�Լ���"

      Map���������ʽ:
      1. Collection���ϵĸ�ʽ��[Ԫ��1,Ԫ��2,Ԫ��3...]
      2. Map���ϵ�������ʽ��{key1=value1,key2=value2,key3=value3,...}

      Map������ϵ:
                             Map
               /              |               \
          HashMap         HashTable           ...
           /                  |                 \
       LinkedHashMap      properties           TreeMap

      ˵��: ʹ������Map������HashMap

      Map������ϵ�ص�:
      1. Map���ϵ��ص㶼���ɼ�������
      2. Map���ϵļ��� ���򣬲��ظ�����������ֵ����Ҫ��(�����ظ�)
      3. Map���Ϻ����ظ��ļ���Ӧ��ֵ�Ḳ��ǰ���ظ�����ֵ
      4. Map���ϵļ�ֵ�Զ�����Ϊnull

      Map����ʵ�����ص�:
      1. HashMap: Ԫ�ذ��ռ��� ���򣬲��ظ�����������ֵ����Ҫ��(��Map��ϵһ��)
      2. LinkedHashMap: Ԫ�ذ��ռ��� ���򣬲��ظ�����������ֵ����Ҫ��
      3. TreeMap: Ԫ�ذ��ռ��� ���򣬲��ظ�����������ֵ����Ҫ��
 */
public class MapDemo1 {
    /**
     Ŀ�꣺��ʶMap��ϵ���ص㣺���ռ����򣬲��ظ�����������ֵ����Ҫ��
     */
    public static void main(String[] args) {
        // 1. ����һ��Map���϶���
        // Map<String,Integer> maps = new HashMap<>(); // һ�о������
        Map<String,Integer> maps = new LinkedHashMap<>();
        maps.put("���Ƕ���", 3);
        maps.put("Java", 1);
        maps.put("���", 100);
        maps.put("Java", 100); // ����ǰ�������
        maps.put(null, null);
        System.out.println(maps);
    }
}
