public class ExceptionHandlingDemo {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[3]); // this will throw an ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index is out of bounds!");
        } catch (Exception e) {
            System.out.println("Error: An exception has occurred!");
        } finally {
            System.out.println("This block will always execute, even if an exception occurs.");
        }
    }
}