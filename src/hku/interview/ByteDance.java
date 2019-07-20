package hku.interview;
public class ByteDance {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,8,9}, {2,4,9,12}, {4,7,10,13}, {6,8,11,15}};
        int target = 6;
        System.out.println(solu(matrix, target));
    }

    public static boolean solu(int[][] matrix, int target){
        boolean res = false;
        int index = 0;
        int x, y;
        for(index = 0; index < matrix[0].length; index ++){
            if(res == true){
                break;
            }
            if(target < matrix[matrix.length -1 - index][index]){
                //在y = index的列中二分查找
                y = index;
                for(x = matrix.length -1 - index; x >= 0 ; x --){
                    if(matrix[x][y] == target){
                        res = true;
                        break;
                    }
                }
            }
            else if(target > matrix[matrix.length -1 - index][index]){
                //在 x = matrix.length - 1 - index的行中二分查找
                x = matrix.length - 1 - index;
                for(y = index; y < matrix[0].length; y ++){
                    if(matrix[x][y] == target){
                        res = true;
                        break;
                    }
                }
            }
            else{
                res = true;
                break;
            }
        }
        return res;
    }
}