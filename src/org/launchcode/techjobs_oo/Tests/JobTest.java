package org.launchcode.techjobs_oo.Tests;

import org.junit.*;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class JobTest {

    Job job1;
    Job job2;

    @Before
    public void createJobObjects() {
        job1 = new Job();
        job2 = new Job();
    }

    @Test
    public void testSettingJobId() {
        assertTrue(job2.getId() - job1.getId() == 1);
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job newJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType(
                "Quality control"), new CoreCompetency("Persistance"));

        assertTrue(newJob instanceof Job);

        assertEquals("Product tester", newJob.getName());
        assertEquals("ACME", newJob.getEmployer().getValue());
        assertEquals("Desert", newJob.getLocation().getValue());
        assertEquals("Quality control", newJob.getPositionType().getValue());
        assertEquals("Persistance", newJob.getCoreCompetency().getValue());
    }

}
