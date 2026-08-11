class Solution {
    public int totalFruit(int[] arr) {
        return total(arr);
    }

    public static int total(int[] arr){
        int i = 0; //start of window
        int j = 0; //end of window
        HashMap<Integer, Integer> map =  new HashMap<>();
        int maxFruit  = 0;
        while(j < arr.length){
            int add = arr[j];
            map.put(add, map.getOrDefault(add, 0) + 1);
              
              if(map.size() <= 2){ //   basket = 2
                  maxFruit = Math.max(maxFruit, j-i+1);
              }else{
                while(map.size() > 2){
                    int remve =  arr[i];
                    map.put(remve, map.get(remve)-1);

                    if(map.get(remve) == 0){
                        map.remove(remve);
                    }
                    i++;
                }
              }
              j++;
        
        }
        return maxFruit;
    }
}