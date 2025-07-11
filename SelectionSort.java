import java.util.*;
class Student{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }

        for(int i=0;i<n-1;i++){
            int min_index=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min_index]){
                    int temp=arr[j];
                    arr[j]=arr[min_index];
                    arr[min_index]=temp;
                }
            }
        }
        System.out.println("The Sorted array in ascending order using Selection sort algorithm is :");
        for(int i=0;i<n;i++){
            if(i!=n-1){
                System.out.print(arr[i]+", ");
            }
            else{
                System.out.print(arr[i]);
            }
        }
    }
}
