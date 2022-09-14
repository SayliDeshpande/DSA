class CountPrime {
    public int countPrimes(int n) {
      // this is brute force approach , which is not efficient
      /* int count=0;
        for (int i = 2; i < n; i++) {
             if(ifPrime(i))
                count++;
        }
        return count;
    }
     public boolean ifPrime(int n) {
         for(int j=2;j*j<=n;j++){
             if(n % j==0){
               return false;
           }
         }
        return true;*/
      
      // Approach #2 :
      
        //initially all the values in this boolean array are false
        boolean[] notPrime = new boolean[n];
        int count = 0;
        for (int i = 2; i < n; i++) {
            //let's say, value false in an array means number is prime
            if (notPrime[i] == false) {
                count++;
                for (int j = i*2; j <n; j+=i) {
                    notPrime[j] = true; // making all factors of the number as true, since //these are factors , they cannot be prime
                }
            }
        }
        return count;
    
    }
}
