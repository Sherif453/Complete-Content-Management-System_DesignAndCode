// Category class
class Category {
    private String code;
    private String description;

    public Category(String code, String description) {
        this.code = code;
        this.description = description;
    }

    public String getCode() {
        return code;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Code: " + code + ", Description: " + description;
    }
}
