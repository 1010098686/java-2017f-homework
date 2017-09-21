enum Color
{
    RED("�ϴ�","��ɫ",1), ORANGE("�϶�", "��ɫ",2), YELLOW("����", "��ɫ",3), GREEN("����","��ɫ",4),
    CYAN("����","��ɫ",5), BLUE("����", "��ɫ", 6), PURPLE("����", "��ɫ", 7);
    private String NoName; //��X
    private String ColorName; //��ɫ
    private int index; //���
    private Color(String NoName, String ColorName, int index) //���캯��
    {
        this.NoName = NoName;
        this.ColorName = ColorName;
        this.index = index;
    }
    public  String getNoName()
    {
        return NoName;
    }
    public String getColorName()
    {
        return  ColorName;
    }
}
public class Huluwa
{
    Color color;
    int index;
    Huluwa(int index)
    {
        this.index = index;
        switch (index)
        {
            case 1: color = Color.RED; break;
            case 2: color = Color.ORANGE; break;
            case 3: color = Color.YELLOW; break;
            case 4: color = Color.GREEN; break;
            case 5: color = Color.CYAN; break;
            case 6: color = Color.BLUE; break;
            case 7: color = Color.PURPLE; break;
        }
    }
    public void giveNumber() //����
    {
        System.out.print(color.getNoName() + " ");
    }
    public void giveColor() //������
    {
        System.out.print(color.getColorName() + " ");
    }
    public void Move(int a, int b) //���潻��λ��
    {
        a++; b++;
        System.out.println(color.getNoName() + ":" + a + "->"+ b);
    }
}