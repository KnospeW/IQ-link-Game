package comp1110.ass2;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertTrue;

/**
 * Created by Administrator on 2016/9/17.
 */
public class updatePegsPiecePlacementTest {
    @Test
    public void testUnrotated()
    {
      String PiecePlacement="HBA";
      int states[]=LinkGame.updatePegsPiecePlacement(PiecePlacement);
        assertTrue("there should be a ring with no opening in the origin but got "+Arrays.toString(states),states[0]==0&&states[3]==1&&states[4]==0&&states[5]==0);
        assertTrue("there should be a ball with connection3 in the br1 but got "+ Arrays.toString(states),states[6]==1&&states[7]==4&&states[8]==0&&states[9]==0);
        assertTrue("there should be a ring with opening2 in the br2 but got "+Arrays.toString(states),states[12]==0&&states[15]==1&&states[16]==3&&states[17]==0);
    }
    @Test
    public void testrotating()
    {
        String PiecePlacement0="WEB";
        int states[]=LinkGame.updatePegsPiecePlacement(PiecePlacement0);
        assertTrue("there should be a ring with no opening in the origin but got "+Arrays.toString(states),states[0]==0&&states[3]==1&&states[4]==0&&states[5]==0);
        assertTrue("there should be a ball with connection4 in the br1 but got "+Arrays.toString(states),states[6]==1&&states[7]==5&&states[8]==0&&states[9]==0);
        assertTrue("there should be a ring with opening1 in the br2 but got "+Arrays.toString(states),states[12]==0&&states[15]==1&&states[16]==2&&states[17]==0);
        String PiecePlacement1="MID";
        int states1[]=LinkGame.updatePegsPiecePlacement(PiecePlacement1);
        assertTrue("there should be a ball with connection34 in the origin but got "+Arrays.toString(states),states1[0]==1&&states1[1]==4&&states1[2]==5&&states1[3]==0);
        assertTrue("there should be a ball with connection6 in the br1 but got "+Arrays.toString(states),states1[6]==1&&states1[7]==1&&states1[8]==0&&states1[9]==0);
        assertTrue("there should be a ring with opening4 in the br2 but got "+Arrays.toString(states),states1[12]==0&&states1[15]==1&&states1[16]==5&&states1[17]==0);
    }
    @Test
    public void testflip()
    {
        String PiecePlacement0="CGL";
        int states[]=LinkGame.updatePegsPiecePlacement(PiecePlacement0);
        assertTrue("there should be a ring with no opening in the origin but got "+Arrays.toString(states),states[0]==0&&states[3]==1&&states[4]==0&&states[5]==0);
        assertTrue("there should be a ball with connection4 in the br1 but got "+Arrays.toString(states),states[6]==1&&states[7]==4&&states[8]==0&&states[9]==0);
        assertTrue("there should be a ball with connection1 in the br2 but got "+Arrays.toString(states),states[12]==1&&states[13]==1&&states[14]==0&&states[15]==0);
        String PiecePlacement1="LKH";
        int states1[]=LinkGame.updatePegsPiecePlacement(PiecePlacement1);
        assertTrue("there should be a ring with opening4 in the origin but got "+Arrays.toString(states),states1[0]==0&&states1[3]==1&&states1[4]==4&&states1[5]==0);
        assertTrue("there should be a ball with connection4 in the br1 but got "+Arrays.toString(states),states1[6]==1&&states1[7]==4&&states1[8]==0&&states1[9]==0);
        assertTrue("there should be a ball with connection3 in the br2 but got "+Arrays.toString(states),states1[12]==1&&states1[13]==3&&states1[14]==0&&states1[15]==0);
    }

    }

