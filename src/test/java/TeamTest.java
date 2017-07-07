import org.junit.*;
import static org.junit.Assert.*;

public class TeamTest {

  @Test
  public void Team_instantiatesCorrectly_true() {
    Team testTeam = new Team("Team 1");
    assertEquals(true, testTeam instanceof Team);
  }

  @Test
  public void getTeamName_teamInstantiatesWithName_SeattleTeam() {
    Team testTeam = new Team("SeattleTeam");
    assertEquals("SeattleTeam", testTeam.getTeamName());
  }


}
