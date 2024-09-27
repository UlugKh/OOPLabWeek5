public class Person {
    private String name;
    private String ID; // Unique identifier
    private int age;
    private String login; // Unique login credentials
    private String password; // Hashed password for security
    private UserRole role; // Enum to represent user roles (MEMBER, LIBRARIAN, ADMIN)

    // Constructor
    public Person(String name, String ID, int age, String login, String password, UserRole role) {
        this.name = name;
        this.ID = ID;
        this.age = age;
        this.login = login;
        this.password = password; // Ideally, store the hashed version
        this.role = role;
    }

    // Method to display person information
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + ID);
        System.out.println("Age: " + age);
        System.out.println("Role: " + role);
    }

    // Getters and Setters (optional)
    public String getName() {
        return name;
    }

    public String getID() {
        return ID;
    }

    public int getAge() {
        return age;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password; // In practice, return a hashed version
    }

    public UserRole getRole() {
        return role;
    }
}

// Enum to define user roles
enum UserRole {
    MEMBER,
    LIBRARIAN,
    ADMIN
}