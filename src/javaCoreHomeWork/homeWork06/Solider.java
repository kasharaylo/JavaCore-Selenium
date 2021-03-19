package javaCoreHomeWork.homeWork06;

public class Solider {
    private String name;
    private String lastName;
    private String rank;
    private int badgeNumber1;
    private String bloodType;
    private String typeOfTroops;
    private String sex;

    //Constructor
    public Solider(Builder builder) {
        this.name = builder.name;
        this.lastName = builder.lastName;
        this.rank = builder.rank;
        this.badgeNumber1 = builder.badgeNumber1;
        this.bloodType = builder.bloodType;
        this.typeOfTroops = builder.typeOfTroops;
        this.sex = builder.sex;
    }

    @Override
    public String toString() {
        return "Solider{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", rank='" + rank + '\'' +
                ", badgeNumber1=" + badgeNumber1 +
                ", bloodType='" + bloodType + '\'' +
                ", typeOfTroops='" + typeOfTroops + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }

    //Builder
    public static class Builder {
        private String name;
        private String lastName;
        private String rank;
        private int badgeNumber1;
        private String bloodType;
        private String typeOfTroops;
        private String sex;

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

        public Builder setRank(String rank) {
            this.rank = rank;
            return this;
        }

        public Builder setBadgeNumber1(int badgeNumber1) {
            this.badgeNumber1 = badgeNumber1;
            return this;
        }

        public Builder setBloodType(String bloodType) {
            this.bloodType = bloodType;
            return this;
        }

        public Builder setTypeOfTroops(String typeOfTroops) {
            this.typeOfTroops = typeOfTroops;
            return this;
        }

        public Builder setSex(String sex) {
            this.sex = sex;
            return this;
        }

        public Solider build() {
            return new Solider(this);
        }
    }

}
