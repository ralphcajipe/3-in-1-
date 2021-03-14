import java.io.IOException;
import java.util.*;

public class Collections{

    public static void main(String[] args) throws IOException {
         
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("[1] Array List: ");
            System.out.println("[2] Linked List: ");
            System.out.println("[3] Vector: ");
            System.out.print("Enter choice[]: ");
            int x = sc.nextInt();
            switch(x)
            {
                case 1:
                    ArrayList<String> arr=new ArrayList<String>();
                    System.out.print("How many string(s) do you want to add to the Array List: ");
                    int p=sc.nextInt();
                    for(int i=0;i<p;i++)
                    {
                        String s;
                        s=sc.next();
                        arr.add(s);
                    }
                    System.out.println("");
                    System.out.println("Your strings are:");
                    Iterator it= arr.listIterator();

                    while(it.hasNext())
                    {
                        System.out.println(it.next());

                    }
                    break;
                case 2:
                    LinkedList<String> l= new LinkedList<String>();
                    System.out.print("How many string(s) do you want to add to the Linked List: ");
                    int n=sc.nextInt();
                    for(int i=0;i<n;i++)
                    {
                        String s;
                        s=sc.next();
                        l.add(s);
                    }
                    System.out.println("");
                    System.out.println("Your strings are:");
                    Iterator it1= l.listIterator();

                    while(it1.hasNext())
                    {
                        System.out.println(it1.next());
                    }
                    break;
                case 3:
                    Vector<String> v=new Vector<String>();
                    System.out.print("How many string(s) do you want to add to the Vector: ");
                    int n1=sc.nextInt();
                    for(int i=0;i<n1;i++)
                    {
                        String s;
                        s=sc.next();
                        v.add(s);
                    }
                    System.out.println("");
                    System.out.println("Your strings are:");
                    Iterator it2= v.listIterator();

                    while(it2.hasNext())
                    {
                        System.out.println(it2.next());
                    }
                    break;

            }
          }
        finally {
            sc.close();
        } 
        


    }
}
