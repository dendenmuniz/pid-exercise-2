package pid.exercise;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import com.sa.pidexercise2.model.Member;

import pid.exercise.service.AttendeeService;

public class AttendeeApp {

	public static void main(String[] args) {
		AttendeeService service = new AttendeeService("attendance.json");

		try (Scanner sc = new Scanner(System.in)) {
			int userOption;
			do {
				System.out.println("\n*****  Welcome to Attendee App  *****");
				System.out.println("*************************************");
				System.out.println("Here you can see the attendance list.");
				System.out.println("Pick an option:");
				System.out.println("(1) See the actual list");
				System.out.println("(2) Inform the attendance for other day");
				System.out.println("(3) Save the attendance list in a file");
				System.out.println("(4) Quit");

				userOption = Integer.parseInt(sc.nextLine());

				switch (userOption) {
				case 1:
					// TODO
					showList(service);
					break;
				case 2:
					// TODO
					System.out.println("Enter the date (yyyy-mm-dd).");
					String dateNewAttendance = sc.nextLine();
					System.out.println("Enter the member's name.");
					String memberName = sc.nextLine();
					System.out.println("Enter the member's id.");
					String memberId = sc.nextLine();
					System.out.println("Enter true or false to inform the member attendance.");
					String memberAttended = sc.nextLine();
					service.requestNewAttendance(dateNewAttendance, memberName, memberId, memberAttended);
					break;
				case 3:
					service.saveAttendance();
					break;
				}
			} while (userOption != 4);

		} catch (Exception e) {
			System.out.println(e);
		}finally {
			System.out.println("Bye Bye"); 
		}

	}

	private static void showList(AttendeeService service) throws IOException {
		System.out.println("**** This is the list ****");

		Map<String, List<Member>> membersList = service.showAttendance();

		if (!membersList.isEmpty()) {
			membersList.forEach((attendance, members) -> {
				System.out.println("Date: " + attendance + "\n");
				members.stream().forEach(person -> System.out.println(person.toString()));
			});
		} else {
			System.out.println("Attendance list does not exists yet. Create one+.");
		}

	}

}
