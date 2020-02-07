package ua.lviv.iot.first.lab;

public class Chainsaw //implements Comparable<Chainsaw>
{
    private static final String FUEL = "petrol";

    private String name;
    private int powerInVat;
    private int turnsAmount;
    private float tankVolume; //переписати поміняти місцями
    private String country;
    protected String form;
    protected String description;
    public static String useType;

    public Chainsaw() {
        this(null, 0, 0, 0, null, null);
    }

    public Chainsaw(String name, int powerInVat, int amountOfTurns, float tankVolume, String country, String form, String description) {
        resetValues(name, powerInVat, amountOfTurns, tankVolume, country, form, description);
    }


    public Chainsaw(String name, int powerInVat, int amountOfTurns, float tankVolume, String country, String form) {
        this(name, powerInVat, amountOfTurns, tankVolume, country, form, "Very sharp");
    }

    public Chainsaw(String name, int powerInVat, int amountOfTurns, float tankVolume, String country) {
        this(name, powerInVat, amountOfTurns, tankVolume, country, null);
    }

    public void resetValues(String name, int powerInVat, int amountOfTurns, float tankVolume, String country,
                            String form, String description) {
        this.name = name;
        this.powerInVat = powerInVat;
        this.turnsAmount = amountOfTurns;
        this.tankVolume = tankVolume;
        this.country = country;
        this.form = form;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPowerInVat() {
        return powerInVat;
    }

    public void setPowerInVat(int powerInVat) {
        this.powerInVat = powerInVat;
    }

    public int getAmountOfTurns() {
        return turnsAmount;
    }

    public void setAmountOfTurns(int amountOfTurns) {
        this.turnsAmount = amountOfTurns;
    }

    public float getTankVolume() {
        return tankVolume;
    }

    public void setTankVolume(float tankVolume) {
        this.tankVolume = tankVolume;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getForm() {
        return form;
    }

    public void setForm(String form) {
        this.form = form;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public static void setUseType(String useType) {
        Chainsaw.useType = useType;
    }

    @Override
    public String toString() {
        return "Chainsaw{" +
                "name='" + name + '\'' +
                ", powerInVat=" + powerInVat +
                ", amountOfTurns=" + turnsAmount +
                ", tankVolume=" + tankVolume +
                ", country='" + country + '\'' +
                ", form='" + form + '\'' +
                ", description='" + description + '\'' +
                ", ***String fuel***='" + Chainsaw.FUEL + '\'' +
                '}';

    }
}


