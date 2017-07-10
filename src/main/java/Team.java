import java.util.ArrayList;
import java.util.List;

public class Team {
  private String mNameOfTeam;
  private static List<Team> instancesOfTeam = new ArrayList<Team>();
  private int mTeamId;
  private List<Member> mMembers;

  public Team(String nameOfTeam) {
    mNameOfTeam = nameOfTeam;
    instancesOfTeam.add(this);
    mTeamId = instancesOfTeam.size();
    mMembers = new ArrayList<Member>();
  }

  public String getTeamName() {
    return mNameOfTeam;
  }

  public static List<Team> all() {
    return instancesOfTeam;
  }

  public static void clear() {
    instancesOfTeam.clear();
  }

  public int getTeamId() {
    return mTeamId;
  }

  public static Team find(int teamId) {
    return instancesOfTeam.get(teamId - 1);
  }

  public List<Member> getMembers() {
    return mMembers;
  }

  public void addMember(Member member) {
    mMembers.add(member);
  }
}
