package homework11;

import java.io.*;

/*3*) � ��������� ���� ��������� �������� ������� � ��� �������� ������ � ��� ������.
a) ������� ������� ���� �� ������.
b) �������� � ������ ���� ���� ��� ������ ������ 3 ������.*/

public class Dz3 {

    public static void main(String[] args) {

        readFromFile("klass.txt");
        //writeToFileV2("asdf\nasdf\n1234", "test.txt");
    }

    private static void readFromFile(String fileName) {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {

            int counter = 0;
            double sum = 0;
            StringBuilder stringBuilder = new StringBuilder();

            String currentLine;
            while ((currentLine = br.readLine()) != null) {
                String line = currentLine;
                int assessment = Integer.parseInt(line.substring(line.length() - 1));
                sum += assessment;
                if (assessment < 3) {
                    stringBuilder.append(line + "\n");
                }
                counter++;
            }
            double averageMark = sum / counter;
            System.out.println("������� ���� �� ������ �����: " + String.format("%.2f", averageMark));
            writeToFileV2(String.valueOf(stringBuilder), "newList.txt");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void writeToFileV2(String str, String fileName) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(str);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
