/**
 * Created by cbcwe on 2017/9/22.
 */
public class GourdDoll {
    /***
     * ģ��һ����«��
     * name:��«�޵�����
     * value:0������ޣ�1����2�ޣ��Դ�����
     */
    String name;
    int value;

    public GourdDoll(int new_value) {
        value = new_value;
        value %= 7;
        switch (value) {
            case 0:
                name = "����";
                break;
            case 1:
                name = "����";
                break;
            case 2:
                name = "����";
                break;
            case 3:
                name = "����";
                break;
            case 4:
                name = "����";
                break;
            case 5:
                name = "����";
                break;
            case 6:
                name = "����";
                break;
            default:
                name = "˭�ҵĺ���?";
        }
    }

    public void speakColor(){
        System.out.print(name+"! ");
    }

    public void speakRank(){
        switch(value){
            case 0:
                System.out.print("�ϴ� ");
                break;
            case 1:
                System.out.print("�϶� ");
                break;
            case 2:
                System.out.print("���� ");
                break;
            case 3:
                System.out.print("���� ");
                break;
            case 4:
                System.out.print("���� ");
                break;
            case 5:
                System.out.print("���� ");
                break;
            case 6:
                System.out.print("���� ");
                break;
            default:
                System.out.print("үүʲôʱ���ժ�˸���«�� ");

        }
    }
}
