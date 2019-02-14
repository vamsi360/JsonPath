package com.jayway.jsonpath.internal.path;

import com.jayway.jsonpath.internal.EvaluationContext;

public class ContextWithEvalResult<T> {

  private final EvaluationContext evaluationContext;
  private final EvalResult<T> evalResult;

  public ContextWithEvalResult(EvaluationContext evaluationContext,
      EvalResult<T> evalResult) {
    this.evaluationContext = evaluationContext;
    this.evalResult = evalResult;
  }

  public EvaluationContext getEvaluationContext() {
    return evaluationContext;
  }

  public EvalResult<T> getEvalResult() {
    return evalResult;
  }
}
