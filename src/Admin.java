class Admin implements Observer {
    private String username;

    public Admin(String username) {
        this.username = username;
    }

    public boolean login(String username, String password) {
        // Hardcoded for simplicity
        return this.username.equals(username) && password.equals("admin123");
    }

    @Override
    public void update(String message) {
        System.out.println("Admin Notification: " + message);
    }
}
