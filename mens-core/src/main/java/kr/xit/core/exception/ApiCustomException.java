package kr.xit.core.exception;

import kr.xit.core.model.ResultCode;
import lombok.Getter;

/**
 * <pre>
 * description :
 *
 * packageName : kr.xit.core.exception
 * fileName    : ApiCustomException
 * author      : limju
 * date        : 2024-03-15
 * ======================================================================
 * 변경일         변경자        변경 내용
 * ----------------------------------------------------------------------
 * 2024-03-15    limju       최초 생성
 *
 * </pre>
 */
@Getter
public class ApiCustomException extends RuntimeException {
    private Integer code = ResultCode.INVALID_DATA.getStatusCode();
    private final String message = ResultCode.findByStatusCode(code).getMessage();

    private ApiCustomException() {
        super(ResultCode.INVALID_DATA.getMessage());
    }
    private ApiCustomException(String message) {
        super(message);
    }

    private ApiCustomException(Integer code, String message) {
        super(message);
        this.code = code;
    }

    public static ApiCustomException create(String message) {
        return new ApiCustomException(message);
    }

    public static ApiCustomException create(Integer code, String message) {
        return new ApiCustomException(code, message);
    }
}
