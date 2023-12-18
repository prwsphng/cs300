import java.util.*;
public class Income{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        int arr[] = new int[num];

        for(int i=0; i<num; i++){
            arr[i] = scan.nextInt();
        }

        Arrays.sort(arr);
        
        if(arr.length %2 == 1){
            int tmp = arr.length / 2;
            int result1 = arr[tmp];
            System.out.println(result1);
        }
        else{
            int tmp1 = arr.length / 2 - 1;
            int tmp2 = arr.length / 2;
            double tmp3 = (arr[tmp1] + arr[tmp2]) / 2.0;
            int result2 = (int) Math.ceil(tmp3);
            System.out.println(result2);
        }
        scan.close();
    }
}