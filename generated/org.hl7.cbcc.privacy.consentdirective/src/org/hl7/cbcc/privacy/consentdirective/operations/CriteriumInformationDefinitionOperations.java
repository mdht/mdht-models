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
import org.hl7.cbcc.privacy.consentdirective.CriteriumInformationDefinition;
import org.hl7.cbcc.privacy.consentdirective.util.CONSENTDIRECTIVEValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Criterium Information Definition</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.cbcc.privacy.consentdirective.CriteriumInformationDefinition#validateCriteriumInformationDefinitionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Criterium Information Definition Template Id</em>}</li>
 *   <li>{@link org.hl7.cbcc.privacy.consentdirective.CriteriumInformationDefinition#validateCriteriumInformationDefinitionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Criterium Information Definition Code P</em>}</li>
 *   <li>{@link org.hl7.cbcc.privacy.consentdirective.CriteriumInformationDefinition#validateCriteriumInformationDefinitionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Criterium Information Definition Code</em>}</li>
 *   <li>{@link org.hl7.cbcc.privacy.consentdirective.CriteriumInformationDefinition#validateCriteriumInformationDefinitionEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Criterium Information Definition Effective Time</em>}</li>
 *   <li>{@link org.hl7.cbcc.privacy.consentdirective.CriteriumInformationDefinition#validateCriteriumInformationDefinitionMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Criterium Information Definition Mood Code</em>}</li>
 *   <li>{@link org.hl7.cbcc.privacy.consentdirective.CriteriumInformationDefinition#validateCriteriumInformationDefinitionId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Criterium Information Definition Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CriteriumInformationDefinitionOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CriteriumInformationDefinitionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCriteriumInformationDefinitionTemplateId(CriteriumInformationDefinition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Criterium Information Definition Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCriteriumInformationDefinitionTemplateId(CriteriumInformationDefinition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CRITERIUM_INFORMATION_DEFINITION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.3.445.10')";

	/**
	 * The cached OCL invariant for the '{@link #validateCriteriumInformationDefinitionTemplateId(CriteriumInformationDefinition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Criterium Information Definition Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCriteriumInformationDefinitionTemplateId(CriteriumInformationDefinition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_CRITERIUM_INFORMATION_DEFINITION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param criteriumInformationDefinition The receiving '<em><b>Criterium Information Definition</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateCriteriumInformationDefinitionTemplateId(CriteriumInformationDefinition criteriumInformationDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CRITERIUM_INFORMATION_DEFINITION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CONSENTDIRECTIVEPackage.Literals.CRITERIUM_INFORMATION_DEFINITION);
			try {
				VALIDATE_CRITERIUM_INFORMATION_DEFINITION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CRITERIUM_INFORMATION_DEFINITION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CRITERIUM_INFORMATION_DEFINITION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(criteriumInformationDefinition)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CONSENTDIRECTIVEValidator.DIAGNOSTIC_SOURCE,
						 CONSENTDIRECTIVEValidator.CRITERIUM_INFORMATION_DEFINITION__CRITERIUM_INFORMATION_DEFINITION_TEMPLATE_ID,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateCriteriumInformationDefinitionTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(criteriumInformationDefinition, context) }),
						 new Object [] { criteriumInformationDefinition }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCriteriumInformationDefinitionCodeP(CriteriumInformationDefinition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Criterium Information Definition Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCriteriumInformationDefinitionCodeP(CriteriumInformationDefinition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CRITERIUM_INFORMATION_DEFINITION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateCriteriumInformationDefinitionCodeP(CriteriumInformationDefinition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Criterium Information Definition Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCriteriumInformationDefinitionCodeP(CriteriumInformationDefinition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_CRITERIUM_INFORMATION_DEFINITION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param criteriumInformationDefinition The receiving '<em><b>Criterium Information Definition</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateCriteriumInformationDefinitionCodeP(CriteriumInformationDefinition criteriumInformationDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CRITERIUM_INFORMATION_DEFINITION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CONSENTDIRECTIVEPackage.Literals.CRITERIUM_INFORMATION_DEFINITION);
			try {
				VALIDATE_CRITERIUM_INFORMATION_DEFINITION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CRITERIUM_INFORMATION_DEFINITION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CRITERIUM_INFORMATION_DEFINITION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(criteriumInformationDefinition)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CONSENTDIRECTIVEValidator.DIAGNOSTIC_SOURCE,
						 CONSENTDIRECTIVEValidator.CRITERIUM_INFORMATION_DEFINITION__CRITERIUM_INFORMATION_DEFINITION_CODE_P,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateCriteriumInformationDefinitionCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(criteriumInformationDefinition, context) }),
						 new Object [] { criteriumInformationDefinition }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCriteriumInformationDefinitionCode(CriteriumInformationDefinition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Criterium Information Definition Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCriteriumInformationDefinitionCode(CriteriumInformationDefinition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CRITERIUM_INFORMATION_DEFINITION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateCriteriumInformationDefinitionCode(CriteriumInformationDefinition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Criterium Information Definition Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCriteriumInformationDefinitionCode(CriteriumInformationDefinition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_CRITERIUM_INFORMATION_DEFINITION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param criteriumInformationDefinition The receiving '<em><b>Criterium Information Definition</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateCriteriumInformationDefinitionCode(CriteriumInformationDefinition criteriumInformationDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CRITERIUM_INFORMATION_DEFINITION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CONSENTDIRECTIVEPackage.Literals.CRITERIUM_INFORMATION_DEFINITION);
			try {
				VALIDATE_CRITERIUM_INFORMATION_DEFINITION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CRITERIUM_INFORMATION_DEFINITION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CRITERIUM_INFORMATION_DEFINITION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(criteriumInformationDefinition)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CONSENTDIRECTIVEValidator.DIAGNOSTIC_SOURCE,
						 CONSENTDIRECTIVEValidator.CRITERIUM_INFORMATION_DEFINITION__CRITERIUM_INFORMATION_DEFINITION_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateCriteriumInformationDefinitionCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(criteriumInformationDefinition, context) }),
						 new Object [] { criteriumInformationDefinition }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCriteriumInformationDefinitionEffectiveTime(CriteriumInformationDefinition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Criterium Information Definition Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCriteriumInformationDefinitionEffectiveTime(CriteriumInformationDefinition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CRITERIUM_INFORMATION_DEFINITION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateCriteriumInformationDefinitionEffectiveTime(CriteriumInformationDefinition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Criterium Information Definition Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCriteriumInformationDefinitionEffectiveTime(CriteriumInformationDefinition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_CRITERIUM_INFORMATION_DEFINITION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param criteriumInformationDefinition The receiving '<em><b>Criterium Information Definition</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateCriteriumInformationDefinitionEffectiveTime(CriteriumInformationDefinition criteriumInformationDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CRITERIUM_INFORMATION_DEFINITION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CONSENTDIRECTIVEPackage.Literals.CRITERIUM_INFORMATION_DEFINITION);
			try {
				VALIDATE_CRITERIUM_INFORMATION_DEFINITION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CRITERIUM_INFORMATION_DEFINITION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CRITERIUM_INFORMATION_DEFINITION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(criteriumInformationDefinition)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CONSENTDIRECTIVEValidator.DIAGNOSTIC_SOURCE,
						 CONSENTDIRECTIVEValidator.CRITERIUM_INFORMATION_DEFINITION__CRITERIUM_INFORMATION_DEFINITION_EFFECTIVE_TIME,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateCriteriumInformationDefinitionEffectiveTime", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(criteriumInformationDefinition, context) }),
						 new Object [] { criteriumInformationDefinition }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCriteriumInformationDefinitionMoodCode(CriteriumInformationDefinition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Criterium Information Definition Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCriteriumInformationDefinitionMoodCode(CriteriumInformationDefinition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CRITERIUM_INFORMATION_DEFINITION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateCriteriumInformationDefinitionMoodCode(CriteriumInformationDefinition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Criterium Information Definition Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCriteriumInformationDefinitionMoodCode(CriteriumInformationDefinition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_CRITERIUM_INFORMATION_DEFINITION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param criteriumInformationDefinition The receiving '<em><b>Criterium Information Definition</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateCriteriumInformationDefinitionMoodCode(CriteriumInformationDefinition criteriumInformationDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CRITERIUM_INFORMATION_DEFINITION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CONSENTDIRECTIVEPackage.Literals.CRITERIUM_INFORMATION_DEFINITION);
			try {
				VALIDATE_CRITERIUM_INFORMATION_DEFINITION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CRITERIUM_INFORMATION_DEFINITION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CRITERIUM_INFORMATION_DEFINITION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(criteriumInformationDefinition)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CONSENTDIRECTIVEValidator.DIAGNOSTIC_SOURCE,
						 CONSENTDIRECTIVEValidator.CRITERIUM_INFORMATION_DEFINITION__CRITERIUM_INFORMATION_DEFINITION_MOOD_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateCriteriumInformationDefinitionMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(criteriumInformationDefinition, context) }),
						 new Object [] { criteriumInformationDefinition }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCriteriumInformationDefinitionId(CriteriumInformationDefinition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Criterium Information Definition Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCriteriumInformationDefinitionId(CriteriumInformationDefinition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CRITERIUM_INFORMATION_DEFINITION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateCriteriumInformationDefinitionId(CriteriumInformationDefinition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Criterium Information Definition Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCriteriumInformationDefinitionId(CriteriumInformationDefinition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_CRITERIUM_INFORMATION_DEFINITION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param criteriumInformationDefinition The receiving '<em><b>Criterium Information Definition</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateCriteriumInformationDefinitionId(CriteriumInformationDefinition criteriumInformationDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CRITERIUM_INFORMATION_DEFINITION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CONSENTDIRECTIVEPackage.Literals.CRITERIUM_INFORMATION_DEFINITION);
			try {
				VALIDATE_CRITERIUM_INFORMATION_DEFINITION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CRITERIUM_INFORMATION_DEFINITION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CRITERIUM_INFORMATION_DEFINITION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(criteriumInformationDefinition)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CONSENTDIRECTIVEValidator.DIAGNOSTIC_SOURCE,
						 CONSENTDIRECTIVEValidator.CRITERIUM_INFORMATION_DEFINITION__CRITERIUM_INFORMATION_DEFINITION_ID,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateCriteriumInformationDefinitionId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(criteriumInformationDefinition, context) }),
						 new Object [] { criteriumInformationDefinition }));
			}
			return false;
		}
		return true;
	}

} // CriteriumInformationDefinitionOperations