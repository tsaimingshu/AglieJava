package sis.studentinfo;

/**
 * Created by sixleaves on 16/8/11.
 */
public class StudentTest1 extends junit.framework.TestCase {
    public void testCreate() {
        // 请重构代码, 并说明原因
        final String firstStudentName = "SuWeiPeng";
        Student firstStudent = new Student(firstStudentName);
        assertEquals(firstStudent.getName(), firstStudentName);

        final String secondStudentName = "WangDongLiang";
        Student secondStudent = new Student(secondStudentName);
        assertEquals(secondStudent.getName(), secondStudentName);
    }

    public void testFullTime() {
        Student student = new Student("a");
        assertFalse(student.isFullTime());
    }

    public void testCredits() {
        Student student = new Student("a");
        assertEquals(0, student.getCredits());
        student.addCredits(1);
        assertEquals(1, student.getCredits());
        student.addCredits(5);
        assertEquals(6, student.getCredits());
    }

    public void testStudentStatus() {
        Student student = new Student("a");
        assertFalse(student.isFullTime());
        student.addCredits(3);
        assertFalse(student.isFullTime());
        student.addCredits(7);
        assertFalse(student.isFullTime());
        student.addCredits(2);
        assertTrue(student.isFullTime());
        assertEquals(12, student.getCredits());
        student.addCredits(3);
        assertTrue(student.isFullTime());
        student.addCredits(-3);
        assertTrue(student.isFullTime());
        student.addCredits(-13);
        assertFalse(student.isFullTime());
    }
}
