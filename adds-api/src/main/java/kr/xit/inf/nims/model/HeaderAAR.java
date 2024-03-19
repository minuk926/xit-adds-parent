
package kr.xit.inf.nims.model;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>headerAAR complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="headerAAR"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="HDR_DE" type="{https://www.nims.or.kr/schema/nims}HDR_DE"/&gt;
 *         &lt;element name="BSSH_CD" type="{https://www.nims.or.kr/schema/nims}BSSH_CD"/&gt;
 *         &lt;element name="RPT_SE_CD" type="{https://www.nims.or.kr/schema/nims}RPT_SE_CD"/&gt;
 *         &lt;element name="USR_RPT_ID_NO" type="{https://www.nims.or.kr/schema/nims}USR_RPT_ID_NO"/&gt;
 *         &lt;element name="REF_USR_RPT_ID_NO" type="{https://www.nims.or.kr/schema/nims}REF_USR_RPT_ID_NO"/&gt;
 *         &lt;element name="RPT_TY_CD" type="{https://www.nims.or.kr/schema/nims}RPT_TY_CD"/&gt;
 *         &lt;element name="RMK" type="{https://www.nims.or.kr/schema/nims}RMK"/&gt;
 *         &lt;element name="RPTR_NM" type="{https://www.nims.or.kr/schema/nims}RPTR_NM"/&gt;
 *         &lt;element name="RPTR_ENTRPS_NM" type="{https://www.nims.or.kr/schema/nims}RPTR_ENTRPS_NM"/&gt;
 *         &lt;element name="CHRG_NM" type="{https://www.nims.or.kr/schema/nims}CHRG_NM"/&gt;
 *         &lt;element name="CHRG_TEL_NO" type="{https://www.nims.or.kr/schema/nims}CHRG_TEL_NO"/&gt;
 *         &lt;element name="CHRG_MP_NO" type="{https://www.nims.or.kr/schema/nims}CHRG_MP_NO"/&gt;
 *         &lt;element name="RND_DTL_RPT_CNT" type="{https://www.nims.or.kr/schema/nims}RND_DTL_RPT_CNT"/&gt;
 *         &lt;element name="DSUSE_SE_CD" type="{https://www.nims.or.kr/schema/nims}DSUSE_SE_CD"/&gt;
 *         &lt;element name="DSUSE_PRV_CD" type="{https://www.nims.or.kr/schema/nims}DSUSE_PRV_CD"/&gt;
 *         &lt;element name="DSUSE_MTH_CD" type="{https://www.nims.or.kr/schema/nims}DSUSE_MTH_CD"/&gt;
 *         &lt;element name="DSUSE_LOC" type="{https://www.nims.or.kr/schema/nims}DSUSE_LOC"/&gt;
 *         &lt;element name="DSUSE_DE" type="{https://www.nims.or.kr/schema/nims}DSUSE_DE"/&gt;
 *         &lt;element name="DSUSE_INSTT_CD" type="{https://www.nims.or.kr/schema/nims}DSUSE_INSTT_CD"/&gt;
 *         &lt;element name="ATCH_FILE_CO" type="{https://www.nims.or.kr/schema/nims}ATCH_FILE_CO"/&gt;
 *         &lt;element name="REGISTER_ID" type="{https://www.nims.or.kr/schema/nims}REGISTER_ID"/&gt;
 *         &lt;element name="FILE_CREAT_DT" type="{https://www.nims.or.kr/schema/nims}FILE_CREAT_DT"/&gt;
 *         &lt;element name="LINES" type="{https://www.nims.or.kr/schema/nims}linesAAR" minOccurs="0"/&gt;
 *         &lt;element name="ATCH_FILES" type="{https://www.nims.or.kr/schema/nims}atchFiles" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "headerAAR", namespace = "https://www.nims.or.kr/schema/nims", propOrder = {
    "hdrde",
    "bsshcd",
    "rptsecd",
    "usrrptidno",
    "refusrrptidno",
    "rpttycd",
    "rmk",
    "rptrnm",
    "rptrentrpsnm",
    "chrgnm",
    "chrgtelno",
    "chrgmpno",
    "rnddtlrptcnt",
    "dsusesecd",
    "dsuseprvcd",
    "dsusemthcd",
    "dsuseloc",
    "dsusede",
    "dsuseinsttcd",
    "atchfileco",
    "registerid",
    "filecreatdt",
    "lines",
    "atchfiles"
})
public class HeaderAAR {

