// appD

arr={1,2,3,4,5}

// first itr
arr={2,3,4,5,1}

ans={5,1,2,3,4}

newIndex=((ind)+(size%numItr))%size;

(0+(5%4))%5=1

// code

// numofItr
int n=4;

int ans[]=new int[arr.length];

for(int i=0;i<arr.length;i++){

	newIndex=((i)+(arr.length%n))%size;

	ans[newIndex]=arr[i];

}






size=m;

for(int i=0;i<n;i++){

	int indexZero=arr[0];

	for(int j=0;j<arr.length-1;j++){
		arr[j]=arr[j+1];
	}

	arr[arr.length-1]=indexZero;

}

















String a="lowsalt";
String b="owlslat";

if(a.length()!=b.length())
	return "not angram";

char ar1[]=new int[26];
char ar2[]=new int[26];

for(char c:a.toCharArray())
	ar1[c-'a']++;

for(char c:b.toCharArray())
	ar2[c-'a']++;

for(int i=0;i<26;i++){

	if(ar1[i]!=ar2[i])
		return "not angram";

}

return "angram";























ar1={1,2,3,4,5}

ar2={2,3}

ans={2,3}


ArrayList<Integer> ans=new ArrayList<>();

HashSet<Integer> seen=new HashSet<>();

for(int i:ar1){
	seen.add(i);
}

for(int i:ar2){

	if(seen.contains(i))
		ans.add(i);
}

return ans;




select empname from emp 

100 sqft

2bhk

ms bedrm=10x15 attack 8*5 bath

2nd bdrm= 11*11 attach bath=6*x5

kitched 8*8

hall 10*10

