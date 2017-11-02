package zad5;

import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.internet.AddressException;
import java.util.Properties;

public class TestEmail {
    public static void main(String [] argv) {
        final String username = "piotr.k9750@gmail.com";
        final String password = "eloelo12";

        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

        Session session = Session.getInstance(props,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(username, password);
                    }
                });

        EmailMessage mail = new EmailMessage.Builder()
                .addFrom("piotr.k9750@gmail.com")
                .addTo("mateusz_zygmuntowicz@wp.pl")
                .addSubject("ATAK BOBA")
                .addContent("test")
                .build();

        for(int i=0;i<10;++i) {
            try {
                mail.send(session);
            } catch (AddressException e) {
                e.printStackTrace();
            }
        }
    }
}

