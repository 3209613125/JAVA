class Test2{
    public static void main(String[] args) {
    //long t = System.currentTimeMillis();
    //随机种子
        Random random = new Random(3);
        for (int i = 0;i < 5;i++){
            int r = random.nextInt(3);
            //[0,3)右开区间
            System.out.println(r);
        }
    }
}
