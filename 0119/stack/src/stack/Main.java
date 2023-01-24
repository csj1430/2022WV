package stack;
import list.*;
import java.util.ArrayList;


public class Main {
    public interface ListInterface {
        public void add(int i, E x);
        public int index(E x);
        public E get(int i);
        public void remove(int i);
        public void clear();
        public boolean isEmpty();
    }
    public void _01() {
        //15 push
        //25 push
        //+는 연산자이므로 15, 25 pop
        //15+25해주고 push --> 40만이 스택에 저장 돼 있음
        //10 push
        //2 push
        //*는 연산자이므로 10, 2 pop
        //10*2 해주고 push --> 40, 20이 스택에 저장 돼 있음
        //-는 연산자이므로 40, 20 pop
        //40-20 해줌
        //답은 20
    }

    public class _02_ListStack implements StackInterface { //사실 모르겠음 막 적음
        private ListInterface list;

        public _02_ListStack() {
            list = new ArrayList<E>();
        }

        public void push(E newItem) {
            list.add(list.length, newItem);
        }

        public E pop() {
            E x = list.get(list.length);
            list.remove(list.length);
            return x;
        }

        public E top() {
            return list.get(list.lenght);
        }

        public boolean isEmpty() {
            return list.isEmpty();
        }

        public void popAll() {
            list.clear();
        }
    }

    public void _03() {
        //몰라... 더미헤드.... 어케 추가해..
    }

    public void _04() {
        //이해를 못하겠음 $ 뭔데..?
    }

    public void _05_printAll() {
        for (int i = topIndex; i < 0; i--) {
            System.out.println(stack[i]);
        }
    }

    public void _06_printAll() {
        //연결리스트 이해가 잘 안감..ㅠ
    }

    public void _07_printAll() {
        //제발 그만해..
    }

    public void _08() {
        //연결리스트 그만..........
    }

    public void _09_push(E newItem) {
        if(isFull()) {
            E stack2 = (E[]) new Object[2 * stack.length];
            for (int i = 0; i < stack.length; i++) {
                stack2[i] = stack[i];
            }

            stack2[++topIndex] = newItem;
        }
        else {
            stack[++topIndex] = newItem;
        }
    }

    public void _10_printReverse() {
        //몰라..
    }
}
