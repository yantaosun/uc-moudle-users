package com.uc.moudle.user.api.exception;/** * @author 9527 * @ClassName HttpRequestException * @Date 2020/1/21 * @Description TODO * @Version 1.0 */public class HttpRequestException extends Exception{    private Integer code;    private String message;    private Throwable throwable;    public Integer getCode() {        return code;    }    public Throwable getThrowable() {        return throwable;    }    public void setCode(Integer code) {        this.code = code;    }    public void setMessage(String message) {        this.message = message;    }    @Override    public String getMessage() {        return message;    }    public void setThrowable(Throwable throwable) {        this.throwable = throwable;    }    public HttpRequestException(){        super();    }    public HttpRequestException(Integer code, String message) {        this.code = code;        this.message = message;    }    public HttpRequestException(Integer code, String message, Throwable throwable) {        this.code = code;        this.message = message;        this.throwable = throwable;    }}