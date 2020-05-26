package pid.exercise.test;

import static org.junit.Assert.assertEquals;


import org.junit.Test;

import com.sa.pidexercise2.model.Attendance;
import com.sa.pidexercise2.model.JsonModel;
import com.sa.pidexercise2.model.Member;
import com.sda.pidexercise2.repository.AttendeeRepository;

import pid.exercise.service.AttendeeService;

public class AttendeeServiceTest {
	
	
	@Test
	public void verifyIfIsPossibleAddNewMember() {
		AttendeeRepository repository = new AttendeeRepository("testfile.json");
		JsonModel model = repository.readJsonFile();
		AttendeeService service = new AttendeeService("testfile.json");
		service.requestNewAttendance("2020-12-12", "Johanna Jones", "oiu3","true");
		
		assertEquals(expectedModel(), model);
		
	}
	
	
	private JsonModel expectedModel() {
		JsonModel testModel = new JsonModel();
		Attendance testAttendance = new Attendance();
		Member testMembers = new Member("David Yu","f1f7",true);
		testMembers = new Member("Johanna Jones", "oiu3",true);
		
		testAttendance.setDate("2020-12-12");
		testAttendance.getMembers().add(testMembers);		
		testModel.getAttendance().add(testAttendance);
		return testModel;
	}
	
	
}
