package com.glab30991.AC16;

public class FileStorageException extends RuntimeException{
    private String msg;

    public FileStorageException(String msg){
        this.msg = msg;
    }

    public String getMsg(){
        return  msg;
    }

    public  void  setMsg(String msg){
        this.msg = msg;
    }
}
