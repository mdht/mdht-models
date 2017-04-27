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
import org.openhealthtools.mdht.uml.cda.emspcr.MedicationNotAdministeredReasonObservation;
import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Medication Not Administered Reason Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.MedicationNotAdministeredReasonObservation#validateMedicationNotAdministeredReasonObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Not Administered Reason Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.MedicationNotAdministeredReasonObservation#validateMedicationNotAdministeredReasonObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Not Administered Reason Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.MedicationNotAdministeredReasonObservation#validateMedicationNotAdministeredReasonObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Not Administered Reason Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.MedicationNotAdministeredReasonObservation#validateMedicationNotAdministeredReasonObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Not Administered Reason Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.MedicationNotAdministeredReasonObservation#validateMedicationNotAdministeredReasonObservationValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Not Administered Reason Observation Value P</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MedicationNotAdministeredReasonObservationOperations extends org.eclipse.mdht.uml.cda.operations.ClinicalStatementOperations {
	protected static final ThreadLocal< OCL > EOCL_ENV = new ThreadLocal< OCL >() {
		@Override
		public OCL initialValue() {
			return OCL.newInstance();
		}
	};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicationNotAdministeredReasonObservationOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationNotAdministeredReasonObservationTemplateId(MedicationNotAdministeredReasonObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Not Administered Reason Observation Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationNotAdministeredReasonObservationTemplateId(MedicationNotAdministeredReasonObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_NOT_ADMINISTERED_REASON_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.1133883.17.3.10.1.105')";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationNotAdministeredReasonObservationTemplateId(MedicationNotAdministeredReasonObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Not Administered Reason Observation Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationNotAdministeredReasonObservationTemplateId(MedicationNotAdministeredReasonObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_MEDICATION_NOT_ADMINISTERED_REASON_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationNotAdministeredReasonObservation The receiving '<em><b>Medication Not Administered Reason Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicationNotAdministeredReasonObservationTemplateId(
			MedicationNotAdministeredReasonObservation medicationNotAdministeredReasonObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_MEDICATION_NOT_ADMINISTERED_REASON_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.MEDICATION_NOT_ADMINISTERED_REASON_OBSERVATION);
			try {
				VALIDATE_MEDICATION_NOT_ADMINISTERED_REASON_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_MEDICATION_NOT_ADMINISTERED_REASON_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_MEDICATION_NOT_ADMINISTERED_REASON_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(medicationNotAdministeredReasonObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.MEDICATION_NOT_ADMINISTERED_REASON_OBSERVATION__MEDICATION_NOT_ADMINISTERED_REASON_OBSERVATION_TEMPLATE_ID,
						 EmspcrPlugin.INSTANCE.getString("MedicationNotAdministeredReasonObservationMedicationNotAdministeredReasonObservationTemplateId"),
						 new Object [] { medicationNotAdministeredReasonObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationNotAdministeredReasonObservationMoodCode(MedicationNotAdministeredReasonObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Not Administered Reason Observation Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationNotAdministeredReasonObservationMoodCode(MedicationNotAdministeredReasonObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_NOT_ADMINISTERED_REASON_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationNotAdministeredReasonObservationMoodCode(MedicationNotAdministeredReasonObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Not Administered Reason Observation Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationNotAdministeredReasonObservationMoodCode(MedicationNotAdministeredReasonObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_MEDICATION_NOT_ADMINISTERED_REASON_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationNotAdministeredReasonObservation The receiving '<em><b>Medication Not Administered Reason Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicationNotAdministeredReasonObservationMoodCode(
			MedicationNotAdministeredReasonObservation medicationNotAdministeredReasonObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_MEDICATION_NOT_ADMINISTERED_REASON_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.MEDICATION_NOT_ADMINISTERED_REASON_OBSERVATION);
			try {
				VALIDATE_MEDICATION_NOT_ADMINISTERED_REASON_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_MEDICATION_NOT_ADMINISTERED_REASON_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_MEDICATION_NOT_ADMINISTERED_REASON_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(medicationNotAdministeredReasonObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.MEDICATION_NOT_ADMINISTERED_REASON_OBSERVATION__MEDICATION_NOT_ADMINISTERED_REASON_OBSERVATION_MOOD_CODE,
						 EmspcrPlugin.INSTANCE.getString("MedicationNotAdministeredReasonObservationMedicationNotAdministeredReasonObservationMoodCode"),
						 new Object [] { medicationNotAdministeredReasonObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationNotAdministeredReasonObservationCode(MedicationNotAdministeredReasonObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Not Administered Reason Observation Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationNotAdministeredReasonObservationCode(MedicationNotAdministeredReasonObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_NOT_ADMINISTERED_REASON_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.code = 'ASSERTION' and value.codeSystem = '2.16.840.1.113883.5.4')";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationNotAdministeredReasonObservationCode(MedicationNotAdministeredReasonObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Not Administered Reason Observation Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationNotAdministeredReasonObservationCode(MedicationNotAdministeredReasonObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_MEDICATION_NOT_ADMINISTERED_REASON_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationNotAdministeredReasonObservation The receiving '<em><b>Medication Not Administered Reason Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicationNotAdministeredReasonObservationCode(
			MedicationNotAdministeredReasonObservation medicationNotAdministeredReasonObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_MEDICATION_NOT_ADMINISTERED_REASON_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.MEDICATION_NOT_ADMINISTERED_REASON_OBSERVATION);
			try {
				VALIDATE_MEDICATION_NOT_ADMINISTERED_REASON_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_MEDICATION_NOT_ADMINISTERED_REASON_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_MEDICATION_NOT_ADMINISTERED_REASON_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(medicationNotAdministeredReasonObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.MEDICATION_NOT_ADMINISTERED_REASON_OBSERVATION__MEDICATION_NOT_ADMINISTERED_REASON_OBSERVATION_CODE,
						 EmspcrPlugin.INSTANCE.getString("MedicationNotAdministeredReasonObservationMedicationNotAdministeredReasonObservationCode"),
						 new Object [] { medicationNotAdministeredReasonObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationNotAdministeredReasonObservationValue(MedicationNotAdministeredReasonObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Not Administered Reason Observation Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationNotAdministeredReasonObservationValue(MedicationNotAdministeredReasonObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_NOT_ADMINISTERED_REASON_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = element.oclAsType(datatypes::CD) in "+
"value.codeSystem = '2.16.840.1.113883.6.1' and (value.code = 'LA15185-4' or value.code = 'LA18921-9' or value.code = 'LA18922-7' or value.code = 'LA18925-0' or value.code = 'LA4216-3' or value.code = 'LA4389-8')))";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationNotAdministeredReasonObservationValue(MedicationNotAdministeredReasonObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Not Administered Reason Observation Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationNotAdministeredReasonObservationValue(MedicationNotAdministeredReasonObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_MEDICATION_NOT_ADMINISTERED_REASON_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationNotAdministeredReasonObservation The receiving '<em><b>Medication Not Administered Reason Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicationNotAdministeredReasonObservationValue(
			MedicationNotAdministeredReasonObservation medicationNotAdministeredReasonObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_MEDICATION_NOT_ADMINISTERED_REASON_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.MEDICATION_NOT_ADMINISTERED_REASON_OBSERVATION);
			try {
				VALIDATE_MEDICATION_NOT_ADMINISTERED_REASON_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_MEDICATION_NOT_ADMINISTERED_REASON_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_MEDICATION_NOT_ADMINISTERED_REASON_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(medicationNotAdministeredReasonObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.MEDICATION_NOT_ADMINISTERED_REASON_OBSERVATION__MEDICATION_NOT_ADMINISTERED_REASON_OBSERVATION_VALUE,
						 EmspcrPlugin.INSTANCE.getString("MedicationNotAdministeredReasonObservationMedicationNotAdministeredReasonObservationValue"),
						 new Object [] { medicationNotAdministeredReasonObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationNotAdministeredReasonObservationValueP(MedicationNotAdministeredReasonObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Not Administered Reason Observation Value P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationNotAdministeredReasonObservationValueP(MedicationNotAdministeredReasonObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_NOT_ADMINISTERED_REASON_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::CD)))";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationNotAdministeredReasonObservationValueP(MedicationNotAdministeredReasonObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Not Administered Reason Observation Value P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationNotAdministeredReasonObservationValueP(MedicationNotAdministeredReasonObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_MEDICATION_NOT_ADMINISTERED_REASON_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationNotAdministeredReasonObservation The receiving '<em><b>Medication Not Administered Reason Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicationNotAdministeredReasonObservationValueP(
			MedicationNotAdministeredReasonObservation medicationNotAdministeredReasonObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_MEDICATION_NOT_ADMINISTERED_REASON_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.MEDICATION_NOT_ADMINISTERED_REASON_OBSERVATION);
			try {
				VALIDATE_MEDICATION_NOT_ADMINISTERED_REASON_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_MEDICATION_NOT_ADMINISTERED_REASON_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_MEDICATION_NOT_ADMINISTERED_REASON_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(medicationNotAdministeredReasonObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.MEDICATION_NOT_ADMINISTERED_REASON_OBSERVATION__MEDICATION_NOT_ADMINISTERED_REASON_OBSERVATION_VALUE_P,
						 EmspcrPlugin.INSTANCE.getString("MedicationNotAdministeredReasonObservationMedicationNotAdministeredReasonObservationValueP"),
						 new Object [] { medicationNotAdministeredReasonObservation }));
			}
			 
			return false;
		}
		return true;
	}

} // MedicationNotAdministeredReasonObservationOperations
