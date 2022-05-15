package labs_examples.input_output.labs;

import java.io.*;
import java.util.ArrayList;

/**
 *
 *      Following the video examples and source code found in the src/labs_examples/input_output/examples/csv_parser
 *      package, create a new application that will parse a custom CSV file that you created and map each line of the
 *      csv to a custom POJO that you create.
 *
 *      Then add that object to an arraylist. After you have mapped each row of the csv to objects
 *      and added each object to an arraylist, print out each object using the objects custom toString() method.
 *
 *      Then, write the arraylist of objects back out to a new .csv file. Ensure that the resulting csv file is valid.
 *
 */
class Bill{
    String serviceName;
    double usageAmount;
    double amountDue;

    public Bill(){}
    public Bill(String serviceName, double usageAmount, double amountDue) {
        this.serviceName = serviceName;
        this.usageAmount = usageAmount;
        this.amountDue = amountDue;
    }

    public String getServiceName() {
        return serviceName;
    }

    public double getUsageAmount() {
        return usageAmount;
    }

    public double getAmountDue() {
        return amountDue;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public void setUsageAmount(double usageAmount) {
        this.usageAmount = usageAmount;
    }

    public void setAmountDue(double amountDue) {
        this.amountDue = amountDue;
    }

    @Override
    public String toString() {
        return "Bill{" +
                "serviceName='" + serviceName + '\'' +
                ", usageAmount=" + usageAmount +
                ", amountDue=" + amountDue +
                '}';
    }
    public String[] joinedValues(){
        return new String[]{this.getServiceName(),this.getUsageAmount() + "",this.getAmountDue() + ""};
    }

}
class Main{

    public static void main(String[] args) {
        String filePath = "src/labs_examples/input_output/labs/bills.csv";
        String filePathOut = "src/labs_examples/input_output/labs/bills-writeback.csv";
        ArrayList<Bill> bills = readCsvAndCreateBills(filePath);
        for (Bill bill: bills ) {
            System.out.println(bill.toString());
        }
        readBillsArrayAndWriteToCsv(bills,filePathOut);
    }
    public static ArrayList<Bill> readCsvAndCreateBills(String filePath){
        ArrayList<Bill> billArrayList = new ArrayList<>();
        try(BufferedReader csvReader = new BufferedReader(new FileReader(filePath))){
            String line;

            while ((line = csvReader.readLine()) != null){
                String[] values = line.split(",");
                if (values[0].equalsIgnoreCase("service")){
                } else {
                    billArrayList.add(csvMapperToBillObject(values));
                }
            }

        } catch(IOException ioException){
            System.out.println("I/O Error: " + ioException);
        }
        return billArrayList;
    }

    public static Bill csvMapperToBillObject(String[] values){
        Bill bill = new Bill();
        bill.setServiceName(values[0]);
        bill.setUsageAmount(Double.parseDouble(values[1]));
        bill.setAmountDue(Double.parseDouble(values[2]));
        return bill;
    }

    public static void readBillsArrayAndWriteToCsv(ArrayList<Bill> billArrayList, String filePath){
        try (BufferedWriter csvWriter = new BufferedWriter(new FileWriter(filePath))){
            String headers = "Service,Usage,AmountDue\r\n";
            csvWriter.write(headers);
            for (Bill bill: billArrayList) {
                String billLine = String.join(",", bill.joinedValues()) + "\r\n";
                csvWriter.write(billLine);
            }
        } catch (IOException e){
            System.out.println("I/O Error: " + e);
        }
    }
}