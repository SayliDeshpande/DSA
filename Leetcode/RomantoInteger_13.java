class RomantoInteger_13 {
    //Queston to ask : can we assume input string is always valid?
    static Map<String, Integer> map = new HashMap<>();
    static {
        //hard-code a mapping with the value of each symbol 
        map.put("I", 1);
        map.put("V", 5);
        map.put("X", 10);
        map.put("L", 50);
        map.put("C", 100);
        map.put("D", 500);
        map.put("M", 1000);
    }
    public int romanToInt(String s) {
        String lastSymbol = s.substring(s.length() - 1);
        int lastValue = map.get(lastSymbol);
        int total = lastValue;

        for(int i = s.length() - 2 ; i >= 0 ; i--){
            String currentSymbol = s.substring(i, i + 1);  
            int currValue = map.get(currentSymbol);
            //when a smaller valued symbol is before a larger valued symbol,
            // remmember, here we are iterating from last
            if(currValue < lastValue){ 
                total -= currValue; //we need to subtract the large from the small
            }else{
                total += currValue; // else add
            }      
            lastValue = currValue;
        }

        return total;

    }
}
