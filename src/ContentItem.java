// ContentItem class
class ContentItem {
    private String id;
    private String title;
    private String categoryCode;

    public ContentItem(String id, String title) {
        this.id = id;
        this.title = title;
        this.categoryCode = "";
    }

    public String getId() {
        return id;
    }

    public void setCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Title: " + title + ", Category: " + categoryCode;
    }
}
