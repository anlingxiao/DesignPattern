import org.omg.Messaging.SYNC_WITH_TRANSPORT;

/**
 * Created by c06042 on 2019/11/20.
 */
public class Example {
    public static void test(DynamicArray dynamicArray){
        dynamicArray.add(5);
        dynamicArray.add(1);
        dynamicArray.add(3);
        for (int i=0;i<dynamicArray.size();++i){
             System.out.println(dynamicArray.elements[i]);
        }
    }

    public static void main(String[] args) {
        DynamicArray dynamicArray=new SortedDynamicArray();
        test(dynamicArray);
    }
}