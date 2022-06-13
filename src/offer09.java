import java.util.Stack;

/**
 * 用两个栈实现一个队列。队列的声明如下，请实现它的两个函数 appendTail 和 deleteHead ，分别完成在队列尾部插入整数和在队列头部删除整数的功能。(若队列中没有元素，deleteHead 操作返回 -1 )
 *
 */
public class offer09 {

    private int size = 0;
    private Stack<Integer> firstStack = new Stack<>();
    private Stack<Integer> secondStack = new Stack<>();

    public offer09() {}

    public void appendTail(int value) {
        firstStack.add(value);
        ++this.size;
    }

    public int deleteHead() {
        if (0 == this.size){
            return -1;
        }
        if (secondStack.size() == 0){
            this.reArrangeStack();
        }
        --this.size;
        return secondStack.pop();
    }

    private void reArrangeStack(){
        while(firstStack.size() != 0){
            this.secondStack.add(firstStack.pop());
        }
    }
}
