package javafortesters;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.*;


public class TestArray{
    // EX1, EX2
    // Create an array of 3 users with username and password
    // Do assert username at their position are correctly
    // Iterate over the array and System.out.println the name of each User

    @Test
    public void arrayOfUsers()
    {
        int arrayLength=3;
        Account[] accounts= new Account[arrayLength];

        for(int i=0; i<arrayLength;i++)
        {
            accounts[i]= new Account("Username"+(i+1),"Password"+(i+1));
        }

        for(int i =0;i<arrayLength;i++)
        {
            Assert.assertEquals("Username"+(i+1),accounts[i].getUsername());
            Assert.assertEquals("Password"+(i+1),accounts[i].getPassword());
            System.out.println("Username"+(i+1)+": "+accounts[i].getUsername());
            System.out.println("Password"+(i+1)+": "+accounts[i].getPassword());
        }


    }


    @Test
    public void arrayOfUsersWithObject () throws IllegalPassword {
        Account useInfo;

        List<Account> userList = new ArrayList<>();
        //userList.add(new Account("username1","password1")); another way
//        useInfo = new Account();
        for(int i=1; i<=3; i++) {
            useInfo = new Account();
            useInfo.setUsername("username"+i);
            useInfo.setPassword("password"+i);
            userList.add(useInfo);
//          userList.add(new Account ("username"+i ,"password"+i));

        }
        for(Account user:userList)
        {
            System.out.println(user.getUsername() +" " + user.getPassword());
        }

    }

    //EX3:
    //Create an @Test method which instantiates a workdays array, as shown in the examples previously. String[] workdays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
    //Then sort it using Arrays.sort
    //Assert that the order of values in the array are as you expect.

    @Test
    public void workdaysArrayTest()
    {
        String[] worksday = {"Monday","Tuesday","Wednesday","Thursday","Friday"};
        List<String> workdaysArray = Arrays.asList(worksday);
        Collections.sort(workdaysArray);
        //Arrays.sort(worksday); we can use sort array instead of sort list
        List <String> expectedList = Arrays.asList(new String[]{"Friday", "Monday", "Thursday", "Tuesday", "Wednesday"});

        for (String day:workdaysArray)
        {
            System.out.println(day);
        }

        Assert.assertEquals(expectedList,workdaysArray);
    }

    //Create another @Test method so that the workdays have mixed case, and assert the result i.e. {"monday", "Tuesday", "WedNesday", "thursday", "Friday"}


    @Test
    public void mixedWorkdays_2()
    {
        String[] worksday = {"monday","Tuesday","WedNesday","thursday","Friday"};
        Arrays.sort(worksday);
        String[] expectedList = {"Friday", "Tuesday", "WedNesday", "monday", "thursday"};
        for (String day:worksday)
        {
            System.out.println(day);
        }

        Assert.assertEquals(expectedList,worksday);
    }

    //EX4:
    //Create an array which can hold 100 user objects.
    //
    //Use a for loop to fill the array with User objects having the following username, password combinations (e.g user1, password1, user2, password2...)
    //
    //Find a way to check the array was created
    //
    //For bonus points, write some code to assert that the array was filled properly

    @Test
    public void arrayOf100Users()
    {
        List<String> userList = new ArrayList<String>();
        for(int i=1;i<=200;i++)
        {
            userList.add("username"+i);
            userList.add("password"+i);
        }
        for (String user:userList)
        {
            System.out.println(user);
        }
        Assert.assertEquals("username1",userList.get(0));
        Assert.assertEquals("password50",userList.get(99));
    }

    @Test
    public void arrayOfUsersWithObject_2 () throws IllegalPassword {
        Account userInfo;

        List<Account> userList = new ArrayList<>();
        for(int i=1; i<=100; i++) {
            userInfo = new Account();
            userInfo.setUsername("username"+i);
            userInfo.setPassword("password"+i);
            userList.add(userInfo);
        }
        for(Account user:userList)
        {
            System.out.println(user.getUsername() +" " + user.getPassword());
        }

//        for(int i=1; i<=100; i++) {
//            Assert.assertEquals("username" + i + " " + "password" +i, user.getUsername() + " " + user.getPassword());
//        }
        int j=1;
        for(Account user:userList)
        {
            Assert.assertEquals("username" + j + " " + "password" +j, user.getUsername() + " " + user.getPassword());
            j++;
        }

    }
}

