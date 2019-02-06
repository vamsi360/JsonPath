package com.jayway.jsonpath.internal.path;

public class EvalResult<T> {

  private final T result;
  private final boolean isPathPresent;

  public EvalResult(T result, boolean isPathPresent) {
    this.result = result;
    this.isPathPresent = isPathPresent;
  }

  public T getResult() {
    return result;
  }

  public boolean isPathPresent() {
    return isPathPresent;
  }
}
