public class Subarray {
    public static void main(String args[]) {
        int [] arr={5,1,3};
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                for(int k=i;k<=j;k++){
                    System.out.println(arr[k] );
                }
                System.out.println();
            }
        }
    }
}
