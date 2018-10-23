/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package jscip;

public class SCIPJNIJNI {
  public final static native long new_double_array(int jarg1);
  public final static native void delete_double_array(long jarg1);
  public final static native double double_array_getitem(long jarg1, int jarg2);
  public final static native void double_array_setitem(long jarg1, int jarg2, double jarg3);
  public final static native long new_unsigned_int_array(int jarg1);
  public final static native void delete_unsigned_int_array(long jarg1);
  public final static native long unsigned_int_array_getitem(long jarg1, int jarg2);
  public final static native void unsigned_int_array_setitem(long jarg1, int jarg2, long jarg3);
  public final static native long new_SCIP_VAR_array(int jarg1);
  public final static native void delete_SCIP_VAR_array(long jarg1);
  public final static native long SCIP_VAR_array_getitem(long jarg1, int jarg2);
  public final static native void SCIP_VAR_array_setitem(long jarg1, int jarg2, long jarg3);
  public final static native long new_SCIP_SOL_array(int jarg1);
  public final static native void delete_SCIP_SOL_array(long jarg1);
  public final static native long SCIP_SOL_array_getitem(long jarg1, int jarg2);
  public final static native void SCIP_SOL_array_setitem(long jarg1, int jarg2, long jarg3);
  public final static native int SCIP_OKAY_get();
  public final static native int SCIP_ERROR_get();
  public final static native int SCIP_NOMEMORY_get();
  public final static native int SCIP_READERROR_get();
  public final static native int SCIP_WRITEERROR_get();
  public final static native int SCIP_NOFILE_get();
  public final static native int SCIP_FILECREATEERROR_get();
  public final static native int SCIP_LPERROR_get();
  public final static native int SCIP_NOPROBLEM_get();
  public final static native int SCIP_INVALIDCALL_get();
  public final static native int SCIP_INVALIDDATA_get();
  public final static native int SCIP_INVALIDRESULT_get();
  public final static native int SCIP_PLUGINNOTFOUND_get();
  public final static native int SCIP_PARAMETERUNKNOWN_get();
  public final static native int SCIP_PARAMETERWRONGTYPE_get();
  public final static native int SCIP_PARAMETERWRONGVAL_get();
  public final static native int SCIP_KEYALREADYEXISTING_get();
  public final static native int SCIP_MAXDEPTHLEVEL_get();
  public final static native int SCIP_BRANCHERROR_get();
  public final static native int SCIP_VARTYPE_BINARY_get();
  public final static native int SCIP_VARTYPE_INTEGER_get();
  public final static native int SCIP_VARTYPE_IMPLINT_get();
  public final static native int SCIP_VARTYPE_CONTINUOUS_get();
  public final static native int SCIP_PARAMEMPHASIS_DEFAULT_get();
  public final static native int SCIP_PARAMEMPHASIS_CPSOLVER_get();
  public final static native int SCIP_PARAMEMPHASIS_EASYCIP_get();
  public final static native int SCIP_PARAMEMPHASIS_FEASIBILITY_get();
  public final static native int SCIP_PARAMEMPHASIS_HARDLP_get();
  public final static native int SCIP_PARAMEMPHASIS_OPTIMALITY_get();
  public final static native int SCIP_PARAMEMPHASIS_COUNTER_get();
  public final static native int SCIP_PARAMEMPHASIS_PHASEFEAS_get();
  public final static native int SCIP_PARAMEMPHASIS_PHASEIMPROVE_get();
  public final static native int SCIP_PARAMEMPHASIS_PHASEPROOF_get();
  public final static native int SCIP_OBJSENSE_MAXIMIZE_get();
  public final static native int SCIP_OBJSENSE_MINIMIZE_get();
  public final static native double SCIPcalcMachineEpsilon();
  public final static native int SCIPcreate(long jarg1);
  public final static native int SCIPgetNVars(long jarg1);
  public final static native int SCIPreadProb(long jarg1, String jarg2, String jarg3);
  public final static native int SCIPreadParams(long jarg1, String jarg2);
  public final static native int SCIPcreateProbBasic(long jarg1, String jarg2);
  public final static native int SCIPincludeDefaultPlugins(long jarg1);
  public final static native int SCIPsolve(long jarg1);
  public final static native int SCIPaddVar(long jarg1, long jarg2);
  public final static native long SCIPgetVars(long jarg1);
  public final static native int SCIPaddCons(long jarg1, long jarg2);
  public final static native int SCIPwriteOrigProblem(long jarg1, String jarg2, String jarg3, long jarg4);
  public final static native int SCIPwriteTransProblem(long jarg1, String jarg2, String jarg3, long jarg4);
  public final static native int SCIPprintStatistics(long jarg1, long jarg2);
  public final static native int SCIPprintBestSol(long jarg1, long jarg2, long jarg3);
  public final static native void SCIPsetMessagehdlrQuiet(long jarg1, long jarg2);
  public final static native long SCIPgetSols(long jarg1);
  public final static native int SCIPgetNSols(long jarg1);
  public final static native long SCIPgetBestSol(long jarg1);
  public final static native double SCIPgetSolVal(long jarg1, long jarg2, long jarg3);
  public final static native double SCIPgetSolOrigObj(long jarg1, long jarg2);
  public final static native double SCIPinfinity(long jarg1);
  public final static native double SCIPepsilon(long jarg1);
  public final static native double SCIPfeastol(long jarg1);
  public final static native int SCIPsetBoolParam(long jarg1, String jarg2, long jarg3);
  public final static native int SCIPsetIntParam(long jarg1, String jarg2, int jarg3);
  public final static native int SCIPsetLongintParam(long jarg1, String jarg2, int jarg3);
  public final static native int SCIPsetRealParam(long jarg1, String jarg2, double jarg3);
  public final static native int SCIPsetCharParam(long jarg1, String jarg2, char jarg3);
  public final static native int SCIPsetStringParam(long jarg1, String jarg2, String jarg3);
  public final static native int SCIPsetEmphasis(long jarg1, int jarg2, long jarg3);
  public final static native int SCIPsetObjsense(long jarg1, int jarg2);
  public final static native int SCIPgetObjsense(long jarg1);
  public final static native int SCIPcreateSol(long jarg1, long jarg2, long jarg3);
  public final static native int SCIPsetSolVal(long jarg1, long jarg2, long jarg3, double jarg4);
  public final static native int SCIPsetSolVals(long jarg1, long jarg2, int jarg3, long jarg4, long jarg5);
  public final static native int SCIPaddSolFree(long jarg1, long jarg2, long jarg3);
  public final static native void BMScheckEmptyMemory();
  public final static native long BMSgetMemoryUsed();
  public final static native String SCIPvarGetName(long jarg1);
  public final static native int SCIPvarGetType(long jarg1);
  public final static native double SCIPvarGetLbLocal(long jarg1);
  public final static native double SCIPvarGetUbLocal(long jarg1);
  public final static native double SCIPvarGetLbGlobal(long jarg1);
  public final static native double SCIPvarGetUbGlobal(long jarg1);
  public final static native double SCIPvarGetObj(long jarg1);
  public final static native int SCIPsolGetDepth(long jarg1);
  public final static native int SCIPsolGetIndex(long jarg1);
  public final static native String SCIPconsGetName(long jarg1);
  public final static native long createSCIP();
  public final static native void freeSCIP(long jarg1);
  public final static native long createVar(long jarg1, String jarg2, double jarg3, double jarg4, double jarg5, int jarg6);
  public final static native void releaseVar(long jarg1, long jarg2);
  public final static native long createConsBasicLinear(long jarg1, String jarg2, int jarg3, long jarg4, long jarg5, double jarg6, double jarg7);
  public final static native long createConsBasicQuadratic(long jarg1, String jarg2, int jarg3, long jarg4, long jarg5, int jarg6, long jarg7, long jarg8, long jarg9, double jarg10, double jarg11);
  public final static native long createConsBasicSuperIndicator(long jarg1, String jarg2, long jarg3, long jarg4);
  public final static native void releaseCons(long jarg1, long jarg2);
}
