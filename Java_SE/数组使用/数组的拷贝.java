class ArrayDemo {
    public static void main(String[] args) {
        int[] a = new int[]{1,2,3,4,5,6,7,8,9};
        int [] b= new int[]{11,22,33,44,55,66,77,88,99};
        System.arraycopy(b,3,a,2,2);
        printArray(a);
    }
    public static void printArray(int[] a){
        for(int i:a){
            System.out.print(i+" ");
    }

    }
}
