import java.util.ArrayList;
import java.util.List;

public class Member {
  private String mMemberName;
  private static List<Member> instancesOfMembers = new ArrayList<Member>();
  private int mMemberId;

  public Member(String memberName) {
    mMemberName = memberName;
    instancesOfMembers.add(this);
    mMemberId = instancesOfMembers.size();
  }

  public String getMemberName() {
    return mMemberName;
  }

  public static List<Member> all() {
    return instancesOfMembers;
  }

  public static void clear() {
    instancesOfMembers.clear();
  }

  public int getMemberId() {
    return mMemberId;
  }

  public static Member find(int memberId) {
    return instancesOfMembers.get(memberId - 1);
  }
}
