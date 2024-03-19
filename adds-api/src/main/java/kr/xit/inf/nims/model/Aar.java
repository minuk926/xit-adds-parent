
package kr.xit.inf.nims.model;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>aar complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="aar"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="REPORT_SET" type="{https://www.nims.or.kr/schema/nims}reportSetAAR"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "aar", namespace = "https://www.nims.or.kr/schema/nims", propOrder = {
    "reportset"
})
public class Aar {

    @XmlElement(name = "REPORT_SET", namespace = "https://www.nims.or.kr/schema/nims", required = true)
    protected ReportSetAAR reportset;

    /**
     * reportset 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link ReportSetAAR }
     *     
     */
    public ReportSetAAR getREPORTSET() {
        return reportset;
    }

    /**
     * reportset 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportSetAAR }
     *     
     */
    public void setREPORTSET(ReportSetAAR value) {
        this.reportset = value;
    }

}
