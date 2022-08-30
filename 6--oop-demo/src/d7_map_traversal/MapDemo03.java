package d7_map_traversal;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

/**
      Map���ϵı�����ʽ�У�3��
      ��ʽһ: ����ֵ�ķ�ʽ�������Ȼ�ȡMap����ȫ���ļ����ٸ��ݱ�������ֵ
      ��ʽ��: ��ֵ�Եķ�ʽ�������� "��ֵ��" ����һ�����壬�Ѷȴ�
      ��ʽ��: JDK1.8��ʼ֮����¼�����Lambda���ʽ

      Map���ϵı�����ʽ��: Lambda
      1. ������JDK 8��ʼ���¼���Lambda���ʽ���ṩ��һ�ָ��򵥣���ֱ�ӵı������ϵķ�ʽ��

      Map���Lambda������API:
        - default void forEach(BiConsumer<? super K, ? syper V> action): ���Lambda����Map����

      maps = {huawei=1000,�ֱ�=10,������Ʒ=10,iphoneX=100};
      maps.forEach((k,v)){
         System.out.println(k + "--->" + v);
      });
 */
public class MapDemo03 {
    public static void main(String[] args) {
        Map<String , Integer> maps = new HashMap<>();
        // 1.���Ԫ��: ���򣬲��ظ�����������
        maps.put("����",30);
        maps.put("iphoneX",100);//  Map���Ϻ����ظ��ļ���Ӧ��Ԫ�ػḲ��ǰ���ظ�������Ԫ�أ�
        maps.put("huawei",1000);
        maps.put("������Ʒ",10);
        maps.put("�ֱ�",10);
        System.out.println(maps);

        //  maps = {huawei=1000, �ֱ�=10, ������Ʒ=10, iphoneX=100, ����=30}

        // maps.forEach(new BiConsumer<String, Integer>() {
        //     @Override
        //     public void accept(String key, Integer value) {
        //         System.out.println(key + "--->" + value);
        //     }
        // });

        maps.forEach((k,v) ->{
                System.out.println(k + "--->" + v);
        });
    }
}
