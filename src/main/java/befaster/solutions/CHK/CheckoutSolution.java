package befaster.solutions.CHK;

import befaster.runner.SolutionNotImplementedException;

import java.util.HashMap;
import java.util.Map;

public class CheckoutSolution {
    public Integer checkout(String skus) {
        if ( !skus.matches("[A-Z]*")){
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
        int countG =itemCounts.getOrDefault('G', 0);
        total += countG * 20;

        int countH =itemCounts.getOrDefault('H', 0);
        total += (countH/10) *80 + (( countH % 10) /5 )*45 + (countH % 10 % 5) * 10;

        int countI =itemCounts.getOrDefault('I', 0);
        total += countI *35;

        int countJ =itemCounts.getOrDefault('J', 0);
        total += countJ * 60;

        int countK =itemCounts.getOrDefault('K', 0);
        total += (countK / 2) *120 + (countK %2)*70;

        int countL =itemCounts.getOrDefault('L', 0);
        total += countL *90;

        int countM =itemCounts.getOrDefault('M', 0);

        int countN =itemCounts.getOrDefault('N', 0);
        total += countN *40;

        int freeM =countN /3;
        countM -= freeM;

        int countO =itemCounts.getOrDefault('O', 0);
        total += countO *10;

        int countP =itemCounts.getOrDefault('P', 0);
        total += (countP / 5) * 200 + (countP % 5) *50;

        int countQ =itemCounts.getOrDefault('Q', 0);
       // total += (countQ / 3) * 80 + (countP % 3) *30;

        int countR =itemCounts.getOrDefault('R', 0);
        total += countR * 50 ;
        int freeQ = countR /3;
        countQ -= freeQ;

        int countS =itemCounts.getOrDefault('S', 0);
       // total += countS * 30 ;

        int countT =itemCounts.getOrDefault('T', 0);
       // total += countT * 20 ;
        int countX =itemCounts.getOrDefault('X', 0);
        int countY =itemCounts.getOrDefault('Y', 0);
        int countZ =itemCounts.getOrDefault('Z', 0);
        int group= countS + countT + countX + countY + countZ;
        int groupSets = group / 3;
        total += groupSets * 45;
        int remaining=  group %3;

        while ( groupSets > 0){

            if(countS>0 ){
                remaining--;
                countS--;
                }
            if(countT>0 ){
                remaining--;
                countT--;
                }
            if(countX>0 ){
                remaining--;
                countX--;
                }
            if(countY>0 ){
                 remaining--;
                countY--;
            }
            if(countZ>0 ){
                remaining--;
                countZ--;
            }
            groupSets --;
            }
        if(countS > 0) total+= countS *20;
        if(countT > 0) total+= countT *20;
        if(countX > 0) total+= countX *17;
        if(countY > 0) total+= countY *20;
        if(countZ > 0) total+= countZ *21;
        int countU =itemCounts.getOrDefault('U', 0);
        int setsofFour = countU/ 4;

        int remainingU = countU % 4;
        total += setsofFour * 120;
        if (remainingU == 3) {
            total += 120;
        }else { total += remainingU *40;
        }

        int countV =itemCounts.getOrDefault('V', 0);
        total += (countV /3) * 130 + ((countV %3)/2) * 90 + (countV % 3 % 2) * 50;

        int countW =itemCounts.getOrDefault('W', 0);
        total += countW * 20 ;






        if(countM >0 ){
            total += countM * 15;}

        if(countQ>0){
            total+= (countQ / 3) * 80 + (countQ % 3) * 30;
        }



        return total;
    }
}




