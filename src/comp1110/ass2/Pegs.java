package comp1110.ass2;

/**
 * Created by Yicong on 2016/8/17.
 */

/*  _ _ _ _ _ _ an int array first 3 for ball and last 3 for ring
      _ _ _ the first digits 1/0 indicates whether there exists a ball/ring
       the second and third one indicates the direction of openings and connections

            1    2
          6        3
            5   4
*/
public class Pegs {
//    private int[] pegStates;
    private int ballExit, ringExit, ballCon1, ballCon2, ringOpn1, ringOpn2;

    Pegs(int[] states)
    {
//        System.arraycopy(states, 0, this.pegStates, 0, 6); // condensed for loop to transfer array values
        this.ballExit = states[0];
        this.ringExit = states[3];
        this.ballCon1 = states[1];
        this.ballCon2 = states[2];
        this.ringOpn1 = states[4];
        this.ringOpn2 = states[5];

    }

    public int[] getStateArray(Pegs pegs) {
        int[] arr = new int[6];
        arr[0] = this.ballExit;
        arr[1] = this.ballCon1;
        arr[2] = this.ballCon2;
        arr[3] = this.ringExit;
        arr[4] = this.ringOpn1;
        arr[5] = this.ringOpn2;
        return arr;
    }

    public void updateStates(int[] newStates)
    {
//        System.arraycopy(newStates, 0, this.pegStates, 0, 6); // condensed for loop
//        return pegStates;
        this.ballExit = newStates[0];
        this.ballCon1 = newStates[1];
        this.ballCon2 = newStates[2];
        this.ringExit = newStates[3];
        this.ringOpn1 = newStates[4];
        this.ringOpn2 = newStates[5];
    }

    public boolean hasBall() {
        return this.ballExit == 1;
    }

    public boolean hasRing() {
        return this.ringExit == 1;
    }
}
