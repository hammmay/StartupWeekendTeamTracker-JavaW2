import java.util.ArrayList;
import java.util.List;

public class Member {
  private String mMemberName;
  private static List<Member> instancesOfMembers = new ArrayList<Member>();
//method to instantiate member object
  public Member(String memberName) {
    mMemberName = memberName;
    instancesOfMembers.add(this);
  }
//method to get name of member object
  public String getMemberName() {
    return mMemberName;
  }
//method to get all names of all member objects added to the member array
  public static List<Member> all() {
    return instancesOfMembers;
  }
}
