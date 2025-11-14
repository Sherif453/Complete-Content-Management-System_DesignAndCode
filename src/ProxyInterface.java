public interface ProxyInterface {
    void createCategory(String code, String description, Admin admin);
    void viewCategories(Admin admin);
    void editCategoryDescription(String code, String newDescription, Admin admin);
    void assignContentItem(String contentID, String categoryCode, Admin admin);
    void addContentItem(ContentItem item);
}
