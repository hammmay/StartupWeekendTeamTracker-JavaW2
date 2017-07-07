import org.junit.*;
import static org.junit.Assert.*;

public class MemberTest {

  @Test
  public void Member_instantiatesCorrectly_true() {
    Member myMember = new Member("Human");
    assertEquals(true, myMember instanceof Member);
  }

  @Test
  public void Member_instantiatesWithMemberName_String() {
    Member myMember = new Member("Human");
    assertEquals("Human", myMember.getMemberName());
  }

}
