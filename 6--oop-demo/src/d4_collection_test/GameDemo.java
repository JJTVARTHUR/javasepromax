package d4_collection_test;

import java.util.*;

/**
     Ŀ�꣺��������Ϸ�İ���������

     ҵ���������:
          ������������, ϴ��, ����, ������չ֪ʶ��, ���ơ�
          ҵ��: �ܹ���54���ơ�
          ����: "3","4","5","6","7","8","9","10","J","Q","K","A","2"
          ��ɫ: "?", "?", "?", "?"
          ��С��: "?" , "?"
          �����ֱ�Ҫ���4�ֻ�ɫ����С����һ�š�
          ������������51���ƣ�ʣ��3����Ϊ���ơ�

     ���ܣ�
          1.���ơ�
          2.ϴ�ơ�
          3.����3�����
          4.���ơ�
          5.������չ���˽⣬��ҵ��
          6.����
 */
public class GameDemo {
    /**
     1������һ����̬�ļ��ϴ洢54���ƶ���
     */
    public static List<Card> allCards = new ArrayList<>();

    /**
     2�����ƣ����徲̬������ʼ��������
     */
    static{
        // 3���������������ȷ��������ȷ����ʹ������
        String[] sizes = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
        // 4�����廨ɫ������ȷ��������ȷ����ʹ������
        String[] colors = {"?", "?", "?", "?"};
        // 5����ϵ����ͻ�ɫ
        int index = 0; // ��¼�ƵĴ�С
        for (String size: sizes) {
            index++;
            for (String color: colors) {
                // 6. ��װ��һ������
                Card c = new Card(size,color,index);
                // 7. ���뵽����������ȥ
                allCards.add(c);
            }
        }
        // 8 ��С�����뵽���϶�����ȥ "?" , "?"
        Card c1 = new Card("" ,  "?", ++index);
        Card c2 = new Card("" ,  "?",++index);
        Collections.addAll(allCards,c1,c2);
        System.out.println("���ƣ�" + allCards);
    }

    public static void main(String[] args) {
        // 9. ϴ��
        Collections.shuffle(allCards);
        System.out.println("ϴ�ƺ�" + allCards);

        // 10. ����(����������ң�ÿ����ҵ���Ҳ��һ����������)
        List<Card> linhuchong = new ArrayList<>();
        List<Card> jiumozhi = new ArrayList<>();
        List<Card> renyingying = new ArrayList<>();

        // 11����ʼ���ƣ����Ƽ����з���51���Ƹ�������ң�ʣ��3����Ϊ���ƣ�
        // allCards = [?, A?, 5?, 2?, 2?, Q?, ?, Q? ...
        //    i        0  1   2   3   4   5    6  7      %  3
        for (int i = 0; i < allCards.size() - 3; i++) {
            // ���õ���ǰ�ƶ���
            Card c = allCards.get(i);
            if(i % 3 == 0){
                // �밢�����
                linhuchong.add(c);
            }else if(i % 3 == 1){
                // �밢����
                jiumozhi.add(c);
            }else if(i % 3 == 2){
                // ��ӯӯ����
                renyingying.add(c);
            }
        }

        // 12. �õ�������ŵ���(����������ƽ�ȡ��һ���Ӽ���)
        List<Card> lastThreeCards = allCards.subList(allCards.size() - 3, allCards.size() );

        // 13. ����ҵ�������(�Ӵ�С �����Լ���������ôʵ��)
        sortCards(linhuchong);
        sortCards(jiumozhi);
        sortCards(renyingying);

        // 14. �����ҵ���
        System.out.println("���壺" + linhuchong);
        System.out.println("��汎" + jiumozhi);
        System.out.println("ӯӯ��" + renyingying);
        System.out.println("���ŵ��ƣ�" + lastThreeCards);
    }

    // �������򣬼򻯳�Lambda���ʽ
    private static void sortCards(List<Card> card){
        Collections.sort(card,(o1 , o2) -> (o1.getIndex() - o2.getIndex()));
    }
}
