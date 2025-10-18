class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        helper(nums,ans,new ArrayList<>(),0,new boolean[nums.length]);
        return ans;
    }
    private void helper(int[] arr,List<List<Integer>> ans,List<Integer> curr,int idx,boolean[] vis){
        if(curr.size()==arr.length) {
            ans.add(new ArrayList<>(curr));
            return;
        }
        for(int i=0;i<arr.length;i++){
            if(vis[i]) continue;
            curr.add(arr[i]);
            vis[i]=true;
            helper(arr,ans,curr,idx+1,vis);
            vis[i]=false;
            curr.remove(curr.size()-1);
        }
    }
}
