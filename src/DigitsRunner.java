public class DigitsRunner
{
    public static void main(String[] args)
    {
        Digits d = new Digits(8675309);
        System.out.println(d.getDigitList());
         System.out.println(d.isStrictlyIncreasing());
    }
}