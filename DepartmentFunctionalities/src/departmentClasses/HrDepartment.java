package departmentClasses;

import superclass.SuperDepartment;

public class HrDepartment extends SuperDepartment {

	public HrDepartment() {
		super();
	}

	public HrDepartment(String name, String work, String deadline) {
		super();
	}

	@Override
	public String departmentName() {
		name = "Hr Department";
		return name;
	}
	
	@Override
	public String getTodaysWork() {
		work = "Fill today's timesheet and mark your attendance";
		return work;
	}
	
	@Override
	public String getWorkDeadline() {
		deadline = "Complete by EOD";
		return deadline;
	}
	
	public String doActivity() {
		String activity = "Team Launch";
		return activity;
	}
}

