package javaCorePractics.practics16;

public class Driver {

    private String name;
    private int driverId;
    private boolean male;

    public Driver(String name, int driverId, boolean male) {
        this.name = name;
        this.driverId = driverId;
        this.male = male;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + driverId;
        result = prime * result + (male ? 1231 : 1237);
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Driver other = (Driver) obj;
        if (driverId != other.driverId)
            return false;
        if (male != other.male)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }
}
