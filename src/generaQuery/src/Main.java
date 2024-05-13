import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter writer = null;

        String[] firstNames = {"Matteo", "Elena", "Luca", "Laura", "Alessandro", "Paola", "Carlo", "Sofia", "Giovanni", "Francesca", "Anna", "Roberto", "Giulia", "Luigi", "Mario"};
        String[] lastNames = {"De Luca", "Conti", "Gallo", "Bruno", "Greco", "Marino", "Ricci", "Colombo", "Romano", "Bianco", "Esposito", "Russo", "Ferrari", "Bianchi", "Rossi"};
        String[] fiscalCodes = {"DLCELN95T30F839U", "CNTTLN90E66H501P", "GLLMRA83P28B791N", "BRNLRA68M11E204R", "GRCAES81C30D963Q", "MARNPL93E42H501T", "RCCRLA74P13A509R", "CLBSFA89T47G240X", "RSGGNN82A10F839Z", "BNCFRN85R51C968X", "SPTNNA91M41L424K", "RSSRRT75L10H501E", "FRRGLI64H65E204J", "BNCLGI75B52F839S", "RSSMRA85A01H501H"};
        String[] birthDates = {"1995-12-30", "1990-06-06", "1983-09-28", "1968-05-11", "1981-03-30", "1993-05-12", "1974-09-13", "1989-04-17", "1982-01-10", "1985-12-05", "1991-03-14", "1975-10-10", "1964-08-05", "1975-05-02", "1985-01-01"};
        String[] birthTimes = {"18:25:00", "07:10:00", "11:55:00", "05:20:00", "21:45:00", "17:00:00", "13:20:00", "09:40:00", "16:55:00", "12:30:00", "10:10:00", "03:45:00", "19:20:00", "14:15:00", "08:30:00"};
        String[] graduated = {"false", "false", "false", "false", "true", "true", "false", "true", "true", "true", "false", "true", "true", "false", "false"};

        Random random = new Random();

        try {
            FileWriter fileWriter = new FileWriter("commands.txt", true); // true tells to append data.
            writer = new BufferedWriter(fileWriter);
            String query;

            for (int i = 0; i < 7; i++) {
                query = "INSERT IGNORE INTO contact (firstName, lastName, fiscalCode, birthDate, birthTime, graduated) VALUES (";
                int index = random.nextInt(15);
                query += "\"" + firstNames[index] + "\"" + ", " + "\"" + lastNames[index] + "\"" + ", " + "\"" + fiscalCodes[index] + "\"" + ", " + "\"" + birthDates[index] + "\"" + ", " + "\"" + birthTimes[index] + "\"" + ", " + "\"" + graduated[index] + "\"" + ");";
                System.out.println(query);
                writer.write("\n" + query + ";");
            }
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        } finally {
            if (writer != null) {
                writer.close();
            }
        }
    }
}
