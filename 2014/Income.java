import java.util.*;
public class Income {
    public static void main(String[] args) {
        // number of arr
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        // create array
        int arr[] = new int[num];
        for(int i=0; i<arr.length; i++){
            arr[i] = scan.nextInt();
        }

        //sorting array
        Arrays.sort(arr);

        // conditions
        if(arr.length % 2 == 1){
            int index = arr.length / 2;
            System.out.println(arr[index]);
        }
        else{
            int mid1 = (arr.length / 2) -1;
            int mid2 = arr.length / 2;
            int median = (int)Math.ceil((arr[mid1] + arr[mid2]) / 2.0);
            System.out.println(median);
        }
        scan.close();
    }
}
