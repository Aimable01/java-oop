import java.util.Date;

public class Transaction {
    private String description;
    private double amount;
    private Date date;
    private String type;
    private String category;

    public Transaction(String description, double amount, Date date, String type, String category) {
        this.description = description;
        this.amount = amount;
        this.date = date;
        this.type = type;
        this.category = category;
    }

    public String getDescription() {
        return description;
    }
    public double getAmount() {
        return amount;
    }
    public Date getDate() {
        return date;
    }
    public String getType() {
        return type;
    }
    public String getCategory() {
        return category;
    }

    // display the data
    @Override
    public String toString() {
        return "Transaction{"+"description='" + description + '\'' + ", amount=" + amount + ", date=" + date + ", type='" + (type.equals("expense") ? ", category='" + category + '\'':"") + "}";
    }

    // save the data
    public String toFileFormat(){
        return description + "," + amount + "," + date.getTime() + "," + type + "," + (category == null ? "null" : category);
    }

    public static Transaction fromFileFormat(String fileLine){
        String[] data = fileLine.split(",");
        String description = data[0];
        double amount = Double.parseDouble(data[1]);
        Date date = new Date(Long.parseLong(data[2]));
        String type = data[3];
        String category = data[4];
        return new Transaction(description, amount, date, type, category);
    }
}
