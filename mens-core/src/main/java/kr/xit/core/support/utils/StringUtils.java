package kr.xit.core.support.utils;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

import kr.xit.core.exception.ApiCustomException;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

/**
 * <pre>
 * description :
 *
 * packageName : kr.xit.core.support.utils
 * fileName    : StringUtils
 * author      : limju
 * date        : 2024-03-20
 * ======================================================================
 * 변경일         변경자        변경 내용
 * ----------------------------------------------------------------------
 * 2024-03-20    limju       최초 생성
 *
 * </pre>
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class StringUtils {

    public static String getUtf8UrlEncoding(final String str) {
        try {
            return URLEncoder.encode(
                org.apache.commons.codec.binary.StringUtils.newStringUtf8(
                    org.apache.commons.codec.binary.StringUtils.getBytesUtf8(str)),
                StandardCharsets.UTF_8
            );
        } catch (Exception e) {
            throw ApiCustomException.create(e.getLocalizedMessage());
        }
    }
}
