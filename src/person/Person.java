package person;

public class Person {

    private String name;
    private String surename;
    private int quatityTickets;

    public Person(String name, String surename, int quatityTickets){
        this.name = name;
        this.surename = surename;
        this.quatityTickets = quatityTickets;

    }
    public String getName() {
        return name;

    }

    public String getSureName() {
        return surename;
    }



    public int getQuatityTickets() {
        return quatityTickets;
    }

    public void setQuatityTickets(int quatityTickets) {
        this.quatityTickets = quatityTickets;
    }
}
