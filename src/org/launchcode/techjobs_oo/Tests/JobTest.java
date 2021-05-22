package org.launchcode.techjobs_oo.Tests;
import org.junit.Assert;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;
import org.junit.Before;

import javax.naming.Name;

import static org.junit.Assert.*;

public class JobTest {
    Job job1,job2,job3;

    private int id;
    private Employer Employer;
    private String name;
    private Location Location;
    private PositionType PositionType;
    private CoreCompetency CoreCompetency;

    @Before
        public void createJobTest() {
             job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
             job2 = new Job("Web Developer", new Employer("LaunchCode"), new Location("St. Louis"), new PositionType("Front-end developer"), new CoreCompetency("JavaScript"));
            job3 = new Job("Ice cream taster", new Employer(""), new Location("Home"), new PositionType("UX"), new CoreCompetency("Taste"));
        }

    @Test
    public void testSettingJobId() {
        assertTrue(job1.getId() != job2.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        assertNotNull(String.valueOf(Employer),"ACME");
        assertNotNull("Product tester");
        assertNotNull(String.valueOf(Location), "Desert");
        assertNotNull(String.valueOf(PositionType), "Quality control");
        assertNotNull(String.valueOf(CoreCompetency), "Persistence");
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


