package kr.xit.inf.mois.model;

import static org.junit.jupiter.api.Assertions.*;

import java.io.FileWriter;
import java.io.IOException;

import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.xml.JacksonXmlModule;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import lombok.extern.slf4j.Slf4j;

/**
 * <pre>
 * description :
 *
 * packageName : kr.xit.inf.mois.model
 * fileName    : ExchangeDtoTest
 * author      : limju
 * date        : 2024-03-14
 * ======================================================================
 * 변경일         변경자        변경 내용
 * ----------------------------------------------------------------------
 * 2024-03-14    limju       최초 생성
 *
 * </pre>
 */
@Slf4j
@ExtendWith(SpringExtension.class)
public class ExchangeDtoTest {

    String xml = """
        <?xml version="1.0" encoding="EUC-KR"?>
        <EXCHANGE>
            <HEADER>
                <COMMON>
                    <SENDER>
                        <SERVERID>DOC999999901</SERVERID>
                        <USERID>admin</USERID>
                        <EMAIL/>
                    </SENDER>
                    <RECEIVER>
                        <SERVERID>DOC123456701</SERVERID>
                        <USERID>admin</USERID>
                    </RECEIVER>
                    <TITLE>TEST TITLE_DOC</TITLE>
                    <CREATED_DATE>2020-12-08 14:00:00</CREATED_DATE>
                    <ATTACHNUM>1</ATTACHNUM>
                    <ADMINISTRATIVE_NUM>TEST1234567890</ADMINISTRATIVE_NUM>
                </COMMON>
                <DIRECTION>
                    <TO_DOCUMENT_SYSTEM notification="all">
                        <MODIFICATION_FLAG>
                            <MODIFIABLE modifyflag="yes"/>
                        </MODIFICATION_FLAG>
                    </TO_DOCUMENT_SYSTEM>
                </DIRECTION>
            </HEADER>
            <BODY><![CDATA[연계테스트 문서입니다.]]></BODY>
            <ATTACHMENTS>
                <ATTACHMENT filename="attach_attach_title.txt">TEST_ATTACH.txt</ATTACHMENT>
            </ATTACHMENTS>
        </EXCHANGE>
        """;

    //<!DOCTYPE EXCHANGE SYSTEM "exchange_mis.dtd">

