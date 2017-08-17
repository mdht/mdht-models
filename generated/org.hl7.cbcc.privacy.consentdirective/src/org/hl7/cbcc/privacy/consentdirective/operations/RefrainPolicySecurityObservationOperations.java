/**
 */
package org.hl7.cbcc.privacy.consentdirective.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.hl7.cbcc.privacy.consentdirective.CONSENTDIRECTIVEPackage;
import org.hl7.cbcc.privacy.consentdirective.RefrainPolicySecurityObservation;
import org.hl7.cbcc.privacy.consentdirective.util.CONSENTDIRECTIVEValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Refrain Policy Security Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.cbcc.privacy.consentdirective.RefrainPolicySecurityObservation#validateSecurityObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Security Observation Template Id</em>}</li>
 *   <li>{@link org.hl7.cbcc.privacy.consentdirective.RefrainPolicySecurityObservation#validateSecurityObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Security Observation Code P</em>}</li>
 *   <li>{@link org.hl7.cbcc.privacy.consentdirective.RefrainPolicySecurityObservation#validateSecurityObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Security Observation Code</em>}</li>
 *   <li>{@link org.hl7.cbcc.privacy.consentdirective.RefrainPolicySecurityObservation#validateSecurityObservationValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Security Observation Value P</em>}</li>
 *   <li>{@link org.hl7.cbcc.privacy.consentdirective.RefrainPolicySecurityObservation#validateSecurityObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Security Observation Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RefrainPolicySecurityObservationOperations extends SecurityObservationOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RefrainPolicySecurityObservationOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSecurityObservationTemplateId(RefrainPolicySecurityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Security Observation Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSecurityObservationTemplateId(RefrainPolicySecurityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SECURITY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.3.445.23')";

	/**
	 * The cached OCL invariant for the '{@link #validateSecurityObservationTemplateId(RefrainPolicySecurityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Security Observation Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSecurityObservationTemplateId(RefrainPolicySecurityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_SECURITY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param refrainPolicySecurityObservation The receiving '<em><b>Refrain Policy Security Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateSecurityObservationTemplateId(RefrainPolicySecurityObservation refrainPolicySecurityObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_SECURITY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CONSENTDIRECTIVEPackage.Literals.REFRAIN_POLICY_SECURITY_OBSERVATION);
			try {
				VALIDATE_SECURITY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SECURITY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SECURITY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(refrainPolicySecurityObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CONSENTDIRECTIVEValidator.DIAGNOSTIC_SOURCE,
						 CONSENTDIRECTIVEValidator.REFRAIN_POLICY_SECURITY_OBSERVATION__SECURITY_OBSERVATION_TEMPLATE_ID,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateSecurityObservationTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(refrainPolicySecurityObservation, context) }),
						 new Object [] { refrainPolicySecurityObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSecurityObservationCodeP(RefrainPolicySecurityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Security Observation Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSecurityObservationCodeP(RefrainPolicySecurityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SECURITY_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.code.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateSecurityObservationCodeP(RefrainPolicySecurityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Security Observation Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSecurityObservationCodeP(RefrainPolicySecurityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_SECURITY_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param refrainPolicySecurityObservation The receiving '<em><b>Refrain Policy Security Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateSecurityObservationCodeP(RefrainPolicySecurityObservation refrainPolicySecurityObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_SECURITY_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CONSENTDIRECTIVEPackage.Literals.REFRAIN_POLICY_SECURITY_OBSERVATION);
			try {
				VALIDATE_SECURITY_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SECURITY_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SECURITY_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(refrainPolicySecurityObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CONSENTDIRECTIVEValidator.DIAGNOSTIC_SOURCE,
						 CONSENTDIRECTIVEValidator.REFRAIN_POLICY_SECURITY_OBSERVATION__SECURITY_OBSERVATION_CODE_P,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateSecurityObservationCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(refrainPolicySecurityObservation, context) }),
						 new Object [] { refrainPolicySecurityObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSecurityObservationCode(RefrainPolicySecurityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Security Observation Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSecurityObservationCode(RefrainPolicySecurityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SECURITY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.code = 'SECCONOBS' and value.codeSystem = '2.16.840.1.113883.1.11.20471'";

	/**
	 * The cached OCL invariant for the '{@link #validateSecurityObservationCode(RefrainPolicySecurityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Security Observation Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSecurityObservationCode(RefrainPolicySecurityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_SECURITY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param refrainPolicySecurityObservation The receiving '<em><b>Refrain Policy Security Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateSecurityObservationCode(RefrainPolicySecurityObservation refrainPolicySecurityObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_SECURITY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CONSENTDIRECTIVEPackage.Literals.REFRAIN_POLICY_SECURITY_OBSERVATION);
			try {
				VALIDATE_SECURITY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SECURITY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SECURITY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(refrainPolicySecurityObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CONSENTDIRECTIVEValidator.DIAGNOSTIC_SOURCE,
						 CONSENTDIRECTIVEValidator.REFRAIN_POLICY_SECURITY_OBSERVATION__SECURITY_OBSERVATION_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateSecurityObservationCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(refrainPolicySecurityObservation, context) }),
						 new Object [] { refrainPolicySecurityObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSecurityObservationValueP(RefrainPolicySecurityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Security Observation Value P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSecurityObservationValueP(RefrainPolicySecurityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SECURITY_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.value->isEmpty()";

	/**
	 * The cached OCL invariant for the '{@link #validateSecurityObservationValueP(RefrainPolicySecurityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Security Observation Value P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSecurityObservationValueP(RefrainPolicySecurityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_SECURITY_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param refrainPolicySecurityObservation The receiving '<em><b>Refrain Policy Security Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateSecurityObservationValueP(RefrainPolicySecurityObservation refrainPolicySecurityObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_SECURITY_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CONSENTDIRECTIVEPackage.Literals.REFRAIN_POLICY_SECURITY_OBSERVATION);
			try {
				VALIDATE_SECURITY_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SECURITY_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SECURITY_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(refrainPolicySecurityObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CONSENTDIRECTIVEValidator.DIAGNOSTIC_SOURCE,
						 CONSENTDIRECTIVEValidator.REFRAIN_POLICY_SECURITY_OBSERVATION__SECURITY_OBSERVATION_VALUE_P,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateSecurityObservationValueP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(refrainPolicySecurityObservation, context) }),
						 new Object [] { refrainPolicySecurityObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSecurityObservationValue(RefrainPolicySecurityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Security Observation Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSecurityObservationValue(RefrainPolicySecurityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SECURITY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = element.oclAsType(datatypes::CE) in "+
"value.codeSystem = '2.16.840.1.113883.1.11.20471' and (value.code = 'NORDSCLCD' or value.code = 'NOMOU'))";

	/**
	 * The cached OCL invariant for the '{@link #validateSecurityObservationValue(RefrainPolicySecurityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Security Observation Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSecurityObservationValue(RefrainPolicySecurityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_SECURITY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param refrainPolicySecurityObservation The receiving '<em><b>Refrain Policy Security Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateSecurityObservationValue(RefrainPolicySecurityObservation refrainPolicySecurityObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_SECURITY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CONSENTDIRECTIVEPackage.Literals.REFRAIN_POLICY_SECURITY_OBSERVATION);
			try {
				VALIDATE_SECURITY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SECURITY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SECURITY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(refrainPolicySecurityObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CONSENTDIRECTIVEValidator.DIAGNOSTIC_SOURCE,
						 CONSENTDIRECTIVEValidator.REFRAIN_POLICY_SECURITY_OBSERVATION__SECURITY_OBSERVATION_VALUE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateSecurityObservationValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(refrainPolicySecurityObservation, context) }),
						 new Object [] { refrainPolicySecurityObservation }));
			}
			return false;
		}
		return true;
	}

} // RefrainPolicySecurityObservationOperations