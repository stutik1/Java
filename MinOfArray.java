public class MinOfArray {
    public static void main(String[] args){
        int[] arr ={1,3,4};
        int min=arr[0];
        for(int i=1;i<arr.length;i++){
            if(min>arr[i]){
                min=arr[i];
            }
        }
        System.out.println(min);
    }
}
