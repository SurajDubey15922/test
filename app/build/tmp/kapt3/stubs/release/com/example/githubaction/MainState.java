package com.example.githubaction;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b-\u0018\u00002\u00020\u0001BY\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u000bJ\u0010\u0010.\u001a\u00020\u00002\u0006\u0010/\u001a\u00020\u0001H\u0016J\u0010\u00100\u001a\u00020\u00062\u0006\u00101\u001a\u00020\u0001H\u0016J\b\u00102\u001a\u00020\u0000H\u0016R*\u0010\r\u001a\u0004\u0018\u00010\u00032\b\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006@FX\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R*\u0010\u0013\u001a\u0004\u0018\u00010\u00032\b\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006@FX\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b\u0015\u0010\u0011R\u000e\u0010\u0016\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R,\u0010\u0017\u001a\u0004\u0018\u00010\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006@FX\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u000e\u0010\u001d\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R*\u0010\u001e\u001a\u0004\u0018\u00010\u00032\b\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006@FX\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u000f\"\u0004\b \u0010\u0011R\u000e\u0010!\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R*\u0010\"\u001a\u0004\u0018\u00010\u00032\b\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006@FX\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u000f\"\u0004\b$\u0010\u0011R\u000e\u0010%\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R*\u0010&\u001a\u0004\u0018\u00010\u00032\b\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006@FX\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010\u000f\"\u0004\b(\u0010\u0011R\u000e\u0010)\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R,\u0010*\u001a\u0004\u0018\u00010\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006@FX\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b+\u0010\u0019\"\u0004\b,\u0010\u001bR\u000e\u0010-\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u00063"}, d2 = {"Lcom/example/githubaction/MainState;", "Lcom/saurabhbadola/statesman/BaseState;", "name", "", "password", "remember", "", "isLoading", "errorMessage", "alertMessage", "loadingMessage", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "value", "mAlertMessage", "getMAlertMessage", "()Ljava/lang/String;", "setMAlertMessage", "(Ljava/lang/String;)V", "mAlertMessageChanged", "mErrorMessage", "getMErrorMessage", "setMErrorMessage", "mErrorMessageChanged", "mIsLoading", "getMIsLoading", "()Ljava/lang/Boolean;", "setMIsLoading", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "mIsLoadingChanged", "mLoadingMessage", "getMLoadingMessage", "setMLoadingMessage", "mLoadingMessageChanged", "mName", "getMName", "setMName", "mNameChanged", "mPassword", "getMPassword", "setMPassword", "mPasswordChanged", "mRemember", "getMRemember", "setMRemember", "mRememberChanged", "changeToNewStateFrom", "newState", "compareTo", "state", "getCopy", "app_release"})
public final class MainState extends com.saurabhbadola.statesman.BaseState {
    @org.jetbrains.annotations.Nullable
    @androidx.databinding.Bindable
    private java.lang.String mName;
    private boolean mNameChanged = false;
    @org.jetbrains.annotations.Nullable
    @androidx.databinding.Bindable
    private java.lang.String mPassword;
    private boolean mPasswordChanged = false;
    @org.jetbrains.annotations.Nullable
    @androidx.databinding.Bindable
    private java.lang.Boolean mRemember;
    private boolean mRememberChanged = false;
    @org.jetbrains.annotations.Nullable
    @androidx.databinding.Bindable
    private java.lang.Boolean mIsLoading;
    private boolean mIsLoadingChanged = false;
    @org.jetbrains.annotations.Nullable
    @androidx.databinding.Bindable
    private java.lang.String mErrorMessage;
    private boolean mErrorMessageChanged = false;
    @org.jetbrains.annotations.Nullable
    @androidx.databinding.Bindable
    private java.lang.String mAlertMessage;
    private boolean mAlertMessageChanged = false;
    @org.jetbrains.annotations.Nullable
    @androidx.databinding.Bindable
    private java.lang.String mLoadingMessage;
    private boolean mLoadingMessageChanged = false;
    
    public MainState() {
        super();
    }
    
    public MainState(@org.jetbrains.annotations.Nullable
    java.lang.String name, @org.jetbrains.annotations.Nullable
    java.lang.String password, @org.jetbrains.annotations.Nullable
    java.lang.Boolean remember, @org.jetbrains.annotations.Nullable
    java.lang.Boolean isLoading, @org.jetbrains.annotations.Nullable
    java.lang.String errorMessage, @org.jetbrains.annotations.Nullable
    java.lang.String alertMessage, @org.jetbrains.annotations.Nullable
    java.lang.String loadingMessage) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getMName() {
        return null;
    }
    
    public final void setMName(@org.jetbrains.annotations.Nullable
    java.lang.String value) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getMPassword() {
        return null;
    }
    
    public final void setMPassword(@org.jetbrains.annotations.Nullable
    java.lang.String value) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean getMRemember() {
        return null;
    }
    
    public final void setMRemember(@org.jetbrains.annotations.Nullable
    java.lang.Boolean value) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean getMIsLoading() {
        return null;
    }
    
    public final void setMIsLoading(@org.jetbrains.annotations.Nullable
    java.lang.Boolean value) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getMErrorMessage() {
        return null;
    }
    
    public final void setMErrorMessage(@org.jetbrains.annotations.Nullable
    java.lang.String value) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getMAlertMessage() {
        return null;
    }
    
    public final void setMAlertMessage(@org.jetbrains.annotations.Nullable
    java.lang.String value) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getMLoadingMessage() {
        return null;
    }
    
    public final void setMLoadingMessage(@org.jetbrains.annotations.Nullable
    java.lang.String value) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.example.githubaction.MainState getCopy() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.example.githubaction.MainState changeToNewStateFrom(@org.jetbrains.annotations.NotNull
    com.saurabhbadola.statesman.BaseState newState) {
        return null;
    }
    
    @java.lang.Override
    public boolean compareTo(@org.jetbrains.annotations.NotNull
    com.saurabhbadola.statesman.BaseState state) {
        return false;
    }
}