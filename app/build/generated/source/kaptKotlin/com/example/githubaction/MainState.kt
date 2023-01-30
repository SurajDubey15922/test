package com.example.githubaction

import androidx.databinding.Bindable
import androidx.databinding.library.baseAdapters.BR
import com.saurabhbadola.statesman.BaseState
import kotlin.Boolean
import kotlin.String

public class MainState(
  name: String? = null,
  password: String? = null,
  remember: Boolean? = null,
  isLoading: Boolean? = null,
  errorMessage: String? = null,
  alertMessage: String? = null,
  loadingMessage: String? = null
) : BaseState() {
  @Bindable
  public var mName: String? = name
    set(`value`) {
      mNameChanged = true
      `field` = `value`
      notifyPropertyChanged(BR.name)
    }

  private var mNameChanged: Boolean = false

  @Bindable
  public var mPassword: String? = password
    set(`value`) {
      mPasswordChanged = true
      `field` = `value`
      notifyPropertyChanged(BR.password)
    }

  private var mPasswordChanged: Boolean = false

  @Bindable
  public var mRemember: Boolean? = remember
    set(`value`) {
      mRememberChanged = true
      `field` = `value`
      notifyPropertyChanged(BR.remember)
    }

  private var mRememberChanged: Boolean = false

  @Bindable
  public var mIsLoading: Boolean? = isLoading
    set(`value`) {
      mIsLoadingChanged = true
      `field` = `value`
      notifyPropertyChanged(BR.isLoading)
    }

  private var mIsLoadingChanged: Boolean = false

  @Bindable
  public var mErrorMessage: String? = errorMessage
    set(`value`) {
      mErrorMessageChanged = true
      `field` = `value`
      notifyPropertyChanged(BR.errorMessage)
    }

  private var mErrorMessageChanged: Boolean = false

  @Bindable
  public var mAlertMessage: String? = alertMessage
    set(`value`) {
      mAlertMessageChanged = true
      `field` = `value`
      notifyPropertyChanged(BR.alertMessage)
    }

  private var mAlertMessageChanged: Boolean = false

  @Bindable
  public var mLoadingMessage: String? = loadingMessage
    set(`value`) {
      mLoadingMessageChanged = true
      `field` = `value`
      notifyPropertyChanged(BR.loadingMessage)
    }

  private var mLoadingMessageChanged: Boolean = false

  init {
    if( name !=null ) mName = name 
    if( password !=null ) mPassword = password 
    if( remember !=null ) mRemember = remember 
    if( isLoading !=null ) mIsLoading = isLoading 
    if( errorMessage !=null ) mErrorMessage = errorMessage 
    if( alertMessage !=null ) mAlertMessage = alertMessage 
    if( loadingMessage !=null ) mLoadingMessage = loadingMessage 
  }

  public override fun getCopy(): MainState =
      MainState(this.mName,this.mPassword,this.mRemember,this.mIsLoading,this.mErrorMessage,this.mAlertMessage,this.mLoadingMessage,)

  public override fun changeToNewStateFrom(newState: BaseState): MainState {
    val oldState = getCopy()
    newState as MainState
    if(newState.mNameChanged) oldState.mName = newState.mName
        if(newState.mPasswordChanged) oldState.mPassword = newState.mPassword
        if(newState.mRememberChanged) oldState.mRemember = newState.mRemember
        if(newState.mIsLoadingChanged) oldState.mIsLoading = newState.mIsLoading
        if(newState.mErrorMessageChanged) oldState.mErrorMessage = newState.mErrorMessage
        if(newState.mAlertMessageChanged) oldState.mAlertMessage = newState.mAlertMessage
        if(newState.mLoadingMessageChanged) oldState.mLoadingMessage = newState.mLoadingMessage
    if(newState.mIsLoadingChanged) oldState.mIsLoading = newState.mIsLoading
    if(newState.mAlertMessageChanged) oldState.mAlertMessage = newState.mAlertMessage
    if(newState.mErrorMessageChanged) oldState.mErrorMessage = newState.mErrorMessage
    if(newState.mLoadingMessageChanged) oldState.mLoadingMessage = newState.mLoadingMessage
    return oldState
  }

  public override fun compareTo(state: BaseState): Boolean {
    state as MainState
    if(
    this.mName == state.mName &&
        this.mPassword == state.mPassword &&
        this.mRemember == state.mRemember &&
        this.mIsLoading == state.mIsLoading &&
        this.mErrorMessage == state.mErrorMessage &&
        this.mAlertMessage == state.mAlertMessage &&
        this.mLoadingMessage == state.mLoadingMessage &&
    this.mIsLoading == state.mIsLoading &&
    this.mAlertMessage == state.mAlertMessage &&
    this.mErrorMessage == state.mErrorMessage &&
    this.mLoadingMessage == state.mLoadingMessage
    )
    return true
    return false
  }
}
