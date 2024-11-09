class Solution {
    public int removeDuplicates(int[] nums) {
    if(nums.length==0)
	{
		return 0;
	}
	int res=0;
	for(int j=1;j<nums.length;j++)
	{
		if(nums[j]!=nums[res])
		{
			res++;
			nums[res]=nums[j];
		}
	}
	return res+1;
    }
}