package hhh.shujujiegou.java;

class QuickSort {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] a = new int[]{5, 9, 8, 4, 7, 3, 6, 2,9,52,54,47,4,74,25,111};	//定义数组
        quickSortPrint(a);				//打印之前的排序
        quickSort(a, 0, a.length - 1);	//排序
        quickSortPrint(a);				//打印排序后的结果
    }

    //打印方法
    public static void quickSortPrint(int[] arrays) {
        for (int i = 0; i < arrays.length; i++) {	//遍历
            System.out.print(arrays[i] + " ");		//打印，以空格隔开
        }
        System.out.println(); 						//换行
    }

    //排序方法
    static void quickSort(int[] arrays, int low, int high){
        if (low >= high) {					//low小于或等于high，则直接返回
            return;
        }
        if ((high - low) == 1) {			//如果只有两个数字，则直接比较
            if (arrays[0] > arrays[1]) {
                swap(arrays, 0, 1);
            }
            return;
        }
        int pivot = arrays[low];	//取第一个数作为中间数
        //左滑块当前的下标数，从第2个数字开始，从最后一个开始
        int left = low + 1;
        int right = high;		//右滑块当前的下标数
        while (left < right) {	//左右循环
            //从左边开始找
            while (left < right && left <= high) {		//如果左小于右则一直循环
                if (arrays[left] > pivot) {				//找到一个大的数字没有
                    break;
                }
                left++;
            }
            //从右边开始找
            while (left <= right && right > low) {		//如果左大于右则一直循环
                if (arrays[right] <= pivot) {		//找到一个小的数字没有
                    break;
                }
                right--;
            }
            if (left < right) {					//如果还没找完，则交换数字
                swap(arrays, right, left);
            }
        }
        swap(arrays, low, right); 				//交换中间数字
        quickSort(arrays, low, right); 			//排序前面数组
        quickSort(arrays, right + 1, high); 	//排序后边数组
    }

    //掉位方法
    private static void swap(int[] array, int i, int j) {
        int temp;
        temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
