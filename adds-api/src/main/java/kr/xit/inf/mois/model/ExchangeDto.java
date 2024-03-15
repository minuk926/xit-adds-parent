package kr.xit.inf.mois.model;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlText;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * <pre>
 * description :
 *
 * packageName : kr.xit.inf.mois.model
 * fileName    : Exchange
 * author      : limju
 * date        : 2024-03-14
 * ======================================================================
 * 변경일         변경자        변경 내용
 * ----------------------------------------------------------------------
 * 2024-03-14    limju       최초 생성
 *
 * </pre>
 */
//@Getter
@JacksonXmlRootElement(localName = "EXCHANGE")
@XmlRootElement(name = "EXCHANGE")
@XmlAccessorType(XmlAccessType.FIELD)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ExchangeDto {
    @JsonIgnore
    @Getter
    private static String XML_PRE_FIX = """
                                        <?xml version="1.0" encoding="EUC-KR"?>
                                        <!DOCTYPE EXCHANGE SYSTEM "exchange_mis.dtd">
                                        """;

    @JsonProperty("HEADER")
    private Header HEADER;

    @JsonProperty("BODY")
    private Body BODY;

    @JsonProperty("ATTACHMENTS")
    private Attachments ATTACHMENTS;

    @JsonProperty("ADMINISTRATIVE_INFO")
    private AdminstrativeInfo ADMINISTRATIVE_INFO;


    //---------------------------------------------------------------
    // EXCHANGE
    //---------------------------------------------------------------
    //@Getter
    @JacksonXmlRootElement(localName = "HEADER")
    @XmlRootElement(name = "HEADER")
    @XmlAccessorType(XmlAccessType.FIELD)
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class Header {
        @JsonProperty("COMMON")
        private Common COMMON;
        @JsonProperty("DIRECTION")
        private Direction DIRECTION;
        @JsonProperty("ADDENDA")
        private Addenda ADDENDA;
    }

    //@Getter
    @JacksonXmlRootElement(localName = "BODY")
    @XmlRootElement(name = "BODY")
    @XmlAccessorType(XmlAccessType.FIELD)
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class Body {
        @XmlAttribute
        @JacksonXmlProperty(isAttribute = true, localName = "filename")
        private String filename;
        @XmlAttribute
        @JacksonXmlProperty(isAttribute = true, localName = "desc")
        private String desc;

        @XmlValue
        @JacksonXmlText
        private String value;
    }

    //@Getter
    @JacksonXmlRootElement(localName = "ATTACHMENTS")
    @XmlRootElement(name = "ATTACHMENTS")
    @XmlAccessorType(XmlAccessType.FIELD)
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class Attachments {
        @XmlElementWrapper
        @JsonProperty("ATTACHMENT")
        private List<Attachment> ATTACHMENT;
    }


    //@Getter
    @JacksonXmlRootElement(localName = "ADMINISTRATIVE_INFO")
    @XmlRootElement(name = "ADMINISTRATIVE_INFO")
    @XmlAccessorType(XmlAccessType.FIELD)
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class AdminstrativeInfo {
        @JsonProperty("FORM_INFO")
        private FormInfo FORM_INFO;
        @JsonProperty("FORM_DATA")
        private FormData FORM_DATA;
    }
    //---------------------------------------------------------------


    //@Getter
    @JacksonXmlRootElement(localName = "COMMON")
    @XmlRootElement(name = "COMMON")
    @XmlAccessorType(XmlAccessType.FIELD)
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class Common {
        @JsonProperty("SENDER")
        private Sender SENDER;
        @JsonProperty("RECEIVER")
        private Receiver RECEIVER;
        @JsonProperty("TITLE")
        private String TITLE;
        @JsonProperty("CREATED_DATE")
        private String CREATED_DATE;
        @JsonProperty("ATTACHNUM")
        private int ATTACHNUM;
        @JsonProperty("ADMINISTRATIVE_NUM")
        private String ADMINISTRATIVE_NUM;
    }

    //@Getter
    @JacksonXmlRootElement(localName = "DIRECTION")
    @XmlRootElement(name = "DIRECTION")
    @XmlAccessorType(XmlAccessType.FIELD)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class Direction {
        @JsonProperty("TO_DOCUMENT_SYSTEM")
        private ToDocumentSystem TO_DOCUMENT_SYSTEM;
        @JsonProperty("TO_ADMINISTRATIVE_SYSTEM")
        private ToAdministrativeSystem TO_ADMINISTRATIVE_SYSTEM;
    }

    //@Getter
    @JacksonXmlRootElement(localName = "TO_ADMINISTRATIVE_SYSTEM")
    @XmlRootElement(name = "TO_ADMINISTRATIVE_SYSTEM")
    @XmlAccessorType(XmlAccessType.FIELD)
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class ToAdministrativeSystem {
        @JsonProperty("DOCNUM")
        private Docnum DOCNUM;
        @JsonProperty("SANCTION_INFO")
        private SanctionInfo SANCTION_INFO;
        @JsonProperty("MODIFICATION_FLAG")
        private ModificationFlag MODIFICATION_FLAG;
        @JsonProperty("BODY_MODIFICATIONFLAG")
        private BodyModificationflag BODY_MODIFICATIONFLAG;
        @JsonProperty("BODY_TEXT")
        private String BODY_TEXT;
    }

    //@Getter
    @JacksonXmlRootElement(localName = "DOCNUM")
    @XmlRootElement(name = "DOCNUM")
    @XmlAccessorType(XmlAccessType.FIELD)
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class Docnum {
        @XmlAttribute
        @JacksonXmlProperty(isAttribute = true, localName = "docnumcode")
        private String docnumcode;
        @XmlValue
        @JacksonXmlText
        private String value;
    }

    //@Getter
    @JacksonXmlRootElement(localName = "SANCTION_INFO")
    @XmlRootElement(name = "SANCTION_INFO")
    @XmlAccessorType(XmlAccessType.FIELD)
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class SanctionInfo {
        @XmlAttribute
        @JacksonXmlProperty(isAttribute = true, localName = "status")
        private String status;

        @JsonProperty("LINES")
        private Lines LINES;
    }

    //@Getter
    @JacksonXmlRootElement(localName = "ADDENDA")
    @XmlRootElement(name = "ADDENDA")
    @XmlAccessorType(XmlAccessType.FIELD)
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class Addenda {
        @JsonProperty("ADDENDUM")
        private Addendum ADDENDUM;
    }

    //@Getter
    @JacksonXmlRootElement(localName = "ADDENDUM")
    @XmlRootElement(name = "ADDENDUM")
    @XmlAccessorType(XmlAccessType.FIELD)
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class Addendum {
        @XmlAttribute
        @JacksonXmlProperty(isAttribute = true, localName = "comment")
        private String comment;
        @XmlAttribute
        @JacksonXmlProperty(isAttribute = true, localName = "name")
        private String name;
        @XmlValue
        @JacksonXmlText
        private String value;
    }

    //@Getter
    @JacksonXmlRootElement(localName = "SENDER")
    @XmlRootElement(name = "SENDER")
    @XmlAccessorType(XmlAccessType.FIELD)
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class Sender {
        @JsonProperty("SERVERID")
        private String SERVERID;
        @JsonProperty("USERID")
        private String USERID;
        @JsonProperty("EMAIL")
        private String EMAIL;
    }

    //@Getter
    @JacksonXmlRootElement(localName = "RECEIVER")
    @XmlRootElement(name = "RECEIVER")
    @XmlAccessorType(XmlAccessType.FIELD)
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class Receiver {
        @JsonProperty("SERVERID")
        private String SERVERID;
        @JsonProperty("USERID")
        private String USERID;
        @JsonProperty("EMAIL")
        private String EMAIL;
    }


    //@Getter
    @JacksonXmlRootElement(localName = "TO_DOCUMENT_SYSTEM")
    @XmlRootElement(name = "TO_DOCUMENT_SYSTEM")
    @XmlAccessorType(XmlAccessType.FIELD)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class ToDocumentSystem {
        @XmlAttribute
        @JacksonXmlProperty(isAttribute = true, localName = "notification")
        String notification;

        @JsonProperty("LINES")
        private Lines LINES;
        @JsonProperty("MODIFICATION_FLAG")
        private ModificationFlag MODIFICATION_FLAG;
        @JsonProperty("BODY_MODIFICATIONFLAG")
        private BodyModificationflag BODY_MODIFICATIONFLAG;
        @JsonProperty("DOC_INFO")
        private DocInfo DOC_INFO;
        //private String text;
    }

    //@Getter
    @JacksonXmlRootElement(localName = "LINES")
    @XmlRootElement(name = "LINES")
    @XmlAccessorType(XmlAccessType.FIELD)
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class Lines {
        @XmlElementWrapper
        @JsonProperty("LINE")
        private List<Line> LINE;
    }

    //@Getter
    @JacksonXmlRootElement(localName = "LINE")
    @XmlRootElement(name = "LINE")
    @XmlAccessorType(XmlAccessType.FIELD)
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class Line {
        @JsonProperty("LEVEL")
        private String LEVEL;
        @JsonProperty("SANCTION")
        private Sanction SANCTION;
    }

    //@Getter
    @JacksonXmlRootElement(localName = "SANCTION")
    @XmlRootElement(name = "SANCTION")
    @XmlAccessorType(XmlAccessType.FIELD)
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class Sanction {
        @XmlAttribute
        @JacksonXmlProperty(isAttribute = true, localName = "result")
        private String result;
        @XmlAttribute
        @JacksonXmlProperty(isAttribute = true, localName = "type")
        private String type;
        @JsonProperty("PERSON")
        private Person PERSON;

        @JsonProperty("COMMENT")
        private String COMMENT;

        @JsonProperty("DATE")
        private String DATE;
    }

    //@Getter
    @JacksonXmlRootElement(localName = "PERSON")
    @XmlRootElement(name = "PERSON")
    @XmlAccessorType(XmlAccessType.FIELD)
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class Person {
        @JsonProperty("USERID")
        private String USERID;
        @JsonProperty("NAME")
        private String NAME;
        @JsonProperty("POSITION")
        private String POSITION;
        @JsonProperty("DEPT")
        private String DEPT;
        @JsonProperty("ORG")
        private String ORG;
    }

    //@Getter
    @JacksonXmlRootElement(localName = "MODIFICATION_FLAG")
    @XmlRootElement(name = "MODIFICATION_FLAG")
    @XmlAccessorType(XmlAccessType.FIELD)
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class ModificationFlag {
        @JsonProperty("MODIFIABLE")
        private Modifiable MODIFIABLE;

        @JsonProperty("MODIFIED")
        private String MODIFIED;
    }

    //@Getter
    @JacksonXmlRootElement(localName = "MODIFIABLE")
    @XmlRootElement(name = "MODIFIABLE")
    @XmlAccessorType(XmlAccessType.FIELD)
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class Modifiable {
        @XmlAttribute
        @JacksonXmlProperty(isAttribute = true, localName = "modifyflag")
        private String modifyflag;
    }

    //@Getter
    @JacksonXmlRootElement(localName = "BODY_MODIFICATIONFLAG")
    @XmlRootElement(name = "BODY_MODIFICATIONFLAG")
    @XmlAccessorType(XmlAccessType.FIELD)
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class BodyModificationflag {
        @JsonProperty("BODY_MODIFIABLE")
        private BodyModifiable BODY_MODIFIABLE;

        @JsonProperty("BODY_MODIFIED")
        private BodyModified BODY_MODIFIED;
    }

    @JacksonXmlRootElement(localName = "BODY_MODIFIED")
    @XmlRootElement(name = "BODY_MODIFIED")
    @XmlAccessorType(XmlAccessType.FIELD)
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class BodyModified {
        @XmlValue
        @JacksonXmlText
        private String value;
    }

    //@Getter
    @JacksonXmlRootElement(localName = "BODY_MODIFIABLE")
    @XmlRootElement(name = "BODY_MODIFIABLE")
    @XmlAccessorType(XmlAccessType.FIELD)
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class BodyModifiable {
        @XmlAttribute
        @JacksonXmlProperty(isAttribute = true, localName = "modifyflag")
        private String modifyflag;
    }

    //@Getter
    @JacksonXmlRootElement(localName = "DOC_INFO")
    @XmlRootElement(name = "DOC_INFO")
    @XmlAccessorType(XmlAccessType.FIELD)
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class DocInfo {
        @JsonProperty("SUMMARY")
        private String SUMMARY;
    }



    //@Getter
    @JacksonXmlRootElement(localName = "ATTACHMENT")
    @XmlRootElement(name = "ATTACHMENT")
    @XmlAccessorType(XmlAccessType.FIELD)
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class Attachment {
        @XmlAttribute
        @JacksonXmlProperty(isAttribute = true, localName = "filename")
        private String filename;
        @XmlAttribute
        @JacksonXmlProperty(isAttribute = true, localName = "desc")
        private String desc;
        @XmlValue
        @JacksonXmlText
        private String value;
    }


    //@Getter
    @JacksonXmlRootElement(localName = "FORM_INFO")
    @XmlRootElement(name = "FORM_INFO")
    @XmlAccessorType(XmlAccessType.FIELD)
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class FormInfo {
        @XmlAttribute(name = "sys_id")
        @JacksonXmlProperty(isAttribute = true, localName = "sys_id")
        private String sys_id;
        @XmlAttribute(name = "biz_id")
        @JacksonXmlProperty(isAttribute = true, localName = "biz_id")
        private String biz_id;
        @XmlAttribute
        @JacksonXmlProperty(isAttribute = true, localName = "seq")
        private String seq;
    }

    //@Getter
    @JacksonXmlRootElement(localName = "FORM_DATA")
    @XmlRootElement(name = "FORM_DATA")
    @XmlAccessorType(XmlAccessType.FIELD)
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class FormData {
        @XmlElementWrapper
        @JsonProperty("DATA_FIELD")
        private List<DataField> DATA_FIELD;
    }

    @JacksonXmlRootElement(localName = "DATA_FIELD")
    @XmlRootElement(name = "DATA_FIELD")
    @XmlAccessorType(XmlAccessType.FIELD)
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class DataField {
        @XmlAttribute
        @JacksonXmlProperty(isAttribute = true, localName = "modifyflag")
        private String modifyflag;
        @JsonProperty("FIELD_NAME")
        private String FIELD_NAME;
        @JsonProperty("FIELD_VALUE")
        private String FIELD_VALUE;
    }
}
