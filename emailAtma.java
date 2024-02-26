
package martekstaj;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class emailAtma {

    public static void mail(String subject, String message1,List<String> mail){
        try{
            String from ="stajstaj61@gmail.com";
            String pass="mcohfayqbnyrspja";
            String[] to = {mail.get(0)};
            String host = "smtp.gmail.com";
            
            Properties props = new Properties();
            props.put("mail.smtp.starttls.enable","true");
            props.put("mail.smtp.host", host);
            props.put("mail.smtp.user", from);
            props.put("mail.smtp.password", pass);
            props.put("mail.smtp.port", "587");
            props.put("mail.smtp.auth", "true");
            

            Session session = Session.getDefaultInstance(props, null) ;
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(from));
            InternetAddress[] toAddress = new InternetAddress[to.length];
            for(int i=0;i<to.length;i++){
                toAddress[i] = new InternetAddress(to[i]);
            }
            for(int i =0 ;i<toAddress.length;i++){
                message.addRecipient(Message.RecipientType.TO, toAddress[i]);
            }
            message.setSubject(subject);
            message.setText(message1);
            
            Transport transport = session.getTransport("smtp");
            transport.connect(host,from,pass);
            transport.sendMessage(message, message.getAllRecipients());
            transport.close();
        }catch(Exception e){
            System.out.println("hata"+e);
    
}    
    }
    
    public  void gerceklesme(String hedefAdres){
        List mail = new ArrayList();
        mail.add("stajstaj61@gmail.com");
        
        //System.out.println(mail);
        mail("Ağ Erişim Sorunu", hedefAdres + " erişilemez", mail);
    }
}