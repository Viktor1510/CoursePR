package Course.project;
public class Item
{
    private String name;
    private String expiryDate;
    private String dateOfReceipt;
    private String producer;
    private Unit unit;
    private int quantity;
    private String location;

    public Item(String name, String expiryDate, String dateOfReceipt, String producer, Unit unit, int quantity, String location) {
        this.name = name;
        this.expiryDate = expiryDate;
        this.dateOfReceipt = dateOfReceipt;
        this.producer = producer;
        this.unit = unit;
        this.quantity = quantity;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getDateOfReceipt() {
        return dateOfReceipt;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public String getLocation() {
        return location;
    }

    public String getProducer() {
        return producer;
    }

    public Unit getUnit() {
        return unit;
    }

}
