class Number {
    public static void main(String args[]){
        double num = 50.57;
        int a = (int)num;
        System.out.println("Integer part is "+ a);
        System.out.println("Fractional part is "+ (num-a));
    }
}