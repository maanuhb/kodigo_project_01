package utilities;

import org.apache.commons.mail.Email;
import org.apache.commons.mail.SimpleEmail;
import org.apache.commons.mail.EmailException;
import java.util.Date;


public class SendMail {
    private final String HOSTNAME= "smtp.gmail.com";
    private final int PORT = 465;
    private final String EMAIL ="correo@gmail.com";
    private final String PASS ="PASS";

    public void send(String emailToSend) {
        Date fecha = new Date();
        Email email = new SimpleEmail();
        email.setHostName(HOSTNAME);
        email.setSmtpPort(PORT);
        email.setAuthentication(EMAIL, PASS);
        email.setSSLOnConnect(true);

        try {
            email.setFrom(EMAIL);
            email.setSubject("PRUEBA");
            email.addTo(emailToSend); 
            email.setMsg("Envio de correo realizado exitosamente\n");
            email.send();
        } catch (EmailException ex) {
            ex.getMessage();
        }
    }
}
