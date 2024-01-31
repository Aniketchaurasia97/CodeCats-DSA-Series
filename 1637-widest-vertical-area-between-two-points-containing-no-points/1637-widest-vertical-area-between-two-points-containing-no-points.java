import java.util.Arrays;
class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        int max = Integer.MIN_VALUE;
        int[] arr = new int[points.length];
        for(int i=0;i<points.length;i++){
            arr[i] = points[i][0];
        }
        Arrays.sort(arr);
        for(int i=1;i<arr.length;i++){
            int area =0;
            area = (arr[i])-(arr[i-1]);
            if(area>max){
                max = area;
            }
        }
         return max;
    }
}