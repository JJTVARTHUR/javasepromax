package d1_collection_set;

/**
        HashSet�ײ�ԭ��:
        1. HashSet�ײ�ԭ���ȡ��ϣ��洢������
        2. ��ϣ����һ�ֶ�����ɾ�Ĳ��������ܶ��ϺõĽṹ

        ��ϣ������:
        1. JDK8֮ǰ�ģ��ײ�ʹ�� ���� + ���� ���
        2. JDK8��ʼ�󣬵ײ���� ���� + ���� + ����� ���

        ��ϣֵ:
        1. ��JDK���ݶ���ĵ�ַ������ĳ�ֹ����������int���͵���ֵ

        Object���API:
        1. public int hashCode(): ���ض���Ĺ�ϣֵ

        ����Ĺ�ϣֵ�ص�:
        1. ͬһ�������ε���hashCode()�������صĹ�ϣֵ����ͬ��
        2. Ĭ������£���ͬ����Ĺ�ϣֵ�ǲ�ͬ��
 */

public class SetDemo2 {
    public static void main(String[] args) {
        // ѧ���ȡ����Ĺ�ϣֵ
        String name = "itheima";
        System.out.println(name.hashCode());
        System.out.println(name.hashCode());

        String name1 = "itheima";
        System.out.println(name.hashCode());
        System.out.println(name1.hashCode());
    }
}
