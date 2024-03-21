
package kr.xit.inf.nims.model.aar;

import javax.xml.namespace.QName;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;

/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the kr.xit.inf.nims.model package.
 * <p>An ObjectFactory allows you to programatically
 * construct new instances of the Java representation
 * for XML content. The Java representation of XML
 * content can consist of schema derived interfaces
 * and classes representing the binding of schema
 * type definitions, element declarations and model
 * groups.  Factory methods for each of these are
 * provided in this class.
 *
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AarRegist_QNAME = new QName("https://www.nims.or.kr/schema/nims", "aar_regist");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: kr.xit.inf.nims.model
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Aar }
     *
     */
    public Aar createAar() {
        return new Aar();
    }

    /**
     * Create an instance of {@link ReportSetAAR }
     *
     */
    public ReportSetAAR createReportSetAAR() {
        return new ReportSetAAR();
    }

    /**
     * Create an instance of {@link HeaderAAR }
     *
     */
    public HeaderAAR createHeaderAAR() {
        return new HeaderAAR();
    }

    /**
     * Create an instance of {@link LinesAAR }
     *
     */
    public LinesAAR createLinesAAR() {
        return new LinesAAR();
    }

    /**
     * Create an instance of {@link LineAAR }
     *
     */
    public LineAAR createLineAAR() {
        return new LineAAR();
    }

    /**
     * Create an instance of {@link AtchFiles }
     *
     */
    public AtchFiles createAtchFiles() {
        return new AtchFiles();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Aar }{@code >}
     *
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Aar }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.nims.or.kr/schema/nims", name = "aar_regist")
    public JAXBElement<Aar> createAarRegist(Aar value) {
        return new JAXBElement<Aar>(_AarRegist_QNAME, Aar.class, null, value);
    }

}
