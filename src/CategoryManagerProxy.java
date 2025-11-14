// Proxy for CategoryManager (access control)
public class CategoryManagerProxy implements ProxyInterface {
    private CategoryManager realManager = CategoryManager.getInstance();

    @Override
    public void createCategory(String code, String description, Admin admin) {
        if (admin != null) {
            realManager.createCategory(code, description, admin);
        } else {
            System.out.println("Access denied!");
        }
    }

    @Override
    public void viewCategories(Admin admin) {
        if (admin != null) {
            realManager.viewCategories(admin);
        } else {
            System.out.println("Access denied!");
        }
    }

    @Override
    public void editCategoryDescription(String code, String newDescription, Admin admin) {
        if (admin != null) {
            realManager.editCategoryDescription(code, newDescription, admin);
        } else {
            System.out.println("Access denied!");
        }
    }

    @Override
    public void assignContentItem(String contentID, String categoryCode, Admin admin) {
        if (admin != null) {
            realManager.assignContentItem(contentID, categoryCode, admin);
        } else {
            System.out.println("Access denied!");
        }
    }

    @Override
    public void addContentItem(ContentItem item) {
        realManager.addContentItem(item);
    }
}
