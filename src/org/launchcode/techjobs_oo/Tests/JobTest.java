package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.Job;

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

}
