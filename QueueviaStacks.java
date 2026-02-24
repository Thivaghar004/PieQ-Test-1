import java.util.*;
public class QueueviaStacks{

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Stack<Integer> st=new Stack<>();
        Stack<Integer> st2=new Stack<>();
        List<Integer> list=new ArrayList<>();
        System.out.println("Enter the number of elements to be added: ");
        int n=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the elements(one by one): ");
        for(int i=0;i<n;i++){
            list.add(sc.nextInt());
            st.push(list.get(i));
        }
        while(!st.isEmpty()){
            System.out.println("Stack implementation: "+st.peek());
            st2.push(st.pop());
        }
        System.out.println("-------------------------------------");
        while(!st2.isEmpty()){
            System.out.println("QUEUE implementation: "+st2.pop());
        }
        sc.close();
    }
}