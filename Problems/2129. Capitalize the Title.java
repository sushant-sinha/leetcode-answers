// SUSHANT SINHA

// 7ms ( 33.33% ) 41.1mb ( 16.67% )

class Solution {
    public String capitalizeTitle(String title) {

        StringBuffer ans=new StringBuffer();
        
        for(String s: title.split(" ")){

            StringBuffer temp=new StringBuffer();

            if(s.length()<=2){

                for(char c:s.toCharArray()){

                    if(c>=65 && c<=91)
                        temp.append((char)(c+32));

                    else
                        temp.append(c);

                }

            }

            else{

                if(s.charAt(0)>=65 && s.charAt(0)<=91)
                    temp.append(s.charAt(0));

                else
                    temp.append((char)(s.charAt(0)-32));

                for(int i=1;i<s.length();i++){

                    if(s.charAt(i)>=65 && s.charAt(i)<=91)
                        temp.append((char)(s.charAt(i)+32));

                    else
                        temp.append(s.charAt(i));

                }

            }
            
            ans.append(temp+" ");

        }

        return String.valueOf(ans).substring(0,title.length());

    }
}