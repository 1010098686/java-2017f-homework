/**
 * Created by cbcwe on 2017/9/22.
 */

public class Game {

    public static void main(String[] arg) {
        GourdDoll[] gourddoll = new GourdDoll[7];
        MySort my_sort = new MySort();
        for (int i = 0; i <= 6; ++i) {
            GourdDoll temp = new GourdDoll(i);
            gourddoll[i] = temp;
        }

        getRandomArray(gourddoll);
        System.out.println("����վ�ӣ�");
        showRank(gourddoll);
        my_sort.bubbleSort(gourddoll);
        System.out.println("������ð�������");
        showRank(gourddoll);

        getRandomArray(gourddoll);
        System.out.println("\n����վ�ӣ�");
        showColor(gourddoll);
        my_sort.quickSort(gourddoll);
        System.out.println("����ɫ���������");
        showColor(gourddoll);
    }

    private static void showColor(GourdDoll[] gourdDolls) {
        for (int i = 0; i <= 6; ++i)
            gourdDolls[i].speakColor();
        System.out.print('\n');
    }

    private static void showRank(GourdDoll[] gourdDolls) {
        for (int i = 0; i <= 6; ++i)
            gourdDolls[i].speakRank();
        System.out.print('\n');
    }

    private static void getRandomArray(GourdDoll[] gourddoll) {
        // ��˳�����
        for (int i = 0; i <= 6; ++i) {
            int j = (int) (System.currentTimeMillis() % 7);
            GourdDoll temp = gourddoll[i];
            gourddoll[i] = gourddoll[j];
            gourddoll[j] = temp;
        }
    }
}
