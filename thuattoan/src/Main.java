public class Main {
    public static void main(String[] args) {
        int arr[] = {2, 4, 5, 6, 7, 3, 8, 9, 2, 1};

        System.out.println(binarySearch(arr,7));
    }
    public static int binarySearch(int list[], int key){
       int low=0;
       int high =list.length-1;
       while (high>=low){
           int mid=(low+high)/2;
           if(key<list[mid]){
               high=mid-1;}
               else if(key==list[mid])
                   return mid;
               else
                   low= mid +1;           }
           return -1;
       }
    }
