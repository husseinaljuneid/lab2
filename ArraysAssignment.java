import java.util.Arrays;
import java.util.Random;
public class ArraysAssignment {
    public static int[] random(int[] x)
    {
        Random ran = new Random();
        int deleted = ran.nextInt(x.length-1);
        System.out.println(deleted);
        for (int i = 0; i < x.length; i++) {
            if (i <= deleted )
            {
                x[i] = -1;
            }
        }
        return x;
    }
    public static int[] reverse(int []a)
    {
        int size=a.length;
        int arr[]=new int[size];
        for (int i = 0; i <a.length ; i++,size--) {
            arr[i]=a[size-1];
        }
        return arr;
    }

    public static void clone(int []a,int []b)
    {
        for (int i = 0; i <a.length ; i++)
            b[i]=a[i];
        System.out.println("Cloned Successfully");
        System.out.println("Array is : "+ Arrays.toString(b));
    }
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7,8,9};
        System.out.println("Before Reverse : "+ Arrays.toString(a));
        System.out.println("After Reverse : "+Arrays.toString(reverse(a)));
        int[] b= {10,20,30,40,50};
        System.out.println( Arrays.toString(random(b)));
    }
}
