package pid.exercise.service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.sa.pidexercise2.model.Attendance;
import com.sa.pidexercise2.model.JsonModel;
import com.sa.pidexercise2.model.Member;
import com.sda.pidexercise2.repository.AttendeeRepository;
import com.sda.pidexercise2.repository.WriterJson;

public class AttendeeService {

	private AttendeeRepository repository ;
	private JsonModel model;

	public AttendeeService(String jsonFileName) {
		repository = new AttendeeRepository(jsonFileName);
		model = repository.readJsonFile();
	}

	public Map<String, List<Member>> showAttendance() {

		return model.getAttendance().stream().collect(Collectors.toMap(Attendance::getDate, Attendance::getMembers));

	}

	public void requestNewAttendance(String date, String name, String id, String attended) {
		Attendance att = new Attendance(date);
		Boolean attendedB = Boolean.valueOf(attended);
		
		if (model.getAttendance().contains(att)) {
			model.getAttendance().stream().filter(attendanceDate -> attendanceDate.getDate().equals(date)).findFirst()
					.map(Attendance::getMembers).ifPresent(listMembers -> listMembers.add(new Member(name,id,attendedB)));
		} else {
			att.getMembers().add(new Member(name,id,attendedB)); 
			model.getAttendance().add(att);
		}
	}
	
	public void saveAttendance() {
		
		repository.writeJson(model);
		
	}
}
