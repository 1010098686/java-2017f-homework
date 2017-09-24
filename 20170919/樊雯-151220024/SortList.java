package work2_huluwa;

import java.util.*;

class Huluwa{
	 private int order;
	 private int trueorder;
	 
	 public String creatname(int num){
		 String name;
		 switch(num){
	    	case(1):
	    		name="�ϴ�";
	    		break;
	    	case(2):
	    		name="�϶�";
				break;
	    	case(3):
	    		name="����";
	    		break;
	    	case(4):
				name="����";
	    		break;
	    	case(5):
				name="����";
	    		break;
	    	case(6):
	    		name="����";
	    		break;
	    	default:
				name="����";
	    		break;
	    	}
		 return name;
	 }
	 public String creatcolor(int num){
		 String color;
		 switch(num){
	    	case(1):
	    		color="��ɫ";
	    		break;
	    	case(2):
	    		color="��ɫ";
				break;
	    	case(3):
	    		color="��ɫ";
	    		break;
	    	case(4):
	    		color="��ɫ";
	    		break;
	    	case(5):
	    		color="��ɫ";
	    		break;
	    	case(6):
	    		color="��ɫ";
	    		break;
	    	default:
	    		color="��ɫ";
	    		break;
	    	}
		 return color;
	 }
	 public Huluwa() {}
	    public Huluwa(int num) {
	    	this.trueorder = num;
	        this.order = num;
	    }
	    public void settrue(int num){
	        this.trueorder = num;
	    }
	    public void setorder(int num){
	        this.order = num;
	    }
	   
	    public int getorder() {
	        return this.order+1;
	    }
	    public int gettrue() {
	        return this.trueorder;
	    }
}

public class SortList {
	public static void main(String [] args){
		Huluwa[] Hululist = new Huluwa[7];
		for(int i = 0;i < 7;i++){ 
		Hululist[i] = new Huluwa(i);
		}//ʵ����
		
		//�������1
		shuffle(Hululist);
		//printname(Hululist);
		
		//ð������
		bubblesort(Hululist);
		//������
		printname(Hululist);
		
		
		//�������2
		shuffle(Hululist);
		//printname(Hululist);
		
		//��������
		quicksort(Hululist,0,Hululist.length-1);
		//����ɫ
		printcolor(Hululist);
	} 
	public static void printname(Huluwa[] Hululist){
		for(int i = 0;i < 7;i++){ 
			System.out.print(Hululist[i].creatname(Hululist[i].gettrue())+" ");
		}
		System.out.print("\n");
	}
	public static void printcolor(Huluwa[] Hululist){
		for(int i = 0;i < 7;i++){ 
			System.out.print(Hululist[i].creatcolor(Hululist[i].gettrue())+" ");
		}
		System.out.print("\n");
	}

	public static void shuffle(Huluwa[] Hululist){    
		int[] x = {1,2,3,4,5,6,7};    
		List<Integer> list = new ArrayList<Integer> ();    
		for(int i = 0;i < x.length;i++){ 
			//System.out.print(x[i]+", ");
			list.add(x[i]);    
		} 
		 System.out.println();
		 Collections.shuffle(list);   
		 for(int i = 0;i < 7;i++){ 
			 Hululist[i].settrue(list.get(i));
			 Hululist[i].setorder(i);
		} 
	}
	public static void bubblesort(Huluwa[] Hululist){
		for( int i = 0 ; i < 6;i++)
			for(int j = i+1; j <7;j++){
				if(Hululist[i].gettrue()>Hululist[j].gettrue()){
					System.out.print(Hululist[i].creatname(Hululist[i].gettrue())+": ");
					System.out.print(Hululist[i].getorder()+"->"+(j+1)+" ");
					System.out.print(Hululist[j].creatname(Hululist[j].gettrue())+": ");
					System.out.print((j+1)+"->"+Hululist[i].getorder()+"\n");
					int temp = Hululist[i].gettrue();
					Hululist[i].settrue(Hululist[j].gettrue());
					Hululist[j].settrue(temp);
				}
			}				
	}
    public static int divide(Huluwa[] H, int start, int end){
		//�����ұ�Ϊ��׼ֵ
		int base = H[end].gettrue();
		while(start < end){
			while(start < end && H[start].gettrue() <= base)
				//����߿�ʼ����
				start++;
			
			if(start < end){
				//����
				System.out.print(H[start].creatname(H[start].gettrue())+": ");
				System.out.print(H[start].getorder()+"->"+H[end].getorder()+" ");
				System.out.print(H[end].creatname(H[end].gettrue())+": ");
				System.out.print(H[end].getorder()+"->"+H[start].getorder()+"\n");
				int temp = H[start].gettrue();
				H[start].settrue(H[end].gettrue());
				H[end].settrue(temp);
				end--;
			}	
			while(start < end && H[end].gettrue() >= base)
				//���ұ߿�ʼ����
				end--;
			if(start < end){
				//����
				System.out.print(H[start].creatname(H[start].gettrue())+": ");
				System.out.print(H[start].getorder()+"->"+H[end].getorder()+" ");
				System.out.print(H[end].creatname(H[end].gettrue())+": ");
				System.out.print(H[end].getorder()+"->"+H[start].getorder()+"\n");
				int temp = H[start].gettrue();
				H[start].settrue(H[end].gettrue());
				H[end].settrue(temp);
				
				start++;
			}	
			
		}
		//��׼ֵ���ڵ�λ��
		return end;
	}
	public static void quicksort(Huluwa [] Hululist, int start, int end){
		if(start > end){
			//һ��Ԫ��
			return;
		} 
		else{
			//�ݹ�
			int partition = divide(Hululist, start, end);
			quicksort(Hululist, start, partition-1);
			quicksort(Hululist, partition+1, end);
		}
			
	}
	
}
