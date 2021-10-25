// SUSHANT SINHA

// 97ms ( 78.91% ) 77.5mb ( 98.96% )

class Bank {
    
    long bal[];

    public Bank(long[] balance) {
        
        bal=new long[balance.length+1];
        
        int i=1;
        
        for(long x:balance)
            bal[i++]=x;
        
        // for(long x:bal)
        //     System.out.println(x);
        
    }
    
    public boolean transfer(int account1, int account2, long money) {
        
        if(account1<1 || account1>bal.length-1 || account2<1 || account2>bal.length-1 || bal[account1]<money)
            return false;
        
        bal[account1]-=money;
        bal[account2]+=money;
        
        return true;
        
    }
    
    public boolean deposit(int account, long money) {
        
        if(account<1 || account>bal.length-1)
            return false;
        
        bal[account]+=money;
        
        return true;
        
    }
    
    public boolean withdraw(int account, long money) {
        
        if(account<1 || account>bal.length-1 || bal[account]<money)
            return false;
        
        bal[account]-=money;
        
        return true;
        
    }
}

/**
 * Your Bank object will be instantiated and called as such:
 * Bank obj = new Bank(balance);
 * boolean param_1 = obj.transfer(account1,account2,money);
 * boolean param_2 = obj.deposit(account,money);
 * boolean param_3 = obj.withdraw(account,money);
 */