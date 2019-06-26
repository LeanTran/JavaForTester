package javafortesters;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Random;


public class RandomDataTest<bytes> {

    Random generate = new Random();
    @Test
    public void checkRandomDataForInt() {

        for (int i = 0; i < 10; i++) {
            int n = generate.nextInt();

            Assert.assertTrue(n >= Integer.MIN_VALUE);
            Assert.assertTrue(n <= Integer.MAX_VALUE);
            System.out.println("random between min n max: " + n);
        }
    }


    @Test
    public void checkRandomDataForBoolean() {
        for (int i = 0; i < 10; i++) {
            boolean n = generate.nextBoolean();

            if (n==true) {
                Assert.assertTrue(n);
                System.out.println("true : " + n);
            }
            else {
                Assert.assertFalse(n);
                System.out.println("false : " + n);
            }
        }
    }

    //nextLong generates a long between Long.MIN_VALUE and Long.MAX_VALUE
    @Test
    public void checkRandomDataForLong() {

        for (int i = 0; i < 10; i++) {
            long n = generate.nextLong();

            Assert.assertTrue(n >= Long.MIN_VALUE);
            Assert.assertTrue(n <= Long.MAX_VALUE);
            System.out.println("random between min n max: " + n);
        }
    }


    @Test
    public void checkRandomDataForFloat() {

        for (int i = 0; i < 10; i++) {
            float n = generate.nextFloat();

            Assert.assertTrue(n >= 0.0f);
            Assert.assertTrue(n <= 1.0f );
            System.out.println("random between 0.0f and 1.0f: " + n);
        }
    }

//    nextDouble generates a double between 0.0d and 1.0d
    @Test
    public void checkRandomDataForDouble() {

        for (int i = 0; i < 10; i++) {
            double n = generate.nextDouble();

            Assert.assertTrue(n >= 0.0d);
            Assert.assertTrue(n <= 1.0d );
            System.out.println("random between 0.0d and 1.0d: " + n);
        }
    }

//    nextBytes fills a byte[] with random data
    @Test
    public void checkRandomDataForByte()
    {
        byte[] b = new byte[100];
        for (int i=0;i<10;i++)
        {
            new Random(System.currentTimeMillis()).nextBytes(b);
            System.out.println("Random byte:" + b[i]);
        }

    }
//    nextInt(x) generates and int from 0 to x-1
    @Test

    public void checkRandomDataForSpecificInt() {
        int x=50;
        for (int i = 0; i < 10; i++) {
            int n = generate.nextInt(x);

            Assert.assertTrue(n >= 0);
            Assert.assertTrue(n <= x-1);
            System.out.println("random between 0-> "+ x+"-1: " + n);
        }
    }

    //Generate a random string, 100 characters long, containing the characters ' ' (space) and 'A' to 'Z'.

    @Test
    public void randomStringIncludeSpaceAndAtoZ() {

        int stringLength = 100;
        String tempString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ ";
        Random random = new Random();
        for (int i = 0; i < stringLength; i++) {
            int randomInt = random.nextInt(tempString.length());
            System.out.print(tempString.charAt(randomInt));
        }

    }


}
