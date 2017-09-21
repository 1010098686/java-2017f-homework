public class HuluwaBrothers
{
    Huluwa []brothers;
    void Initialize() //��ʼ��
    {
        brothers = new Huluwa[7];
        int i;
        for(i = 0; i < 7; i++)
        {
            Huluwa newbrother = new Huluwa(i+1);
            brothers[i] = newbrother;
            //brothers[i].Initialize(i+1); ����д��!! brothers[i]��ʱΪNULL!
        }
    }
    public void LineUpRandomly() //����վ��
    {
        int [] array = new int []{0,1,2,3,4,5,6};
        int i, rand;
        for(i = 6; i >= 0; i--)
        {
            java.util.Random random=new java.util.Random();// ���������
            rand = random.nextInt(i+1);// ����[0,7)�����е�������ע�ⲻ����10
            if(rand != i)
            {
                int temp = array[i];
                array[i] = array[rand];
                array[rand] = temp;
            }
        }
        Huluwa []brothersCopy = new Huluwa[7];
        for(i = 0; i < 7; i++)
        {
            //System.out.print(array[i] + " ");
            brothersCopy[i] = brothers[array[i]];
        }
        brothers = brothersCopy;
    }
    public void GiveNumbers() //����
    {
        int i;
        for(i = 0; i < 7; i++)
            brothers[i].giveNumber(); //ÿ����«�����α���
        System.out.println();
    }
    public void GiveColors() //����ɫ
    {
        int i;
        for(i = 0; i < 7; i++)
            brothers[i].giveColor(); //ÿ����«�����α���ɫ
        System.out.println();
    }
    public void BubbleSort() //ð������
    {
        int i, j;
        for(i = 0; i < 7 - 1; i++)
        {
            for(j = 0; j < 7 - 1 - i; j++)
            {
                if(brothers[j].index > brothers[j+1].index)
                {
                    brothers[j].Move(j, j+1);//���潻��λ��
                    brothers[j+1].Move(j+1, j);//���潻��λ��
                    Huluwa temp = brothers[j];
                    brothers[j] = brothers[j+1];
                    brothers[j+1] = temp;
                }
            }
        }
    }
    private int Partition(int low, int high)
    {
        int pivotpos = low;
        Huluwa pivot = brothers[low];
        int i;
        for(i = low + 1; i <= high; i++)
        {
            if(brothers[i].index < pivot.index)
            {
                pivotpos++;
                if(pivotpos != i)
                {
                    brothers[i].Move(i, pivotpos); //���潻��λ��
                    brothers[pivotpos].Move(pivotpos, i); //���潻��λ��
                    Huluwa temp = brothers[i];
                    brothers[i] = brothers[pivotpos];
                    brothers[pivotpos] = temp;
                }
            }
        }
        if(pivotpos != low)
        {
            brothers[pivotpos].Move(pivotpos, low); //���潻��λ��
            pivot.Move(low, pivotpos); //���潻��λ��
            brothers[low] = brothers[pivotpos];
            brothers[pivotpos] = pivot;
        }
        return pivotpos;
    }
    public void QuickSort(int left, int right) //��������
    {
        if(left < right)
        {
            int pivotpos = Partition(left, right);
            QuickSort(left, pivotpos - 1);
            QuickSort(pivotpos+1, right);
        }
    }
}
