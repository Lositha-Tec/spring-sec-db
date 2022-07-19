package lk.tea_leaves_collector.asset.employee.entity.enums;

public enum EmployeeStatus {
    WORKING("Working"),
    LEAVE("Leave"),
    SUSPENDED("Suspended"),
    RESIGNED("Resigned"),
    RETIRED("Retired");

    private final String employeeStatus;

    EmployeeStatus(String employeeStatus) {

        this.employeeStatus = employeeStatus;
    }

    public String getEmployeeStatus() {
        return employeeStatus;
    }
}
