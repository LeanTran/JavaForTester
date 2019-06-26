package javafortesters;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.*;

public class SelectionAndDecisionsTest {

    //an @Test method that uses an if statement without a set of braces {} to assertTrue on truthy, if truthy is true.
    @Test
    public void ifTruthyIsTrue() {
        boolean truthy = true;
        if (truthy == true) {
            System.out.print("Truthy is true");
        }

    }

    //an @Test method that uses an if statement that when truthy is true, assertsTrue on truthy, and assertsFalse on !truthy
    @Test
    public void ifTruthyIsTrueOrIsNotTrue() {
        boolean truthy = true;
        if (truthy == true) {
            assertTrue(truthy);
            assertFalse(!truthy);

        }

    }


    //an @Test method that uses an if statement without a set of braces {} to assertTrue on truthy, if truthy is true, otherwise it uses assertFalse on truthy.
    @Test
    public void ifTruthyIsTrueElseIsNotTrue() {
        boolean truthy = true;
        if (truthy == true) {
            assertTrue(truthy);

        } else {
            assertFalse(truthy);
        }

    }

    //an @Test method that uses an if statement that if truthy is true, assertsTrue on truthy, and assertsFalse on !truthy, otherwise it uses assertFalse on truthy
    @Test
    public void ifElseCheckTruthy() {
        boolean truthy = true;
        if (truthy == true) {
            assertTrue("assertTrue on truthy",truthy);
            assertFalse("assertFalse on !truthy",!truthy);

        } else {
            assertFalse("assertFalse",truthy);
        }

    }


    //Write the following pseudo-code as Java in an @Test method
    @Test
    public void ifElseStatementWithPseudoCode()
    {
        boolean truthy = true;
        boolean falsey = false;
        if (truthy)
        {
            if(!falsey)
            {
                if(truthy && !falsey)
                {
                    if(falsey || truthy) {
                        assertTrue("assert truthy is true", truthy);
                        assertFalse("assert falsey is false", falsey);
                    }
                }
                else
                {
                    assertTrue("assert truthy is true",truthy);
                    assertFalse("assert falsey is false",truthy);
                }
            }
        }
        else
        {
            if(!truthy)
            {
                if(falsey)
                {
                    assertFalse("assert falsey is true ", truthy);
                    assertTrue("assert truthy is false ", falsey);
                }
                else
                {
                    assertFalse("assert falsey is false",falsey);
                    assertTrue("assert truthy is false",falsey);
                }
            }
        }
    }



    //  a method to return a String depending on the shortCode passed in as a parameter to the method

    public String returnStringDependOnShortCode(String shortCode)
    {
        switch (shortCode.toUpperCase())
        {
            case "UK":
                shortCode = "United Kingdom";
                System.out.println("United Kingdom");
                break;
            case "US":
                shortCode = "United States";
                System.out.println("United States");
                break;
            case "USA":
                shortCode = "United States";
                System.out.println("United States ");
                break;
            case "FR":
                shortCode = "France";
                System.out.println("France");
                break;
            case "SE":
                shortCode = "Sweden";
                System.out.println("Sweden");
                break;
            default:
                shortCode = "Rest Of World";
                System.out.println("Rest Of World");

        }
    return shortCode;
    }

    @Test
    public void checkOutputStringDependOnShortCode1()
    {
        String returnedString1 = returnStringDependOnShortCode("uk");
        assertEquals("United Kingdom",returnedString1);
        String returnedString2 = returnStringDependOnShortCode("uK");
        assertEquals("United Kingdom",returnedString2);
        String returnedString3 = returnStringDependOnShortCode("UK");
        assertEquals("United Kingdom",returnedString3);
        String returnedString4 = returnStringDependOnShortCode("Uk");
        assertEquals("United Kingdom",returnedString4);

        String returnedString5 = returnStringDependOnShortCode("us");
        assertEquals("United States",returnedString5);
        String returnedString6 = returnStringDependOnShortCode("Us");
        assertEquals("United States",returnedString6);
        String returnedString7 = returnStringDependOnShortCode("uS");
        assertEquals("United States",returnedString7);
        String returnedString70 = returnStringDependOnShortCode("US");
        assertEquals("United States",returnedString70);

        String returnedString8 = returnStringDependOnShortCode("fr");
        assertEquals("France", returnedString8);
        String returnedString9 = returnStringDependOnShortCode("fR");
        assertEquals("France", returnedString9);
        String returnedString10 = returnStringDependOnShortCode("Fr");
        assertEquals("France", returnedString10);
        String returnedString11 = returnStringDependOnShortCode("FR");
        assertEquals("France", returnedString11);

        String returnedString12 = returnStringDependOnShortCode("se");
        assertEquals("Sweden", returnedString12);
        String returnedString13 = returnStringDependOnShortCode("sE");
        assertEquals("Sweden", returnedString13);
        String returnedString14 = returnStringDependOnShortCode("Se");
        assertEquals("Sweden", returnedString14);
        String returnedString15 = returnStringDependOnShortCode("SE");
        assertEquals("Sweden", returnedString15);

        String returnedString16 = returnStringDependOnShortCode("dd");
        assertEquals("Rest Of World", returnedString16);
    }
}
