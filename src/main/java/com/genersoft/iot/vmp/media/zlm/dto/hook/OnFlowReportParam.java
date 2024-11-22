package com.genersoft.iot.vmp.media.zlm.dto.hook;

/**
 * @Author qiansl
 * @Date 2024/11/22 11:20
 * @Version 1.0
 * @Description
 */
public class OnFlowReportParam extends HookParam {

    private String app;

    private int duration;

    private String params;

    private boolean player;

    private String schema;

    private String stream;

    private int totalBytes;

    private String vhost;

    private String ip;

    private int port;

    private String id;

    public void setApp(String app){
        this.app = app;
    }
    public String getApp(){
        return this.app;
    }
    public void setDuration(int duration){
        this.duration = duration;
    }
    public int getDuration(){
        return this.duration;
    }
    public void setParams(String params){
        this.params = params;
    }
    public String getParams(){
        return this.params;
    }
    public void setPlayer(boolean player){
        this.player = player;
    }
    public boolean getPlayer(){
        return this.player;
    }
    public void setSchema(String schema){
        this.schema = schema;
    }
    public String getSchema(){
        return this.schema;
    }
    public void setStream(String stream){
        this.stream = stream;
    }
    public String getStream(){
        return this.stream;
    }
    public void setTotalBytes(int totalBytes){
        this.totalBytes = totalBytes;
    }
    public int getTotalBytes(){
        return this.totalBytes;
    }
    public void setVhost(String vhost){
        this.vhost = vhost;
    }
    public String getVhost(){
        return this.vhost;
    }
    public void setIp(String ip){
        this.ip = ip;
    }
    public String getIp(){
        return this.ip;
    }
    public void setPort(int port){
        this.port = port;
    }
    public int getPort(){
        return this.port;
    }
    public void setId(String id){
        this.id = id;
    }
    public String getId(){
        return this.id;
    }
}
