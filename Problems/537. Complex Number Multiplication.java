// SUSHANT SINHA

// 4ms ( 79.18% ) 36.9mb ( 94.34% )

// https://stackoverflow.com/questions/40246231/java-util-regex-patternsyntaxexception-dangling-meta-character-near-index-0

class Solution {
    public String complexNumberMultiply(String num1, String num2) {
        
        String split1[]=num1.split("\\+");
        String split2[]=num2.split("\\+");
        
        int re1=Integer.parseInt(split1[0]);
        int re2=Integer.parseInt(split2[0]);
        int img1=Integer.parseInt(split1[1].substring(0,split1[1].length()-1));
        int img2=Integer.parseInt(split2[1].substring(0,split2[1].length()-1));

        int re, img;
        re=(re1*re2-(img1*img2));
        img=(re1*img2)+(re2*img1);

        return re+"+"+img+"i";

    }
}

// if we use StringBuilder and its append function in the return statement

// 1ms ( 93.06% ) 36.8mb ( 94.34% )

class Solution {
    public String complexNumberMultiply(String num1, String num2) {
        
        String split1[]=num1.split("\\+");
        String split2[]=num2.split("\\+");
        
        int re1=Integer.parseInt(split1[0]);
        int re2=Integer.parseInt(split2[0]);
        int img1=Integer.parseInt(split1[1].substring(0,split1[1].length()-1));
        int img2=Integer.parseInt(split2[1].substring(0,split2[1].length()-1));

        int re, img;
        re=(re1*re2-(img1*img2));
        img=(re1*img2)+(re2*img1);

        return new StringBuilder()
            .append(re)
            .append("+")
            .append(img)
            .append("i")
            .toString();

    }
}