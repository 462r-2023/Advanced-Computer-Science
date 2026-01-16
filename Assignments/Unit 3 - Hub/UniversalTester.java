public class UniversalTester {
    public static void main(String[] args) {
        Hub hub = new Hub();
        Student newStudent;
        try {
            newStudent = hub.registerStudent("John Student", "1111", null);
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("An error occurred when the email was null, as intended.\n");
        }
        try {
            newStudent = hub.registerStudent("John Student", "1111", "");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("An error occurred when the email was empty, as intended.\n");
        }
        try {
            newStudent = hub.registerStudent("John Student", "1111", "invalidemail.hotmail.com");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("An error occurred when the email was invalid, as intended.\n");
        }
        try {
            newStudent = hub.registerStudent("John@Student", "1111", "validemail@hotmail.com");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("An error occurred when the name had an @, as intended.\n");
        }
        newStudent = hub.registerStudent("John Student", "1111", "validemail@hotmail.com");
        try {
            newStudent = hub.registerStudent("John Student", "1111", "validemail@hotmail.com");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println(
                    "An error occurred when the same student was created twice, as intended.\n");
        }
        Student sameStudent;
        try {
            sameStudent = hub.loginStudent("Joe Student", "1112");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println(
                    "An error occurred when an invalid username was input, as intended.\n");
        }
        try {
            sameStudent = hub.loginStudent("John Student", "1112");
        } catch (Exception e) {
            System.out.println(e);
            System.out
                    .println("An error occurred when the wrong password was input, as intended.\n");
        }
        sameStudent = hub.loginStudent("John Student", "1111");
        sameStudent.resetPassword();

        try {
            sameStudent.submitAssignment(null, "This assignment is designed to break the student.");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println(
                    "An error occurred when the student submitted an assignment with a null name, as intended.\n");
        }

        try {
            sameStudent.submitAssignment("", "This assignment is designed to break the student.");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println(
                    "An error occurred when the student submitted an assignment with a blank name, as intended.\n");
        }

        try {
            sameStudent.submitAssignment("Invalid assignment", null);
        } catch (Exception e) {
            System.out.println(e);
            System.out.println(
                    "An error occurred when the student submitted an assignment with a null description, as intended.\n");
        }

        try {
            sameStudent.submitAssignment("Invalid assignment", "");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println(
                    "An error occurred when the student submitted an assignment with a blank description, as intended.\n");
        }

        for (int i = 0; i < 5; i++) {
            sameStudent.submitAssignment("Several page Spanish packet",
                    "250 word essay must be written seperately.");
        }
        try {
            sameStudent.submitAssignment("Invalid assignment",
                    "This assignment is designed to break the student.");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println(
                    "An error occurred when the student submitted too many assignments, as intended.\n");
        }
    }
}
