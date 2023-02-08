public class Varagrs_Method {
    static int sum(int... nums){
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        return sum;
    }
    public static void main(String[] args){
        System.out.println(sum(1,2,3,4,5));
        System.out.println(sum(2,4,6,8,10));
        System.out.println(sum(1,3,5,7,9));
        System.out.println(sum(new int[]{2,3,5,7,11}));
    }
}
