package function.func;

import java.util.Arrays;

public class FuncTest2 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int[] scores=new int[]{89,-23,64,91,119,52,73};
		FuncTest2 ft2=new FuncTest2();
        System.out.println("考试成绩的前三名为:");
        ft2.getArrays(scores);		
	}
	public void getArrays(int[] nums) {
		int effective=1;
		Arrays.sort(nums);
		System.out.println(nums[0]);
		for(int i=nums.length-1;i>0;i--) {
			if(nums[i]<0||nums[i]>100) 
				continue;			
			if(effective++>3) 
				break;
			System.out.println(nums[i]);			
		}		
	}
}
