import java.util.*;

public class test2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Stack<Integer> st = new Stack<Integer>();
        int n = scn.nextInt();
        for (int i = 0; i < n; i++) {
            st.add(scn.nextInt());
        }
        scn.close();
        Stack<Integer> que = Stack2Queue(st);
        System.out.println(que.peek());
        que.pop();
        System.out.println(que.peek());
    }

    public static Stack<Integer> Stack2Queue(Stack<Integer> st) {
        Stack<Integer> que = new Stack<Integer>();
        int sz = st.size();
        for (int i = 0; i < sz; i++) {
            int temp = st.peek();
            que.add(temp);
            st.pop();
        }
        return que;
    }

}
