package com.tuanloc.spotify.core.utilities;

public class ErrorResult extends Result{
    public ErrorResult(boolean success){
        super(success);
    }

    public ErrorResult(boolean success, String message){
        super(success, message);
    }
}
