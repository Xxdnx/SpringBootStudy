package com.xx.web.server.bean;

/**
 * @author Xx
 * @program study
 * @description
 * @create 2020-12-29 16:50
 * @since 1.0
 */
public class RequestMessage {
    private String url;
    private String method;
    private String host;
    private String address;
    private int port;

    public RequestMessage() {
    }

    public RequestMessage(String url, String method, String host, String address, int port) {
        this.url = url;
        this.method = method;
        this.host = host;
        this.address = address;
        this.port = port;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    @Override
    public String toString() {
        return "RequestMessage{" +
                "url='" + url + '\'' +
                ", method='" + method + '\'' +
                ", host='" + host + '\'' +
                ", address='" + address + '\'' +
                ", port=" + port +
                '}';
    }
}
