public class TopicScheduler {
    public static void main(String[] args) {
        try {
            if (args.length == 0) throw new Exception("No topics provided.");
            
            String input = String.join(" ", args);
            String[] pairs = input.split(", ");
            
            int currentDay = 1;
            int hoursLeftInDay = 8;

            System.out.println("Day " + currentDay + ":");
            for (String pair : pairs) {
                String[] parts = pair.split(" ");
                String topic = parts[0];
                int hours = Integer.parseInt(parts[1]);

                if (hours > hoursLeftInDay) {
                    currentDay++;
                    hoursLeftInDay = 8;
                    System.out.println("\nDay " + currentDay + ":");
                }
                
                System.out.println("- " + topic + " (" + hours + " hrs)");
                hoursLeftInDay -= hours;
            }
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
            System.out.println("Error: Ensure format is 'Topic Hours, Topic Hours'");
        } catch (Exception e) {
            System.out.println("General Error: " + e.getMessage());
        }
    }
}