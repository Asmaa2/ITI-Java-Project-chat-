//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.01.20 at 10:47:26 AM EET 
//


package XML;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author asmaa
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "historyType", propOrder = {
    "message"
})
public class HistoryType {

   
    @XmlElement(required = true)
    protected List<MessageType> message;

    @XmlAttribute(name = "owner", required = true)
    protected String owner;

 
    public List<MessageType> getMessage() {
        if (message == null) {
            message = new ArrayList<MessageType>();
        }
        return this.message;
    }

  
    public String getOwner() {
        return owner;
    }

   
    public void setOwner(String value) {
        this.owner = value;
    }

}
