class Solution {
    public String toHex(int num) {

        int tooperate = num;

        if (num == 0)
            return "0";

        if (num == -2147483648)
            return "80000000";

        if (tooperate < 0)
            tooperate *= -1;

        // preprocessing
        // for both negative and positive

        String ans = "", temp = tobin(tooperate);

        // converting for negative number
        // getting 2s complement

        for (int i = 0; i < temp.length() % 4; i++)
            temp = 0 + temp;

        if (num < 0) {

            StringBuffer sb = new StringBuffer(temp);
            temp = findTwoscomplement(sb);

        }


        char ar[] = temp.toCharArray();

        for (int i = 0; i < ar.length; i += 4) {

            int sum = 0, power = 3;

            for (int j = i; j < i + 4 && j < ar.length; j++)
                sum += Character.getNumericValue(ar[j]) * Math.pow(2, power--);

            if (sum < 10)
                ans += sum;

            else
                ans += (char)(97 + sum - 10);

        }

        while (num < 0 && ans.length() < 8)
            ans = "f" + ans;

        return ans;


    }

    // function to conver integet to 

    String tobin(int num) {

        StringBuilder temp = new StringBuilder();

        while (num > 0) {

            temp.append(num % 2);
            num /= 2;

        }

        return String.valueOf(temp.reverse());


    }

    // from gfg
    // https://www.geeksforgeeks.org/efficient-method-2s-complement-binary-string/

    String findTwoscomplement(StringBuffer str) {

        int n = str.length();

        // Traverse the string to get first '1' from
        // the last of string
        int i;
        for (i = n - 1; i >= 0; i--)
            if (str.charAt(i) == '1')
                break;

        // If there exists no '1' concat 1 at the
        // starting of string
        if (i == -1)
            return "1" + str;

        // Continue traversal after the position of
        // first '1'
        for (int k = i - 1; k >= 0; k--) {
            //Just flip the values
            if (str.charAt(k) == '1')
                str.replace(k, k + 1, "0");
            else
                str.replace(k, k + 1, "1");
        }

        // return the modified string
        return str.toString();
    }
}