    @XmlElement(name = "HDR_DE", namespace = "https://www.nims.or.kr/schema/nims", required = true)
    protected String hdrde;
    @XmlElement(name = "BSSH_CD", namespace = "https://www.nims.or.kr/schema/nims", required = true)
    protected String bsshcd;
    @XmlElement(name = "RPT_SE_CD", namespace = "https://www.nims.or.kr/schema/nims", required = true)
    protected String rptsecd;
    @XmlElement(name = "USR_RPT_ID_NO", namespace = "https://www.nims.or.kr/schema/nims", required = true)
    protected String usrrptidno;
    @XmlElement(name = "REF_USR_RPT_ID_NO", namespace = "https://www.nims.or.kr/schema/nims", required = true)
    protected String refusrrptidno;
    @XmlElement(name = "RPT_TY_CD", namespace = "https://www.nims.or.kr/schema/nims", required = true)
    protected String rpttycd;
    @XmlElement(name = "RMK", namespace = "https://www.nims.or.kr/schema/nims", required = true)
    protected String rmk;
    @XmlElement(name = "RPTR_NM", namespace = "https://www.nims.or.kr/schema/nims", required = true)
    protected String rptrnm;
    @XmlElement(name = "RPTR_ENTRPS_NM", namespace = "https://www.nims.or.kr/schema/nims", required = true)
    protected String rptrentrpsnm;
    @XmlElement(name = "CHRG_NM", namespace = "https://www.nims.or.kr/schema/nims", required = true)
    protected String chrgnm;
    @XmlElement(name = "CHRG_TEL_NO", namespace = "https://www.nims.or.kr/schema/nims", required = true)
    protected String chrgtelno;
    @XmlElement(name = "CHRG_MP_NO", namespace = "https://www.nims.or.kr/schema/nims", required = true)
    protected String chrgmpno;
    @XmlElement(name = "RND_DTL_RPT_CNT", namespace = "https://www.nims.or.kr/schema/nims", required = true)
    protected String rnddtlrptcnt;
    @XmlElement(name = "DSUSE_SE_CD", namespace = "https://www.nims.or.kr/schema/nims", required = true)
    protected String dsusesecd;
    @XmlElement(name = "DSUSE_PRV_CD", namespace = "https://www.nims.or.kr/schema/nims", required = true)
    protected String dsuseprvcd;
    @XmlElement(name = "DSUSE_MTH_CD", namespace = "https://www.nims.or.kr/schema/nims", required = true)
    protected String dsusemthcd;
    @XmlElement(name = "DSUSE_LOC", namespace = "https://www.nims.or.kr/schema/nims", required = true)
    protected String dsuseloc;
    @XmlElement(name = "DSUSE_DE", namespace = "https://www.nims.or.kr/schema/nims", required = true)
    protected String dsusede;
    @XmlElement(name = "DSUSE_INSTT_CD", namespace = "https://www.nims.or.kr/schema/nims", required = true)
    protected String dsuseinsttcd;
    @XmlElement(name = "ATCH_FILE_CO", namespace = "https://www.nims.or.kr/schema/nims", required = true)
    protected String atchfileco;
    @XmlElement(name = "REGISTER_ID", namespace = "https://www.nims.or.kr/schema/nims", required = true)
    protected String registerid;
    @XmlElement(name = "FILE_CREAT_DT", namespace = "https://www.nims.or.kr/schema/nims", required = true)
    protected String filecreatdt;
    @XmlElement(name = "LINES", namespace = "https://www.nims.or.kr/schema/nims")
    protected LinesAAR lines;
    @XmlElement(name = "ATCH_FILES", namespace = "https://www.nims.or.kr/schema/nims")
    protected AtchFiles atchfiles;

