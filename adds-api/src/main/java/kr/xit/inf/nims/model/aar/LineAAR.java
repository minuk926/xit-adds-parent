
package kr.xit.inf.nims.model.aar;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>lineAAR complex type에 대한 Java 클래스입니다.
 *
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 *
 * <pre>
 * &lt;complexType name="lineAAR"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="USR_RPT_ID_NO" type="{https://www.nims.or.kr/schema/nims}USR_RPT_ID_NO"/&gt;
 *         &lt;element name="USR_RPT_LN_ID_NO" type="{https://www.nims.or.kr/schema/nims}USR_RPT_LN_ID_NO"/&gt;
 *         &lt;element name="STORGE_NO" type="{https://www.nims.or.kr/schema/nims}STORGE_NO"/&gt;
 *         &lt;element name="MVMN_TY_CD" type="{https://www.nims.or.kr/schema/nims}MVMN_TY_CD"/&gt;
 *         &lt;element name="PRDUCT_CD" type="{https://www.nims.or.kr/schema/nims}PRDUCT_CD"/&gt;
 *         &lt;element name="MNF_NO" type="{https://www.nims.or.kr/schema/nims}MNF_NO"/&gt;
 *         &lt;element name="MNF_SEQ" type="{https://www.nims.or.kr/schema/nims}MNF_SEQ"/&gt;
 *         &lt;element name="MIN_DISTB_QY" type="{https://www.nims.or.kr/schema/nims}MIN_DISTB_QY"/&gt;
 *         &lt;element name="PRD_MIN_DISTB_UNIT" type="{https://www.nims.or.kr/schema/nims}PRD_MIN_DISTB_UNIT"/&gt;
 *         &lt;element name="PCE_QY" type="{https://www.nims.or.kr/schema/nims}PCE_QY"/&gt;
 *         &lt;element name="PRD_PCE_UNIT" type="{https://www.nims.or.kr/schema/nims}PRD_PCE_UNIT"/&gt;
 *         &lt;element name="PRDUCT_NM" type="{https://www.nims.or.kr/schema/nims}PRDUCT_NM"/&gt;
 *         &lt;element name="PRD_SGTIN" type="{https://www.nims.or.kr/schema/nims}PRD_SGTIN"/&gt;
 *         &lt;element name="PRD_MIN_DISTB_QY" type="{https://www.nims.or.kr/schema/nims}PRD_MIN_DISTB_QY"/&gt;
 *         &lt;element name="PRD_TOT_PCE_QY" type="{https://www.nims.or.kr/schema/nims}PRD_TOT_PCE_QY"/&gt;
 *         &lt;element name="PRD_VALID_DE" type="{https://www.nims.or.kr/schema/nims}PRD_VALID_DE"/&gt;
 *         &lt;element name="FILE_CREAT_DT" type="{https://www.nims.or.kr/schema/nims}FILE_CREAT_DT"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "lineAAR", namespace = "https://www.nims.or.kr/schema/nims", propOrder = {
    "usrrptidno",
    "usrrptlnidno",
    "storgeno",
    "mvmntycd",
    "prductcd",
    "mnfno",
    "mnfseq",
    "mindistbqy",
    "prdmindistbunit",
    "pceqy",
    "prdpceunit",
    "prductnm",
    "prdsgtin",
    "prdmindistbqy",
    "prdtotpceqy",
    "prdvalidde",
    "filecreatdt"
})
public class LineAAR {

    @XmlElement(name = "USR_RPT_ID_NO", namespace = "https://www.nims.or.kr/schema/nims", required = true)
    protected String usrrptidno;
    @XmlElement(name = "USR_RPT_LN_ID_NO", namespace = "https://www.nims.or.kr/schema/nims", required = true)
    protected String usrrptlnidno;
    @XmlElement(name = "STORGE_NO", namespace = "https://www.nims.or.kr/schema/nims", required = true)
    protected String storgeno;
    @XmlElement(name = "MVMN_TY_CD", namespace = "https://www.nims.or.kr/schema/nims", required = true)
    protected String mvmntycd;
    @XmlElement(name = "PRDUCT_CD", namespace = "https://www.nims.or.kr/schema/nims", required = true)
    protected String prductcd;
    @XmlElement(name = "MNF_NO", namespace = "https://www.nims.or.kr/schema/nims", required = true)
    protected String mnfno;
    @XmlElement(name = "MNF_SEQ", namespace = "https://www.nims.or.kr/schema/nims", required = true)
    protected String mnfseq;
    @XmlElement(name = "MIN_DISTB_QY", namespace = "https://www.nims.or.kr/schema/nims", required = true)
    protected String mindistbqy;
    @XmlElement(name = "PRD_MIN_DISTB_UNIT", namespace = "https://www.nims.or.kr/schema/nims", required = true)
    protected String prdmindistbunit;
    @XmlElement(name = "PCE_QY", namespace = "https://www.nims.or.kr/schema/nims", required = true)
    protected String pceqy;
    @XmlElement(name = "PRD_PCE_UNIT", namespace = "https://www.nims.or.kr/schema/nims", required = true)
    protected String prdpceunit;
    @XmlElement(name = "PRDUCT_NM", namespace = "https://www.nims.or.kr/schema/nims", required = true)
    protected String prductnm;
    @XmlElement(name = "PRD_SGTIN", namespace = "https://www.nims.or.kr/schema/nims", required = true)
    protected String prdsgtin;
    @XmlElement(name = "PRD_MIN_DISTB_QY", namespace = "https://www.nims.or.kr/schema/nims", required = true)
    protected String prdmindistbqy;
    @XmlElement(name = "PRD_TOT_PCE_QY", namespace = "https://www.nims.or.kr/schema/nims", required = true)
    protected String prdtotpceqy;
    @XmlElement(name = "PRD_VALID_DE", namespace = "https://www.nims.or.kr/schema/nims", required = true)
    protected String prdvalidde;
    @XmlElement(name = "FILE_CREAT_DT", namespace = "https://www.nims.or.kr/schema/nims", required = true)
    protected String filecreatdt;

