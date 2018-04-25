class Solution {
    public int minTotalDistance(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        List<Integer> row = new ArrayList<>();
        List<Integer> col = new ArrayList<>();
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(grid[i][j] == 1){
                    row.add(i);
                }
            }
        }

        for(int j = 0; j < n; j++){
            for(int i = 0; i < m; i ++){
                if(grid[i][j] == 1){
                    col.add(j);
                }
            }
        }

        return getMin(row) + getMin(col);
    }

    private int getMin(List<Integer> list){
        int left = 0;
        int right = list.size() -1;
        int sum = 0;
        while(left < right){
            sum += list.get(right--) - list.get(left++);
        }
        return sum;
    }
}