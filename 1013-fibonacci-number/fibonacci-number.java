class Solution {
    public int fib(int n) {
        Scanner read = new Scanner(System.in);
        // int n = read.nextInt();
        int a = 0;
        int b = 1;
        if(n == 0){
            // System.out.print(a);
            return a;
        }
        if(n == 1){
            // System.out.print(b);
            return b;
        }
        int sum = 0;
        for(int i=2;i<=n;i++){
            sum  = a+b;
            a = b;
            b = sum;
        }

        // System.out.print(sum);
        return sum;
    }
}