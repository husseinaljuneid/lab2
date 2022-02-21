import java.util.Arrays;
public class ArrayOperation {
    public static void main(String [] args)
    {
        int x[]={1,2,3,4,5,6,7,8,9};
        System.out.println("Array before reverse : "+ Arrays.toString(x));
        System.out.println("After revers : "+Arrays.toString(reverse(x)));
        System.out.println("After shifting left : "+Arrays.toString(shiftleft(x)));
        System.out.println("After Shifting Right : "+Arrays.toString(shiftright(x)));
    }
    public static int[] reverse(int[]a)
    {
        int n =a.length-1;
        for (int i = 0; i < a.length-1; i++)
        {
            int t=a[i];
            a[i]=a[n];
            a[n]=t;
            n--;
        }
        return a;
    }

    public static int[] shiftleft(int[] b)
    {
        int t=b[0];
        for (int i = 0; i <b.length-1 ; i++) {
            b[i]=b[i+1];
        }
        b[b.length-1]=t;
        return b;
    }

    public static int[] shiftright(int []c)
    {
        int t=c[c.length-1];
        for (int i = c.length-1 ; i >0 ; i--)
        {
            c[i]=c[i-1];
        }
        c[0]=t;
        return c;
    }

}
