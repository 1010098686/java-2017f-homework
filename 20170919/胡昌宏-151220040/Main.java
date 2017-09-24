
public class Main {
	 public static void main(String args[]){
	        HuLuWa []HuLuBros = new HuLuWa[7];
	        HuLuBros[0] = new HuLuWa(1, "�ϴ�",  "��");
	        HuLuBros[1] = new HuLuWa(2, "�϶�",  "��");
	        HuLuBros[2] = new HuLuWa(3, "����",  "��");
	        HuLuBros[3] = new HuLuWa(4, "����",  "��");
	        HuLuBros[4] = new HuLuWa(5, "����",  "��");
	        HuLuBros[5] = new HuLuWa(6, "����",  "��");
	        HuLuBros[6] = new HuLuWa(7, "����",  "��");
	        
	        
	        HuLuWa [] RandPos = new HuLuWa[7];
	        boolean []is_empty = new boolean[7];
	        
	        /*--------------�����Ŷ�------------------*/
	        Initial_empty(is_empty, 7);
	        Random_Queue(HuLuBros, RandPos, is_empty);
	        
	        /*---------------ð������-----------------*/
	        System.out.println("�����Ŷӣ�");
	         for(int i = 0; i < 7; i++)
	            RandPos[i].out_name();
	         System.out.println("\n");
	         System.out.println("ð��������̣�");
	         BubbleSort(RandPos);
	         System.out.println();
	         System.out.println("ð����������");
	          for(int i = 0; i < 7; i++)
	             RandPos[i].out_name();
	           System.out.println("\n");
	        
	        /*-------------�ٴ������Ŷ�--------------*/
	        Initial_empty(is_empty, 7);
	        Random_Queue(HuLuBros, RandPos, is_empty);
	        
	        /*--------------��������----------------*/
	        System.out.println("�ٴ������Ŷӣ�");
	         for(int i = 0; i < 7; i++)
	            RandPos[i].out_color();
	         System.out.println("\n");
	         System.out.println("����������̣�");
	         QSort(RandPos, 0, 6);
	         System.out.println();
	         System.out.println("������������");
	          for(int i = 0; i < 7; i++)
	             RandPos[i].out_color();
	    }
	 	
	 	public static void Random_Queue(HuLuWa [] HuLuBros, HuLuWa []RandPos, boolean []is_empty) {
	 		 int rand;
		        for(int i = 0; i < 7; i++){
		             rand = (int)(1+Math.random()*(7-1+1));
		             while(is_empty[rand-1] == false)
		                  rand = (int)(1+Math.random()*(7-1+1));
		             RandPos[rand-1] = HuLuBros[i];
		             is_empty[rand-1] = false;
		        }
	 	}
	 	
	 	public static void Initial_empty(boolean []is_empty, int n) {
	 		for(int i = 0; i < n; i++)
	 			is_empty[i] = true;
	 	}
	 	
	    public static void BubbleSort(HuLuWa []Array){
	        for(int i = 0; i < 6; i++)
	            for(int j = 0; j < 6 - i; j ++){
	                if(Array[j].rank > Array[j+1].rank){
	                    int k = j + 1;
	                    System.out.println(Array[j].name + ": " + j + "-->" + k);
	                    System.out.println(Array[j+1].name + ": " + k+ "-->" + j);
	                    HuLuWa temp = Array[j];
	                    Array[j] = Array[j+1];
	                    Array[j+1] = temp;
	                }
	            }
	    }
	    
	    public static void QSort(HuLuWa[]a, int start, int n){
	       if (start < n){
	           int point = Partition(a, start, n);
	           QSort(a, start, point - 1);
	           QSort(a, point + 1, n);
	        }
	    }
	    
	    public static int Partition(HuLuWa []a, int start, int n){
	        HuLuWa index = a[start];
	        int first = start;
	        int last = n;
	        int index_loc = start;
	        while(last > first){
	            while (a[last].rank > index.rank)
	                --last;
	            if(index_loc != last){
	                System.out.println(a[last].name + '(' + a[last].color + ')' + ": " + last + "-->" + index_loc);
	                System.out.println(index.name+ '(' + index.color + ')' +": " + index_loc + "-->" + last);
	            }
	            a[index_loc] = a[last];
	            a[last] = index;
	            index_loc = last;
	            
	            if(first < last){
	                ++first;
	                while (first < last && a[first].rank < index.rank)
	                    ++first;
	            }
	            if(index_loc != first){
	                System.out.println(a[first].name + '(' + a[first].color + ')' +": " + first + "-->" + index_loc);
	                System.out.println(index.name+ '(' + index.color + ')' + ": " + index_loc + "-->" + first);
	            }
	            a[index_loc] = a[first];
	            a[first] = index;
	            index_loc = first;
	        }
	        return index_loc;
	    }
}
