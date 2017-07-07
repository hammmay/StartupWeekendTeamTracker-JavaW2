import java.util.ArrayList;
import java.util.List;

public class Member {
  private String mMemberName;
  private static List<Member> instancesOfMembers = new ArrayList<Member>();
  private int mMemberId;
//method to instantiate member object
  public Member(String memberName) {
    mMemberName = memberName;
    instancesOfMembers.add(this);
    mMemberId = instancesOfMembers.size();
  }
//method to get name of member object
  public String getMemberName() {
    return mMemberName;
  }
//method to get all names of all member objects added to the member array
  public static List<Member> all() {
    return instancesOfMembers;
  }
//method to clear member array
  public static void clear() {
    instancesOfMembers.clear();
  }
//method to get a member's unique ID
  public int getMemberId() {
    return mMemberId;
  }
//method to find a member based on ID
  public static Member find(int memberId) {
    return instancesOfMembers.get(memberId - 1);
  }







}
