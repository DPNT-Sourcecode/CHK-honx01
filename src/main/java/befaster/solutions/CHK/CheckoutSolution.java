package befaster.solutions.CHK;

import befaster.runner.SolutionNotImplementedException;

import java.util.HashMap;
import java.util.Map;

public class CheckoutSolution {
    public Integer checkout(String skus) {
        if ( !skus.matches("[ABCD]*")){
            return -1;
        }
        Map<Character, Integer> itemCounts= new HashMap<>();
        for (char sku : skus.toCharArray()){
            itemCounts.put(sku,itemCounts.getOrDefault(sku,0) +1);
        }
        int total = 0;
        int countA = itemCounts.getOrDefault('A', 0);
        total += (countA / 3) * 130 + (countA % 3 ) *50;
        int countB =itemCounts.getOrDefault('B', 0);
        total+= (countB /2) *45 + (countB %2 ) *30;
        int countC = itemCounts.getOrDefault('C',0);
        total +=countC *20;
        int countD =itemCounts.getOrDefault('D', 0);
        total += countD *15;
        return total;
    }
}

