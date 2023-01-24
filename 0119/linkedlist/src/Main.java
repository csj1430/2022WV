import java.util.LinkedList;

public class Main {
    private Integer[] item;
    private int numItems;
    private final int NOT_FOUND = -12345;

    private int indexOf(int x) {
        int i = 0;

        while (i < numItems && item[i] != x) {
            i++;
        }

        if (i == numItems) {
            return NOT_FOUND;
        }
        else {
            return i;
        }
    }

    public void _01() {
        // 연결 리스트 구현 시 더미 헤드를 사용하는 장단점을 말해보시오

        //  삽입하고자 하는 노드 앞에 항상 직전 노드가 존재하기 때문에 prevNode.next 사용 가능
        //  원소를 삽일할 때 if문을 쓰지 않아도 됨
    }

    public boolean _02_contains(int x) { //x가 존재하는지 체크해주는 메서드
        if (indexOf(x) != NOT_FOUND)
            return true;
        else
            return false;
    }

    public void _03_1() {
        //?
    }

    public void _03_2() {
        //?
    }

    public void _04_printInterval(int i, int j) {
        for (int k = i; k < j + 1; k++) {
            System.out.println(item[k]);
        }
    }

    public void _05_printInterval(int i, int j) {
        for (int k = i; k < j + 1; k++) {
            System.out.println(tNode.item);
        }
    }

    public void _06_1_numItems() { //재귀x
        //?
    }

    public void _06_2_numItems() { //재귀o
        //?
    }

    public void _07_remove(int index, int k) {
        if (index >= 0 && index <= numItems-1) {
            for (int i = index; i < k + 1; i++) {
                Node preNode = getNode(index - 1);
                prevNode.next = preNode.next.next;
                numItems--;
            }
        }
        else {
            // 에러 처리
        }
    }

    public void _08_add(int x) {
        newNode.next.prev = newNode;
        prevNode.next = newNode;
        numItems++;
    }

    public void _09_concat(LinkedList list1, LinkedList list2) {
        //?
    }

    public void _10() {
        //?
    }

    public int _11_lastIndexOf(Integer x) {
        int indexSave = -1; //인덱스 저장할 변수 생성

        for (int i = 0; i < item.length; i++) {
            if (item[i] == x) {
                indexSave = i;
            }
        }

        return indexSave;
    }

    public void _12() {
        //뭐 어쩌라고..
    }
}
