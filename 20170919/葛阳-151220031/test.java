//package pack;
enum Color{
	red("��ɫ"),orange("��ɫ"),yellow("��ɫ"),green("��ɫ"),ching("��ɫ"),blue("��ɫ"),purple("��ɫ");	
	String name;     
    private Color(String name) {  
         this.name = name;        
     }  
}

enum Rank{	
	one("�ϴ�"),two("�϶�"),three("����"),four("����"),five("����"),six("����"),seven("����");
	String name;
	private Rank(String name)
	{
		this.name=name;
	}
}

class Hulu{
	Rank num;
	Color col;	
	Hulu(Rank n,Color c)
	{
		num=n;
		col=c;
	}
	//��֪�ƶ�
	void TellMove(int a,int b) {
		System.out.println(num.name+": "+a+"->"+b);
	}
	//�����
	void TellNum()
	{
		System.out.print(num.name+" ");
	}
	//����ɫ
	void TellCol()
	{
		System.out.print(col.name+" ");
	}

}


class brothers{
	
	Hulu[] bro=new Hulu[7];//�߸���«��
	void initialize() {
		bro[0]=new Hulu(Rank.seven,Color.purple);		
		bro[1]=new Hulu(Rank.three,Color.yellow);
		bro[2]=new Hulu(Rank.five,Color.ching);
		bro[3]=new Hulu(Rank.one,Color.red);
		bro[4]=new Hulu(Rank.six,Color.blue);
		bro[5]=new Hulu(Rank.four,Color.green);
		bro[6]=new Hulu(Rank.two,Color.orange);
		
	}//����վ��
	
	//�����н���ð������
	void SortByNum() {
		for(int i=0; i< 7; i++) {
			int min=i;
			for (int j=i+1;j<7;j++)
			{
				if(bro[j].num.ordinal()<bro[min].num.ordinal())
					min=j;					
			}
			if (min!=i)
			{
				bro[i].TellMove(i, min);
				bro[min].TellMove(min, i);
				Hulu t=bro[i];
				bro[i]=bro[min];
				bro[min]=t;
				
				
			}
			}
	}
	
	//��������
	int partition(int low,int high)
	{
		
		Hulu pivot=bro[low];
		while(low<high)
		{
			
			while (low<high&&bro[high].col.ordinal()>=pivot.col.ordinal()) high--;
			if(low<high)
			{
				bro[high].TellMove(high,low);
				bro[low].TellMove(low,high);				
				bro[low]=bro[high];
				bro[high]=pivot;
			}
			while (low<high&&bro[low].col.ordinal()<=pivot.col.ordinal()) low++;
			if (low<high)
			{
				bro[high].TellMove(high,low);
				bro[low].TellMove(low,high);
				bro[high]=bro[low];
				bro[low]=pivot;
			}
		}		
		return low;
	}
	void QuickSort(int low,int high)
	{
		if(low<high)
		{
			int pivot=partition(low,high);
			QuickSort(low,pivot-1);
			QuickSort(pivot+1,high);
		}
		return ;
	}
	void SortByCol() {
		QuickSort(0,6);
	}//����ɫ��������
	
	//��ǰ��������
	void Number() {
		for (int i=0;i<7;i++)
		{
			bro[i].TellNum();
		}
		System.out.println();
	}
	//��ǰ������ɫ
	void Color() {
		for (int i=0;i<7;i++)
			bro[i].TellCol();
		System.out.println();
		
	}
	
}
public class test {
	public static void main(String[] args) {
	brothers SevenHulu=new brothers();
	SevenHulu.initialize();
	SevenHulu.SortByNum();
	SevenHulu.Number();
	SevenHulu.initialize();
	SevenHulu.SortByCol();
	SevenHulu.Color();
	
		
	
	}
}
