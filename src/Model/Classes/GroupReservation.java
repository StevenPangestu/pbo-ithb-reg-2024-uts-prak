package Model.Classes;

public class GroupReservation {
    private String groupName;
    private int numberPassangers;
    private Reservation reservation;

    public GroupReservation(String groupName, int numberPassangers) {
        this.groupName = groupName;
        this.numberPassangers = numberPassangers;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public int getNumberPassangers() {
        return numberPassangers;
    }

    public void setNumberPassangers(int numberPassangers) {
        this.numberPassangers = numberPassangers;
    }

}
