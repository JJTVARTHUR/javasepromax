package d6_map_api;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
      Map������˫�м��ϵ����ڽӿڣ����Ĺ�����ȫ��˫�м��϶����Լ̳�ʹ�õ�
      Ŀ�꣺Map���ϵĳ���API(�ص��е��ص�)
        - public V put(K key, V value):  ��ָ���ļ���ָ����ֵ��ӵ�Map�����С�
        - public V remove(Object key): ��ָ���ļ� ����Ӧ�ļ�ֵ��Ԫ�� ��Map������ɾ�������ر�ɾ��Ԫ�ص�ֵ��
        - public void clear(): �Ƴ����еļ�ֵ��Ԫ�ء�
        - public boolean isEmpty(): �жϼ����Ƿ�Ϊ�ա�
        - public int size(): ���ϵĳ��ȣ�Ҳ���Ǽ����м�ֵ�Եĸ�����
        - public V get(Object key): ����ָ���ļ�����Map�����л�ȡ��Ӧ��ֵ��
        - public Set<K> keySet(): ��ȡMap���������еļ����洢��Set�����С�
        - public Set<Map.Entry<K,V>> entrySet(): ��ȡ��Map���������еļ�ֵ�Զ���ļ���(Set����)��
        - public boolean containKey(Object key):�жϸü������Ƿ��д˼���
        - public boolean containValue(Object value):�жϸü������Ƿ��д�ֵ��
 */
public class MapDemo {
    public static void main(String[] args) {
        // 1. ���Ԫ�أ����� ���ظ� ������
        Map<String,Integer> maps = new HashMap<>();
        maps.put("iphoneX",10);
        maps.put("����",20);
        maps.put("iphoneX",100); // Map���Ϻ����ظ��ļ���Ӧ��Ԫ�ػḲ��ǰ���ظ�������Ԫ�أ�
        maps.put("huawei",100);
        maps.put("������Ʒ",10);
        maps.put("�ֱ�",10);
        // {huawei=100, �ֱ�=10, ������Ʒ=10, iphoneX=100, ����=20}
        System.out.println(maps);

        // 2. ��ռ���
        // maps.clear();
        // System.out.println(maps);

        // 3. �жϼ����Ƿ�Ϊ�գ�Ϊ�շ���true����֮����false��
        System.out.println(maps.isEmpty());

        // 4. ���ݼ���ȡ��Ӧֵ: public V get(Object key)
        Integer key = maps.get("huawei");
        System.out.println(key); // 100
        System.out.println(maps.get("������Ʒ")); // 10
        System.out.println(maps.get("������Ʒ2")); // null

        // 5. ���ݼ�ɾ������Ԫ�� (ɾ�����᷵�ؼ���ֵ)
        System.out.println(maps.remove("iphoneX")); // 100
        System.out.println(maps);

        // 6. �ж��Ƿ����ĳ��������������true����֮����false
        System.out.println(maps.containsKey("����")); // true
        System.out.println(maps.containsKey("����2")); // false
        System.out.println(maps.containsKey("iphoneX")); // false

        // 7. �ж��Ƿ����ĳ��ֵ
        System.out.println(maps.containsValue(100)); // true
        System.out.println(maps.containsValue(10)); // true
        System.out.println(maps.containsValue(22)); // false

        // {huawei=100, �ֱ�=10, ������Ʒ=10, ����=20}
        // 8. ��ȡȫ�����ļ��ϣ�public Set<K> keySet()
        Set<String> keys = maps.keySet();
        System.out.println(keys);

        System.out.println("----------------------------");
        // 9. ��ȡȫ��ֵ�ļ��ϣ�Collection<V> values()
        Collection<Integer> values = maps.values();
        System.out.println(values);

        // 10. ���ϵĴ�С
        System.out.println(maps.size()); // 4

        // 11. �ϲ�����Map����
        Map<String,Integer> map1 = new HashMap<>();
        map1.put("java1",1);
        map1.put("java2",100);
        Map<String,Integer> map2 = new HashMap<>();
        map2.put("java2",1);
        map2.put("java3",100);
        map1.putAll(map2); // �Ѽ���map2��Ԫ�ؿ���һ�ݵ�map1��ȥ
        System.out.println(map1);
        System.out.println(map2);
    }
}
