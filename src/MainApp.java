import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Admin admin = new Admin("admin");
        System.out.print("Enter username: ");
        String user = sc.nextLine();
        System.out.print("Enter password: ");
        String pass = sc.nextLine();

        if (admin.login(user, pass)) {
            admin.update("Login successful.");
            ProxyInterface manager = new CategoryManagerProxy();

            manager.addContentItem(new ContentItem("C001", "Java Course"));
            manager.addContentItem(new ContentItem("C002", "Python eBook"));

            while (true) {
                System.out.println("\nMenu: 1) View Categories 2) Create Category 3) Edit Category 4) Assign Content Item 5) Exit");
                int choice = Integer.parseInt(sc.nextLine());
                switch (choice) {
                    case 1:
                        manager.viewCategories(admin);
                        break;
                    case 2:
                        System.out.print("Enter code: ");
                        String code = sc.nextLine();
                        System.out.print("Enter description: ");
                        String desc = sc.nextLine();
                        manager.createCategory(code, desc, admin);
                        break;
                    case 3:
                        System.out.print("Enter code: ");
                        String code2 = sc.nextLine();
                        System.out.print("Enter new description: ");
                        String newDesc = sc.nextLine();
                        manager.editCategoryDescription(code2, newDesc, admin);
                        break;
                    case 4:
                        System.out.print("Enter Content ID: ");
                        String cid = sc.nextLine();
                        System.out.print("Enter Category Code: ");
                        String catCode = sc.nextLine();
                        manager.assignContentItem(cid, catCode, admin);
                        break;
                    case 5:
                        System.out.println("Goodbye!");
                        return;
                    default:
                        System.out.println("Invalid choice.");
                }
            }
        } else {
            System.out.println("Login failed!");
        }
    }
}
