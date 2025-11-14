import java.util.*;

// Singleton for managing categories and content items
public class CategoryManager implements ProxyInterface {
    private static CategoryManager instance;
    private List<Category> categories;
    private List<ContentItem> contentItems;

    private CategoryManager() {
        categories = new ArrayList<>();
        contentItems = new ArrayList<>();
    }

    public static CategoryManager getInstance() {
        if (instance == null) {
            instance = new CategoryManager();
        }
        return instance;
    }

    @Override
    public void createCategory(String code, String description, Admin admin) {
        for (Category c : categories) {
            if (c.getCode().equals(code)) {
                System.out.println("Category code already exists!");
                return;
            }
        }
        Category category = new Category(code, description);
        categories.add(category);
        System.out.println("Category created successfully.");
    }

    @Override
    public void viewCategories(Admin admin) {
        if (categories.isEmpty()) {
            System.out.println("No categories available.");
            return;
        }
        for (Category c : categories) {
            System.out.println(c);
        }
    }

    @Override
    public void editCategoryDescription(String code, String newDescription, Admin admin) {
        for (Category c : categories) {
            if (c.getCode().equals(code)) {
                Scanner sc = new Scanner(System.in);
                System.out.print("Confirm edit (yes/no): ");
                String confirm = sc.nextLine();
                if (confirm.equalsIgnoreCase("yes")) {
                    c.setDescription(newDescription);
                    System.out.println("Description updated.");
                } else {
                    System.out.println("Edit canceled.");
                }
                return;
            }
        }
        System.out.println("Category not found!");
    }

    @Override
    public void assignContentItem(String contentID, String categoryCode, Admin admin) {
        Category category = null;
        for (Category c : categories) {
            if (c.getCode().equals(categoryCode)) {
                category = c;
                break;
            }
        }
        if (category == null) {
            System.out.println("Category not found!");
            return;
        }

        for (ContentItem item : contentItems) {
            if (item.getId().equals(contentID)) {
                item.setCategoryCode(categoryCode);
                System.out.println("Content item assigned to category.");
                return;
            }
        }
        System.out.println("Content item not found!");
    }

    @Override
    public void addContentItem(ContentItem item) {
        contentItems.add(item);
    }
}
