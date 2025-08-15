 import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
Scanner sc = new Scanner(System.in);
ChatService chatService = new ChatService();

chatService.register("sweta", "1234");
chatService.register(null, null);

System.out.println("Enter username:");
String username = sc.nextLine();

System.out.println("Enter password:");
String password = sc.nextLine();

if (chatService.login(username, password)){
    System.out.println("Type a message to send to 'null':");
    String msg = sc.nextLine();
    chatService.sendMessage(username, "null", msg);
}
System.out.println("Chat History:");
chatService.showMessage();
    }
}
    
    

