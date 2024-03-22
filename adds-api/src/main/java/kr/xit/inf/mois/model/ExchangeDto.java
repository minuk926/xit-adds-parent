package kr.xit.inf.mois.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

/**
 * <pre>
 * description : 온나라전자결재연계 exchange.dtd 구조 정의
 *
 * packageName : kr.xit.inf.mois.model
 * fileName    : ExchangeDto
 * author      : limju
 * date        : 2024-03-14
 * ======================================================================
 * 변경일         변경자        변경 내용
 * ----------------------------------------------------------------------
 * 2024-03-14    limju       최초 생성
 *
 * </pre>
 */
@JacksonXmlRootElement(localName = "EXCHANGE")
@XmlAccessorType(XmlAccessType.FIELD)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ExchangeDto extends ExchangeCommon {
    @JsonProperty(value = "HEADER", required = true)
    private Header header;

    @JsonProperty("BODY")
    private String body;

    @JsonProperty("ATTACHMENTS")
    private Attachments attachments;

    @JacksonXmlRootElement(localName = "HEADER")
    @XmlAccessorType(XmlAccessType.FIELD)
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class Header {
        @JsonProperty(value = "COMMON", required = true)
        private Common common;
        @JsonProperty(value = "DIRECTION", required = true)
        private Direction direction;
        @JsonProperty("ADDENDA")
        private Addenda addenda;
    }

    @JacksonXmlRootElement(localName = "DIRECTION")
    @XmlAccessorType(XmlAccessType.FIELD)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class Direction {
        @JsonProperty("TO_DOCUMENT_SYSTEM")
        private ToDocumentSystem toDocumentSystem;
        @JsonProperty("TO_ADMINISTRATIVE_SYSTEM")
        private ExchangeMisDto.ToAdministrativeSystem toAdministrativeSystem;
    }

    @JacksonXmlRootElement(localName = "TO_DOCUMENT_SYSTEM")
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
        private Lines lines;

        @JsonProperty("MODIFICATION_FLAG")
        private ModificationFlag modificationFlag;
    }
}
