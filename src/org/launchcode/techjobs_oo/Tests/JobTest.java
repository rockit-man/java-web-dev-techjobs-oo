package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;

public class JobTest {

    Job job1;
    Job job2;
    Job job3;
    Job job4;
    Job job5;
    Job newJob;

    @Before
    public void createJobObjects() {
        job1 = new Job();
        job2 = new Job();
        job3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistance"));
        job4 = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistance"));
        newJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType(
                "Quality control"), new CoreCompetency("Persistance"));
        job5 = new Job(null, null, null, null, null);
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
        assertFalse(job3.equals(job4));
    }

    @Test
    public void testsToStringForBlanksLines() {
//        System.out.println(newJob.toString());
//        System.out.println(newJob.toString().trim());
        assertFalse(newJob.toString().trim().isEmpty());
    }

    @Test
    public void testsToStringForDataFields() {
        String newJobString = "\nID: " + newJob.getId() +
                "\nName: " + newJob.getName() +
                "\nEmployer: " + newJob.getEmployer() +
                "\nLocation: " + newJob.getLocation() +
                "\nPosition Type: " + newJob.getPositionType() +
                "\nCore Competency: " + newJob.getCoreCompetency() + "\n";
        assertEquals(newJob.toString(), newJobString);
//        System.out.println(newJobString);
    }

    @Test
    public void testsIfFieldsAreEmpty() {
//        Job job5 = new Job(null, null, null, null, null);

//        System.out.println(job5);
//        System.out.println(job5.toString());
//        String job5AsString = job5.toString();
//        System.out.println(job5AsString);
//        job5AsString = job5AsString.replace("null", "Data Not Available");
//        System.out.println(job5AsString);

        System.out.println("job1:");
        System.out.println(job1.toString());
        System.out.println("job2:");
        System.out.println(job2.toString());
        System.out.println("job3:");
        System.out.println(job3.toString());
        System.out.println("job4:");
        System.out.println(job4.toString());
        System.out.println("newJob:");
        System.out.println(newJob.toString());
        System.out.println("job5:");
        System.out.println(job5.toString());

        String job5Expected = "\nID: " + "18" +
                "\nName: " + "Data not available" +
                "\nEmployer: " + "Data not available" +
                "\nLocation: " + "Data not available" +
                "\nPosition Type: " + "Data not available" +
                "\nCore Competency: " + "Data not available" + "\n";

//        System.out.println(job5Expected);

        assertEquals(job5Expected, job5.toString());
    }

}
