public class Main {
    public static void main(String[] args) {

       // text box object
       var textBox1 = new TextBox();
       textBox1.setText("Aimable's Box 1");

        var textBox2 = new TextBox();
        textBox2.setText("Aimable's box 2");


        // employee object
        var employee = new Employee(50_000,20);
        int wage = employee.calculateWage(10);
        System.out.println("The employee's total wage is: "+wage);
        System.out.println("The number of employees is: "+Employee.numberOfEmployees);


        // browser object
        var browser = new Browser();
        browser.navigate("youtube.com");
    }
}