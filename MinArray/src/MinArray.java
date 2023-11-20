import java.util.Scanner;

public class MinArray {
    public static void main(String[] args) {
        int size;
        Scanner scanner= new Scanner(System.in);
        do
        {
            System.out.println("Enter a size");
            size= scanner.nextInt();
            if(size>20){
                System.out.println("The size should not exceed 20");
            }
        }while(size >20);
        int [] array= new int[size];
        int i=0;
        while(i<array.length){
            System.out.println("Enter element "+(i+1)+" is:");
            array[i]= scanner.nextInt();
            i++;
        }
        System.out.println("Property list:");
        for (int j=0;j< array.length;j++){
            System.out.println(array[j]+"\t");
        }
        int Min= array[0];
        int index=1;
        for(int j=0;j< array.length;j++){
            if(array[j]<Min){
               Min=array[j];
                index=j+1;
            }
        }
        System.out.println("Min in array is "+Min+" in element "+index);


}
}
