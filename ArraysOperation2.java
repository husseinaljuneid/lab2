import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Arabic on 17/01/22.
 */
public class ArraysOperation2 {
    int numOfElements;
    int x[];

    public ArraysOperation2()
    {
        x=new int [5];
        numOfElements=0;
    }

    public int add(int e)
    {
        if (numOfElements<x.length)
        {
            x[numOfElements]=e;
            numOfElements++;
            return 0;
        }
        return -1;
    }

    public int addsorted(int e)
    {
        if (numOfElements<x.length)
        {

            int i=numOfElements;
            while(i>0&&e<x[i-1])
            {
                x[i]=x[i-1];
                i--;
            }
            x[i]=e;
            numOfElements++;
            return 0;
        }
        return -1;
    }


    public int delete(    )
    {
        if(numOfElements>0)
        {
            x[numOfElements-1]=-1;
            numOfElements--;
            return 0 ;
        }
        return -1;
    }

    public int deleteSorted( int idex   )
    {
        if(numOfElements>0&& idex>=0)
        {
            int i= idex;
            while (i<numOfElements-1 )
            {
                x[i]=x[i+1];
                i++;
            }
            x[numOfElements-1]=-1;
            numOfElements--;
            return 0 ;
        }
        return -1;
    }

    public int sequentialSearch(int key)
    {
        int index=-1;
        int i=0;
        boolean found=false;
        while (i<numOfElements&&!found)
        {
            if(x[i]==key)
            {
                found=true;
                index=i;
                i++;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        ArraysOperation2 test= new ArraysOperation2();
        Scanner in = new Scanner(System.in);
        System.out.println("Input elements");
        for (int i = 0; i <7 ; i++) {
            if (test.addsorted(in.nextInt())==0)
                System.out.println("Added successfully");
            else
                System.out.println("Array is full");
            System.out.println(Arrays.toString(test.x));
        }
        System.out.println("Input any index for delete");
        for (int i = 0; i <7 ; i++) {
            if (test.deleteSorted(in.nextInt())==0)
                System.out.println("Deleted successfully");
            else
                System.out.println("Array is empty");
            System.out.println(Arrays.toString(test.x));
        }

    }
}
