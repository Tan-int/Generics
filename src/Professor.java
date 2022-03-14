public abstract class Professor {
    /*
    We start with an abstract class of Professors, because in a university there are professors
    in different departments which will have a name, email, and address as their contact.
    Each department will have a list of professors, so we declare this class as abstract (although there aren't any abstract methods)
    to ensure the list can contain any type of professors that we can declare in the type parameter (using generics)
     */
    private String name;
    private String email;
    private String phoneNumber;

    public Professor(String name, String email, String phoneNumber) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Professor {" +
                "name:'" + name + '\'' +
                ", email:'" + email + '\'' +
                ", phoneNumber:'" + phoneNumber + '\'' +
                '}';
    }
}
