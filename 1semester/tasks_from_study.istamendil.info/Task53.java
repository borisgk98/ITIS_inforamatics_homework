import java.lang.*;
import java.util.*;


class Task53 {

    static class SimpleStack {
        private int size;
        private class StackEl {
            public Object object;
            public StackEl next;
            public StackEl pref;
        }
        private StackEl top;
        public void push(Object el) {
            StackEl newEl = new StackEl();
            newEl.object = el;
            if (top != null) {
                top.next = newEl;
                newEl.pref = top;
            }
            top = newEl;
            size++;
        }
        public Object pop() {
            if (top != null) {
                Object obj = top.object;
                top = top.pref;
                size--;
                return obj;
            }
            return null;
        }
        public Object getTop() {
            if (top == null) {
                return null;
            }
            return top.object;
        }
        public boolean isEmpty() {
            return size == 0;
        }
        public void clear() {
            top = null;
            size = 0;
        }
        public int getSize() {
            return size;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int level = 0;
        SimpleStack st = new SimpleStack();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ')') {
                if (st.isEmpty() || !st.getTop().equals(new Character('('))) {
                    System.out.println("No a correct bracket sequence");
                    System.exit(0);
                    break;
                }
                st.pop();
            }
            else if (str.charAt(i) == ']') {
                if (st.isEmpty() || !st.getTop().equals(new Character('['))) {
                    System.out.println("No a correct bracket sequence");
                    System.exit(0);
                    break;
                }
                st.pop();
            }
            else if (str.charAt(i) == '}') {
                if (st.isEmpty() || !st.getTop().equals(new Character('{'))) {
                    System.out.println("No a correct bracket sequence");
                    System.exit(0);
                    break;
                }
                st.pop();
            }
            else if (str.charAt(i) == '(' || str.charAt(i) == '{' || str.charAt(i) == '[') {
                st.push(new Character(str.charAt(i)));
            }
        }
        if (st.isEmpty()) {
            System.out.println("A correct bracket sequence");
        }
        else {
            System.out.println("No a correct bracket sequence");
        }
    }
}