package befaster.solutions.CHK;

import befaster.runner.SolutionNotImplementedException;

import java.util.HashMap;
import java.util.Map;

public class CheckoutSolution {
    public Integer checkout(String skus) {
        if ( !skus.matches("[ABCDEF]*")){
            return -1;
        }
        Map<Character, Integer> itemCounts= new HashMap<>();
        for (char sku : skus.toCharArray()){
            itemCounts.put(sku,itemCounts.getOrDefault(sku,0) +1);
        }
        int total = 0;
        int countA = itemCounts.getOrDefault('A', 0);
        total += (countA/5) * 200 +((countA % 5 ) /3) * 130   + (countA % 5 % 3 ) *50 ;
        int countB =itemCounts.getOrDefault('B', 0);
      //  total+= (countB /2) *45 + (countB %2 ) *30;
        int countC = itemCounts.getOrDefault('C',0);
        total +=countC *20;
        int countD =itemCounts.getOrDefault('D', 0);
        total += countD *15;
        int countE = itemCounts.getOrDefault('E',0);
        total += countE *40;
        int freeB = countE /2;
        countB -= freeB;
        if (countB>0){
            total += (countB /2 ) * 45 + (countB % 2 ) *30;}
        int countF = itemCounts.getOrDefault('F',0);
        int setsofThree =  countF /3;
        int remainingF = countF % 3;
        total += setsofThree * 20;
        if (remainingF == 2) {
            total += 20;
        }else { total += remainingF *10;
        }

        return total;
    }
}
