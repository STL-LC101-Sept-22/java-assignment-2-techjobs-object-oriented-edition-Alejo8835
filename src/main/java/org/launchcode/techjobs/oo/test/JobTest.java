package org.launchcode.techjobs.oo.test;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import static org.junit.Assert.*;


/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {

    Job job1;
    Job job2;
    Job job3;

    @Before
    public void createTestData() {
        job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        job2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        job3 = new Job("Web Developer", new Employer("LaunchCode"), new Location("St. Louis"), new PositionType("Front-end developer"), new CoreCompetency("JavaScript"));

    }

    @Test
    public void testSettingJobId() {
        job1.getId();
        job3.getId();
        assertNotEquals(job1, job3);
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        String spec = "The second constructor correctly assigns both the class and value of each field";
        assertTrue(job1 instanceof Job);
        assertEquals(spec, "Product tester", job1.getName());
        assertTrue(job1.getEmployer() instanceof Employer);
        assertEquals(spec, "ACME", job1.getEmployer().getValue());
        assertTrue(job1.getLocation() instanceof Location);
        assertEquals(spec,"Desert", job1.getLocation().getValue());
        assertTrue(job1.getPositionType() instanceof PositionType);
        assertEquals(spec, "Quality control", job1.getPositionType().getValue());
        assertTrue(job1.getCoreCompetency() instanceof CoreCompetency);
        assertEquals(spec, "Persistence", job1.getCoreCompetency().getValue());
    }

    @Test
    public void testJobsForEquality() {
        assertFalse(job1.equals(job2));
    }

    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        char [] charactersInString = job1.toString().toCharArray();
        assertEquals('\n', charactersInString[charactersInString.length-1]);
        assertEquals('\n', charactersInString[0]);
    }

    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        String correctFormat = "\nID: " + job1.getId() + "\n" +
                "Name: " + job1.getName() + "\n" +
                "Employer: " + job1.getEmployer() + "\n" +
                "Location: " + job1.getLocation() + "\n" +
                "Position Type: " + job1.getPositionType() + "\n" +
                "Core Competency: " + job1.getCoreCompetency() + "\n";
        assertEquals(job1.toString(), correctFormat);
    }

    @Test
    public void testToStringHandlesEmptyField() {
        String correctFormat = "\nID: " + job1.getId() + "\n" +
                "Name: " + job1.getName() + "\n" +
                "Employer: " + job1.getEmployer() + "\n" +
                "Location: " + job1.getLocation() + "\n" +
                "Position Type: " + job1.getPositionType() + "\n" +
                "Core Competency: " + job1.getCoreCompetency() + "\n";
        assertEquals(job1.toString(), correctFormat);
    }


}