    /**
     * usrrptidno 속성의 값을 가져옵니다.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUSRRPTIDNO() {
        return usrrptidno;
    }

    /**
     * usrrptidno 속성의 값을 설정합니다.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUSRRPTIDNO(String value) {
        this.usrrptidno = value;
    }

    /**
     * usrrptlnidno 속성의 값을 가져옵니다.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUSRRPTLNIDNO() {
        return usrrptlnidno;
    }

    /**
     * usrrptlnidno 속성의 값을 설정합니다.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUSRRPTLNIDNO(String value) {
        this.usrrptlnidno = value;
    }

    /**
     * storgeno 속성의 값을 가져옵니다.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSTORGENO() {
        return storgeno;
    }

    /**
     * storgeno 속성의 값을 설정합니다.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSTORGENO(String value) {
        this.storgeno = value;
    }

    /**
     * mvmntycd 속성의 값을 가져옵니다.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getMVMNTYCD() {
        return mvmntycd;
    }

    /**
     * mvmntycd 속성의 값을 설정합니다.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setMVMNTYCD(String value) {
        this.mvmntycd = value;
    }

    /**
     * prductcd 속성의 값을 가져옵니다.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPRDUCTCD() {
        return prductcd;
    }

    /**
     * prductcd 속성의 값을 설정합니다.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPRDUCTCD(String value) {
        this.prductcd = value;
    }

    /**
     * mnfno 속성의 값을 가져옵니다.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getMNFNO() {
        return mnfno;
    }

    /**
     * mnfno 속성의 값을 설정합니다.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setMNFNO(String value) {
        this.mnfno = value;
    }

    /**
     * mnfseq 속성의 값을 가져옵니다.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getMNFSEQ() {
        return mnfseq;
    }

    /**
     * mnfseq 속성의 값을 설정합니다.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setMNFSEQ(String value) {
        this.mnfseq = value;
    }

    /**
     * mindistbqy 속성의 값을 가져옵니다.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getMINDISTBQY() {
        return mindistbqy;
    }

    /**
     * mindistbqy 속성의 값을 설정합니다.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setMINDISTBQY(String value) {
        this.mindistbqy = value;
    }

    /**
     * prdmindistbunit 속성의 값을 가져옵니다.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPRDMINDISTBUNIT() {
        return prdmindistbunit;
    }

    /**
     * prdmindistbunit 속성의 값을 설정합니다.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPRDMINDISTBUNIT(String value) {
        this.prdmindistbunit = value;
    }

    /**
     * pceqy 속성의 값을 가져옵니다.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPCEQY() {
        return pceqy;
    }

    /**
     * pceqy 속성의 값을 설정합니다.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPCEQY(String value) {
        this.pceqy = value;
    }

    /**
     * prdpceunit 속성의 값을 가져옵니다.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPRDPCEUNIT() {
        return prdpceunit;
    }

    /**
     * prdpceunit 속성의 값을 설정합니다.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPRDPCEUNIT(String value) {
        this.prdpceunit = value;
    }

    /**
     * prductnm 속성의 값을 가져옵니다.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPRDUCTNM() {
        return prductnm;
    }

    /**
     * prductnm 속성의 값을 설정합니다.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPRDUCTNM(String value) {
        this.prductnm = value;
    }

    /**
     * prdsgtin 속성의 값을 가져옵니다.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPRDSGTIN() {
        return prdsgtin;
    }

    /**
     * prdsgtin 속성의 값을 설정합니다.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPRDSGTIN(String value) {
        this.prdsgtin = value;
    }

    /**
     * prdmindistbqy 속성의 값을 가져옵니다.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPRDMINDISTBQY() {
        return prdmindistbqy;
    }

    /**
     * prdmindistbqy 속성의 값을 설정합니다.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPRDMINDISTBQY(String value) {
        this.prdmindistbqy = value;
    }

    /**
     * prdtotpceqy 속성의 값을 가져옵니다.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPRDTOTPCEQY() {
        return prdtotpceqy;
    }

    /**
     * prdtotpceqy 속성의 값을 설정합니다.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPRDTOTPCEQY(String value) {
        this.prdtotpceqy = value;
    }

    /**
     * prdvalidde 속성의 값을 가져옵니다.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPRDVALIDDE() {
        return prdvalidde;
    }

    /**
     * prdvalidde 속성의 값을 설정합니다.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPRDVALIDDE(String value) {
        this.prdvalidde = value;
    }

    /**
     * filecreatdt 속성의 값을 가져옵니다.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFILECREATDT() {
        return filecreatdt;
    }

    /**
     * filecreatdt 속성의 값을 설정합니다.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFILECREATDT(String value) {
        this.filecreatdt = value;
    }

}
