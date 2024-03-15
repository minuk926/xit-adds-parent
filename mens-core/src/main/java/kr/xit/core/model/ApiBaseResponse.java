package kr.xit.core.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonRootName;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <pre>
 * description :
 *
 * packageName : kr.xit.core.model
 * fileName    : ApiBaseResponse
 * author      : limju
 * date        : 2024-03-15
 * ======================================================================
 * 변경일         변경자        변경 내용
 * ----------------------------------------------------------------------
 * 2024-03-15    limju       최초 생성
 *
 * </pre>
 */
@Data
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
@JsonRootName("result")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiBaseResponse<T> {
    private Integer code = ResultCode.SUCCESS.getStatusCode();
    private String message = ResultCode.SUCCESS.getMessage();
    private T data;

    private Boolean success = Objects.equals(code, ResultCode.SUCCESS.getStatusCode());
    private String responseTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));

    public static <T> ApiBaseResponse<T> of() {
        return new ApiBaseResponse<>();
    }
    public static <T> ApiBaseResponse<T> of(T data) {
        return new ApiBaseResponse<>(data);
    }



    private ApiBaseResponse(T data) {
        this.code = ResultCode.SUCCESS.getStatusCode();
        this.message = ResultCode.findByStatusCode(code).getMessage();
        this.data = data;
    }

    public ApiBaseResponse(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public ApiBaseResponse(Integer code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

}
