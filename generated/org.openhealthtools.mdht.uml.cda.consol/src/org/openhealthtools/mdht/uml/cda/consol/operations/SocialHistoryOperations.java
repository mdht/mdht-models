/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClassifier;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.eclipse.ocl.expressions.OCLExpression;

import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.EpisodeObservation;
import org.openhealthtools.mdht.uml.cda.consol.SocialHistory;
import org.openhealthtools.mdht.uml.cda.consol.SocialHistoryStatusObservation;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Social History</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SocialHistory#validateSocialHistoryCodeValueSet(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Code Value Set</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SocialHistory#validateSocialHistoryNoRepeatNumber(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History No Repeat Number</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SocialHistory#validateSocialHistoryNoInterpretationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History No Interpretation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SocialHistory#validateSocialHistoryNoMethodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History No Method Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SocialHistory#validateSocialHistoryNoTargetSiteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History No Target Site Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SocialHistory#validateSocialHistoryTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SocialHistory#validateSocialHistoryId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SocialHistory#validateSocialHistoryCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SocialHistory#validateSocialHistoryText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SocialHistory#validateSocialHistoryStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SocialHistory#validateSocialHistoryEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SocialHistory#validateSocialHistoryValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SocialHistory#validateSocialHistorySocialHistoryStatusObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Social History Status Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SocialHistory#validateSocialHistoryEpisodeObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Episode Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SocialHistory#getSocialHistoryStatusObservation() <em>Get Social History Status Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SocialHistory#getEpisodeObservation() <em>Get Episode Observation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SocialHistoryOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SocialHistoryOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSocialHistoryCodeValueSet(SocialHistory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Code Value Set</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSocialHistoryCodeValueSet(SocialHistory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SOCIAL_HISTORY_CODE_VALUE_SET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.code.codeSystem = '2.16.840.1.113883.6.1' or self.code.codeSystem = '2.16.840.1.113883.6.96' or self.code.codeSystem = '2.16.840.1.113883.1.11.20.18'";

	/**
	 * The cached OCL invariant for the '{@link #validateSocialHistoryCodeValueSet(SocialHistory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Code Value Set</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSocialHistoryCodeValueSet(SocialHistory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_SOCIAL_HISTORY_CODE_VALUE_SET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.code.codeSystem = '2.16.840.1.113883.6.1' or self.code.codeSystem = '2.16.840.1.113883.6.96' or self.code.codeSystem = '2.16.840.1.113883.1.11.20.18'
	 * @param socialHistory The receiving '<em><b>Social History</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateSocialHistoryCodeValueSet(SocialHistory socialHistory, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_SOCIAL_HISTORY_CODE_VALUE_SET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SOCIAL_HISTORY);
			try {
				VALIDATE_SOCIAL_HISTORY_CODE_VALUE_SET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SOCIAL_HISTORY_CODE_VALUE_SET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SOCIAL_HISTORY_CODE_VALUE_SET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(socialHistory)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.SOCIAL_HISTORY__SOCIAL_HISTORY_CODE_VALUE_SET,
						 ConsolPlugin.INSTANCE.getString("SocialHistoryCodeValueSet"),
						 new Object [] { socialHistory }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSocialHistoryNoRepeatNumber(SocialHistory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History No Repeat Number</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSocialHistoryNoRepeatNumber(SocialHistory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SOCIAL_HISTORY_NO_REPEAT_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.repeatNumber->size() = 0";

	/**
	 * The cached OCL invariant for the '{@link #validateSocialHistoryNoRepeatNumber(SocialHistory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History No Repeat Number</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSocialHistoryNoRepeatNumber(SocialHistory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_SOCIAL_HISTORY_NO_REPEAT_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.repeatNumber->size() = 0
	 * @param socialHistory The receiving '<em><b>Social History</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateSocialHistoryNoRepeatNumber(SocialHistory socialHistory, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_SOCIAL_HISTORY_NO_REPEAT_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SOCIAL_HISTORY);
			try {
				VALIDATE_SOCIAL_HISTORY_NO_REPEAT_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SOCIAL_HISTORY_NO_REPEAT_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SOCIAL_HISTORY_NO_REPEAT_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(socialHistory)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.SOCIAL_HISTORY__SOCIAL_HISTORY_NO_REPEAT_NUMBER,
						 ConsolPlugin.INSTANCE.getString("SocialHistoryNoRepeatNumber"),
						 new Object [] { socialHistory }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSocialHistoryNoInterpretationCode(SocialHistory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History No Interpretation Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSocialHistoryNoInterpretationCode(SocialHistory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SOCIAL_HISTORY_NO_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.interpretationCode->size() = 0";

	/**
	 * The cached OCL invariant for the '{@link #validateSocialHistoryNoInterpretationCode(SocialHistory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History No Interpretation Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSocialHistoryNoInterpretationCode(SocialHistory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_SOCIAL_HISTORY_NO_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.interpretationCode->size() = 0
	 * @param socialHistory The receiving '<em><b>Social History</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateSocialHistoryNoInterpretationCode(SocialHistory socialHistory, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_SOCIAL_HISTORY_NO_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SOCIAL_HISTORY);
			try {
				VALIDATE_SOCIAL_HISTORY_NO_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SOCIAL_HISTORY_NO_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SOCIAL_HISTORY_NO_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(socialHistory)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.SOCIAL_HISTORY__SOCIAL_HISTORY_NO_INTERPRETATION_CODE,
						 ConsolPlugin.INSTANCE.getString("SocialHistoryNoInterpretationCode"),
						 new Object [] { socialHistory }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSocialHistoryNoMethodCode(SocialHistory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History No Method Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSocialHistoryNoMethodCode(SocialHistory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SOCIAL_HISTORY_NO_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.methodCode->size() = 0";

	/**
	 * The cached OCL invariant for the '{@link #validateSocialHistoryNoMethodCode(SocialHistory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History No Method Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSocialHistoryNoMethodCode(SocialHistory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_SOCIAL_HISTORY_NO_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.methodCode->size() = 0
	 * @param socialHistory The receiving '<em><b>Social History</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateSocialHistoryNoMethodCode(SocialHistory socialHistory, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_SOCIAL_HISTORY_NO_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SOCIAL_HISTORY);
			try {
				VALIDATE_SOCIAL_HISTORY_NO_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SOCIAL_HISTORY_NO_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SOCIAL_HISTORY_NO_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(socialHistory)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.SOCIAL_HISTORY__SOCIAL_HISTORY_NO_METHOD_CODE,
						 ConsolPlugin.INSTANCE.getString("SocialHistoryNoMethodCode"),
						 new Object [] { socialHistory }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSocialHistoryNoTargetSiteCode(SocialHistory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History No Target Site Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSocialHistoryNoTargetSiteCode(SocialHistory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SOCIAL_HISTORY_NO_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.targetSiteCode->size() = 0";

	/**
	 * The cached OCL invariant for the '{@link #validateSocialHistoryNoTargetSiteCode(SocialHistory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History No Target Site Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSocialHistoryNoTargetSiteCode(SocialHistory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_SOCIAL_HISTORY_NO_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.targetSiteCode->size() = 0
	 * @param socialHistory The receiving '<em><b>Social History</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateSocialHistoryNoTargetSiteCode(SocialHistory socialHistory, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_SOCIAL_HISTORY_NO_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SOCIAL_HISTORY);
			try {
				VALIDATE_SOCIAL_HISTORY_NO_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SOCIAL_HISTORY_NO_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SOCIAL_HISTORY_NO_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(socialHistory)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.SOCIAL_HISTORY__SOCIAL_HISTORY_NO_TARGET_SITE_CODE,
						 ConsolPlugin.INSTANCE.getString("SocialHistoryNoTargetSiteCode"),
						 new Object [] { socialHistory }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSocialHistoryTemplateId(SocialHistory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSocialHistoryTemplateId(SocialHistory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SOCIAL_HISTORY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.1.33')";

	/**
	 * The cached OCL invariant for the '{@link #validateSocialHistoryTemplateId(SocialHistory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSocialHistoryTemplateId(SocialHistory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_SOCIAL_HISTORY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.1.33')
	 * @param socialHistory The receiving '<em><b>Social History</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateSocialHistoryTemplateId(SocialHistory socialHistory, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_SOCIAL_HISTORY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SOCIAL_HISTORY);
			try {
				VALIDATE_SOCIAL_HISTORY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SOCIAL_HISTORY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SOCIAL_HISTORY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(socialHistory)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.SOCIAL_HISTORY__SOCIAL_HISTORY_TEMPLATE_ID,
						 ConsolPlugin.INSTANCE.getString("SocialHistoryTemplateId"),
						 new Object [] { socialHistory }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSocialHistoryId(SocialHistory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSocialHistoryId(SocialHistory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SOCIAL_HISTORY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateSocialHistoryId(SocialHistory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSocialHistoryId(SocialHistory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_SOCIAL_HISTORY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())
	 * @param socialHistory The receiving '<em><b>Social History</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateSocialHistoryId(SocialHistory socialHistory, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_SOCIAL_HISTORY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SOCIAL_HISTORY);
			try {
				VALIDATE_SOCIAL_HISTORY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SOCIAL_HISTORY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SOCIAL_HISTORY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(socialHistory)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.SOCIAL_HISTORY__SOCIAL_HISTORY_ID,
						 ConsolPlugin.INSTANCE.getString("SocialHistoryId"),
						 new Object [] { socialHistory }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSocialHistoryCode(SocialHistory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSocialHistoryCode(SocialHistory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SOCIAL_HISTORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in ("+
"value.codeSystem = '2.16.840.1.113883.6.96' and (value.code = '160573003' or value.code = '363908000' or value.code = '364703007' or value.code = '256235009' or value.code = '228272008' or value.code = '364393001' or value.code = '229819007' or value.code = '425400000')))";

	/**
	 * The cached OCL invariant for the '{@link #validateSocialHistoryCode(SocialHistory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSocialHistoryCode(SocialHistory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_SOCIAL_HISTORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (self.code.oclIsKindOf(datatypes::CD) and 
	 * let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in (
	 * value.codeSystem = '2.16.840.1.113883.6.96' and (value.code = '160573003' or value.code = '363908000' or value.code = '364703007' or value.code = '256235009' or value.code = '228272008' or value.code = '364393001' or value.code = '229819007' or value.code = '425400000')))
	 * @param socialHistory The receiving '<em><b>Social History</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateSocialHistoryCode(SocialHistory socialHistory, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_SOCIAL_HISTORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SOCIAL_HISTORY);
			try {
				VALIDATE_SOCIAL_HISTORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SOCIAL_HISTORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SOCIAL_HISTORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(socialHistory)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.SOCIAL_HISTORY__SOCIAL_HISTORY_CODE,
						 ConsolPlugin.INSTANCE.getString("SocialHistoryCode"),
						 new Object [] { socialHistory }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSocialHistoryText(SocialHistory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSocialHistoryText(SocialHistory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SOCIAL_HISTORY_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.text.oclIsUndefined() or self.text.isNullFlavorUndefined()) implies (not self.text.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateSocialHistoryText(SocialHistory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSocialHistoryText(SocialHistory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_SOCIAL_HISTORY_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.text.oclIsUndefined() or self.text.isNullFlavorUndefined()) implies (not self.text.oclIsUndefined())
	 * @param socialHistory The receiving '<em><b>Social History</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateSocialHistoryText(SocialHistory socialHistory, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_SOCIAL_HISTORY_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SOCIAL_HISTORY);
			try {
				VALIDATE_SOCIAL_HISTORY_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SOCIAL_HISTORY_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SOCIAL_HISTORY_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(socialHistory)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.SOCIAL_HISTORY__SOCIAL_HISTORY_TEXT,
						 ConsolPlugin.INSTANCE.getString("SocialHistoryText"),
						 new Object [] { socialHistory }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSocialHistoryStatusCode(SocialHistory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSocialHistoryStatusCode(SocialHistory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SOCIAL_HISTORY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and "+
"let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in ("+
"value.code = 'completed'))";

	/**
	 * The cached OCL invariant for the '{@link #validateSocialHistoryStatusCode(SocialHistory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSocialHistoryStatusCode(SocialHistory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_SOCIAL_HISTORY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and 
	 * let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in (
	 * value.code = 'completed'))
	 * @param socialHistory The receiving '<em><b>Social History</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateSocialHistoryStatusCode(SocialHistory socialHistory, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_SOCIAL_HISTORY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SOCIAL_HISTORY);
			try {
				VALIDATE_SOCIAL_HISTORY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SOCIAL_HISTORY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SOCIAL_HISTORY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(socialHistory)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.SOCIAL_HISTORY__SOCIAL_HISTORY_STATUS_CODE,
						 ConsolPlugin.INSTANCE.getString("SocialHistoryStatusCode"),
						 new Object [] { socialHistory }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSocialHistoryEffectiveTime(SocialHistory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSocialHistoryEffectiveTime(SocialHistory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SOCIAL_HISTORY_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateSocialHistoryEffectiveTime(SocialHistory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSocialHistoryEffectiveTime(SocialHistory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_SOCIAL_HISTORY_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())
	 * @param socialHistory The receiving '<em><b>Social History</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateSocialHistoryEffectiveTime(SocialHistory socialHistory, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_SOCIAL_HISTORY_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SOCIAL_HISTORY);
			try {
				VALIDATE_SOCIAL_HISTORY_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SOCIAL_HISTORY_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SOCIAL_HISTORY_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(socialHistory)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.SOCIAL_HISTORY__SOCIAL_HISTORY_EFFECTIVE_TIME,
						 ConsolPlugin.INSTANCE.getString("SocialHistoryEffectiveTime"),
						 new Object [] { socialHistory }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSocialHistoryValue(SocialHistory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSocialHistoryValue(SocialHistory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SOCIAL_HISTORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (not self.value->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateSocialHistoryValue(SocialHistory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSocialHistoryValue(SocialHistory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_SOCIAL_HISTORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (not self.value->isEmpty())
	 * @param socialHistory The receiving '<em><b>Social History</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateSocialHistoryValue(SocialHistory socialHistory, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_SOCIAL_HISTORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SOCIAL_HISTORY);
			try {
				VALIDATE_SOCIAL_HISTORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SOCIAL_HISTORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SOCIAL_HISTORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(socialHistory)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.SOCIAL_HISTORY__SOCIAL_HISTORY_VALUE,
						 ConsolPlugin.INSTANCE.getString("SocialHistoryValue"),
						 new Object [] { socialHistory }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSocialHistorySocialHistoryStatusObservation(SocialHistory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Social History Status Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSocialHistorySocialHistoryStatusObservation(SocialHistory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SOCIAL_HISTORY_SOCIAL_HISTORY_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::SocialHistoryStatusObservation))";

	/**
	 * The cached OCL invariant for the '{@link #validateSocialHistorySocialHistoryStatusObservation(SocialHistory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Social History Status Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSocialHistorySocialHistoryStatusObservation(SocialHistory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_SOCIAL_HISTORY_SOCIAL_HISTORY_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::SocialHistoryStatusObservation))
	 * @param socialHistory The receiving '<em><b>Social History</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateSocialHistorySocialHistoryStatusObservation(SocialHistory socialHistory, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_SOCIAL_HISTORY_SOCIAL_HISTORY_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SOCIAL_HISTORY);
			try {
				VALIDATE_SOCIAL_HISTORY_SOCIAL_HISTORY_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SOCIAL_HISTORY_SOCIAL_HISTORY_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SOCIAL_HISTORY_SOCIAL_HISTORY_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(socialHistory)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.SOCIAL_HISTORY__SOCIAL_HISTORY_SOCIAL_HISTORY_STATUS_OBSERVATION,
						 ConsolPlugin.INSTANCE.getString("SocialHistorySocialHistoryStatusObservation"),
						 new Object [] { socialHistory }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSocialHistoryEpisodeObservation(SocialHistory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Episode Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSocialHistoryEpisodeObservation(SocialHistory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SOCIAL_HISTORY_EPISODE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::EpisodeObservation))";

	/**
	 * The cached OCL invariant for the '{@link #validateSocialHistoryEpisodeObservation(SocialHistory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Episode Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSocialHistoryEpisodeObservation(SocialHistory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_SOCIAL_HISTORY_EPISODE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::EpisodeObservation))
	 * @param socialHistory The receiving '<em><b>Social History</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateSocialHistoryEpisodeObservation(SocialHistory socialHistory, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_SOCIAL_HISTORY_EPISODE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SOCIAL_HISTORY);
			try {
				VALIDATE_SOCIAL_HISTORY_EPISODE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SOCIAL_HISTORY_EPISODE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SOCIAL_HISTORY_EPISODE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(socialHistory)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.SOCIAL_HISTORY__SOCIAL_HISTORY_EPISODE_OBSERVATION,
						 ConsolPlugin.INSTANCE.getString("SocialHistoryEpisodeObservation"),
						 new Object [] { socialHistory }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getSocialHistoryStatusObservation(SocialHistory) <em>Get Social History Status Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSocialHistoryStatusObservation(SocialHistory)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_SOCIAL_HISTORY_STATUS_OBSERVATION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::SocialHistoryStatusObservation))->asSequence()->first().oclAsType(consol::SocialHistoryStatusObservation)";

	/**
	 * The cached OCL query for the '{@link #getSocialHistoryStatusObservation(SocialHistory) <em>Get Social History Status Observation</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSocialHistoryStatusObservation(SocialHistory)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_SOCIAL_HISTORY_STATUS_OBSERVATION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::SocialHistoryStatusObservation))->asSequence()->first().oclAsType(consol::SocialHistoryStatusObservation)
	 * @param socialHistory The receiving '<em><b>Social History</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  SocialHistoryStatusObservation getSocialHistoryStatusObservation(SocialHistory socialHistory) {
		if (GET_SOCIAL_HISTORY_STATUS_OBSERVATION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ConsolPackage.Literals.SOCIAL_HISTORY, ConsolPackage.Literals.SOCIAL_HISTORY.getEAllOperations().get(63));
			try {
				GET_SOCIAL_HISTORY_STATUS_OBSERVATION__EOCL_QRY = helper.createQuery(GET_SOCIAL_HISTORY_STATUS_OBSERVATION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_SOCIAL_HISTORY_STATUS_OBSERVATION__EOCL_QRY);
		return (SocialHistoryStatusObservation) query.evaluate(socialHistory);
	}

	/**
	 * The cached OCL expression body for the '{@link #getEpisodeObservation(SocialHistory) <em>Get Episode Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEpisodeObservation(SocialHistory)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_EPISODE_OBSERVATION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::EpisodeObservation))->asSequence()->first().oclAsType(consol::EpisodeObservation)";

	/**
	 * The cached OCL query for the '{@link #getEpisodeObservation(SocialHistory) <em>Get Episode Observation</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEpisodeObservation(SocialHistory)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_EPISODE_OBSERVATION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::EpisodeObservation))->asSequence()->first().oclAsType(consol::EpisodeObservation)
	 * @param socialHistory The receiving '<em><b>Social History</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  EpisodeObservation getEpisodeObservation(SocialHistory socialHistory) {
		if (GET_EPISODE_OBSERVATION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ConsolPackage.Literals.SOCIAL_HISTORY, ConsolPackage.Literals.SOCIAL_HISTORY.getEAllOperations().get(64));
			try {
				GET_EPISODE_OBSERVATION__EOCL_QRY = helper.createQuery(GET_EPISODE_OBSERVATION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_EPISODE_OBSERVATION__EOCL_QRY);
		return (EpisodeObservation) query.evaluate(socialHistory);
	}

} // SocialHistoryOperations