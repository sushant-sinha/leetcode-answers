n=6
13
ar={1,4,45,6,10,8}

{1,6,4,45,10,8}

13-1=12

12-6=6 X

12-4=8


int ans=0;

int sum=13;
for(int i=0;i<n-2;i++){

	int temp=sum-ar[i];

	for(int j=i+1;j<n-1;j++){

		int toFind=temp-ar[j];

		/*// if(seen.contains(toFind)){
		print
	}
	*/

		for(int k=j+1;k<n;k++){
			if(ar[k]==toFind){
				System.out.println(ar[i]+" "+ar[j]+" "+af[k]);
			}
		}
	}

}