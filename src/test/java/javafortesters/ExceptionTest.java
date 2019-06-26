package javafortesters;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class ExceptionTest
{

    //EX1: Fix the NullPointerException in the code (at Example: NullPointerException error)
    @Test
    public void throwANullPointerException()
    {
        Integer age = null;
        String ageAsString;
        try {
            ageAsString = age.toString();
        } catch (NullPointerException e) {
            age = 18;
            ageAsString = age.toString();
        }
        String yourAge = "You are " + ageAsString + " years old";

        assertEquals("You are 18 years old", yourAge);
    }

    //EX2: Use a different exception ArithmeticException instead of NullPointerException and see what happens

    @Test
    public void throwArithmeticException()
    {
        Integer age = null;
        String ageAsString;
        try {
            ageAsString = age.toString();
        } catch (ArithmeticException e) {
            age = 18;
            ageAsString = age.toString();
        }
        String yourAge = "You are " + ageAsString + " years old";

        assertEquals("You are 18 years old", yourAge);
    }


    //EX3: Don't fix the cause of the exception, remove the age = 18, statement from within the catch block. And see what happens
    @Test
    public void throwArithmeticExceptionRemoveAgeValue()
    {
        Integer age = null;
        String ageAsString;
        try {
            ageAsString = age.toString();
        } catch (ArithmeticException e) {
            ageAsString = age.toString();
        }
        String yourAge = "You are " + ageAsString + " years old";

        assertEquals("You are 18 years old", yourAge);
    }

   //EX4:
    //
    //Catch a Checked Exception. Use NoSuchMethodException instead of NullPointerException and see what happens
   @Test
   public void useNoSuchMethodException () throws NoSuchMethodException {
       Integer age = null;
       String ageAsString;
       ageAsString = age.toString();
       String yourAge = "You are " + ageAsString + " years old";
       assertEquals("You are 18 years old", yourAge);
   }


   //EX5: Add getMessage, getStrackTrace, printStrackTrace into your catch block (TryCatch example) and see what information you get from the exception itself
    @Test
    public void getInfoFromException()
    {
        Integer age = null;
        String ageAsString;
        try{
            ageAsString = age.toString();
        }catch(NullPointerException e){
            //System.out.println("Message of getMessage method is:" +e.getMessage());

            /*
            StackTraceElement[] stkTrace=e.getStackTrace();
            System.out.println("The lines of code which led up to the throwing of the exception are from here:");
            for (int i=0; i<stkTrace.length;i++) {
                System.out.println(stkTrace[i].toString());
            }
            */
            System.out.println("The stack trace to the error output stream is from here:");
            e.printStackTrace();
            age = 18;
            ageAsString = age.toString();
        }
    }
}
