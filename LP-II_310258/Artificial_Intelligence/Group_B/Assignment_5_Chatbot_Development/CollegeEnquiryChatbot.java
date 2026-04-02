package Group_B.Assignment_5_Chatbot_Development;
import java.util.HashMap;
import java.util.Scanner;

public class CollegeEnquiryChatbot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HashMap<String, String> replies = new HashMap<>();
        replies.put("admission", "Admissions are open. Please visit the admission office between 10 AM to 4 PM.");
        replies.put("fees",
                "The annual fees vary by branch. For Computer Engineering, it is approximately Rs. 1,20,000.");
        replies.put("courses", "We offer Computer, IT, Mechanical, Civil, AI-DS, and Electronics Engineering.");
        replies.put("placement", "Top recruiters include TCS, Infosys, Capgemini, and Wipro.");
        replies.put("timing", "College timings are from 9:00 AM to 5:00 PM.");
        replies.put("library", "The library is open from 8:30 AM to 6:00 PM on working days.");
        replies.put("contact", "You can contact the college office at +91-9876543210.");
        replies.put("bye", "Thank you for contacting the college enquiry chatbot.");

        System.out.println("College Bot: Welcome to College Enquiry System!");
        System.out.println("Type your query or type 'bye' to exit.");
        while (true) {
            System.out.print("Student: ");
            String query = input.nextLine().toLowerCase();
            if (query.equals("bye")) {
                System.out.println("College Bot: " + replies.get("bye"));
                break;
            }
            boolean matched = false;
            for (String keyword : replies.keySet()) {
                if (query.contains(keyword)) {
                    System.out.println("College Bot: " + replies.get(keyword));
                    matched = true;
                    break;
                }
            }
            if (!matched) {
                System.out.println(
                        "College Bot: Sorry, please ask about admissions, fees, courses, placement, or timings.");
            }
        }
        input.close();
    }
}
