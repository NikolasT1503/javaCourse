package lesson13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("Белеет парус одинокий");
        sb.append("Что ищет он в стране далекой?");
        sb.append("Что кинул он в краю родном?..");
        sb.insert(21," В тумане моря голубом!..");
        System.out.println(sb.toString());

        Pattern cardNumber = Pattern.compile("\\+*\\d{14}");
        String card = "025612348789564123";
        Matcher matcher = cardNumber.matcher(card);
        System.out.println(matcher.replaceAll("****"));

    }

}
