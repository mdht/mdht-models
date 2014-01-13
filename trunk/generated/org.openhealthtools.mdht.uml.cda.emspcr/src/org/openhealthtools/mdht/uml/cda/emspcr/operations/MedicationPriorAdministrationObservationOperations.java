/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.emspcr.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPlugin;
import org.openhealthtools.mdht.uml.cda.emspcr.MedicationPriorAdministrationObservation;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Medication Prior Administration Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.MedicationPriorAdministrationObservation#validateMedicationPriorAdministrationObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Prior Administration Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.MedicationPriorAdministrationObservation#validateMedicationPriorAdministrationObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Prior Administration Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.MedicationPriorAdministrationObservation#validateMedicationPriorAdministrationObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Prior Administration Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.MedicationPriorAdministrationObservation#validateMedicationPriorAdministrationObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Prior Administration Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.MedicationPriorAdministrationObservation#validateMedicationPriorAdministrationObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Prior Administration Observation Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MedicationPriorAdministrationObservationOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicationPriorAdministrationObservationOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationPriorAdministrationObservationTemplateId(MedicationPriorAdministrationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Prior Administration Observation Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationPriorAdministrationObservationTemplateId(MedicationPriorAdministrationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_PRIOR_ADMINISTRATION_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.1133883.17.3.10.1.108')";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationPriorAdministrationObservationTemplateId(MedicationPriorAdministrationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Prior Administration Observation Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationPriorAdministrationObservationTemplateId(MedicationPriorAdministrationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_MEDICATION_PRIOR_ADMINISTRATION_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationPriorAdministrationObservation The receiving '<em><b>Medication Prior Administration Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateMedicationPriorAdministrationObservationTemplateId(MedicationPriorAdministrationObservation medicationPriorAdministrationObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_MEDICATION_PRIOR_ADMINISTRATION_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.MEDICATION_PRIOR_ADMINISTRATION_OBSERVATION);
			try {
				VALIDATE_MEDICATION_PRIOR_ADMINISTRATION_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_PRIOR_ADMINISTRATION_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_PRIOR_ADMINISTRATION_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicationPriorAdministrationObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.MEDICATION_PRIOR_ADMINISTRATION_OBSERVATION__MEDICATION_PRIOR_ADMINISTRATION_OBSERVATION_TEMPLATE_ID,
						 EmspcrPlugin.INSTANCE.getString("MedicationPriorAdministrationObservationTemplateId"),
						 new Object [] { medicationPriorAdministrationObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationPriorAdministrationObservationMoodCode(MedicationPriorAdministrationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Prior Administration Observation Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationPriorAdministrationObservationMoodCode(MedicationPriorAdministrationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_PRIOR_ADMINISTRATION_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationPriorAdministrationObservationMoodCode(MedicationPriorAdministrationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Prior Administration Observation Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationPriorAdministrationObservationMoodCode(MedicationPriorAdministrationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_MEDICATION_PRIOR_ADMINISTRATION_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationPriorAdministrationObservation The receiving '<em><b>Medication Prior Administration Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateMedicationPriorAdministrationObservationMoodCode(MedicationPriorAdministrationObservation medicationPriorAdministrationObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_MEDICATION_PRIOR_ADMINISTRATION_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.MEDICATION_PRIOR_ADMINISTRATION_OBSERVATION);
			try {
				VALIDATE_MEDICATION_PRIOR_ADMINISTRATION_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_PRIOR_ADMINISTRATION_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_PRIOR_ADMINISTRATION_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicationPriorAdministrationObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.MEDICATION_PRIOR_ADMINISTRATION_OBSERVATION__MEDICATION_PRIOR_ADMINISTRATION_OBSERVATION_MOOD_CODE,
						 EmspcrPlugin.INSTANCE.getString("MedicationPriorAdministrationObservationMoodCode"),
						 new Object [] { medicationPriorAdministrationObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationPriorAdministrationObservationCodeP(MedicationPriorAdministrationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Prior Administration Observation Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationPriorAdministrationObservationCodeP(MedicationPriorAdministrationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_PRIOR_ADMINISTRATION_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationPriorAdministrationObservationCodeP(MedicationPriorAdministrationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Prior Administration Observation Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationPriorAdministrationObservationCodeP(MedicationPriorAdministrationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_MEDICATION_PRIOR_ADMINISTRATION_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationPriorAdministrationObservation The receiving '<em><b>Medication Prior Administration Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateMedicationPriorAdministrationObservationCodeP(MedicationPriorAdministrationObservation medicationPriorAdministrationObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_MEDICATION_PRIOR_ADMINISTRATION_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.MEDICATION_PRIOR_ADMINISTRATION_OBSERVATION);
			try {
				VALIDATE_MEDICATION_PRIOR_ADMINISTRATION_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_PRIOR_ADMINISTRATION_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_PRIOR_ADMINISTRATION_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicationPriorAdministrationObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.MEDICATION_PRIOR_ADMINISTRATION_OBSERVATION__MEDICATION_PRIOR_ADMINISTRATION_OBSERVATION_CODE_P,
						 EmspcrPlugin.INSTANCE.getString("MedicationPriorAdministrationObservationCodeP"),
						 new Object [] { medicationPriorAdministrationObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationPriorAdministrationObservationCode(MedicationPriorAdministrationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Prior Administration Observation Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationPriorAdministrationObservationCode(MedicationPriorAdministrationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_PRIOR_ADMINISTRATION_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.code = '67539-7' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationPriorAdministrationObservationCode(MedicationPriorAdministrationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Prior Administration Observation Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationPriorAdministrationObservationCode(MedicationPriorAdministrationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_MEDICATION_PRIOR_ADMINISTRATION_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationPriorAdministrationObservation The receiving '<em><b>Medication Prior Administration Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateMedicationPriorAdministrationObservationCode(MedicationPriorAdministrationObservation medicationPriorAdministrationObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_MEDICATION_PRIOR_ADMINISTRATION_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.MEDICATION_PRIOR_ADMINISTRATION_OBSERVATION);
			try {
				VALIDATE_MEDICATION_PRIOR_ADMINISTRATION_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_PRIOR_ADMINISTRATION_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_PRIOR_ADMINISTRATION_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicationPriorAdministrationObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.MEDICATION_PRIOR_ADMINISTRATION_OBSERVATION__MEDICATION_PRIOR_ADMINISTRATION_OBSERVATION_CODE,
						 EmspcrPlugin.INSTANCE.getString("MedicationPriorAdministrationObservationCode"),
						 new Object [] { medicationPriorAdministrationObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationPriorAdministrationObservationValue(MedicationPriorAdministrationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Prior Administration Observation Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationPriorAdministrationObservationValue(MedicationPriorAdministrationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_PRIOR_ADMINISTRATION_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::BL)))";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationPriorAdministrationObservationValue(MedicationPriorAdministrationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Prior Administration Observation Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationPriorAdministrationObservationValue(MedicationPriorAdministrationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_MEDICATION_PRIOR_ADMINISTRATION_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationPriorAdministrationObservation The receiving '<em><b>Medication Prior Administration Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateMedicationPriorAdministrationObservationValue(MedicationPriorAdministrationObservation medicationPriorAdministrationObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_MEDICATION_PRIOR_ADMINISTRATION_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.MEDICATION_PRIOR_ADMINISTRATION_OBSERVATION);
			try {
				VALIDATE_MEDICATION_PRIOR_ADMINISTRATION_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_PRIOR_ADMINISTRATION_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_PRIOR_ADMINISTRATION_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicationPriorAdministrationObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.MEDICATION_PRIOR_ADMINISTRATION_OBSERVATION__MEDICATION_PRIOR_ADMINISTRATION_OBSERVATION_VALUE,
						 EmspcrPlugin.INSTANCE.getString("MedicationPriorAdministrationObservationValue"),
						 new Object [] { medicationPriorAdministrationObservation }));
			}
			 
			return false;
		}
		return true;
	}

} // MedicationPriorAdministrationObservationOperations