public class MaxSumofSubarray {
    public static void main(String[] args){
        int[] arr ={4,-2,-3,4,-1,-2,1,5,-3};
        int min=0;
        int max =0;
        int search=0;
        int start =0;
        int end=0;
        for(int i=0;i<arr.length;i++){
            max=max+arr[i];
            if(min<max){
                min=max;
                 start=search;
                 end=arr[i];
            }
            if(max<0){
                max=0;
                search=i+1;
            }
        }
        System.out.println(min + " index " + start +" to" + " " + end);
    }
}
