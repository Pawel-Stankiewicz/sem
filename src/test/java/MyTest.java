import org.junit.jupiter.api.*;
// allows us to import the static methods of a class; Assertions in this case
import static org.junit.jupiter.api.Assertions.*;


class MyTest
{
    @Test
    void unitTest()
    {
        // a static method from Assertions. It is a check to see if two values are equal. If they are not the test will fail.
        assertEquals(5, 5);
    }
    @Test
    void unitTest2()
    {
        assertEquals(5, 4);
    }
    @Test
    void unitTest3()
    {
        assertEquals(5, 5, "Messages are equal");
    }

    @Test
    void unitTest4()
    { //to test floating point values with an error range.
        assertEquals(5.0, 5.01, 0.02);
    }

    @Test
    void unitTest5()
    {
        int[] a = {1, 2, 3};
        int[] b = {1, 2, 3};
        assertArrayEquals(a, b);
    }

    @Test
    void unitTest6()
    { //to test if a value is true.
        assertTrue(5 == 5);
    }

    @Test
    void unitTest7()
    { //to test if a value is false
        assertFalse(5 == 4);
    }

    @Test
    void unitTest8()
    {
        assertNull(null);
    }

    @Test
    void unitTest9()
    {
        assertNotNull("Hello");
    }

    @Test
    void unitTest10()
    { //how to test if a method throws an exception. By default, any exception thrown fails a test if no assertThrows matches
        assertThrows(NullPointerException.class, this::throwsException);
    }

    void throwsException() throws NullPointerException
    {
        throw new NullPointerException();
    }
}