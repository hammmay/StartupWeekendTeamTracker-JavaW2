import java.util.List;
import java.util.ArrayList;

public class Team {
  private String mNameOfTeam;
  private static List<Team> instancesOfTeam = new ArrayList<Team>();

  public Team(String nameOfTeam) {
    mNameOfTeam = nameOfTeam;
    instancesOfTeam.add(this);
  }

  public String getTeamName() {
    return mNameOfTeam;
  }

  public static List<Team> all() {
    return instancesOfTeam;
  }

}
