
package kr.xit.inf.nims.model.aar;

import java.util.ArrayList;
import java.util.List;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * <p>reportSetAAR complex type에 대한 Java 클래스입니다.
 *
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 *
 * <pre>
 * &lt;complexType name="reportSetAAR"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UID" type="{https://www.nims.or.kr/schema/nims}UID"/&gt;
 *         &lt;element name="SW_ID" type="{https://www.nims.or.kr/schema/nims}SW_ID"/&gt;
 *         &lt;element name="RND_RMK" type="{https://www.nims.or.kr/schema/nims}RND_RMK" minOccurs="0"/&gt;
 *         &lt;element name="HEADER" type="{https://www.nims.or.kr/schema/nims}headerAAR" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "reportSetAAR", namespace = "https://www.nims.or.kr/schema/nims", propOrder = {
    "uid",
    "swid",
    "rndrmk",
    "header"
})
public class ReportSetAAR {

    @XmlElement(name = "UID", namespace = "https://www.nims.or.kr/schema/nims", required = true)
    protected String uid;
    @XmlElement(name = "SW_ID", namespace = "https://www.nims.or.kr/schema/nims", required = true)
    protected String swid;
    @XmlElement(name = "RND_RMK", namespace = "https://www.nims.or.kr/schema/nims")
    protected String rndrmk;
    @XmlElement(name = "HEADER", namespace = "https://www.nims.or.kr/schema/nims", required = true)
    protected List<HeaderAAR> header;

    /**
     * uid 속성의 값을 가져옵니다.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUID() {
        return uid;
    }

    /**
     * uid 속성의 값을 설정합니다.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUID(String value) {
        this.uid = value;
    }

    /**
     * swid 속성의 값을 가져옵니다.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSWID() {
        return swid;
    }

    /**
     * swid 속성의 값을 설정합니다.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSWID(String value) {
        this.swid = value;
    }

    /**
     * rndrmk 속성의 값을 가져옵니다.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRNDRMK() {
        return rndrmk;
    }

    /**
     * rndrmk 속성의 값을 설정합니다.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRNDRMK(String value) {
        this.rndrmk = value;
    }

    /**
     * Gets the value of the header property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the header property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHEADER().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HeaderAAR }
     *
     *
     */
    public List<HeaderAAR> getHEADER() {
        if (header == null) {
            header = new ArrayList<HeaderAAR>();
        }
        return this.header;
    }

}
