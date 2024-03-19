
package kr.xit.inf.nims.model;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>atchFiles complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="atchFiles"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ATCH_FILE_NM" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "atchFiles", namespace = "https://www.nims.or.kr/schema/nims", propOrder = {
    "atchfilenm"
})
public class AtchFiles {

    @XmlElement(name = "ATCH_FILE_NM", namespace = "https://www.nims.or.kr/schema/nims", required = true)
    protected List<String> atchfilenm;

    /**
     * Gets the value of the atchfilenm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the atchfilenm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getATCHFILENM().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getATCHFILENM() {
        if (atchfilenm == null) {
            atchfilenm = new ArrayList<String>();
        }
        return this.atchfilenm;
    }

}
