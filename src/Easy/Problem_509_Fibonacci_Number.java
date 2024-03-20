package Easy;

public class Problem_509_Fibonacci_Number {
    //Language Java
    //Runtime 0ms
    //Memory 39.6MB
    public int  fib(int n) {
        int arr [] = new int [n+1];
        int i;

        arr[0]=0;

        if (n>0){
            arr [1]=1;

            for (i=2; i<=n; i++){
                arr[i]=arr[i-1]+arr[i-2];
            }
        }
        return arr[n];
    }
}