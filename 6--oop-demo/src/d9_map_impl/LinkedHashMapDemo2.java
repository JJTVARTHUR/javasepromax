package d9_map_impl;

import java.util.LinkedHashMap;
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

      LinkedHashMap���ϸ������ص�:
      1. �ɼ����������� ���ظ� ������
      2. ���������ָ���Ǳ�֤�洢��ȡ����Ԫ��˳��һ��
      3. ԭ���ײ����ݽṹ��Ȼ�ǹ�ϣ��ֻ��ÿ����ֵ��Ԫ���ֶ���Ķ���һ��˫����Ļ��Ƽ�¼�洢��˳��
 */
public class LinkedHashMapDemo2 {
    public static void main(String[] args) {
        // 1������һ��Map���϶���
        Map<String, Integer> maps = new LinkedHashMap<>();
        maps.put("���Ƕ���", 3);
        maps.put("Java", 1);
        maps.put("���", 100);
        maps.put("Java", 100); // ����ǰ�������
        maps.put(null, null);
        System.out.println(maps);

    }
}
