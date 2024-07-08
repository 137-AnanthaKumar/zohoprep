package taxiapp;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.concurrent.CompletableFuture;

public class MainApp {


    static float               priceforMinKm       = 20f;
    static int                 minkm               = 5;
    static float               remainingPricePerKm = 10f;
    public static List<String> taxiPoints          =
            Arrays.asList("A", "B", "C", "D", "E", "F");
    static int                 kmBetwnPonits       = 15;
    // 60 min
    static int                 timeCapBetenPoints  = 60;
    static List<Ride>          rides               = new ArrayList<Ride>();
    static List<Customer>      listOfCustomer      = new ArrayList<Customer>();
    static List<Taxi>          listOftaxi          = new ArrayList<Taxi>();


    public static void main(String[] args) {
        
      

        Customer cus1 = new Customer("C1", "Ravi", 0f);
        Customer cus2 = new Customer("C2", "Raju", 0f);
        Customer cus3 = new Customer("C3", "Rameash", 0f);
        listOfCustomer.add(cus1);
        listOfCustomer.add(cus2);
        listOfCustomer.add(cus3);
        
        


        // BUSY, AVAIL
        Taxi taxi1 = new Taxi("Taxi-1", 0f, rides, "AVAIL", "A");
        Taxi taxi2 = new Taxi("Taxi-2", 0f, rides, "AVAIL", "A");
        Taxi taxi3 = new Taxi("Taxi-3", 0f, rides, "AVAIL", "A");
        Taxi taxi4 = new Taxi("Taxi-4", 0f, rides, "AVAIL", "A");
        listOftaxi.add(taxi1);
        listOftaxi.add(taxi2);
        listOftaxi.add(taxi3);
        listOftaxi.add(taxi4);
        CompletableFuture.runAsync(() -> {
            processBackrun();
        });

        boolean appstart = true;
        while (appstart)
        {
            Scanner myObj = new Scanner(System.in); // Create a Scanner object

          
                System.out.println("Enter A for new Booking");
                System.out.println("Enter B for Taxi View");
                String options = myObj.nextLine();

                switch (options)
                {
                    case "A":
                    {
                        newBookingInitaate();
                        break;

                    }
                    case "B":
                    {
                        viewDataInitate();
                        break;

                    }default :{
                        System.out.println("Enter the valid input");

                    }


                }

            

        }

    }