    String xml2 = """
        <?xml version="1.0" encoding="EUC-KR"?>
         <EXCHANGE>
           <HEADER>
             <COMMON>
               <SENDER>
                 <SERVERID>ADM131000001</SERVERID>
                 <USERID>hongkildong</USERID>
                 <EMAIL>hongkildong@sample.gcc.go.kr</EMAIL>
               </SENDER>
               <RECEIVER>
                 <SERVERID>ADM131000040</SERVERID>
                 <USERID>hongkildong</USERID>
                 <EMAIL>hongkildong@sample.gcc.go.kr</EMAIL>
               </RECEIVER>
               <TITLE><![CDATA[업무관리시스템과 행정정보시스템간 샘플문서]]></TITLE>
               <CREATED_DATE>2007-01-24 14:45:34</CREATED_DATE>
               <ATTACHNUM>2</ATTACHNUM>
               <ADMINISTRATIVE_NUM>APP20060000000004075</ADMINISTRATIVE_NUM>
             </COMMON>
             <DIRECTION>
               <TO_DOCUMENT_SYSTEM notification="all">
                 <LINES>
                   <LINE>
                     <LEVEL>1</LEVEL>
                     <SANCTION result="미처리" type="기안">
                       <PERSON>
                         <USERID>hongkildong</USERID>
                         <NAME>홍길동</NAME>
                         <POSITION>전산주사</POSITION>
                         <DEPT><![CDATA[고도화팀]]></DEPT>
                         <ORG><![CDATA[행정안전부]]></ORG>
                       </PERSON>
                       <DATE>2007-01-24 14:45:34</DATE>
                     </SANCTION>
                   </LINE>
                   <LINE>
                     <LEVEL>final</LEVEL>
                     <SANCTION result="미처리" type="결재">
                       <PERSON>
                         <USERID>parkchulsoo</USERID>
                         <NAME>박철수</NAME>
                         <POSITION>팀장</POSITION>
                         <DEPT><![CDATA[고도화팀]]></DEPT>
                         <ORG><![CDATA[행정안전부]]></ORG>
                       </PERSON>              \s
                     </SANCTION>
                   </LINE>
                 </LINES>
                 <MODIFICATION_FLAG>
                   <MODIFIABLE modifyflag="yes"/>
                 </MODIFICATION_FLAG>
               </TO_DOCUMENT_SYSTEM>
             </DIRECTION>
           </HEADER>
           <BODY>
              <![CDATA[업무관리시스템과 행정정보시스템간 샘플 기안문서 본문
        		본 문서는 업무관리시스템과 행정정보시스템 간 기안문서의 본문 샘플 내용임
                        끝.]]>
           </BODY>
           <ATTACHMENTS>
             <ATTACHMENT filename="attach_attach_291ddc46bf184029ffe4070328020703.hwp" desc="001">
               <![CDATA[업무관리시스템과 행정정보시스템간 샘플문서_첨부화일_1.hwp]]>
             </ATTACHMENT>
             <ATTACHMENT filename="attach_attach_101bbc46bf184029ffe4070328010291.hwp" desc="002">
               <![CDATA[업무관리시스템과 행정정보시스템간 샘플문서_첨부화일_2.hwp]]>
             </ATTACHMENT>
           </ATTACHMENTS>
         </EXCHANGE>
        """;
    String xml3 = """
        <?xml version="1.0" encoding="EUC-KR"?>
        <!DOCTYPE EXCHANGE SYSTEM "exchange_mis.dtd">
         <EXCHANGE>
           <HEADER>
             <COMMON>
               <SENDER>
                 <SERVERID>ADM131000040</SERVERID>
                 <USERID>hongkildong</USERID>
                 <EMAIL>hongkildong@sample.gcc.go.kr</EMAIL>
               </SENDER>
               <RECEIVER>
                 <SERVERID>ADM131000001</SERVERID>
                 <USERID>hongkildong</USERID>
                 <EMAIL>hongkildong@sample.gcc.go.kr</EMAIL>
               </RECEIVER>
               <TITLE><![CDATA[업무관리시스템과 행정정보시스템간 샘플문서]]></TITLE>
               <CREATED_DATE>2007-01-25 14:45:34</CREATED_DATE>
               <ATTACHNUM>2</ATTACHNUM>
               <ADMINISTRATIVE_NUM>APP20060000000004075</ADMINISTRATIVE_NUM>
             </COMMON>
             <DIRECTION>
               <TO_ADMINISTRATIVE_SYSTEM>
                 <DOCNUM docnumcode="1310000012699"><![CDATA[고도화팀-2699]]></DOCNUM>
                 <SANCTION_INFO status="완료">
                 <LINES>
                   <LINE>
                     <LEVEL>1</LEVEL>
                     <SANCTION result="상신" type="기안">
                       <PERSON>
                         <USERID>hongkildong</USERID>
                         <NAME>홍길동</NAME>
                         <POSITION>전산주사</POSITION>
                         <DEPT><![CDATA[고도화팀]]></DEPT>
                         <ORG><![CDATA[행정안전부]]></ORG>
                       </PERSON>
                       <COMMENT><![CDATA[보고자 의견입니다.]]></COMMENT>
                       <DATE>2007-01-25 14:45:34</DATE>
                     </SANCTION>
                   </LINE>
                   <LINE>
                     <LEVEL>final</LEVEL>
                     <SANCTION result="결재" type="결재">
                       <PERSON>
                         <USERID>parkchulsoo</USERID>
                         <NAME>박철수</NAME>
                         <POSITION>팀장</POSITION>
                         <DEPT><![CDATA[고도화팀]]></DEPT>
                         <ORG><![CDATA[행정안전부]]></ORG>
                       </PERSON>
                       <COMMENT><![CDATA[결재완료 의견입니다.]]></COMMENT>
                       <DATE>2007-01-25 14:45:34</DATE>
                     </SANCTION>
                   </LINE>
                 </LINES>
                 </SANCTION_INFO>
                 <MODIFICATION_FLAG>
                   <MODIFIABLE modifyflag="no"/>
                 </MODIFICATION_FLAG>
               </TO_ADMINISTRATIVE_SYSTEM>
             </DIRECTION>
             <ADDENDA>
               <ADDENDUM comment="문서관리카드ID" name="DCTDOCID">
                                <![CDATA[DCT434ACE11DD5DC11979D5D70BFFFF8002]]></ADDENDUM>
             </ADDENDA>
           </HEADER>
           <BODY filename="attach_body_CFDD119D6EC2410e86E19045E53267A8.hwp" desc="body">
              <![CDATA[업무관리시스템과 행정정보시스템간 샘플문서.hwp]]>
           </BODY>
           <ATTACHMENTS>
             <ATTACHMENT filename="attach_attach_291ddc46bf184029ffe4070328020703.hwp" desc="attach">
               <![CDATA[업무관리시스템과 행정정보시스템간 샘플문서_첨부화일_1.hwp]]>
             </ATTACHMENT>
             <ATTACHMENT filename="attach_attach_101bbc46bf184029ffe4070328010291.hwp" desc="attach">
               <![CDATA[업무관리시스템과 행정정보시스템간 샘플문서_첨부화일_2.hwp]]>
             </ATTACHMENT>
           </ATTACHMENTS>
         </EXCHANGE>
        """;

