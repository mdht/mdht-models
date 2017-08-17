/**
 */
package org.hl7.cbcc.privacy.consentdirective.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.mdht.uml.cda.operations.ClinicalStatementOperations;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.hl7.cbcc.privacy.consentdirective.CONSENTDIRECTIVEPackage;
import org.hl7.cbcc.privacy.consentdirective.ConsentAction;
import org.hl7.cbcc.privacy.consentdirective.util.CONSENTDIRECTIVEValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Consent Action</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.cbcc.privacy.consentdirective.ConsentAction#validateConsentActionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consent Action Template Id</em>}</li>
 *   <li>{@link org.hl7.cbcc.privacy.consentdirective.ConsentAction#validateConsentActionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consent Action Code P</em>}</li>
 *   <li>{@link org.hl7.cbcc.privacy.consentdirective.ConsentAction#validateConsentActionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consent Action Code</em>}</li>
 *   <li>{@link org.hl7.cbcc.privacy.consentdirective.ConsentAction#validateConsentActionMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consent Action Mood Code</em>}</li>
 *   <li>{@link org.hl7.cbcc.privacy.consentdirective.ConsentAction#validateConsentActionNegationInd(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consent Action Negation Ind</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConsentActionOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConsentActionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsentActionTemplateId(ConsentAction, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consent Action Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsentActionTemplateId(ConsentAction, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSENT_ACTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.3.445.8')";

	/**
	 * The cached OCL invariant for the '{@link #validateConsentActionTemplateId(ConsentAction, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consent Action Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsentActionTemplateId(ConsentAction, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_CONSENT_ACTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param consentAction The receiving '<em><b>Consent Action</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateConsentActionTemplateId(ConsentAction consentAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONSENT_ACTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CONSENTDIRECTIVEPackage.Literals.CONSENT_ACTION);
			try {
				VALIDATE_CONSENT_ACTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONSENT_ACTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONSENT_ACTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(consentAction)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CONSENTDIRECTIVEValidator.DIAGNOSTIC_SOURCE,
						 CONSENTDIRECTIVEValidator.CONSENT_ACTION__CONSENT_ACTION_TEMPLATE_ID,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateConsentActionTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(consentAction, context) }),
						 new Object [] { consentAction }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsentActionCodeP(ConsentAction, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consent Action Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsentActionCodeP(ConsentAction, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSENT_ACTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.code.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateConsentActionCodeP(ConsentAction, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consent Action Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsentActionCodeP(ConsentAction, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_CONSENT_ACTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param consentAction The receiving '<em><b>Consent Action</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateConsentActionCodeP(ConsentAction consentAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONSENT_ACTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CONSENTDIRECTIVEPackage.Literals.CONSENT_ACTION);
			try {
				VALIDATE_CONSENT_ACTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONSENT_ACTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONSENT_ACTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(consentAction)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CONSENTDIRECTIVEValidator.DIAGNOSTIC_SOURCE,
						 CONSENTDIRECTIVEValidator.CONSENT_ACTION__CONSENT_ACTION_CODE_P,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateConsentActionCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(consentAction, context) }),
						 new Object [] { consentAction }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsentActionCode(ConsentAction, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consent Action Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsentActionCode(ConsentAction, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSENT_ACTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.code = 'IDISCL' or value.code = 'ICOL' or value.code = 'INFASO' or value.code = 'IRDSCL' or value.code = 'RESEARCH' or value.code = 'RSREID' or value.code = 'INFAO'";

	/**
	 * The cached OCL invariant for the '{@link #validateConsentActionCode(ConsentAction, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consent Action Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsentActionCode(ConsentAction, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_CONSENT_ACTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param consentAction The receiving '<em><b>Consent Action</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateConsentActionCode(ConsentAction consentAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONSENT_ACTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CONSENTDIRECTIVEPackage.Literals.CONSENT_ACTION);
			try {
				VALIDATE_CONSENT_ACTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONSENT_ACTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONSENT_ACTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(consentAction)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CONSENTDIRECTIVEValidator.DIAGNOSTIC_SOURCE,
						 CONSENTDIRECTIVEValidator.CONSENT_ACTION__CONSENT_ACTION_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateConsentActionCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(consentAction, context) }),
						 new Object [] { consentAction }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsentActionMoodCode(ConsentAction, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consent Action Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsentActionMoodCode(ConsentAction, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSENT_ACTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateConsentActionMoodCode(ConsentAction, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consent Action Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsentActionMoodCode(ConsentAction, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_CONSENT_ACTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param consentAction The receiving '<em><b>Consent Action</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateConsentActionMoodCode(ConsentAction consentAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONSENT_ACTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CONSENTDIRECTIVEPackage.Literals.CONSENT_ACTION);
			try {
				VALIDATE_CONSENT_ACTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONSENT_ACTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONSENT_ACTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(consentAction)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CONSENTDIRECTIVEValidator.DIAGNOSTIC_SOURCE,
						 CONSENTDIRECTIVEValidator.CONSENT_ACTION__CONSENT_ACTION_MOOD_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateConsentActionMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(consentAction, context) }),
						 new Object [] { consentAction }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsentActionNegationInd(ConsentAction, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consent Action Negation Ind</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsentActionNegationInd(ConsentAction, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSENT_ACTION_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.negationInd.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateConsentActionNegationInd(ConsentAction, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consent Action Negation Ind</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsentActionNegationInd(ConsentAction, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_CONSENT_ACTION_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param consentAction The receiving '<em><b>Consent Action</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateConsentActionNegationInd(ConsentAction consentAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONSENT_ACTION_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CONSENTDIRECTIVEPackage.Literals.CONSENT_ACTION);
			try {
				VALIDATE_CONSENT_ACTION_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONSENT_ACTION_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONSENT_ACTION_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(consentAction)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CONSENTDIRECTIVEValidator.DIAGNOSTIC_SOURCE,
						 CONSENTDIRECTIVEValidator.CONSENT_ACTION__CONSENT_ACTION_NEGATION_IND,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateConsentActionNegationInd", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(consentAction, context) }),
						 new Object [] { consentAction }));
			}
			return false;
		}
		return true;
	}

} // ConsentActionOperations