    private static void processBackrun() {
        boolean a=true;
        while(a) {
            for(Taxi tax:listOftaxi) {
                LocalTime currentTime = LocalTime.now();
                int hour = currentTime.getHour();
                tax.getHistoryOfride().forEach(ride->{
                    if(ride.getStatus().equalsIgnoreCase("REGISTESRED") && ride.getPickUpTime().equalsIgnoreCase(String.valueOf(hour)) ){
                     tax.setRideStatus("BUSY");
                   }else if(ride.getStatus().equalsIgnoreCase("BUSY") && ride.getEndTime().equalsIgnoreCase(String.valueOf(hour))) {
                       tax.setRideStatus("AVAIL");

                   }
                });
                
               
            }
            try
            {
                Thread.sleep(300000);
            }
            catch (InterruptedException e)
            {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        
    }



    private static void viewDataInitate() {
        System.out.println("---------TAXI VIEW------------------");

        for (Taxi taxi : listOftaxi)
        {

            System.out.println("Taxi Number: " + taxi.getTaxiName()
                    + " , Total Earning " + taxi.getTotalEarning());
            System.out.println(taxi.getTaxiName()+" : "+taxi.getHistoryOfride().size());
            for (Ride ride : taxi.getHistoryOfride())
            {
                System.out.println("----------------------------------");

                System.out.println("Booking ID     :" + ride.getBookingId());
                System.out.println("Customer ID    :" + ride.getCustomerId());
                System.out.println("Pickuppoint    :" + ride.getStartPoint());
                System.out.println("Endpoint       :" + ride.getEndPoint());
                System.out.println("Pickup Time    :" + ride.getPickUpTime());
                System.out.println("Drop Time      :" + ride.getEndTime());
                System.out.println("Total Cast     :" + ride.getTotalCost());
                
                System.out.println("------------------------------------------------------------");



            }


        }
        System.out.println("---------TAXI VIEW END------------------");


    }

    private static void newBookingInitaate() {
        Scanner myObj = new Scanner(System.in); // Create a Scanner object

        System.out.println("Enter Customer Id :");
        String cusId = myObj.nextLine();
        System.out.println("Enter PickUp point :");
        String pickUpPoint = myObj.nextLine();
        System.out.println("Enter Drop point :");
        String dropPoint = myObj.nextLine();
        System.out.println("Enter Pickup time :");
        String pickUpTime = myObj.nextLine();
        System.out.println("Customer Id: " + cusId);
        System.out.println("PickUp point: " + pickUpPoint);
        System.out.println("Drop Point: " + dropPoint);
        System.out.println("Pickup time : " + pickUpTime);

        System.out.println("  ");
        System.out
                .println(" Please Confirm Above details, Press 1 to continoue");

        int userInput = myObj.nextInt();

        if (userInput == 1)
        {

            System.out.println("Processing Your request!...");
            try
            {
                Thread.sleep(1000);
            }
            catch (InterruptedException e)
            {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

            boolean cusIdAvail =
                    checkCustomerCrendential(cusId, listOfCustomer);
            if (!cusIdAvail)
            {
                System.out.println(
                        "Customer Not Found, Please Register the customer");
            }else {
                processBooking(cusId, listOftaxi, listOfCustomer, pickUpPoint,
                        dropPoint, pickUpTime);
            }

          



        }



    }

    private static void processBooking(String cusId, List<Taxi> listOftaxi,
            List<Customer> listOfCustomer, String pickUpPoint, String dropPoint,
            String pickUpTime) {
        String endTime = calculateEndTime(pickUpPoint, dropPoint, pickUpTime);


        Optional<Taxi> taxi = listOftaxi.stream()
                .filter(tax -> tax.getRideStatus().equalsIgnoreCase("AVAIL")
                        && tax.getCurrentLocation()
                                .equalsIgnoreCase(pickUpPoint))
                .findFirst();
        if (taxi.isPresent())
        {
            Taxi taxiDetails = taxi.get();
            initiateBooking(cusId, pickUpPoint, dropPoint, pickUpTime,
                    taxiDetails, endTime);

        }
        else
        {
            List<String> nearestPoint = getNearestPoint(pickUpPoint);
            boolean found = false;
            for (String point : nearestPoint)
            {
                Optional<Taxi> taxiIn = listOftaxi.stream().filter(tax -> tax
                        .getRideStatus().equalsIgnoreCase("AVAIL")
                        && tax.getCurrentLocation().equalsIgnoreCase(point))
                        .findFirst();
                if (taxiIn.isPresent())
                {
                    Taxi taxiDeta = taxiIn.get();
                    initiateBooking(cusId, pickUpPoint, dropPoint, pickUpTime,
                            taxiDeta, endTime);
                    found = true;
                    break;

                }

            }
            if (!found)
            {
                System.out.println("No Taxi Available");
            }

        }



    }


    private static void initiateBooking(String cusId, String pickUpPoint,
            String dropPoint, String pickUpTime, Taxi taxiDetails,
            String endTime) {
        float totalPrize = calculatePrize(pickUpPoint, dropPoint);
        Ride newRide = new Ride();
        newRide.setCustomerId(cusId);
        newRide.setStatus("REGISTERED");
        newRide.setBookingId(String.valueOf(rides.size() + 1));
        newRide.setTotalCost(totalPrize);
        newRide.setStartPoint(pickUpPoint);
        newRide.setPickUpTime(pickUpTime);
        newRide.setEndPoint(dropPoint);
        newRide.setEndTime(endTime);
        taxiDetails.getHistoryOfride().add(newRide);
        taxiDetails.setTotalEarning(taxiDetails.getTotalEarning()+totalPrize);
        taxiDetails.setRideStatus("REGISTEDRED");
        rides.add(newRide);
      if (taxiDetails.getHistoryOfride() != null)
        {

        }

        System.out.println("Taxi is Allocated");
        System.out.println(taxiDetails.getTaxiName() + " is allocated");
        System.out.println("T-----------------------Aaxi is Allocated");

        System.out.println(taxiDetails);

        System.out.println(taxiDetails.getHistoryOfride().size());
    }

    private static List<String> getNearestPoint(String pickUpPoint) {

        List<String> nearestPoint = new ArrayList<String>();
        int index = taxiPoints.indexOf(pickUpPoint);
        
        if (index == 0)
        {
            nearestPoint.add(taxiPoints.get(index + 1));
        }
        else if (index == (taxiPoints.size() - 1))
        {
            nearestPoint.add(taxiPoints.get(index - 1));

        }
        else
        {
            nearestPoint.add(taxiPoints.get(index + 1));
            nearestPoint.add(taxiPoints.get(index - 1));

        }

        // TODO Auto-generated method stub
        return nearestPoint;
    }

    public static boolean isThatAvailable() {
        return true;
    }

    private static String calculateEndTime(String pickUpPoint, String dropPoint,
            String pickUpTime) {
        int pickUpIndex = taxiPoints.indexOf(pickUpPoint);
        int dropIndex = taxiPoints.indexOf(dropPoint);
        int distance = dropIndex - pickUpIndex;
        int totalTime = timeCapBetenPoints * distance;
        int endTime = totalTime / 60;
        return String.valueOf(endTime+pickUpTime);
    }

    private static float calculatePrize(String pickUpPoint, String dropPoint) {

        int pickUpIndex = taxiPoints.indexOf(pickUpPoint);
        int dropIndex = taxiPoints.indexOf(dropPoint);
        int distance = dropIndex - pickUpIndex;
        int totalKm = kmBetwnPonits * distance;
        // 30 ->
        float minKmprize = minkm * priceforMinKm;
        int remaiininKm = totalKm - minkm;
        float remainingPrice = remaiininKm * remainingPricePerKm;

        float totalCast = minKmprize + remainingPrice;


        return totalCast;



    }

    private static boolean checkCustomerCrendential(String cusId,
            List<Customer> listOfCustomer) {
        return listOfCustomer.stream()
                .anyMatch(cus -> cus.getCusId().equalsIgnoreCase(cusId));

    }

}
