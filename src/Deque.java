
public class Deque extends Queue{

    public Deque(int capacity){
        super(capacity);
    }

    public Deque(){
    }

    private int backward(int index) {
        return --index > 0 ? index : array.length-1;
    }

    //Добавить число в конец дека
    public void pushBack(int val) throws Exception{
        super.push(val);
    }

    //Добавить число в начало дека
    public void pushFront(int val) throws Exception{
        if(++size > array.length)
            throw new Exception();
        array[head = backward(head)] = val;
    }


    //Получить последний элемент дека (не удаляя его).
    public int back() throws Exception {
        if(empty())
            throw new Exception();
        return array[tail];
    }

    //Удалить первый элемент дека.
    public int popFront() throws Exception {
        return super.pop();
    }

    //Удалить последний элемент дека.
    public int popBack() throws Exception {
        int val = back();
        tail = backward(tail);
        size -= 1;
        return val;
    }


}
