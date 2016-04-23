/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.uml.cda.operations.ClinicalStatementOperations;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.Query;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.TobaccoUse;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Tobacco Use</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TobaccoUse#validateTobaccoUseEffectiveTimeLow(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tobacco Use Effective Time Low</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TobaccoUse#validateTobaccoUseTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tobacco Use Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TobaccoUse#validateTobaccoUseClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tobacco Use Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TobaccoUse#validateTobaccoUseMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tobacco Use Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TobaccoUse#validateTobaccoUseCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tobacco Use Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TobaccoUse#validateTobaccoUseEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tobacco Use Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TobaccoUse#validateTobaccoUseStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tobacco Use Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TobaccoUse#validateTobaccoUseStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tobacco Use Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TobaccoUse#validateTobaccoUseValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tobacco Use Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TobaccoUse#validateTobaccoUseValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tobacco Use Value P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TobaccoUse#validateTobaccoUseCDCodeTermAssertionOrLoinc(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tobacco Use CD Code Term Assertion Or Loinc</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TobaccoUse#validateTobaccoUseCDCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tobacco Use CD Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TobaccoUse#validateTobaccoUseCDCodeSystem(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tobacco Use CD Code System</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TobaccoUseOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TobaccoUseOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTobaccoUseEffectiveTimeLow(TobaccoUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tobacco Use Effective Time Low</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTobaccoUseEffectiveTimeLow(TobaccoUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TOBACCO_USE_EFFECTIVE_TIME_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.effectiveTime.oclIsUndefined() implies not self.effectiveTime.low.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateTobaccoUseEffectiveTimeLow(TobaccoUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tobacco Use Effective Time Low</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTobaccoUseEffectiveTimeLow(TobaccoUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_TOBACCO_USE_EFFECTIVE_TIME_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param tobaccoUse The receiving '<em><b>Tobacco Use</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateTobaccoUseEffectiveTimeLow(TobaccoUse tobaccoUse, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
		if (VALIDATE_TOBACCO_USE_EFFECTIVE_TIME_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TOBACCO_USE);
			try {
				VALIDATE_TOBACCO_USE_EFFECTIVE_TIME_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TOBACCO_USE_EFFECTIVE_TIME_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_TOBACCO_USE_EFFECTIVE_TIME_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(tobaccoUse)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.TOBACCO_USE__TOBACCO_USE_EFFECTIVE_TIME_LOW,
						 ConsolPlugin.INSTANCE.getString("TobaccoUseTobaccoUseEffectiveTimeLow"),
						 new Object [] { tobaccoUse }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTobaccoUseTemplateId(TobaccoUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tobacco Use Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTobaccoUseTemplateId(TobaccoUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TOBACCO_USE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.85')";

	/**
	 * The cached OCL invariant for the '{@link #validateTobaccoUseTemplateId(TobaccoUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tobacco Use Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTobaccoUseTemplateId(TobaccoUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_TOBACCO_USE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param tobaccoUse The receiving '<em><b>Tobacco Use</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateTobaccoUseTemplateId(TobaccoUse tobaccoUse, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
		if (VALIDATE_TOBACCO_USE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TOBACCO_USE);
			try {
				VALIDATE_TOBACCO_USE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TOBACCO_USE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_TOBACCO_USE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(tobaccoUse)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.TOBACCO_USE__TOBACCO_USE_TEMPLATE_ID,
						 ConsolPlugin.INSTANCE.getString("TobaccoUseTobaccoUseTemplateId"),
						 new Object [] { tobaccoUse }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTobaccoUseClassCode(TobaccoUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tobacco Use Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTobaccoUseClassCode(TobaccoUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TOBACCO_USE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::OBS";

	/**
	 * The cached OCL invariant for the '{@link #validateTobaccoUseClassCode(TobaccoUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tobacco Use Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTobaccoUseClassCode(TobaccoUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_TOBACCO_USE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param tobaccoUse The receiving '<em><b>Tobacco Use</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateTobaccoUseClassCode(TobaccoUse tobaccoUse, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
		if (VALIDATE_TOBACCO_USE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TOBACCO_USE);
			try {
				VALIDATE_TOBACCO_USE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TOBACCO_USE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_TOBACCO_USE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(tobaccoUse)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.TOBACCO_USE__TOBACCO_USE_CLASS_CODE,
						 ConsolPlugin.INSTANCE.getString("TobaccoUseTobaccoUseClassCode"),
						 new Object [] { tobaccoUse }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTobaccoUseMoodCode(TobaccoUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tobacco Use Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTobaccoUseMoodCode(TobaccoUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TOBACCO_USE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

	/**
	 * The cached OCL invariant for the '{@link #validateTobaccoUseMoodCode(TobaccoUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tobacco Use Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTobaccoUseMoodCode(TobaccoUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_TOBACCO_USE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param tobaccoUse The receiving '<em><b>Tobacco Use</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateTobaccoUseMoodCode(TobaccoUse tobaccoUse, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
		if (VALIDATE_TOBACCO_USE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TOBACCO_USE);
			try {
				VALIDATE_TOBACCO_USE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TOBACCO_USE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_TOBACCO_USE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(tobaccoUse)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.TOBACCO_USE__TOBACCO_USE_MOOD_CODE,
						 ConsolPlugin.INSTANCE.getString("TobaccoUseTobaccoUseMoodCode"),
						 new Object [] { tobaccoUse }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTobaccoUseCode(TobaccoUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tobacco Use Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTobaccoUseCode(TobaccoUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TOBACCO_USE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateTobaccoUseCode(TobaccoUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tobacco Use Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTobaccoUseCode(TobaccoUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_TOBACCO_USE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param tobaccoUse The receiving '<em><b>Tobacco Use</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateTobaccoUseCode(TobaccoUse tobaccoUse, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
		if (VALIDATE_TOBACCO_USE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TOBACCO_USE);
			try {
				VALIDATE_TOBACCO_USE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TOBACCO_USE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_TOBACCO_USE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(tobaccoUse)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.TOBACCO_USE__TOBACCO_USE_CODE,
						 ConsolPlugin.INSTANCE.getString("TobaccoUseTobaccoUseCode"),
						 new Object [] { tobaccoUse }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTobaccoUseEffectiveTime(TobaccoUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tobacco Use Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTobaccoUseEffectiveTime(TobaccoUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TOBACCO_USE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateTobaccoUseEffectiveTime(TobaccoUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tobacco Use Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTobaccoUseEffectiveTime(TobaccoUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_TOBACCO_USE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param tobaccoUse The receiving '<em><b>Tobacco Use</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateTobaccoUseEffectiveTime(TobaccoUse tobaccoUse, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
		if (VALIDATE_TOBACCO_USE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TOBACCO_USE);
			try {
				VALIDATE_TOBACCO_USE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TOBACCO_USE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_TOBACCO_USE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(tobaccoUse)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.TOBACCO_USE__TOBACCO_USE_EFFECTIVE_TIME,
						 ConsolPlugin.INSTANCE.getString("TobaccoUseTobaccoUseEffectiveTime"),
						 new Object [] { tobaccoUse }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTobaccoUseStatusCode(TobaccoUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tobacco Use Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTobaccoUseStatusCode(TobaccoUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TOBACCO_USE_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and "+
"let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in "+
"value.code = 'completed')";

	/**
	 * The cached OCL invariant for the '{@link #validateTobaccoUseStatusCode(TobaccoUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tobacco Use Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTobaccoUseStatusCode(TobaccoUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_TOBACCO_USE_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param tobaccoUse The receiving '<em><b>Tobacco Use</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateTobaccoUseStatusCode(TobaccoUse tobaccoUse, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
		if (VALIDATE_TOBACCO_USE_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TOBACCO_USE);
			try {
				VALIDATE_TOBACCO_USE_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TOBACCO_USE_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_TOBACCO_USE_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(tobaccoUse)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.TOBACCO_USE__TOBACCO_USE_STATUS_CODE,
						 ConsolPlugin.INSTANCE.getString("TobaccoUseTobaccoUseStatusCode"),
						 new Object [] { tobaccoUse }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTobaccoUseStatusCodeP(TobaccoUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tobacco Use Status Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTobaccoUseStatusCodeP(TobaccoUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TOBACCO_USE_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateTobaccoUseStatusCodeP(TobaccoUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tobacco Use Status Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTobaccoUseStatusCodeP(TobaccoUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_TOBACCO_USE_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param tobaccoUse The receiving '<em><b>Tobacco Use</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateTobaccoUseStatusCodeP(TobaccoUse tobaccoUse, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
		if (VALIDATE_TOBACCO_USE_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TOBACCO_USE);
			try {
				VALIDATE_TOBACCO_USE_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TOBACCO_USE_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_TOBACCO_USE_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(tobaccoUse)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.TOBACCO_USE__TOBACCO_USE_STATUS_CODE_P,
						 ConsolPlugin.INSTANCE.getString("TobaccoUseTobaccoUseStatusCodeP"),
						 new Object [] { tobaccoUse }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTobaccoUseValue(TobaccoUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tobacco Use Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTobaccoUseValue(TobaccoUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TOBACCO_USE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = element.oclAsType(datatypes::CD) in "+
"value.codeSystem = '2.16.840.1.113883.6.96' and not value.code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateTobaccoUseValue(TobaccoUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tobacco Use Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTobaccoUseValue(TobaccoUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_TOBACCO_USE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param tobaccoUse The receiving '<em><b>Tobacco Use</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateTobaccoUseValue(TobaccoUse tobaccoUse, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
		if (VALIDATE_TOBACCO_USE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TOBACCO_USE);
			try {
				VALIDATE_TOBACCO_USE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TOBACCO_USE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_TOBACCO_USE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(tobaccoUse)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.TOBACCO_USE__TOBACCO_USE_VALUE,
						 ConsolPlugin.INSTANCE.getString("TobaccoUseTobaccoUseValue"),
						 new Object [] { tobaccoUse }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTobaccoUseValueP(TobaccoUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tobacco Use Value P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTobaccoUseValueP(TobaccoUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TOBACCO_USE_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::CD)))";

	/**
	 * The cached OCL invariant for the '{@link #validateTobaccoUseValueP(TobaccoUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tobacco Use Value P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTobaccoUseValueP(TobaccoUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_TOBACCO_USE_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param tobaccoUse The receiving '<em><b>Tobacco Use</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateTobaccoUseValueP(TobaccoUse tobaccoUse, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
		if (VALIDATE_TOBACCO_USE_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TOBACCO_USE);
			try {
				VALIDATE_TOBACCO_USE_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TOBACCO_USE_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_TOBACCO_USE_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(tobaccoUse)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.TOBACCO_USE__TOBACCO_USE_VALUE_P,
						 ConsolPlugin.INSTANCE.getString("TobaccoUseTobaccoUseValueP"),
						 new Object [] { tobaccoUse }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTobaccoUseCDCodeTermAssertionOrLoinc(TobaccoUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tobacco Use CD Code Term Assertion Or Loinc</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTobaccoUseCDCodeTermAssertionOrLoinc(TobaccoUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TOBACCO_USE_CD_CODE_TERM_ASSERTION_OR_LOINC__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.code->excluding(null)->select(isNullFlavorUndefined())->reject((code = 'ASSERTION' and codeSystem = '2.16.840.1.113883.5.4') or (code = '11367-0' and codeSystem = '2.16.840.1.113883.6.1'))";

	/**
	 * The cached OCL invariant for the '{@link #validateTobaccoUseCDCodeTermAssertionOrLoinc(TobaccoUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tobacco Use CD Code Term Assertion Or Loinc</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTobaccoUseCDCodeTermAssertionOrLoinc(TobaccoUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_TOBACCO_USE_CD_CODE_TERM_ASSERTION_OR_LOINC__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param tobaccoUse The receiving '<em><b>Tobacco Use</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateTobaccoUseCDCodeTermAssertionOrLoinc(TobaccoUse tobaccoUse,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_TOBACCO_USE_CD_CODE_TERM_ASSERTION_OR_LOINC__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TOBACCO_USE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_TOBACCO_USE_CD_CODE_TERM_ASSERTION_OR_LOINC__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_TOBACCO_USE_CD_CODE_TERM_ASSERTION_OR_LOINC__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_TOBACCO_USE_CD_CODE_TERM_ASSERTION_OR_LOINC__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(tobaccoUse);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.TOBACCO_USE__TOBACCO_USE_CD_CODE_TERM_ASSERTION_OR_LOINC,
						 ConsolPlugin.INSTANCE.getString("TobaccoUseTobaccoUseCDCodeTermAssertionOrLoinc"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTobaccoUseCDCode(TobaccoUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tobacco Use CD Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTobaccoUseCDCode(TobaccoUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TOBACCO_USE_CD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.code->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies (not code.oclIsUndefined() )))";

	/**
	 * The cached OCL invariant for the '{@link #validateTobaccoUseCDCode(TobaccoUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tobacco Use CD Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTobaccoUseCDCode(TobaccoUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_TOBACCO_USE_CD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param tobaccoUse The receiving '<em><b>Tobacco Use</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateTobaccoUseCDCode(TobaccoUse tobaccoUse, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
		if (VALIDATE_TOBACCO_USE_CD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TOBACCO_USE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_TOBACCO_USE_CD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_TOBACCO_USE_CD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_TOBACCO_USE_CD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(tobaccoUse);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.TOBACCO_USE__TOBACCO_USE_CD_CODE,
						 ConsolPlugin.INSTANCE.getString("TobaccoUseTobaccoUseCDCode"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTobaccoUseCDCodeSystem(TobaccoUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tobacco Use CD Code System</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTobaccoUseCDCodeSystem(TobaccoUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TOBACCO_USE_CD_CODE_SYSTEM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.code->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies (not codeSystem.oclIsUndefined() )))";

	/**
	 * The cached OCL invariant for the '{@link #validateTobaccoUseCDCodeSystem(TobaccoUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tobacco Use CD Code System</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTobaccoUseCDCodeSystem(TobaccoUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_TOBACCO_USE_CD_CODE_SYSTEM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param tobaccoUse The receiving '<em><b>Tobacco Use</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateTobaccoUseCDCodeSystem(TobaccoUse tobaccoUse, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
		if (VALIDATE_TOBACCO_USE_CD_CODE_SYSTEM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TOBACCO_USE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_TOBACCO_USE_CD_CODE_SYSTEM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_TOBACCO_USE_CD_CODE_SYSTEM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_TOBACCO_USE_CD_CODE_SYSTEM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(tobaccoUse);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.TOBACCO_USE__TOBACCO_USE_CD_CODE_SYSTEM,
						 ConsolPlugin.INSTANCE.getString("TobaccoUseTobaccoUseCDCodeSystem"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

} // TobaccoUseOperations
