// SUSHANT SINHA

// 4ms ( 76.51% ) 42.49mb ( 77.29% )

class Solution {
    public String convertDateToBinary(String date) {

        StringBuffer sb=new StringBuffer();

        String[] split=date.split("-");

        int day=Integer.parseInt(split[2]), month=Integer.parseInt(split[1]), year=Integer.parseInt(split[0]);

        sb.append(intToBinary(year));
        sb.append("-");
        sb.append(intToBinary(month));
        sb.append("-");
        sb.append(intToBinary(day));

        return sb.toString();
        
    }

    String intToBinary(int date){

        StringBuffer sb=new StringBuffer();

        while(date!=0){
            sb.append(date%2);
            date/=2;
        }

        // System.out.println(sb);

        return sb.reverse().toString();
    }
}