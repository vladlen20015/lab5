import java.io.*;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

public class Var_4 {
    public static void main(String[] args){
        List<Integer> objArray = new ArrayList<Integer>();
        objArray.clear();
        objArray.add(2);
        objArray.add(-3);
        objArray.add(4);
        objArray.add(-2);
        objArray.add(-6);
        System.out.println("Array before removing an element "+objArray);
        Iterator<Integer> iterator = objArray.iterator();
        while(iterator.hasNext()) {
            Integer next = iterator.next();
            if(next > 0) {
                iterator.remove();
                try {
                    File f1=new File("MyFile1.txt");
                    f1.createNewFile();
                    System.out.println("Array after removing an element"+objArray);
                } catch (Exception e) {
                    System.out.println("Ошибка"+e);
                }
            }
        }
        System.out.println("Array after removing an element"+objArray);
    }
}
