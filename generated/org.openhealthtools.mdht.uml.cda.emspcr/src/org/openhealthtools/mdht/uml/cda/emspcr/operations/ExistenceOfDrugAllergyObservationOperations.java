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
import org.openhealthtools.mdht.uml.cda.emspcr.ExistenceOfDrugAllergyObservation;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Existence Of Drug Allergy Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ExistenceOfDrugAllergyObservation#validateExistenceOfDrugAllergyObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Existence Of Drug Allergy Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ExistenceOfDrugAllergyObservation#validateExistenceOfDrugAllergyObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Existence Of Drug Allergy Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ExistenceOfDrugAllergyObservation#validateExistenceOfDrugAllergyObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Existence Of Drug Allergy Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ExistenceOfDrugAllergyObservation#validateExistenceOfDrugAllergyObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Existence Of Drug Allergy Observation Mood Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExistenceOfDrugAllergyObservationOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExistenceOfDrugAllergyObservationOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateExistenceOfDrugAllergyObservationTemplateId(ExistenceOfDrugAllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Existence Of Drug Allergy Observation Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateExistenceOfDrugAllergyObservationTemplateId(ExistenceOfDrugAllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EXISTENCE_OF_DRUG_ALLERGY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.1133883.17.3.10.1.102')";

	/**
	 * The cached OCL invariant for the '{@link #validateExistenceOfDrugAllergyObservationTemplateId(ExistenceOfDrugAllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Existence Of Drug Allergy Observation Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateExistenceOfDrugAllergyObservationTemplateId(ExistenceOfDrugAllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_EXISTENCE_OF_DRUG_ALLERGY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param existenceOfDrugAllergyObservation The receiving '<em><b>Existence Of Drug Allergy Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateExistenceOfDrugAllergyObservationTemplateId(ExistenceOfDrugAllergyObservation existenceOfDrugAllergyObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_EXISTENCE_OF_DRUG_ALLERGY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EXISTENCE_OF_DRUG_ALLERGY_OBSERVATION);
			try {
				VALIDATE_EXISTENCE_OF_DRUG_ALLERGY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EXISTENCE_OF_DRUG_ALLERGY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_EXISTENCE_OF_DRUG_ALLERGY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(existenceOfDrugAllergyObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.EXISTENCE_OF_DRUG_ALLERGY_OBSERVATION__EXISTENCE_OF_DRUG_ALLERGY_OBSERVATION_TEMPLATE_ID,
						 EmspcrPlugin.INSTANCE.getString("ExistenceOfDrugAllergyObservationTemplateId"),
						 new Object [] { existenceOfDrugAllergyObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateExistenceOfDrugAllergyObservationCode(ExistenceOfDrugAllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Existence Of Drug Allergy Observation Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateExistenceOfDrugAllergyObservationCode(ExistenceOfDrugAllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EXISTENCE_OF_DRUG_ALLERGY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.code = '67794-8' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateExistenceOfDrugAllergyObservationCode(ExistenceOfDrugAllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Existence Of Drug Allergy Observation Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateExistenceOfDrugAllergyObservationCode(ExistenceOfDrugAllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_EXISTENCE_OF_DRUG_ALLERGY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param existenceOfDrugAllergyObservation The receiving '<em><b>Existence Of Drug Allergy Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateExistenceOfDrugAllergyObservationCode(ExistenceOfDrugAllergyObservation existenceOfDrugAllergyObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_EXISTENCE_OF_DRUG_ALLERGY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EXISTENCE_OF_DRUG_ALLERGY_OBSERVATION);
			try {
				VALIDATE_EXISTENCE_OF_DRUG_ALLERGY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EXISTENCE_OF_DRUG_ALLERGY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_EXISTENCE_OF_DRUG_ALLERGY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(existenceOfDrugAllergyObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.EXISTENCE_OF_DRUG_ALLERGY_OBSERVATION__EXISTENCE_OF_DRUG_ALLERGY_OBSERVATION_CODE,
						 EmspcrPlugin.INSTANCE.getString("ExistenceOfDrugAllergyObservationCode"),
						 new Object [] { existenceOfDrugAllergyObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateExistenceOfDrugAllergyObservationValue(ExistenceOfDrugAllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Existence Of Drug Allergy Observation Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateExistenceOfDrugAllergyObservationValue(ExistenceOfDrugAllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EXISTENCE_OF_DRUG_ALLERGY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::BL)))";

	/**
	 * The cached OCL invariant for the '{@link #validateExistenceOfDrugAllergyObservationValue(ExistenceOfDrugAllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Existence Of Drug Allergy Observation Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateExistenceOfDrugAllergyObservationValue(ExistenceOfDrugAllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_EXISTENCE_OF_DRUG_ALLERGY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param existenceOfDrugAllergyObservation The receiving '<em><b>Existence Of Drug Allergy Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateExistenceOfDrugAllergyObservationValue(ExistenceOfDrugAllergyObservation existenceOfDrugAllergyObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_EXISTENCE_OF_DRUG_ALLERGY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EXISTENCE_OF_DRUG_ALLERGY_OBSERVATION);
			try {
				VALIDATE_EXISTENCE_OF_DRUG_ALLERGY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EXISTENCE_OF_DRUG_ALLERGY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_EXISTENCE_OF_DRUG_ALLERGY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(existenceOfDrugAllergyObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.EXISTENCE_OF_DRUG_ALLERGY_OBSERVATION__EXISTENCE_OF_DRUG_ALLERGY_OBSERVATION_VALUE,
						 EmspcrPlugin.INSTANCE.getString("ExistenceOfDrugAllergyObservationValue"),
						 new Object [] { existenceOfDrugAllergyObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateExistenceOfDrugAllergyObservationMoodCode(ExistenceOfDrugAllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Existence Of Drug Allergy Observation Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateExistenceOfDrugAllergyObservationMoodCode(ExistenceOfDrugAllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EXISTENCE_OF_DRUG_ALLERGY_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateExistenceOfDrugAllergyObservationMoodCode(ExistenceOfDrugAllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Existence Of Drug Allergy Observation Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateExistenceOfDrugAllergyObservationMoodCode(ExistenceOfDrugAllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_EXISTENCE_OF_DRUG_ALLERGY_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param existenceOfDrugAllergyObservation The receiving '<em><b>Existence Of Drug Allergy Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateExistenceOfDrugAllergyObservationMoodCode(ExistenceOfDrugAllergyObservation existenceOfDrugAllergyObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_EXISTENCE_OF_DRUG_ALLERGY_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EXISTENCE_OF_DRUG_ALLERGY_OBSERVATION);
			try {
				VALIDATE_EXISTENCE_OF_DRUG_ALLERGY_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EXISTENCE_OF_DRUG_ALLERGY_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_EXISTENCE_OF_DRUG_ALLERGY_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(existenceOfDrugAllergyObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.EXISTENCE_OF_DRUG_ALLERGY_OBSERVATION__EXISTENCE_OF_DRUG_ALLERGY_OBSERVATION_MOOD_CODE,
						 EmspcrPlugin.INSTANCE.getString("ExistenceOfDrugAllergyObservationMoodCode"),
						 new Object [] { existenceOfDrugAllergyObservation }));
			}
			 
			return false;
		}
		return true;
	}

} // ExistenceOfDrugAllergyObservationOperations