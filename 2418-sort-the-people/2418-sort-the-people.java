class Solution 
{
    public String[] sortPeople(String[] names, int[] heights) 
    {
        HashMap<Integer,String> map=new HashMap<>();

        for(int i=0;i<names.length;i++)
        {
            map.put(heights[i],names[i]);
        }

        Arrays.sort(heights);
        String names2[]=new String[names.length];
        int k=0;
        for(int i=heights.length-1;i>=0;i--)
        {
            names2[k]=map.get(heights[i]);
            k++;
        }
        return names2;
    }
}