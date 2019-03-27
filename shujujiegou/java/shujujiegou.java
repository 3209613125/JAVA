package hhh.shujujiegou.java;

class QuickSort {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] a = new int[]{5, 9, 8, 4, 7, 3, 6, 2,9,52,54,47,4,74,25,111};	//��������
        quickSortPrint(a);				//��ӡ֮ǰ������
        quickSort(a, 0, a.length - 1);	//����
        quickSortPrint(a);				//��ӡ�����Ľ��
    }

    //��ӡ����
    public static void quickSortPrint(int[] arrays) {
        for (int i = 0; i < arrays.length; i++) {	//����
            System.out.print(arrays[i] + " ");		//��ӡ���Կո����
        }
        System.out.println(); 						//����
    }

    //���򷽷�
    static void quickSort(int[] arrays, int low, int high){
        if (low >= high) {					//lowС�ڻ����high����ֱ�ӷ���
            return;
        }
        if ((high - low) == 1) {			//���ֻ���������֣���ֱ�ӱȽ�
            if (arrays[0] > arrays[1]) {
                swap(arrays, 0, 1);
            }
            return;
        }
        int pivot = arrays[low];	//ȡ��һ������Ϊ�м���
        //�󻬿鵱ǰ���±������ӵ�2�����ֿ�ʼ�������һ����ʼ
        int left = low + 1;
        int right = high;		//�һ��鵱ǰ���±���
        while (left < right) {	//����ѭ��
            //����߿�ʼ��
            while (left < right && left <= high) {		//�����С������һֱѭ��
                if (arrays[left] > pivot) {				//�ҵ�һ���������û��
                    break;
                }
                left++;
            }
            //���ұ߿�ʼ��
            while (left <= right && right > low) {		//������������һֱѭ��
                if (arrays[right] <= pivot) {		//�ҵ�һ��С������û��
                    break;
                }
                right--;
            }
            if (left < right) {					//�����û���꣬�򽻻�����
                swap(arrays, right, left);
            }
        }
        swap(arrays, low, right); 				//�����м�����
        quickSort(arrays, low, right); 			//����ǰ������
        quickSort(arrays, right + 1, high); 	//����������
    }

    //��λ����
    private static void swap(int[] array, int i, int j) {
        int temp;
        temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}