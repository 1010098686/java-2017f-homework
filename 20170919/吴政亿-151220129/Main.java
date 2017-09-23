import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {  	
        HashSet<calabash> calabashes = new HashSet<>();
        calabashes.add(new calabash("�ϴ�", 1, "��"));
        calabashes.add(new calabash("�϶�", 2, "��"));
        calabashes.add(new calabash("����", 3, "��"));
        calabashes.add(new calabash("����", 4, "��"));
        calabashes.add(new calabash("����", 5, "��"));
        calabashes.add(new calabash("����", 6, "��"));
        calabashes.add(new calabash("����", 7, "��"));
        calabash[] calabashes1 = new calabash[7];

        //ʵ�����վ��
        Iterator<calabash> iterator = calabashes.iterator();
        int index = 0;
        while (iterator.hasNext()) {
            calabashes1[index] = iterator.next();
            index++;
        }
    	//��ǰ˳����
    	System.out.println("��ǰ���˳��:");
    	for (int i = 0; i < calabashes1.length; i++) {
            System.out.print(calabashes1[i].rank + " ");
        }
    	System.out.println();
    	//ð������
    	bubbleSort(calabashes1);
    	System.out.println("ð�������:");
        for (int i = 0; i < calabashes1.length; i++) {
            System.out.println(calabashes1[i].rank + " ");
        }
        System.out.println();
        //�ٴ����վ��
        iterator = calabashes.iterator();
        index = 0;
        while (iterator.hasNext()) {
            calabashes1[index] = iterator.next();
            index++;
        }
        //��ǰ˳����
    	System.out.println("��ǰ���˳��:");
    	for (int i = 0; i < calabashes1.length; i++) {
            System.out.print(calabashes1[i].color + " ");
        }
    	System.out.println();
        //��������
    	quickSort(calabashes1,0,calabashes1.length-1);
    	System.out.println("���������:");
        for (int i = 0; i < calabashes1.length; i++) {
            System.out.print(calabashes1[i].color + " ");
        }
        System.out.println();
    }

    //ð������
    public static void bubbleSort(calabash[] calabashes) {
        for (int i = 0; i < calabashes.length; i++) {
            for (int j = 0; j < calabashes.length - 1 - i; j++) {
                if (calabashes[j].index > calabashes[j + 1].index) {
                    swap(calabashes, j, j + 1);
                }
            }
        }
    }

    //����λ�ò�����ƶ���Ϣ
    public static void swap(calabash[] calabashes, int i, int j) {
        System.out.println(calabashes[i].rank + " : " + i + " -> " + j);
        System.out.println(calabashes[j].rank + " : " + j + " -> " + i);
        calabash temple = calabashes[i];
        calabashes[i] = calabashes[j];
        calabashes[j] = temple;
    }

    //��������
    public static void quickSort(calabash[] calabashes, int start, int end){
    	int i = start,j = end;
    	while(i<j) {
    		while(j>i && calabashes[j].index >= calabashes[start].index)
    			j--;
    		if(i<j) {
    			swap(calabashes, i, j);
    			i++;
    		}
    		while(i<j && calabashes[i].index <= calabashes[j].index) 
    			i++;
    		if(i<j) {
    			swap(calabashes, i, j);
    			j--;
    		}
    	}
    	 if(start<i-1)
    		 quickSort(calabashes, start, i-1);
    	 if(i+1<end)
    		 quickSort(calabashes, i+1, end);
    }
    
    public static void move(calabash[] calabashes, int i, int j) {
        System.out.println(calabashes[i].rank + " : " + i + " -> " + j);
    }
}