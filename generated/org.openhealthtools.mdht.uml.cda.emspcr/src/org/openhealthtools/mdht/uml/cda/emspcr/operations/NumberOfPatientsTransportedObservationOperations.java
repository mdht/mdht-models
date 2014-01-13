/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.emspcr.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPlugin;
import org.openhealthtools.mdht.uml.cda.emspcr.NumberOfPatientsTransportedObservation;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Number Of Patients Transported Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.NumberOfPatientsTransportedObservation#validateNumberOfPatientsTransportedObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Number Of Patients Transported Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.NumberOfPatientsTransportedObservation#validateNumberOfPatientsTransportedObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Number Of Patients Transported Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.NumberOfPatientsTransportedObservation#validateNumberOfPatientsTransportedObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Number Of Patients Transported Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.NumberOfPatientsTransportedObservation#validateNumberOfPatientsTransportedObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Number Of Patients Transported Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.NumberOfPatientsTransportedObservation#validateNumberOfPatientsTransportedObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Number Of Patients Transported Observation Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NumberOfPatientsTransportedObservationOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NumberOfPatientsTransportedObservationOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNumberOfPatientsTransportedObservationTemplateId(NumberOfPatientsTransportedObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Number Of Patients Transported Observation Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNumberOfPatientsTransportedObservationTemplateId(NumberOfPatientsTransportedObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NUMBER_OF_PATIENTS_TRANSPORTED_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.1133883.17.3.10.1.31')";

	/**
	 * The cached OCL invariant for the '{@link #validateNumberOfPatientsTransportedObservationTemplateId(NumberOfPatientsTransportedObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Number Of Patients Transported Observation Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNumberOfPatientsTransportedObservationTemplateId(NumberOfPatientsTransportedObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_NUMBER_OF_PATIENTS_TRANSPORTED_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param numberOfPatientsTransportedObservation The receiving '<em><b>Number Of Patients Transported Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateNumberOfPatientsTransportedObservationTemplateId(NumberOfPatientsTransportedObservation numberOfPatientsTransportedObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_NUMBER_OF_PATIENTS_TRANSPORTED_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.NUMBER_OF_PATIENTS_TRANSPORTED_OBSERVATION);
			try {
				VALIDATE_NUMBER_OF_PATIENTS_TRANSPORTED_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NUMBER_OF_PATIENTS_TRANSPORTED_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NUMBER_OF_PATIENTS_TRANSPORTED_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(numberOfPatientsTransportedObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.NUMBER_OF_PATIENTS_TRANSPORTED_OBSERVATION__NUMBER_OF_PATIENTS_TRANSPORTED_OBSERVATION_TEMPLATE_ID,
						 EmspcrPlugin.INSTANCE.getString("NumberOfPatientsTransportedObservationTemplateId"),
						 new Object [] { numberOfPatientsTransportedObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNumberOfPatientsTransportedObservationMoodCode(NumberOfPatientsTransportedObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Number Of Patients Transported Observation Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNumberOfPatientsTransportedObservationMoodCode(NumberOfPatientsTransportedObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NUMBER_OF_PATIENTS_TRANSPORTED_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateNumberOfPatientsTransportedObservationMoodCode(NumberOfPatientsTransportedObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Number Of Patients Transported Observation Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNumberOfPatientsTransportedObservationMoodCode(NumberOfPatientsTransportedObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_NUMBER_OF_PATIENTS_TRANSPORTED_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param numberOfPatientsTransportedObservation The receiving '<em><b>Number Of Patients Transported Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateNumberOfPatientsTransportedObservationMoodCode(NumberOfPatientsTransportedObservation numberOfPatientsTransportedObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_NUMBER_OF_PATIENTS_TRANSPORTED_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.NUMBER_OF_PATIENTS_TRANSPORTED_OBSERVATION);
			try {
				VALIDATE_NUMBER_OF_PATIENTS_TRANSPORTED_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NUMBER_OF_PATIENTS_TRANSPORTED_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NUMBER_OF_PATIENTS_TRANSPORTED_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(numberOfPatientsTransportedObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.NUMBER_OF_PATIENTS_TRANSPORTED_OBSERVATION__NUMBER_OF_PATIENTS_TRANSPORTED_OBSERVATION_MOOD_CODE,
						 EmspcrPlugin.INSTANCE.getString("NumberOfPatientsTransportedObservationMoodCode"),
						 new Object [] { numberOfPatientsTransportedObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNumberOfPatientsTransportedObservationCodeP(NumberOfPatientsTransportedObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Number Of Patients Transported Observation Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNumberOfPatientsTransportedObservationCodeP(NumberOfPatientsTransportedObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NUMBER_OF_PATIENTS_TRANSPORTED_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateNumberOfPatientsTransportedObservationCodeP(NumberOfPatientsTransportedObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Number Of Patients Transported Observation Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNumberOfPatientsTransportedObservationCodeP(NumberOfPatientsTransportedObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_NUMBER_OF_PATIENTS_TRANSPORTED_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param numberOfPatientsTransportedObservation The receiving '<em><b>Number Of Patients Transported Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateNumberOfPatientsTransportedObservationCodeP(NumberOfPatientsTransportedObservation numberOfPatientsTransportedObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_NUMBER_OF_PATIENTS_TRANSPORTED_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.NUMBER_OF_PATIENTS_TRANSPORTED_OBSERVATION);
			try {
				VALIDATE_NUMBER_OF_PATIENTS_TRANSPORTED_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NUMBER_OF_PATIENTS_TRANSPORTED_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NUMBER_OF_PATIENTS_TRANSPORTED_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(numberOfPatientsTransportedObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.NUMBER_OF_PATIENTS_TRANSPORTED_OBSERVATION__NUMBER_OF_PATIENTS_TRANSPORTED_OBSERVATION_CODE_P,
						 EmspcrPlugin.INSTANCE.getString("NumberOfPatientsTransportedObservationCodeP"),
						 new Object [] { numberOfPatientsTransportedObservation }));
			}
			
			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.emspcr.NumberOfPatientsTransportedObservationCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.emspcr.NumberOfPatientsTransportedObservationCodeP", passToken);
				}
				passToken.add(numberOfPatientsTransportedObservation);
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNumberOfPatientsTransportedObservationCode(NumberOfPatientsTransportedObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Number Of Patients Transported Observation Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNumberOfPatientsTransportedObservationCode(NumberOfPatientsTransportedObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NUMBER_OF_PATIENTS_TRANSPORTED_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.code = '67547-0' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateNumberOfPatientsTransportedObservationCode(NumberOfPatientsTransportedObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Number Of Patients Transported Observation Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNumberOfPatientsTransportedObservationCode(NumberOfPatientsTransportedObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_NUMBER_OF_PATIENTS_TRANSPORTED_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param numberOfPatientsTransportedObservation The receiving '<em><b>Number Of Patients Transported Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateNumberOfPatientsTransportedObservationCode(NumberOfPatientsTransportedObservation numberOfPatientsTransportedObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		Object passToken = (context == null) ? null : context.get("org.openhealthtools.mdht.uml.cda.emspcr.NumberOfPatientsTransportedObservationCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(numberOfPatientsTransportedObservation)) {
			// I have a free pass to short-circuit
			return true;
		}
  	  
		if (VALIDATE_NUMBER_OF_PATIENTS_TRANSPORTED_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.NUMBER_OF_PATIENTS_TRANSPORTED_OBSERVATION);
			try {
				VALIDATE_NUMBER_OF_PATIENTS_TRANSPORTED_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NUMBER_OF_PATIENTS_TRANSPORTED_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NUMBER_OF_PATIENTS_TRANSPORTED_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(numberOfPatientsTransportedObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.NUMBER_OF_PATIENTS_TRANSPORTED_OBSERVATION__NUMBER_OF_PATIENTS_TRANSPORTED_OBSERVATION_CODE,
						 EmspcrPlugin.INSTANCE.getString("NumberOfPatientsTransportedObservationCode"),
						 new Object [] { numberOfPatientsTransportedObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNumberOfPatientsTransportedObservationValue(NumberOfPatientsTransportedObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Number Of Patients Transported Observation Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNumberOfPatientsTransportedObservationValue(NumberOfPatientsTransportedObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NUMBER_OF_PATIENTS_TRANSPORTED_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::INT)))";

	/**
	 * The cached OCL invariant for the '{@link #validateNumberOfPatientsTransportedObservationValue(NumberOfPatientsTransportedObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Number Of Patients Transported Observation Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNumberOfPatientsTransportedObservationValue(NumberOfPatientsTransportedObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_NUMBER_OF_PATIENTS_TRANSPORTED_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param numberOfPatientsTransportedObservation The receiving '<em><b>Number Of Patients Transported Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateNumberOfPatientsTransportedObservationValue(NumberOfPatientsTransportedObservation numberOfPatientsTransportedObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_NUMBER_OF_PATIENTS_TRANSPORTED_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.NUMBER_OF_PATIENTS_TRANSPORTED_OBSERVATION);
			try {
				VALIDATE_NUMBER_OF_PATIENTS_TRANSPORTED_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NUMBER_OF_PATIENTS_TRANSPORTED_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NUMBER_OF_PATIENTS_TRANSPORTED_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(numberOfPatientsTransportedObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.NUMBER_OF_PATIENTS_TRANSPORTED_OBSERVATION__NUMBER_OF_PATIENTS_TRANSPORTED_OBSERVATION_VALUE,
						 EmspcrPlugin.INSTANCE.getString("NumberOfPatientsTransportedObservationValue"),
						 new Object [] { numberOfPatientsTransportedObservation }));
			}
			 
			return false;
		}
		return true;
	}

} // NumberOfPatientsTransportedObservationOperations