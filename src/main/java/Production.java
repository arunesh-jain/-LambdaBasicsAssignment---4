public class Production {
    public static long getOutcomes(long number1,long number2){

        //  Lambda function fot required implementation
        ProductionInterface productionOfTwoNumbers= ((Number1, Number2) -> {
            long returnAns = 1;
            for(long iterate = Number2; iterate>=Number1; iterate--)
            {
                returnAns = returnAns * iterate;
            }
            return returnAns;
        });
        return productionOfTwoNumbers.getProductionOf(number1,number2);
    }
    public static void main(String[] args) {

       //   Given Inputs From the Question
        long result1 = Production.getOutcomes(0,1);
        long result2 = Production.getOutcomes(2,2);
        long result3 = Production.getOutcomes(1,4);
        long result4 = Production.getOutcomes(5,15);

        // output
        System.out.println(" production of all above numbers are (inclusively) ::");
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);

    }
}
