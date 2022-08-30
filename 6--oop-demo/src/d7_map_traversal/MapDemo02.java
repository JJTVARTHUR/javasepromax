package d7_map_traversal;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
      Map���ϵı�����ʽ�У�3��
      ��ʽһ: ����ֵ�ķ�ʽ�������Ȼ�ȡMap����ȫ���ļ����ٸ��ݱ�������ֵ
      ��ʽ��: ��ֵ�Եķ�ʽ�������� "��ֵ��" ����һ�����壬�Ѷȴ�
      ��ʽ��: JDK1.8��ʼ֮����¼�����Lambda���ʽ

      Map���ϵı�����ʽ��: ��ֵ��
      1. �Ȱ�Map����ת����Set���ϣ�Set������ÿ��Ԫ�ض��Ǽ�ֵ��ʵ��������
      2. ����Set���ϣ�Ȼ����ȡ���Լ���ȡֵ

      ��ֵ���漰����API:
        - public Set<Map.Entry<K,V>> entrySet(): ��ȡ���м�ֵ�Զ���ļ���
        - public K getKey(): ��ü�
        - public V getValue(): ��ȡֵ
 */
public class MapDemo02 {
    public static void main(String[] args) {
        Map<String,Integer> maps = new HashMap<>();
        // 1. ���Ԫ��: ���� ���ظ� ������
        // 1.���Ԫ��: ���򣬲��ظ�����������
        maps.put("����",30);
        maps.put("iphoneX",100);
        maps.put("huawei",1000);
        maps.put("������Ʒ",10);
        maps.put("�ֱ�",10);
        System.out.println(maps);
        // maps = {huawei=1000, �ֱ�=10, ������Ʒ=10, iphoneX=100, ����=30}
        /**
             maps = {huawei=1000, �ֱ�=10, ������Ʒ=10, iphoneX=100, ����=30}
                  ?
             ʹ��foreach����map����.����Map���ϵļ�ֵ��Ԫ��ֱ����û�����͵ġ����Բ�����ֱ��foreach�������ϡ�
                  ?
             ����ͨ������Map�ķ��� entrySet��Map����ת����Set������ʽ  maps.entrySet();
                  ?
             Set<Map.Entry<String,Integer>> entries =  maps.entrySet();
             [(huawei=1000), (�ֱ�=10), (������Ʒ=10), (iphoneX=100), (����=30)]
                  ?
             ��ʱ����ʹ��foreach����
         */
        // 1����Map����ת����Set����
        Set<Map.Entry<String,Integer>> entries= maps.entrySet();
        // 2����ʼ����
        for (Map.Entry<String,Integer> entry: entries) {
            String key = entry.getKey();
            int value = entry.getValue();
            System.out.println(key + "-->" + value);
        }

    }
}
