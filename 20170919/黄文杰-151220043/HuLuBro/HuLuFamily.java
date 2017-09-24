package HuLuBro;

public class HuLuFamily{
	final int HULUCOUNT=7;
	int []HuLuBro;
	public HuLuFamily(){
		HuLuBro=new int[HULUCOUNT];
		for(int i=1;i<=HULUCOUNT;i++)
			HuLuBro[i-1]=i;
	}
	public void exchange(int x,int y,boolean show){
		int temp=HuLuBro[x];
		HuLuBro[x]=HuLuBro[y];
		HuLuBro[y]=temp;
		if(show==true){
			System.out.println(getName(getHuLu(y))+":"+String.valueOf(x)+"->"+String.valueOf(y));
			System.out.println(getName(getHuLu(x))+":"+String.valueOf(y)+"->"+String.valueOf(x));
		}		
	}
	public int getHuLu(int x){
		return HuLuBro[x];
	}
	public int getCount(){
		return HULUCOUNT;
	}
	public String getName(int x){
		String s="";
		switch(x){
		case 1:s= "�ϴ�";break;
		case 2:s= "�϶�";break;
		case 3:s= "����";break;
		case 4:s= "����";break;
		case 5:s= "����";break;
		case 6:s= "����";break;
		case 7:s= "����";break;
		}
		return s;
	}
	public String getColor(int x){
		String s="";
		switch(x){
		case 1:s= "��ɫ";break;
		case 2:s= "��ɫ";break;
		case 3:s= "��ɫ";break;
		case 4:s= "��ɫ";break;
		case 5:s= "��ɫ";break;
		case 6:s= "��ɫ";break;
		case 7:s= "��ɫ";break;
		}
		return s;
	}
	

}
