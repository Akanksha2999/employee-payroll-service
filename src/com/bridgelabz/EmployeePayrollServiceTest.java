package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class EmployeePayrollServiceTest {
    @Test
    public void given3EmployeeWhenWrittenToFileShouldMatchEmployeeEntries() {
        EmployeePayrollData[] arrayOfEmp = {
                new EmployeePayrollData(1, "Ashu", 10000.0),
                new EmployeePayrollData(2, "Sree", 20000.0),
                new EmployeePayrollData(3, "Sangeeta", 30000.0)
        };
        EmployeePayrollService employeePayRollService;          //uc3 save the details in a file --open terminal enter->> more payroll-file.txt
        employeePayRollService = new EmployeePayrollService(Arrays.asList(arrayOfEmp));
        employeePayRollService.writeEmployeePayrollData(EmployeePayrollService.IOService.FILE_IO);
        long entries = employeePayRollService.countEntries(EmployeePayrollService.IOService.FILE_IO);
        Assert.assertEquals(3, entries);
    }
}
