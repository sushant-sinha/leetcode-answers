class Solution {
    public long maxWeight(int[] pizzas) {

        Arrays.sort(pizzas);

        // System.out.println(Arrays.toString(pizzas));

        long ans=0;

        boolean oddDay=true;

        int oddDaysLeftToEat=(pizzas.length/4)/2, evenDaysLeftToEat=(pizzas.length/4)/2;

        if(pizzas.length/4%2==1){
            oddDaysLeftToEat++;
        }

        int index=pizzas.length-1;

        for(;oddDaysLeftToEat>0;index--){
            ans+=pizzas[index];
            oddDaysLeftToEat--;
        }

        for(;evenDaysLeftToEat>0;index--){
            index--;
            ans+=pizzas[index];
            evenDaysLeftToEat--;
        }

        return ans;
        
    }
}