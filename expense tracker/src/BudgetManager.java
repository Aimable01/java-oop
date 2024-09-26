import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BudgetManager {
    private List<Transaction> transactions;
    private final String FILE_PATH = "Output_Data.txt";

    public BudgetManager() {
        transactions = new ArrayList<>();
        loadTransactions();
    }

    // add transaction
    public void addTransaction(String description, double amount, String type, String category) {
        Transaction transaction = new Transaction(description,amount,new Date(),type,category);
        transactions.add(transaction);
        saveTransactions();
    }

    // list transactions
    public void listTransactions() {
        if(transactions.isEmpty()) {
            System.out.println("There are no transactions");
        }else {
            for (Transaction transaction : transactions) {
                System.out.println(transaction);
            }
        }
    }

    // get total income
    public double getTotalIncome(){
        double total = 0;
        for (Transaction transaction : transactions) {
            if(transaction.getType().equalsIgnoreCase("income")){
                total += transaction.getAmount();
            }
        }
        return total;
    }

    // get total expenses
    public double getTotalExpense(){
        double total = 0;
        for (Transaction transaction : transactions) {
            if(transaction.getType().equalsIgnoreCase("expense")){
                total += transaction.getAmount();
            }
        }
        return total;
    }

    // get balance
    public double getBalance(){
        return getTotalIncome() + getTotalExpense();
    }

    // save transactions
    public void saveTransactions(){
        try {
            FileWriter fileWriter = new FileWriter(FILE_PATH);
            for (Transaction transaction : transactions) {
                fileWriter.write(transaction.toFileFormat() + "\n");
            }
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("Error while saving transactions" + e.getMessage());
        }
    }

    // load transactions
    public void loadTransactions(){
        try {
            File file = new File(FILE_PATH);
            if (file.exists()) {
                BufferedReader reader = new BufferedReader(new FileReader(file));
                String line;
                while((line = reader.readLine()) != null){
                    transactions.add(Transaction.fromFileFormat(line));
                }
                reader.close();
            }
        }catch (IOException e){
            System.out.println("Error while loading transactions" + e.getMessage());
        }
    }
}
