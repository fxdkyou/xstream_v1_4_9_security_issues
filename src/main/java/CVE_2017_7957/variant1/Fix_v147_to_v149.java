package CVE_2017_7957.variant1;

import com.thoughtworks.xstream.XStream;

public class Fix_v147_to_v149 {

    public static void main(String[] args) {
        XStream xstream = new XStream();

        // this api comes only with v1.4.7
        xstream.denyTypes(new Class[]{ void.class, Void.class });

        xstream.fromXML("<void/>");
    }
}
