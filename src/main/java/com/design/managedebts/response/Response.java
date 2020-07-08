package com.design.managedebts.response;

import org.springframework.http.HttpStatus;

public class Response<T> {

    private HttpStatus status;
    private T data;

    public Response() {
    }

    public Response(HttpStatus status, T data) {
        this.status = status;
        this.data = data;
    }

    public HttpStatus getStatus() {
        return status;
    }

    public void setStatus(HttpStatus status) {
        this.status = status;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Response{" +
                "status=" + status +
                ", data=" + data +
                '}';
    }
}


