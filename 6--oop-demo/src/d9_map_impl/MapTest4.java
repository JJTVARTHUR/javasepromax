package d9_map_impl;

import java.util.*;

/**
 ����ͳ��ͶƱ����
 */

public class MapTest4 {
    public static void main(String[] args) {
        // 1��Ҫ������¼ÿ��ѧ��ѡ��������
        // ʹ��һ��Map���ϴ洢��
        Map<String, List<String>> data = new HashMap<>();

        // 2����ѧ��ѡ������ݴ����ȥ��
        List<String> selects = new ArrayList<>();
        Collections.addAll(selects, "A", "C");
        data.put("����", selects);

        List<String> selects1 = new ArrayList<>();
        Collections.addAll(selects1, "B", "C" , "D");
        data.put("����", selects1);

        List<String> selects2 = new ArrayList<>();
        Collections.addAll(selects2 , "A",  "B", "C" , "D");
        data.put("����", selects2);

        System.out.println(data);

        // 3��ͳ��ÿ������ѡ���������
        Map<String, Integer> infos = new HashMap<>(); // {}

        // 4����ȡ������ѡ��ľ������Ϣ��
        Collection<List<String>> values = data.values();
        System.out.println(values);
        // values = [[A, B, C, D], [B, C, D], [A, C]]
        //             value

        for (List<String> value : values) {
            for (String s : value) {
                // ��û�а����������
                if(infos.containsKey(s)){
                    infos.put(s, infos.get(s) + 1);
                }else {
                    infos.put(s , 1);
                }
            }
        }

        System.out.println(infos);
    }
}