    /**
     * hdrde 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHDRDE() {
        return hdrde;
    }

    /**
     * hdrde 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHDRDE(String value) {
        this.hdrde = value;
    }

    /**
     * bsshcd 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBSSHCD() {
        return bsshcd;
    }

    /**
     * bsshcd 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBSSHCD(String value) {
        this.bsshcd = value;
    }

    /**
     * rptsecd 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRPTSECD() {
        return rptsecd;
    }

    /**
     * rptsecd 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRPTSECD(String value) {
        this.rptsecd = value;
    }

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
     * refusrrptidno 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREFUSRRPTIDNO() {
        return refusrrptidno;
    }

    /**
     * refusrrptidno 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREFUSRRPTIDNO(String value) {
        this.refusrrptidno = value;
    }

    /**
     * rpttycd 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRPTTYCD() {
        return rpttycd;
    }

    /**
     * rpttycd 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRPTTYCD(String value) {
        this.rpttycd = value;
    }

    /**
     * rmk 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRMK() {
        return rmk;
    }

    /**
     * rmk 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRMK(String value) {
        this.rmk = value;
    }

    /**
     * rptrnm 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRPTRNM() {
        return rptrnm;
    }

    /**
     * rptrnm 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRPTRNM(String value) {
        this.rptrnm = value;
    }

    /**
     * rptrentrpsnm 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRPTRENTRPSNM() {
        return rptrentrpsnm;
    }

    /**
     * rptrentrpsnm 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRPTRENTRPSNM(String value) {
        this.rptrentrpsnm = value;
    }

    /**
     * chrgnm 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCHRGNM() {
        return chrgnm;
    }

    /**
     * chrgnm 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCHRGNM(String value) {
        this.chrgnm = value;
    }

    /**
     * chrgtelno 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCHRGTELNO() {
        return chrgtelno;
    }

    /**
     * chrgtelno 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCHRGTELNO(String value) {
        this.chrgtelno = value;
    }

    /**
     * chrgmpno 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCHRGMPNO() {
        return chrgmpno;
    }

    /**
     * chrgmpno 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCHRGMPNO(String value) {
        this.chrgmpno = value;
    }

    /**
     * rnddtlrptcnt 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRNDDTLRPTCNT() {
        return rnddtlrptcnt;
    }

    /**
     * rnddtlrptcnt 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRNDDTLRPTCNT(String value) {
        this.rnddtlrptcnt = value;
    }

    /**
     * dsusesecd 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDSUSESECD() {
        return dsusesecd;
    }

    /**
     * dsusesecd 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDSUSESECD(String value) {
        this.dsusesecd = value;
    }

    /**
     * dsuseprvcd 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDSUSEPRVCD() {
        return dsuseprvcd;
    }

    /**
     * dsuseprvcd 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDSUSEPRVCD(String value) {
        this.dsuseprvcd = value;
    }

    /**
     * dsusemthcd 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDSUSEMTHCD() {
        return dsusemthcd;
    }

    /**
     * dsusemthcd 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDSUSEMTHCD(String value) {
        this.dsusemthcd = value;
    }

    /**
     * dsuseloc 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDSUSELOC() {
        return dsuseloc;
    }

    /**
     * dsuseloc 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDSUSELOC(String value) {
        this.dsuseloc = value;
    }

    /**
     * dsusede 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDSUSEDE() {
        return dsusede;
    }

    /**
     * dsusede 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDSUSEDE(String value) {
        this.dsusede = value;
    }

    /**
     * dsuseinsttcd 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDSUSEINSTTCD() {
        return dsuseinsttcd;
    }

    /**
     * dsuseinsttcd 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDSUSEINSTTCD(String value) {
        this.dsuseinsttcd = value;
    }

    /**
     * atchfileco 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getATCHFILECO() {
        return atchfileco;
    }

    /**
     * atchfileco 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setATCHFILECO(String value) {
        this.atchfileco = value;
    }

    /**
     * registerid 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREGISTERID() {
        return registerid;
    }

    /**
     * registerid 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREGISTERID(String value) {
        this.registerid = value;
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

    /**
     * lines 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link LinesAAR }
     *     
     */
    public LinesAAR getLINES() {
        return lines;
    }

    /**
     * lines 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link LinesAAR }
     *     
     */
    public void setLINES(LinesAAR value) {
        this.lines = value;
    }

    /**
     * atchfiles 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link AtchFiles }
     *     
     */
    public AtchFiles getATCHFILES() {
        return atchfiles;
    }

    /**
     * atchfiles 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link AtchFiles }
     *     
     */
    public void setATCHFILES(AtchFiles value) {
        this.atchfiles = value;
    }

}
