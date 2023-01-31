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
        Node<E> tNode;

        for (int k = i; k < j + 1; k++) {
            tNode = get(k); //코드 5-9의 get함수 사용
            System.out.println(tNode.item);
        }
    }

    public int _06_1_numItems() { //재귀x
        Node currNode = head; //head값을 갖는 노드 생성
        int num = 0; //개수를 세어 줄 변수 생성

        while (currNode.next != 0) { //현재 노드의 다음이 null이 아니면
            num++; //개수 추가
            currNode = currNode.next; //현재 노드를 다음 노드로 바꿔줌
        }

        return num;
    }

    public int _06_2_numItems() { //재귀o
        //모르겟덩
    }

    public void _07_remove(int index, int k) {
        if (index >= 0 && index <= numItems - 1 && (index + k) <= numItems - 1) {
            for (int i = index; i < index + k + 1; i++) {
                Node preNode = getNode(index - 1);
                prevNode.next = preNode.next.next;
                numItems--;
            }
        }
        else if (index >= 0 && index <= numItems - 1) {
            for (int i = 0; i < numItems - index; i++) {
                Node preNode = getNode(index - 1);
                prevNode.next = preNode.next.next;
                numItems--;
            }
        }
        else {
            //에러
        }
    }

    public void _08_add(int x) {
        BidirectionalNode currNode = head;

        for (int i = 0; i < numItems; i++) {
            if (currNode.next == head) { //다음 노드의 값이 head인 경우 (노드가 head뿐일때)
                BidirectionalNode newNode = new BidirectionalNode(x, head, head);
                numItems++;
                break;
            }
            else if (currNode.next < x) { //다음 노드의 값이 x보다 작은 경우
                currNode = currNode.next; //다음 노드로 이동
            }
            else if (currNode.next > x){ //다음 노드의 값이 x보다 큰 경우
                BidirectionalNode newNode = new BidirectionalNode(x, currNode.prev, currNode.next);
                numItems++;
                break;
            }
        }
    }

    public void _09_concat(LinkedList list1, LinkedList list2) {
        //?
    }

    public void _10() {
        //일단 node1과 node2가 속한 연결 리스트의 길이를 각각 구함
        //길이가 같다면 node1의 node1.next를 계속 하던지 node1.prev를 계속 하던지 해서 node2값이 있나 확인
        //node2에서도 마찬가지로 진행.
        //각 리스트에 서로의 값이 존재하고 next, prev를 실행한 횟수가 서로 같다면
        //ex) node1과 node2가 3칸 떨어져있다고 가정했을 때
        // node1.next와 node2.prev.prev의 값이 같은지 확인
        //나머지 node들도 값이 같은지 반복해서 확인하면 결과적으로 node1과 node2가 같은지 확인 가능
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
        //배열리스트 메서드를 왜 연결리스트에 추가함..?
    }
}
