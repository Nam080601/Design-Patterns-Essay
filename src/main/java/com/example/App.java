package com.example;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        boolean flag = false;
        System.out.print("Please enter convert type : ");
        Scanner scanner = new Scanner(System.in);
        String convertType = scanner.next();
        System.out.println("Convert type is : " + convertType.replace("2", " to ").toUpperCase());
        ConvertContext context = new ConvertContext();
        ConvertFactory[] convertList = { new ConvertXml2JsonFactory(), new ConvertJson2XmlFactory(),
                new ConvertJson2CsvFactory(), new ConvertCsv2JsonFactory() };

        for (ConvertFactory convert : convertList) {
            if (!convert.getClass().getSimpleName().equalsIgnoreCase("Convert" + convertType + "Factory")) {
                continue;
            }

            context.setConvertStrategy(convert);
            context.Execute();
            flag = true;
        }
        if (!flag) {
            System.out.println("Convert type not supported");
        }
        scanner.close();
    }
}
