package com.ft.http.converters;

import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.converter.xml.AbstractJaxb2HttpMessageConverter;

import javax.xml.transform.Result;
import javax.xml.transform.Source;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.List;

public class NewJsonMessageConverter extends AbstractJaxb2HttpMessageConverter<Object> {

    @Override
    public void setSupportedMediaTypes(List<MediaType> supportedMediaTypes) {
        super.setSupportedMediaTypes(supportedMediaTypes);
    }

    @Override
    public List<MediaType> getSupportedMediaTypes() {
        return super.getSupportedMediaTypes();
    }

    @Override
    public void setDefaultCharset(Charset defaultCharset) {
        super.setDefaultCharset(defaultCharset);
    }

    @Override
    public Charset getDefaultCharset() {
        return super.getDefaultCharset();
    }

    @Override
    public boolean canRead(Class<?> clazz, MediaType mediaType) {
        return super.canRead(clazz, mediaType);
    }

    @Override
    protected boolean canRead(MediaType mediaType) {
        return super.canRead(mediaType);
    }

    @Override
    public boolean canWrite(Class<?> clazz, MediaType mediaType) {
        return super.canWrite(clazz, mediaType);
    }

    @Override
    protected boolean canWrite(MediaType mediaType) {
        return super.canWrite(mediaType);
    }

    @Override
    protected void addDefaultHeaders(HttpHeaders headers, Object o, MediaType contentType) throws IOException {
        super.addDefaultHeaders(headers, o, contentType);
    }

    @Override
    protected MediaType getDefaultContentType(Object o) throws IOException {
        return super.getDefaultContentType(o);
    }

    @Override
    protected Long getContentLength(Object o, MediaType contentType) throws IOException {
        return super.getContentLength(o, contentType);
    }

    @Override
    protected boolean supports(Class<?> aClass) {
        return false;
    }

    @Override
    protected Object readFromSource(Class<?> aClass, HttpHeaders httpHeaders, Source source) throws Exception {
        return null;
    }

    @Override
    protected void writeToResult(Object o, HttpHeaders httpHeaders, Result result) throws Exception {

    }
}
