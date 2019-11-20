/**
 * Created by c06042 on 2019/11/20.
 * 多态
 */
public class DynamicArray {
    private static final int DEFAULT_CAPACITY=10;
    protected int size=0;
    protected int capacity=DEFAULT_CAPACITY;
    protected Integer[] elements=new Integer[DEFAULT_CAPACITY];

    public int size(){return this.size;}
    public Integer get(int index){return elements[index];}

    public void add(Integer e){
        ensureCapacity();
        elements[size++]=e;
    }
    protected void ensureCapacity(){
        //如果数组满了就扩容
        if (elements[DEFAULT_CAPACITY-1] != null) {
            Integer[] temp=new Integer[DEFAULT_CAPACITY+1];
            for (int i = 0; i < DEFAULT_CAPACITY; i++) {
                temp[i]=elements[i];
            }
            elements=temp;
        }
    }
}
