package cacHamTrongList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(5);
        list.add(15);
        list.add(55);
        list.add(95);
        list.add(75);
        list.add(65);
        list.add(45);
        list.add(25);
        list.add(35);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.toString());
            System.out.println("Số lớn nhất là: "+ Collections.max(list));
            break;
        }
    }
}
