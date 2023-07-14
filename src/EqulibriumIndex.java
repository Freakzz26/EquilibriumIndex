import java.util.Scanner;

public class EqulibriumIndex {
    static int prefixSum(int[] arr, int n) {
        int prefix_sum[] = new int[n];
        prefix_sum[0]=arr[0];
        int min = Integer.MAX_VALUE;
        int count = 0;
        for (int i = 1; i < n; i++) {
            prefix_sum[i] = prefix_sum[i - 1] + arr[i];
        }
        for(int i=1;i<prefix_sum.length;i++)
        {
            if (prefix_sum[i-1]==prefix_sum[prefix_sum.length-1]-prefix_sum[i]) {
                count++;
                if (min > i) {
                    min = i;
                }
            }
        }
        if(count==0)
        {
            return -1;
        }
        return min;
}
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=scanner.nextInt();
        }
        int val=prefixSum(arr,n);
        System.out.print("Count: "+val);

    }
}
