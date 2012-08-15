/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.phcr.flu.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

import org.openhealthtools.mdht.uml.cda.phcr.flu.FluPlugin;
import org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaEmploymentStatusObservation;
import org.openhealthtools.mdht.uml.cda.phcr.flu.fluPackage;

import org.openhealthtools.mdht.uml.cda.phcr.flu.util.fluValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Influenza Employment Status Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaEmploymentStatusObservation#validateInfluenzaEmploymentStatusObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Influenza Employment Status Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaEmploymentStatusObservation#validateInfluenzaEmploymentStatusObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Influenza Employment Status Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaEmploymentStatusObservation#validateInfluenzaEmploymentStatusObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Influenza Employment Status Observation Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InfluenzaEmploymentStatusObservationOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InfluenzaEmploymentStatusObservationOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInfluenzaEmploymentStatusObservationTemplateId(InfluenzaEmploymentStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Influenza Employment Status Observation Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInfluenzaEmploymentStatusObservationTemplateId(InfluenzaEmploymentStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INFLUENZA_EMPLOYMENT_STATUS_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.3.84')";

	/**
	 * The cached OCL invariant for the '{@link #validateInfluenzaEmploymentStatusObservationTemplateId(InfluenzaEmploymentStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Influenza Employment Status Observation Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInfluenzaEmploymentStatusObservationTemplateId(InfluenzaEmploymentStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_INFLUENZA_EMPLOYMENT_STATUS_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.3.84')
	 * @param influenzaEmploymentStatusObservation The receiving '<em><b>Influenza Employment Status Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateInfluenzaEmploymentStatusObservationTemplateId(InfluenzaEmploymentStatusObservation influenzaEmploymentStatusObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_INFLUENZA_EMPLOYMENT_STATUS_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(fluPackage.Literals.INFLUENZA_EMPLOYMENT_STATUS_OBSERVATION);
			try {
				VALIDATE_INFLUENZA_EMPLOYMENT_STATUS_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INFLUENZA_EMPLOYMENT_STATUS_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INFLUENZA_EMPLOYMENT_STATUS_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(influenzaEmploymentStatusObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 fluValidator.DIAGNOSTIC_SOURCE,
						 fluValidator.INFLUENZA_EMPLOYMENT_STATUS_OBSERVATION__INFLUENZA_EMPLOYMENT_STATUS_OBSERVATION_TEMPLATE_ID,
						 FluPlugin.INSTANCE.getString("InfluenzaEmploymentStatusObservationTemplateId"),
						 new Object [] { influenzaEmploymentStatusObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInfluenzaEmploymentStatusObservationCode(InfluenzaEmploymentStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Influenza Employment Status Observation Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInfluenzaEmploymentStatusObservationCode(InfluenzaEmploymentStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INFLUENZA_EMPLOYMENT_STATUS_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in ("+
"value.code = 'ASSERTION' and value.codeSystem = '2.16.840.1.113883.5.6'))";

	/**
	 * The cached OCL invariant for the '{@link #validateInfluenzaEmploymentStatusObservationCode(InfluenzaEmploymentStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Influenza Employment Status Observation Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInfluenzaEmploymentStatusObservationCode(InfluenzaEmploymentStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_INFLUENZA_EMPLOYMENT_STATUS_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and 
	 * let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in (
	 * value.code = 'ASSERTION' and value.codeSystem = '2.16.840.1.113883.5.6'))
	 * @param influenzaEmploymentStatusObservation The receiving '<em><b>Influenza Employment Status Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateInfluenzaEmploymentStatusObservationCode(InfluenzaEmploymentStatusObservation influenzaEmploymentStatusObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_INFLUENZA_EMPLOYMENT_STATUS_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(fluPackage.Literals.INFLUENZA_EMPLOYMENT_STATUS_OBSERVATION);
			try {
				VALIDATE_INFLUENZA_EMPLOYMENT_STATUS_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INFLUENZA_EMPLOYMENT_STATUS_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INFLUENZA_EMPLOYMENT_STATUS_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(influenzaEmploymentStatusObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 fluValidator.DIAGNOSTIC_SOURCE,
						 fluValidator.INFLUENZA_EMPLOYMENT_STATUS_OBSERVATION__INFLUENZA_EMPLOYMENT_STATUS_OBSERVATION_CODE,
						 FluPlugin.INSTANCE.getString("InfluenzaEmploymentStatusObservationCode"),
						 new Object [] { influenzaEmploymentStatusObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInfluenzaEmploymentStatusObservationValue(InfluenzaEmploymentStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Influenza Employment Status Observation Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInfluenzaEmploymentStatusObservationValue(InfluenzaEmploymentStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INFLUENZA_EMPLOYMENT_STATUS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = element.oclAsType(datatypes::CD) in "+
"value.codeSystem = '2.16.840.1.113883.6.96' and (value.code = '224372004' or value.code = '275139002' or value.code = '406156006' or value.code = '105493001' or value.code = '160906004' or value.code = '65853000' or value.code = '440337002' or value.code = '73438004')))";

	/**
	 * The cached OCL invariant for the '{@link #validateInfluenzaEmploymentStatusObservationValue(InfluenzaEmploymentStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Influenza Employment Status Observation Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInfluenzaEmploymentStatusObservationValue(InfluenzaEmploymentStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_INFLUENZA_EMPLOYMENT_STATUS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and 
	 * let value : datatypes::CD = element.oclAsType(datatypes::CD) in 
	 * value.codeSystem = '2.16.840.1.113883.6.96' and (value.code = '224372004' or value.code = '275139002' or value.code = '406156006' or value.code = '105493001' or value.code = '160906004' or value.code = '65853000' or value.code = '440337002' or value.code = '73438004')))
	 * @param influenzaEmploymentStatusObservation The receiving '<em><b>Influenza Employment Status Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateInfluenzaEmploymentStatusObservationValue(InfluenzaEmploymentStatusObservation influenzaEmploymentStatusObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_INFLUENZA_EMPLOYMENT_STATUS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(fluPackage.Literals.INFLUENZA_EMPLOYMENT_STATUS_OBSERVATION);
			try {
				VALIDATE_INFLUENZA_EMPLOYMENT_STATUS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INFLUENZA_EMPLOYMENT_STATUS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INFLUENZA_EMPLOYMENT_STATUS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(influenzaEmploymentStatusObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 fluValidator.DIAGNOSTIC_SOURCE,
						 fluValidator.INFLUENZA_EMPLOYMENT_STATUS_OBSERVATION__INFLUENZA_EMPLOYMENT_STATUS_OBSERVATION_VALUE,
						 FluPlugin.INSTANCE.getString("InfluenzaEmploymentStatusObservationValue"),
						 new Object [] { influenzaEmploymentStatusObservation }));
			}
			 
			return false;
		}
		return true;
	}

} // InfluenzaEmploymentStatusObservationOperations