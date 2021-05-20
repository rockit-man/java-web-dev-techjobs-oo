package org.launchcode.techjobs_oo.Tests;

import org.junit.*;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;

public class JobTest {

    Job job1;
    Job job2;
    Job newJob;

    @Before
    public void createJobObjects() {
        job1 = new Job();
        job2 = new Job();
        newJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType(
                "Quality control"), new CoreCompetency("Persistance"));
    }

    @Test
    public void testSettingJobId() {
        assertTrue(job2.getId() - job1.getId() == 1);
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        assertTrue(newJob instanceof Job);
        assertEquals("Product tester", newJob.getName());
        assertEquals("ACME", newJob.getEmployer().getValue());
        assertEquals("Desert", newJob.getLocation().getValue());
        assertEquals("Quality control", newJob.getPositionType().getValue());
        assertEquals("Persistance", newJob.getCoreCompetency().getValue());
    }

    @Test
    public void testJobsForEquality() {
        Job job3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistance"));
        Job job4 = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistance"));
        assertFalse(job3.equals(job4));
    }

    @Test
    public void testsToStringForBlanksLines() {
        System.out.println(newJob.toString());
        assertFalse(newJob.toString().trim().isEmpty());
    }
}
