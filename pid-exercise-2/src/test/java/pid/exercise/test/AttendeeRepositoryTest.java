package pid.exercise.test;


import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.sa.pidexercise2.model.Attendance;
import com.sa.pidexercise2.model.JsonModel;
import com.sa.pidexercise2.model.Member;
import com.sda.pidexercise2.repository.AttendeeRepository;

public class AttendeeRepositoryTest {

	@Test
	public void verifyIfValidFileIsRead() {

		AttendeeRepository repository = new AttendeeRepository("testfile.json");
		JsonModel model = repository.readJsonFile();

		assertNotNull(model);
		
	}
	

	

	@Test(expected=RuntimeException.class)
	public void verifyIfDataisReadCorrectly() {
		AttendeeRepository repository = new AttendeeRepository("filetest.json");
		JsonModel model = repository.readJsonFile();
		
	}
	
	@Test
	public void verifyIfisTheDataExpected() {
		AttendeeRepository repository = new AttendeeRepository("testfile.json");
		JsonModel model = repository.readJsonFile();

		
		assertEquals(expectedModel(), model);
	}
	
	
	private JsonModel expectedModel() {
		JsonModel testModel = new JsonModel();
		Attendance testAttendance = new Attendance();
		Member testMembers = new Member("David Yu","f1f7",true);
		
		testAttendance.setDate("2020-12-12");
		testAttendance.getMembers().add(testMembers);		
		testModel.getAttendance().add(testAttendance);
		return testModel;
	}
	
	
}
