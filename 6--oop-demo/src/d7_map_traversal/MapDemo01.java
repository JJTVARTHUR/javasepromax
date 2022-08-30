package d7_map_traversal;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
       Map���ϵı�����ʽ�У�3��
       ��ʽһ: ����ֵ�ķ�ʽ�������Ȼ�ȡMap����ȫ���ļ����ٸ��ݱ�������ֵ
       ��ʽ��: ��ֵ�Եķ�ʽ�������� "��ֵ��" ����һ�����壬�Ѷȴ�
       ��ʽ��: JDK1.8��ʼ֮����¼�����Lambda���ʽ

       Map���ϵı�����ʽһ: ����ֵ
       1. �Ȼ�ȡMap���ϵ�ȫ������Set����
       2. ��������Set���ϣ�Ȼ��ͨ������ȡ��Ӧֵ

       ����ֵ�漰����API:
         - public Set<K> keySet(): ��ȡMap���������еļ����洢��Set������
         - public V get(Object key): ����ָ���ļ�����Map�����л�ȡ��Ӧ��ֵ
 */
public class MapDemo01 {
    public static void main(String[] args) {
        Map<String,Integer> maps = new HashMap<>();
        // 1. ���Ԫ��: ���� ���ظ� ������
        maps.put("����",30);
        maps.put("iphoneX",100);
        maps.put("huawei",1000);
        maps.put("������Ʒ",10);
        maps.put("�ֱ�",10);
        System.out.println(maps);
        // maps = {huawei=1000, �ֱ�=10, ������Ʒ=10, iphoneX=100, ����=30}

        // 1������ֵ����һ�������õ����ϵ�ȫ������
        Set<String> keys = maps.keySet();
        // 2���ڶ���������ÿ���������ݼ���ȡֵ
        for (String key: keys) {
            int value = maps.get(key);
            System.out.println(key + "-->" + value);
        }
    }
}
