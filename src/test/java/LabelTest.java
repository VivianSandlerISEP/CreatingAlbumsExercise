import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LabelTest {
  @Test
  void testgetlabelName(){
      //Arrange
      Label labelName1= new Label("Universal Music Group");

      Label labelName2= new Label("Sony Music Entertainment");

      Label labelName3= new Label("Warner Music Group");

      //Act
      String result1 = labelName1.getlabelName();
      String result2 = labelName2.getlabelName();
      String result3 = labelName3.getlabelName();

     //Assert
      assertEquals("Universal Music Group", result1);
      assertEquals("Sony Music Entertainment",  result2);
      assertEquals("Warner Music Group",  result3);

      /*
      @Test
    void testDifferentLabelsAreNotEqual() {
        // Arrange
        Label label1 = new Label("Universal Music Group");
        Label label2 = new Label("Sony Music Entertainment");

        // Assert - objetos diferentes NÃO devem ser iguais
        assertNotEquals(label1, label2);
    }

    @Test
    void testSameNameLabels() {
        // Arrange
        Label label1 = new Label("Universal Music Group");
        Label label2 = new Label("Universal Music Group");

        // Assert - mesmo nome, mas objetos diferentes
        assertEquals(label1.getName(), label2.getName());  // nomes iguais
        assertNotSame(label1, label2);  // mas objetos diferentes
    }
       */
  }
}