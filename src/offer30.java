import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class offer30 {
    /** initialize your data structure here. */
    public offer30() {
    }

    public static void main(String[] args) {
        offer30 minStack = new offer30();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        minStack.min();
        minStack.pop();
        minStack.top();
        minStack.min();
    }


    private LinkedList<Integer> mainList = new LinkedList<>();
    private LinkedList<Integer> minList = new LinkedList<>();

    public void push(int x) {

        if (minList.size() != 0){
            int minValue = minList.getLast();
            minList.add(x > minValue ? minValue : x);
        }else {
            minList.add(x);
        }
        mainList.add(x);
    }

    public void pop() {
        if (mainList.size() == 0)
            return;
        mainList.removeLast();
        minList.removeLast();
    }

    public int top() {
        if (mainList.size() == 0)
            return -1;
        return mainList.getLast();
    }

    public int min() {
        if (minList.size() == 0)
            return -1;
        return minList.getLast();
    }
}
