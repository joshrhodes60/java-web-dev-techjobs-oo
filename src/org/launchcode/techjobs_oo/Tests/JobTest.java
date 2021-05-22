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
        assertEquals(job1.equals(job2)== false);
    }

    private void assertEquals(boolean b) {
    }





}


