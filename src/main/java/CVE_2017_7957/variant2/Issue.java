package CVE_2017_7957.variant2;

import com.thoughtworks.xstream.XStream;

public class Issue {

    public static void main(String[] args) {
        XStream xstream = new XStream();

        xstream.fromXML("<string class='void'>Hello, world!</string>");
    }
}