    @DisplayName("전자결재 xml read 테스트")
    @Test
    public void exchangeXmlReadTest() throws IOException {
        JacksonXmlModule jacksonXmlModule = new JacksonXmlModule();
        jacksonXmlModule.setDefaultUseWrapper(false);
        //ObjectMapper xmlMapper = new XmlMapper(jacksonXmlModule);
        XmlMapper xmlMapper = new XmlMapper(jacksonXmlModule);
        xmlMapper.enable(SerializationFeature.INDENT_OUTPUT);

        ExchangeDto dto
            = xmlMapper.readValue(xml, ExchangeDto.class);
        log.info("dto: {}", dto);

        assertNotNull(dto);

        //xmlMapper.writeValue(new File("open_exchange_exchange2-1.xml"), dto);
        xmlMapper.writeValue(System.out, dto);
    }

    @DisplayName("전자결재 xml write 테스트")
    @Test
    public void exchangeXmlWriteTest() throws IOException {
        ExchangeDto.Common common = ExchangeDto.Common.builder()
            .sender(
                ExchangeDto.Sender.builder()
                    .serverid("ADM131000040")
                    .userid("hongkildong")
                    .email("ttt@g.co.kr")
                    .build())
            .receiver(
                ExchangeDto.Receiver.builder()
                    .serverid("ADM131000040")
                    .userid("hongkildong")
                    .email("ldlldld@k.r")
                    .build())
            .title("업무관리시스템과 행정정보시스템간 샘플문서")
            .createdDate("2007-01-24 14:45:34")
            .attachnum(2)
            .administrativeNum("APP20060000000004075")
            .build();

        ExchangeDto.Direction direction = ExchangeDto.Direction.builder()
            .toDocumentSystem(
                ExchangeDto.ToDocumentSystem.builder()
                    .notification("all")
                    .modificationFlag(
                        ExchangeDto.ModificationFlag.builder()
                            .modifiable(
                                ExchangeDto.Modifiable.builder()
                                    .modifyflag("yes")
                                    .build())
                            .build())
                    .build()
            )
            .build();

        ExchangeDto.Header header = ExchangeDto.Header.builder()
            .common(common)
            .direction(direction)
            .build();


        ExchangeDto dto = ExchangeDto.builder()
            .header(header)
            .body("업무관리시스템과 행정정보시스템간 샘플 기안문서 본문")
            .build();


        /*
        <?xml version="1.0" encoding="EUC-KR"?>
        <!DOCTYPE EXCHANGE SYSTEM "exchange_mis.dtd">
        처리
        */
        JacksonXmlModule module = new JacksonXmlModule();
        module.setDefaultUseWrapper(true);
        XmlMapper mapper = new XmlMapper(module);

        XMLOutputFactory factory = mapper.getFactory().getXMLOutputFactory();

        String dtd = """
            <!DOCTYPE EXCHANGE SYSTEM "exchange.dtd">
            """;
        try (FileWriter w = new FileWriter("exchange_exchange11-1.xml")) {
            XMLStreamWriter sw = factory.createXMLStreamWriter(w);
            sw.writeStartDocument("EUC-KR", "1.0");
            sw.writeDTD("\n"+dtd);
            mapper.enable(SerializationFeature.INDENT_OUTPUT);
            mapper.writeValue(sw, dto);

        }catch (XMLStreamException e) {
            e.printStackTrace();
        }

        String dtoXml = mapper.writeValueAsString(dto);
        log.info("dtoXml: {}", dtoXml);
    }
}
