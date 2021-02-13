package one.digitalinnovation.personapi.enums;

public enum PhoneType {
    HOME("Home"),
    MOBILE("Mobile"),
    COMMERCIAL("Commercial");

    private final String description;

    PhoneType(String description)
    {
        this.description = description;
    }
    
    public String getDescription()
    {
        return this.description;
    }
}
