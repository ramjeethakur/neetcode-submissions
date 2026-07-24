class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int fleet=0;
        double max=0.0;
        List<Pair> list=new ArrayList<>();
        for(int i=0;i<position.length;i++)
            list.add(new Pair(position[i], speed[i]));
        
        list.sort((p1,p2)->Integer.compare(p2.pos, p1.pos));

        for(Pair pair : list){
            int currPos=pair.pos;
            int currSped=pair.sped;
            double time=((double)(target-currPos))/((double)currSped);
            if(time>max){
                fleet++;
                max=time;
            }
        }
        return fleet;
    }
}

class Pair{
    int pos;
    int sped;
    Pair(int pos, int sped){
        this.pos=pos;
        this.sped=sped;
    }
}
