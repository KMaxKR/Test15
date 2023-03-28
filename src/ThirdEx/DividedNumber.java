package ThirdEx;

import java.util.ArrayList;
import java.util.List;

public class DividedNumber {
    private int inferiorLimit;
    private int superiorLimit;
    private int countDivisibleBy7Numbers = 0;
    private ArrayList<Integer> listCount = new ArrayList<>();
    public void setLimit(int inferiorLimit, int superiorLimit){
        if(inferiorLimit > superiorLimit){
            throw new RuntimeException("InvalidRangeException");
        }else{
        this.inferiorLimit = inferiorLimit;
        this.superiorLimit = superiorLimit;
        }
        for(int i = inferiorLimit; i <= superiorLimit; i++){
            listCount.add(i);
        }
    }
    public void getList(){
        System.out.println(listCount);;
    }

    public void countDivisibleBy7Numbers(){
        for (Integer index : listCount){
            if (index % 7 == 0){
                countDivisibleBy7Numbers ++;
            }
        }
        System.out.println(countDivisibleBy7Numbers);
    }

}
