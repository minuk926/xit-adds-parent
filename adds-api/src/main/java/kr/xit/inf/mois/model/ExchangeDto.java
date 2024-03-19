package kr.xit.inf.mois.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlText;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElementWrapper;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlValue;
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

        // @XmlElementWrapper(nillable = true, name = "LINES")
        // @JsonProperty("LINES")
        // private List<Line> LINES;

        //@XmlElementWrapper(nillable = true, name = "LINES")
        @JsonProperty("LINES")
        private Lines LINES;
    }

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

    @JacksonXmlRootElement(localName = "BODY_MODIFICATIONFLAG")
    @XmlRootElement(name = "BODY_MODIFICATIONFLAG")
    @XmlAccessorType(XmlAccessType.FIELD)
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class BodyModificationflag {
        // @XmlAttribute
        // @JacksonXmlProperty(isAttribute = true, localName = "modifyflag")
        @JsonProperty("BODY_MODIFIABLE")
        private BodyModifiable BODY_MODIFIABLE;

        @JsonProperty("BODY_MODIFIED")
        private String BODY_MODIFIED;
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

        // @XmlElementWrapper(nillable = true, name = "LINES")
        // @JsonProperty("LINES")
        // private List<Line> LINES;

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

    @JacksonXmlRootElement(localName = "DOC_INFO")
    @XmlRootElement(name = "DOC_INFO")
    @XmlAccessorType(XmlAccessType.FIELD)
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class DocInfo {
        @JsonProperty("SUMMARY")
        private String SUMMARY;

        @JsonProperty("DOCGUBUN")
        private Docgubun DOCGUBUN;

        @JsonProperty("READINGBOUND")
        private Readingbound READINGBOUND;

        @JsonProperty("READINGLIMIT")
        private Readinglimit READINGLIMIT;

        @JsonProperty("PUBLICATION")
        private Publication PUBLICATION;

        @XmlElementWrapper
        @JsonProperty("TASKCARDS")
        private List<Taskcard> TASKCARDS;

        @JsonProperty("SOURCES")
        private Sources SOURCES;

        @JsonProperty("TO_KMS")
        private ToKms TO_KMS;

        @JsonProperty("TO_UNIKMS")
        private ToUnikms TO_UNIKMS;

        @JsonProperty("SENDORGNAME")
        private String SENDORGNAME;

        @JsonProperty("ENFORCEMENT")
        private Enforcement ENFORCEMENT;
    }

    @JacksonXmlRootElement(localName = "TASKCARD")
    @XmlRootElement(name = "TASKCARD")
    @XmlAccessorType(XmlAccessType.FIELD)
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class Taskcard {
        @XmlAttribute
        @JacksonXmlProperty(isAttribute = true, localName = "type")
        private String type;
        @JsonProperty("CARDNAME")
        private String CARDNAME;
        @JsonProperty("CARDID")
        private String CARDID;
    }

    @JacksonXmlRootElement(localName = "DOCGUBUN")
    @XmlRootElement(name = "DOCGUBUN")
    @XmlAccessorType(XmlAccessType.FIELD)
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class Docgubun {
        @XmlAttribute
        @JacksonXmlProperty(isAttribute = true, localName = "type")
        String type;
        @XmlValue
        @JacksonXmlText
        String value;
    }

    @JacksonXmlRootElement(localName = "READINGBOUND")
    @XmlRootElement(name = "READINGBOUND")
    @XmlAccessorType(XmlAccessType.FIELD)
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class Readingbound {
        @XmlAttribute
        @JacksonXmlProperty(isAttribute = true, localName = "type")
        String type;
        @XmlValue
        @JacksonXmlText
        String value;
    }

    @JacksonXmlRootElement(localName = "READINGLIMIT")
    @XmlRootElement(name = "READINGLIMIT")
    @XmlAccessorType(XmlAccessType.FIELD)
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class Readinglimit {
        @XmlAttribute
        @JacksonXmlProperty(isAttribute = true, localName = "type")
        String type;
        @XmlValue
        @JacksonXmlText
        String value;
    }

    @JacksonXmlRootElement(localName = "PUBLICATION")
    @XmlRootElement(name = "PUBLICATION")
    @XmlAccessorType(XmlAccessType.FIELD)
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class Publication {
        @XmlAttribute
        @JacksonXmlProperty(isAttribute = true, localName = "code")
        String code;
        @XmlAttribute
        @JacksonXmlProperty(isAttribute = true, localName = "reason")
        String reason;
        @XmlValue
        @JacksonXmlText
        String value;
    }

    @JacksonXmlRootElement(localName = "SOURCES")
    @XmlRootElement(name = "SOURCES")
    @XmlAccessorType(XmlAccessType.FIELD)
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class Sources {
        @JsonProperty("DIRECT")
        private Direct DIRECT;
        @JsonProperty("INSTRUCTION")
        private List<Instruction> INSTRUCTION;
        @JsonProperty("DOCUMENT")
        private List<Document> DOCUMENT;
        @JsonProperty("MEMO")
        private List<Memo> MEMO;
    }

    @JacksonXmlRootElement(localName = "DIRECT")
    @XmlRootElement(name = "DIRECT")
    @XmlAccessorType(XmlAccessType.FIELD)
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class Direct {
        @JsonProperty("TITLE")
        private String TITLE;
        @JsonProperty("INSTRUCTED")
        private Instructed INSTRUCTED;
    }

    @JacksonXmlRootElement(localName = "INSTRUCTED")
    @XmlRootElement(name = "INSTRUCTED")
    @XmlAccessorType(XmlAccessType.FIELD)
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class Instructed {
        @JsonProperty("FILE")
        private List<File> FILE;
    }

    @JacksonXmlRootElement(localName = "FILE")
    @XmlRootElement(name = "FILE")
    @XmlAccessorType(XmlAccessType.FIELD)
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class File {
        @JsonProperty("ORDER")
        private String ORDER;
        @JsonProperty("FILENAME")
        private String FILENAME;
        @JsonProperty("DISPLAYNAME")
        private String DISPLAYNAME;
    }

    @JacksonXmlRootElement(localName = "INSTRUCTION")
    @XmlRootElement(name = "INSTRUCTION")
    @XmlAccessorType(XmlAccessType.FIELD)
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class Instruction{
        @JsonProperty("TITLE")
        private String TITLE;
        @JsonProperty("INSTRUCTIONID")
        private String INSTRUCTIONID;
    }

    @JacksonXmlRootElement(localName = "DOCUMENT")
    @XmlRootElement(name = "DOCUMENT")
    @XmlAccessorType(XmlAccessType.FIELD)
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class Document {
        @XmlAttribute
        @JacksonXmlProperty(isAttribute = true, localName = "type")
        private String type;
        @JsonProperty("TITLE")
        private String TITLE;
        @JsonProperty("DOCID")
        private String DOCID;
    }

    @JacksonXmlRootElement(localName = "MEMO")
    @XmlRootElement(name = "MEMO")
    @XmlAccessorType(XmlAccessType.FIELD)
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class Memo {
        @JsonProperty("TITLE")
        private String TITLE;
        @JsonProperty("MEMOID")
        private String MEMOID;
    }

    @JacksonXmlRootElement(localName = "TO_KMS")
    @XmlRootElement(name = "TO_KMS")
    @XmlAccessorType(XmlAccessType.FIELD)
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class ToKms {
        @XmlAttribute
        @JacksonXmlProperty(isAttribute = true, localName = "sendflag")
        private String sendflag;
        @JsonProperty("MAPCODE")
        private String MAPCODE;
        @JsonProperty("MAPNAME")
        private String MAPNAME;
    }

    @JacksonXmlRootElement(localName = "TO_UNIKMS")
    @XmlRootElement(name = "TO_UNIKMS")
    @XmlAccessorType(XmlAccessType.FIELD)
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class ToUnikms {
        @XmlAttribute
        @JacksonXmlProperty(isAttribute = true, localName = "sendflag")
        private String sendflag;
    }

    @JacksonXmlRootElement(localName = "ENFORCEMENT")
    @XmlRootElement(name = "ENFORCEMENT")
    @XmlAccessorType(XmlAccessType.FIELD)
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class Enforcement {
        @JsonProperty("SENDNAME")
        private String SENDNAME;
        @XmlElementWrapper
        @JsonProperty("RECEIPT")
        private List<Receipt> RECEIPT;
        @JsonProperty("EXRECEIPT")
        private ExReceipt EXRECEIPT;
    }

    @JacksonXmlRootElement(localName = "RECEIPT")
    @XmlRootElement(name = "RECEIPT")
    @XmlAccessorType(XmlAccessType.FIELD)
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class Receipt {
        @XmlAttribute
        @JacksonXmlProperty(isAttribute = true, localName = "refer")
        private String refer;
        @JsonProperty("ORG")
        private String ORG;
        @JsonProperty("ORGCODE")
        private String ORGCODE;
        @JsonProperty("DEPT")
        private String DEPT;
        @JsonProperty("DEPTCODE")
        private String DEPTCODE;
    }

    @JacksonXmlRootElement(localName = "EXRECEIPT")
    @XmlRootElement(name = "EXRECEIPT")
    @XmlAccessorType(XmlAccessType.FIELD)
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class ExReceipt {
        @JsonProperty("EXTERNAL")
        private External EXTERNAL;
    }

    @JacksonXmlRootElement(localName = "EXTERNAL")
    @XmlRootElement(name = "EXTERNAL")
    @XmlAccessorType(XmlAccessType.FIELD)
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class External {
        @XmlAttribute
        @JacksonXmlProperty(isAttribute = true, localName = "refer")
        private String refer;
        @JsonProperty("ORG")
        private String ORG;
        @JsonProperty("ORGCODE")
        private String ORGCODE;
        @JsonProperty("DEPT")
        private String DEPT;
        @JsonProperty("DEPTCODE")
        private String DEPTCODE;
        @JsonProperty("ORGTYPE")
        private Orgtype ORGTYPE;
        @JsonProperty("SYSTEMTYPE")
        private Systemtype SYSTEMTYPE;
        @JsonProperty("FLOWTYPE")
        private Flowtype FLOWTYPE;
    }

    @JacksonXmlRootElement(localName = "ORGTYPE")
    @XmlRootElement(name = "ORGTYPE")
    @XmlAccessorType(XmlAccessType.FIELD)
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class Orgtype {
        @XmlAttribute
        @JacksonXmlProperty(isAttribute = true, localName = "typecode")
        private String typecode;
        @XmlValue
        @JacksonXmlText
        private String value;
    }

    @JacksonXmlRootElement(localName = "SYSTEMTYPE")
    @XmlRootElement(name = "SYSTEMTYPE")
    @XmlAccessorType(XmlAccessType.FIELD)
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class Systemtype {
        @XmlAttribute
        @JacksonXmlProperty(isAttribute = true, localName = "typecode")
        private String typecode;
        @XmlValue
        @JacksonXmlText
        private String value;
    }

    @JacksonXmlRootElement(localName = "FLOWTYPE")
    @XmlRootElement(name = "FLOWTYPE")
    @XmlAccessorType(XmlAccessType.FIELD)
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class Flowtype {
        @XmlAttribute
        @JacksonXmlProperty(isAttribute = true, localName = "typecode")
        private String typecode;
        @XmlValue
        @JacksonXmlText
        private String value;
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
        private AdministrativeDB ADMINISTRATIVE_DB;
        @XmlElementWrapper
        @JsonProperty("ATTACHMENT")
        private List<Attachment> ATTACHMENT;
    }

    @JacksonXmlRootElement(localName = "ADMINISTRATIVE_DB")
    @XmlRootElement(name = "ADMINISTRATIVE_DB")
    @XmlAccessorType(XmlAccessType.FIELD)
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class AdministrativeDB {
        @JsonProperty("XMLFILE")
        private XMLFile XMLFILE;
        @JsonProperty("XSLFILE")
        private XSLFile XSLFILE;
    }

    @JacksonXmlRootElement(localName = "XMLFILE")
    @XmlRootElement(name = "XMLFILE")
    @XmlAccessorType(XmlAccessType.FIELD)
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class XMLFile {
        @XmlAttribute
        @JacksonXmlProperty(isAttribute = true, localName = "filename")
        String filename;
        @XmlAttribute
        @JacksonXmlProperty(isAttribute = true, localName = "desc")
        String desc;
    }

    @JacksonXmlRootElement(localName = "XSLFILE")
    @XmlRootElement(name = "XSLFILE")
    @XmlAccessorType(XmlAccessType.FIELD)
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class XSLFile {
        @XmlAttribute
        @JacksonXmlProperty(isAttribute = true, localName = "filename")
        String filename;
        @XmlAttribute
        @JacksonXmlProperty(isAttribute = true, localName = "desc")
        String desc;
    }

    //@Getter
    @JacksonXmlRootElement(localName = "ADMINISTRATIVE_INFO")
    @XmlRootElement(name = "ADMINISTRATIVE_INFO")
    @XmlAccessorType(XmlAccessType.FIELD)
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class AdminstrativeInfo {
        @JsonProperty("FORM_FILE")
        private FormFile FORM_FILE;
        @JsonProperty("FORM_INFO")
        private FormInfo FORM_INFO;
        @JsonProperty("FORM_DATA")
        private FormData FORM_DATA;
    }

    @JacksonXmlRootElement(localName = "FORM_FILE")
    @XmlRootElement(name = "FORM_FILE")
    @XmlAccessorType(XmlAccessType.FIELD)
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class FormFile {
        @XmlAttribute
        @JacksonXmlProperty(isAttribute = true, localName = "filename")
        String filename;
        @XmlAttribute
        @JacksonXmlProperty(isAttribute = true, localName = "desc")
        String desc;
    }

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
        @XmlElementWrapper
        @JsonProperty("REPETITION_DATA_FIELD")
        private List<RepetitionDataField> REPETITION_DATA_FIELD;
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

    @JacksonXmlRootElement(localName = "REPETITION_DATA_FIELD")
    @XmlRootElement(name = "REPETITION_DATA_FIELD")
    @XmlAccessorType(XmlAccessType.FIELD)
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class RepetitionDataField {
        @XmlAttribute
        @JacksonXmlProperty(isAttribute = true, localName = "modifyflag")
        String modifyFlag;
        @JsonProperty("FIELD_NAME")
        String fieldName;
        @JsonProperty("FIELD_VALUE")
        String fieldValue;
        @JsonProperty("ROW")
        String row;
        @JsonProperty("COLUMN")
        String column;
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

}
