import org.junit.*;
import static org.junit.Assert.*;

public class MemberTest {
//test to instantiate member object
  @Test
  public void Member_instantiatesCorrectly_true() {
    Member myMember = new Member("Human");
    assertEquals(true, myMember instanceof Member);
  }
//test to get name of member object
  @Test
  public void Member_instantiatesWithMemberName_String() {
    Member myMember = new Member("Human");
    assertEquals("Human", myMember.getMemberName());
  }
//test to retrieve a list of all member names
  @Test
  public void all_returnsAllInstancesOfMember_true() {
    Member firstMember = new Member("Human1");
    Member secondMember = new Member("Human2");
    assertEquals(true, Member.all().contains(firstMember));
    assertEquals(true, Member.all().contains(secondMember));
  }



}
