package practics07.builder;

import homeWork03.Student;

public class User {
    private String name;
    private String lastName;
    private String address;

    public User(String name, String lastName, String address) {
        this.name = name;
        this.lastName = lastName;
        this.address = address;
    }

    public User(Builder builder) {
        this.name = builder.name;
        this.lastName = builder.lastName;
        this.address = builder.address;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public static class Builder {
        private String name;
        private String lastName;
        private String address;

        public static Builder newInstance() {
            return new Builder();
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }

        public User build() {
            if (lastName == null) {
                //throw new IllegalArgumentException("Last name should be present in user");
                return null;
            }
            return new User(this);
        }
    }
}
