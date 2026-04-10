package Assignment14;

import java.util.ArrayList;
import java.util.List;

public class Question3 {
    public void autoBoxing(){
        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println("LIST:"+list);
        int sum=0;
        for(Integer num:list){
            sum+=num;
        }
        System.out.println("SUM OF LISTS:"+sum);


    }

    static void main() {
            Question3 q3=new Question3();
            q3.autoBoxing();
    }
}
