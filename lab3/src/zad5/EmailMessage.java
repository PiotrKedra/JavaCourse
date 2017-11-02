package zad5;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.LinkedList;



public class EmailMessage {
    private  String _from; //required
    private LinkedList<String> _to; //required at least one
    private String _subject; //optional
    private String _content; //optional
    private String _mimeType; //optional ?

    //no need
    /*EmailMessage(String from, LinkedList<String> to,
                            String subject, String content){
        _from=null;
        _to=null;
        _subject=null;
        _content=null;
        _mimeType=null;
    }*/

    EmailMessage(){
        _from=null;
        _to=null;
        _subject=null;
        _content=null;
        _mimeType=null;
    }

    public void send(Session session) throws AddressException{
        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(this._from));
            message.setRecipients(Message.RecipientType.TO,
                    InternetAddress.parse(this._to.get(0)));
            message.setSubject(this._subject);
            message.setText(this._content);
            Transport.send(message);

            System.out.println("Done");
        } catch (AddressException a){
            throw a;
        }catch (MessagingException e){
            e.printStackTrace();
        }
    }

    static public class Builder {
        private String _from; //required
        private LinkedList<String> _to; //required at least one
        private String _subject; //optional
        private String _content; //optional
        private String _mimeType; //optional

        public Builder(){
            _from=null;
            _to=new LinkedList<String>();
            _subject=null;
            _content=null;
            _mimeType=null;
        }

        public Builder addFrom(String from){
            this._from = from;
            return this;
        }

        public Builder addTo(String to){
            this._to.add(to);
            return this;
        }

        public Builder addSubject(String subject){
            this._subject = subject;
            return this;
        }

        public Builder addContent(String content){
            this._content = content;
            return this;
        }

        public Builder addMimeType(String mimeType){
            this._mimeType = mimeType;
            return this;
        }

        // check it
        public static Builder builder() {
            return new EmailMessage.Builder();
        }

        public EmailMessage build(){
            EmailMessage email = new EmailMessage();
            email._from = this._from;
            email._to = this._to;
            email._content = this._content;
            email._subject = this._subject;
            email._mimeType = this._mimeType;
            return email;
        }
    }

}
