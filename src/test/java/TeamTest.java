import org.junit.*;
import static org.junit.Assert.*;

public class TeamTest {

  @Test
  public void Team_instantiatesCorrectly_true() {
    Team testTeam = new Team("SeattleTeam");
    assertEquals(true, testTeam instanceof Team);
  }

  @Test
  public void getTeamName_teamInstantiatesWithName_SeattleTeam() {
    Team testTeam = new Team("SeattleTeam");
    assertEquals("SeattleTeam", testTeam.getTeamName());
  }

  @Test
  public void all_returnsAllInstancesOfTeams_true() {
    Team firstTeam = new Team("SeattleTeam");
    Team secondTeam = new Team("BellevueTeam");
    assertEquals(true, Team.all().contains(firstTeam));
    assertEquals(true, Team.all().contains(secondTeam));
  }
//to clear the team array list
  @Test
  public void clear_emptiesAllTeamsFromArrayList_0() {
    Team testTeam = new Team("SeattleTeam");
    Team.clear();
    assertEquals(0, Team.all().size());
  }
//to add an ID to the team
  @Test
  public void getTeamId_teamInstantiateWithAnId_1() {
    Team.clear();
    Team testTeam = new Team("SeattleTeam");
    assertEquals(1, testTeam.getTeamId());
  }
//to find a team based an ID
  @Test
  public void find_returnsTeamWithSameId_secondTeam() {
    Team.clear();
    Team firstTeam = new Team("SeattleTeam");
    Team secondTeam = new Team("BellevueTeam");
    assertEquals(Team.find(secondTeam.getTeamId()), secondTeam);
  }
//to make sure the team instantiates with an empty members list
  @Test
  public void getTeams_initiallyReturnsEmptyList_ArrayList() {
    Team.clear();
    Team testTeam = new Team("SeattleTeam");
    assertEquals(0, testTeam.getMembers().size());
  }

}
