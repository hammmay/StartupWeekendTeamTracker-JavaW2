import org.junit.*;
import static org.junit.Assert.*;

public class MemberTest {

  @Test
  public void Member_instantiatesCorrectly_true() {
    Member myMember = new Member("Human");
    assertEquals(true, myMember instanceof Member);
  }

  @Test
  public void getMemberName_instantiatesWithMemberName_Human() {
    Member myMember = new Member("Human");
    assertEquals("Human", myMember.getMemberName());
  }

  @Test
  public void all_returnsAllInstancesOfMember_true() {
    Member firstMember = new Member("Human1");
    Member secondMember = new Member("Human2");
    assertEquals(true, Member.all().contains(firstMember));
    assertEquals(true, Member.all().contains(secondMember));
  }

  @Test
  public void clear_emptiesAllMembersFromArrayList_0() {
    Member testMember = new Member("Human1");
    Member.clear();
    assertEquals(0, Member.all().size());
  }

  @Test
  public void getMemberId_memberInstantiateWithAnId_1() {
    Member.clear();
    Member testMember = new Member("Human1");
    assertEquals(1, testMember.getMemberId());
  }

  @Test
  public void find_returnsMemberWithSameId_secondMember() {
    Member.clear();
    Member firstMember = new Member("Human1");
    Member secondMember = new Member("Human2");
    assertEquals(Member.find(secondMember.getMemberId()), secondMember);
  }

}
