class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int result[] = new int[arr1.length];
        Map<Integer, Integer> map = new HashMap<>();

        for(int num : arr1){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        int index = 0;

        for(int num : arr2){
            int count = map.get(num);
            for(int i = 0 ; i < count ; i++){
                result[index++] = num;
            }
            map.remove(num);
        }
        List<Integer> list = new ArrayList<>();

        for(int num : map.keySet()){
            int count = map.get(num);

            for(int i = 0 ; i < count ; i++){
                list.add(num);
            }
        }
        Collections.sort(list);

        for(int num : list){
            result[index++] = num;
        }
        

        return result;
    }
}