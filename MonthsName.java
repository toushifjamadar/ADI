public class MonthsName {
    public static void main(String[] args) {
        String[] months = {"January", "February", "March","April", "May", "June",
         "July","August","September","October","November","December"};

         System.out.println("List of months:");
         for (int i = 0; i < months.length; i++) {
            System.out.println((i + 1) +". " + months[i]);
         }
    }

    
}
