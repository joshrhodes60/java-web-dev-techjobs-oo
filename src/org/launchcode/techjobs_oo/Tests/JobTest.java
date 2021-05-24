package org.launchcode.techjobs_oo.Tests;
import org.junit.Assert;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;
import org.junit.Before;

import javax.naming.Name;

import static org.junit.Assert.*;

public class JobTest {
    Job job1,job2,job3,job4,job5;

//    private int id;
//    private Employer Employer;
//    private String name;
//    private Location Location;
//    private PositionType PositionType;
//    private CoreCompetency CoreCompetency;

    @Before
        public void createJobTest() {
             job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
             job2 = new Job("Web Developer", new Employer("LaunchCode"), new Location("St. Louis"), new PositionType("Front-end developer"), new CoreCompetency("JavaScript"));
            job3 = new Job("Ice cream taster", new Employer(""), new Location("Home"), new PositionType("UX"), new CoreCompetency("Taste"));
            job4 = new Job();
            job5 = new Job();
        }

    @Test
    public void testSettingJobId() {
        assertTrue(job4.getId() != job5.getId());
        assertTrue(job5.getId() - job4.getId() == 1);
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Assert.assertEquals("ACME",job1.getEmployer().toString());
        Assert.assertEquals("Product tester",job1.getName());
        Assert.assertEquals( "Desert", job1.getLocation().toString());
        Assert.assertEquals( "Quality control", job1.getPositionType().toString());
        Assert.assertEquals( "Persistence", job1.getCoreCompetency().toString());
    }

    @Test
    public void testJobsForEquality() {
        job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        job2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Assert.assertEquals(false,job1.equals(job2));
    }

    private void assertEquals(boolean b) {
    }



    @Test
    public void testForToString(){
        job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Assert.assertEquals(  "JobTest{\nid=6, Employer=ACME, name='Product tester', Location=Desert, PositionType=Quality control, CoreCompetency=Persistence\n}", job1.toString());
        job1 = new Job("Product tester", new Employer(""), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency(""));
        Assert.assertEquals(  "JobTest{\nid=7, Employer=Data not available, name='Product tester', Location=Desert, PositionType=Quality control, CoreCompetency=Data not available\n}", job1.toString());
    }

    @Test
    public void testFirstRequirement(){
        job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Assert.assertEquals(  "JobTest{\nid=6, Employer=ACME, name='Product tester', Location=Desert, PositionType=Quality control, CoreCompetency=Persistence\n}", job1.toString());

        System.out.println( "\n".isBlank() );
    }

    @Test
    public void testSecondRequirement() {
        job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Assert.assertEquals(  "\n ID: 6\n Name: Product tester\n Employer: ACME\n Location: Desert\n PositionType: Quality control\n CoreCompetency: Persistence\n", job1.toString());
    }
}


