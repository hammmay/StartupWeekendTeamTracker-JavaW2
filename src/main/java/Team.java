import java.util.ArrayList;
import java.util.List;

public class Team {
  private String mNameOfTeam;
  private static List<Team> instancesOfTeam = new ArrayList<Team>();
  private int mTeamId;

  public Team(String nameOfTeam) {
    mNameOfTeam = nameOfTeam;
    instancesOfTeam.add(this);
    mTeamId = instancesOfTeam.size();
  }

  public String getTeamName() {
    return mNameOfTeam;
  }

  public static List<Team> all() {
    return instancesOfTeam;
  }
//method to clear team array
  public static void clear() {
    instancesOfTeam.clear();
  }
//method to get a team's unique ID
  public int getTeamId() {
    return mTeamId;
  }
//method to find a team based on ID
  public static Team find(int teamId) {
    return instancesOfTeam.get(teamId - 1);
  }




}
