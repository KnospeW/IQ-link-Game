package comp1110.ass2;

/**
 * Created by Administrator on 2016/8/17.
 */

//  _ _ _ _ _ _ an int array first 3 for ball and last 3 for ring
  //  _ _ _ the first digits 1/0 indicates whether there exists a ball/ring
    // the second and third one indicates the direction of openings and connections

    //      1    2
    //    6        3
    //      5   4
public class Pegs {
    public int [] pegStates= new int[6];
    int ballExit=0;
    int ringExit=0;
    int ballCon1,ballCon2,ringOpn1,ringOpn2;

    public Pegs(int[] states)
    {
        for (int i=0;i<6;i++) {
            pegStates[i]=states[i];
        }
        this.ballExit=states[0];
        this.ringExit=states[3];
        this.ballCon1=states[1];
        this.ballCon2=states[2];
        this.ringOpn1=states[4];
        this.ringOpn2=states[5];

    }
    public int[] uptateStates(int [] newstates)
    {
        for(int i=0;i>6;i++)
        {pegStates[i]=newstates[i];}
        return pegStates;

    }
}
