package codevita;

import java.util.*;

public class Clock {

    // Function to calculate the angle between hour and minute hands
    static int getAngleBetweenHands(int h, int m) {
        // Hour hand position (0 to 360 degrees)
        int hourAngle = (h % 12) * 30 + (m / 2);
        // Minute hand position (0 to 360 degrees)
        int minuteAngle = m * 6;

        // Calculate the difference in the angle
        int angle = Math.abs(hourAngle - minuteAngle);

        // The clock has two angles (internal and external), choose the smallest
        return Math.min(angle, 360 - angle);
    }

    // Function to calculate the cost of moving the hour hand
    static int moveHourHand(int currentHour, int targetHour, int P, int Q) {
        // Calculate the angle difference between the current hour and the target hour
        int angle = Math.abs((targetHour - currentHour + 12) % 12) * 30;

        // Cost to move the hour hand
        if (angle <= 90) {
            return angle * P;
        } else {
            return 90 * P + (angle - 90) * Q;
        }
    }

    // Function to calculate the cost of moving the minute hand
    static int moveMinuteHand(int currentMinute, int targetMinute, int X, int Y) {
        // Calculate the angle difference between the current minute and the target minute
        int angle = Math.abs((targetMinute - currentMinute + 60) % 60) * 6;

        // Cost to move the minute hand
        if (angle <= 90) {
            return angle * X;
        } else {
            return 90 * X + (angle - 90) * Y;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read initial time
        String time = scanner.nextLine();
        int hours = Integer.parseInt(time.split(":")[0]);
        int minutes = Integer.parseInt(time.split(":")[1]);

        // Read number of queries
        int N = scanner.nextInt();
        scanner.nextLine();

        // Read cost values for clockwise and counterclockwise movements
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        scanner.nextLine();
        int P = scanner.nextInt();
        int Q = scanner.nextInt();
        scanner.nextLine();
        int X = scanner.nextInt();
        int Y = scanner.nextInt();
        scanner.nextLine();

        // List to store queries
        List<Integer> queries = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            queries.add(scanner.nextInt());
        }

        // Total cost variable
        int totalCost = 0;

        // Process each query
        for (int i = 0; i < N; i++) {
            int targetAngle = queries.get(i);
            int currentAngle = getAngleBetweenHands(hours, minutes);

            // Calculate clockwise and counterclockwise cost for the minute hand
            int clockwiseMinuteCost = moveMinuteHand(minutes, (minutes + targetAngle / 6) % 60, X, Y);
            int counterClockwiseMinuteCost = moveMinuteHand(minutes, (minutes - targetAngle / 6 + 60) % 60, X, Y);

            // Choose the minimum cost for the minute hand movement
            int minuteCost = Math.min(clockwiseMinuteCost, counterClockwiseMinuteCost);

            // Calculate the cost of moving the hour hand to the target position
            int clockwiseHourCost = moveHourHand(hours, (hours + targetAngle / 30) % 12, P, Q);
            int counterClockwiseHourCost = moveHourHand(hours, (hours - targetAngle / 30 + 12) % 12, P, Q);

            // Choose the minimum cost for the hour hand movement
            int hourCost = Math.min(clockwiseHourCost, counterClockwiseHourCost);

            // Calculate total cost
            totalCost += Math.min(minuteCost + hourCost, A + B); // If combined cost is cheaper

            // Update the current time for the next query
            hours = (hours + targetAngle / 30) % 12;
            minutes = (minutes + targetAngle / 6) % 60;
        }

        // Output total cost
        System.out.println(totalCost);
    }
}
