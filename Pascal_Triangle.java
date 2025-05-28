class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> tria=new ArrayList<>();

        for(int i=0;i<numRows;i++){
            List<Integer> line=new ArrayList<>();
            line.add(1);
            for(int j=1;j<i;j++){
                int value=tria.get(i-1).get(j)+tria.get(i-1).get(j-1);
                line.add(value);
            }
            if(i>0)
                line.add(1);
            tria.add(line);


        }
        return tria;
    }
}
