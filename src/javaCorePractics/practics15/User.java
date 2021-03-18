package javaCorePractics.practics15;

public class User {
    private String name;
    private String address;
    private String lastName;

    //Constructor for Person
    public User(String name, String address, String lastName) {
        this.name = name;
        this.address = address;
        this.lastName = lastName;
    }

    //Constructor for Builder
    public User(Builder builder) {
        this.name = builder.name;
        this.address = builder.address;
        this.lastName = builder.lastName;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    //Builder
    public static class Builder {
        private String name;
        private String address;
        private String lastName;

        public static Builder newInstance() {
            return new Builder();
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }
        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }
        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }
}
