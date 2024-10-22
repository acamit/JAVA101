import com.company.model.ClothingItem;
import com.company.model.ClothingSize;
import com.company.model.Shirt;
import org.w3c.dom.ls.LSOutput;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void AnnounceTeaTime(){
        System.out.println("printing time");
        Scanner sc = new Scanner(System.in);
        sc.next();
        System.out.println("time here");
    }
    public static void main(String[] args) {
//        int  studentAge = 15;
//        double gpa = 3.45;
//        AnnounceTeaTime();
//        boolean hasPerfectAttendance = false;
//        String studentFirstName = "Kayla";
//        String studentLastName = "Hammon";
//        char studentFirstInitial = studentFirstName.charAt(0);
//        char studentLasInitial = studentLastName.charAt(0);
//        System.out.println(studentAge);
//        System.out.println(gpa);
//        System.out.println(studentFirstInitial);
//        System.out.println(studentLasInitial);
//        System.out.println(hasPerfectAttendance);
//        System.out.println(studentFirstName + " " + studentLastName);
//        System.out.println(studentFirstName.length());
//        // read input
//        Scanner input = new Scanner(System.in);
//        gpa = input.nextDouble();
//        System.out.println(gpa);
//
//        if(gpa>4){
//            hasPerfectAttendance = true;
//
//        }
//        else if(gpa<4){
//            hasPerfectAttendance = false;
//        }else{
//            hasPerfectAttendance = true;
//        }
//
//        boolean isRepeat = true;
//        while(isRepeat){
//            System.out.println("Play song");
//            System.out.println("Remove song");
//            String userInput = input.next();
//            if(userInput.equals("yes")){
//                isRepeat  = false;
//            }
//        }
//
//        // precision values
//        var longValue = 2000L;
//        var bigValue = new BigDecimal("0.0012");
//        var bigSum = bigValue.add(bigValue);
//        var sum = bigSum.doubleValue();
//
//        short shortValue = (short) longValue;
//        double doubleValue = -3.9999;
//        Math.round(doubleValue);
//
//        boolean avalue= true;
//        var b2 = false;
//        var b3 = !b2;
//        char c1= 'a';
//        char dollar = '\u0024';  // unicode
//
//        var upper = Character.toUpperCase(c1);
//
//        char [] chars = {'h', 'e', 'l', 'l', 'o'};
//
//        String s = new String(chars);
//
//        var charArray = s.toCharArray();
//
//        String s2 = "hello";
//        System.out.println(s.equals(s2));
//
//        // &&  ||
//
//        double value = 22.3;
//        var rounded = Math.round(value*100)/100d;
//
//        var bigV = BigDecimal.valueOf(rounded);
//        var rounded2 = bigV.setScale(2, RoundingMode.HALF_UP).doubleValue();
//
//        s2.toUpperCase();
//        s2.charAt(3);
//        s2.getBytes();
//
//
//        var sb = new StringBuilder("Welcome");
//        sb.append(s);
//        System.out.println(sb.toString());
//        Boolean.toString(true);

        System.out.println(Thread.activeCount());

        // string formating
        var dVal = 10_000_000.53;
        var numf = NumberFormat.getNumberInstance();
        System.out.println("Number"+ numf.format(dVal));

        var intf = NumberFormat.getIntegerInstance();
        System.out.println("Number"+ intf.format(dVal));
        intf.setGroupingUsed(false); // no seprateer

        var locale = Locale.getDefault();

        var localeFormatter = NumberFormat.getNumberInstance(locale);
        System.out.println(localeFormatter.format(dVal));

        var gLocale = new Locale("de", "DE"); // germany
        var currencyFormatter = NumberFormat.getCurrencyInstance(gLocale);
        System.out.println(currencyFormatter.format(dVal));

        var df = new DecimalFormat("$00.00");
        System.out.println(df.format(1));

        var item = "shirt";
        var size = "M";
        var price = 14.99;
        var color = "red";
        var template = "clothing %s size %s color %s %.2f";
        var itemString = String.format(template, item, size, color, price);
        System.out.println(itemString.length());

        var scanner = new Scanner(System.in);

        System.out.print("Enter value");
        var input = scanner.nextLine();
        var num1= scanner.nextInt();
        var num2= scanner.nextInt();
        System.out.println(input);

        var now = LocalDateTime.now();
        var monthNumber = now.getMonthValue();
        var m2 = now.getDayOfMonth();

        switch (monthNumber){
            case 1:
                System.out.println("1");
                break;
            default:
                System.out.println("default");
        }
        String [] months = {"Jan", "feb"};
        for (String month :months){
            System.out.println(month);
        }
//        shift + f6 - refactoring
        do{
            m2++;
        }while (m2!=4);

        try(FileReader reader = new FileReader(new File("abc.txt"))){

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        CalcHelper.addValue(1, 3);

        var clothingItem = new ClothingItem(ClothingItem.SHIRT, ClothingSize.M,19.99, 3);

        var totalPrice = clothingItem.getPrice() * clothingItem.getQuantity();
        var formatter = NumberFormat.getCurrencyInstance(Locale.US);
        var output = String.format("Your %s order will cost %s. %s", clothingItem.getType(), formatter.format(totalPrice), clothingItem.getSize());
        System.out.println(output);

        List<String> colors = new ArrayList<>();
        colors.add("red");
        for(int i=0;i<colors.size();i++){
            System.out.println(colors.get(i));
        }

        Map<String, ClothingItem> items = new HashMap<>();
        items.put("shirt", new Shirt(ClothingSize.L, 12, 2));
        items.get("shirt");

        var keys = items.keySet();
        for (String key :keys){
            var i = items.get(key);
        }

        ThreadingExample thread1 = new ThreadingExample();
        thread1.setName("My first thread");
        thread1.start();

        ThreadingExample thread2 = new ThreadingExample();
        thread1.setName("My second thread");
        thread1.start();

        Thread thread3 = new Thread(new RunnableExample());
        thread3.setName("My third thread");
        thread3.start();

        Thread thread4 = new Thread(new Runnable() {
            @Override
            public void run() {

            }
        });

    }
    private  static double addValues(int... values){
        double result = 0;
        for(int value : values){
            result += value;
        }
        return result;
    }

    public static void Streams(){
        ArrayList<Book> books = new ArrayList<>();
        books.stream().filter(book -> {
            return book.getAuthor().startsWith("M");
        }).filter(book -> {
            return book.getTitle().startsWith("M");
        }).forEach(System.out::println);

        books.parallelStream().filter(book -> {
            return book.getAuthor().startsWith("M");
        }).filter(book -> {
            return book.getTitle().startsWith("M");
        }).forEach(System.out::println);
    }


}