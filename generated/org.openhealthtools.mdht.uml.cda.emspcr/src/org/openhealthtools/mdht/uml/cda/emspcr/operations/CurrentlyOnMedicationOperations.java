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

import org.openhealthtools.mdht.uml.cda.emspcr.CurrentlyOnMedication;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPlugin;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Currently On Medication</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CurrentlyOnMedication#validateCurrentlyOnMedicationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Currently On Medication Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CurrentlyOnMedication#validateCurrentlyOnMedicationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Currently On Medication Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CurrentlyOnMedication#validateCurrentlyOnMedicationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Currently On Medication Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CurrentlyOnMedication#validateCurrentlyOnMedicationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Currently On Medication Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CurrentlyOnMedicationOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CurrentlyOnMedicationOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCurrentlyOnMedicationTemplateId(CurrentlyOnMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Currently On Medication Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCurrentlyOnMedicationTemplateId(CurrentlyOnMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CURRENTLY_ON_MEDICATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.1133883.17.3.10.1.75')";

	/**
	 * The cached OCL invariant for the '{@link #validateCurrentlyOnMedicationTemplateId(CurrentlyOnMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Currently On Medication Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCurrentlyOnMedicationTemplateId(CurrentlyOnMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_CURRENTLY_ON_MEDICATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param currentlyOnMedication The receiving '<em><b>Currently On Medication</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateCurrentlyOnMedicationTemplateId(CurrentlyOnMedication currentlyOnMedication, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_CURRENTLY_ON_MEDICATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.CURRENTLY_ON_MEDICATION);
			try {
				VALIDATE_CURRENTLY_ON_MEDICATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CURRENTLY_ON_MEDICATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CURRENTLY_ON_MEDICATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(currentlyOnMedication)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.CURRENTLY_ON_MEDICATION__CURRENTLY_ON_MEDICATION_TEMPLATE_ID,
						 EmspcrPlugin.INSTANCE.getString("CurrentlyOnMedicationTemplateId"),
						 new Object [] { currentlyOnMedication }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCurrentlyOnMedicationMoodCode(CurrentlyOnMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Currently On Medication Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCurrentlyOnMedicationMoodCode(CurrentlyOnMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CURRENTLY_ON_MEDICATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateCurrentlyOnMedicationMoodCode(CurrentlyOnMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Currently On Medication Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCurrentlyOnMedicationMoodCode(CurrentlyOnMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_CURRENTLY_ON_MEDICATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param currentlyOnMedication The receiving '<em><b>Currently On Medication</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateCurrentlyOnMedicationMoodCode(CurrentlyOnMedication currentlyOnMedication, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_CURRENTLY_ON_MEDICATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.CURRENTLY_ON_MEDICATION);
			try {
				VALIDATE_CURRENTLY_ON_MEDICATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CURRENTLY_ON_MEDICATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CURRENTLY_ON_MEDICATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(currentlyOnMedication)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.CURRENTLY_ON_MEDICATION__CURRENTLY_ON_MEDICATION_MOOD_CODE,
						 EmspcrPlugin.INSTANCE.getString("CurrentlyOnMedicationMoodCode"),
						 new Object [] { currentlyOnMedication }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCurrentlyOnMedicationCode(CurrentlyOnMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Currently On Medication Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCurrentlyOnMedicationCode(CurrentlyOnMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CURRENTLY_ON_MEDICATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.code = '67791-4' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateCurrentlyOnMedicationCode(CurrentlyOnMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Currently On Medication Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCurrentlyOnMedicationCode(CurrentlyOnMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_CURRENTLY_ON_MEDICATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param currentlyOnMedication The receiving '<em><b>Currently On Medication</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateCurrentlyOnMedicationCode(CurrentlyOnMedication currentlyOnMedication, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_CURRENTLY_ON_MEDICATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.CURRENTLY_ON_MEDICATION);
			try {
				VALIDATE_CURRENTLY_ON_MEDICATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CURRENTLY_ON_MEDICATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CURRENTLY_ON_MEDICATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(currentlyOnMedication)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.CURRENTLY_ON_MEDICATION__CURRENTLY_ON_MEDICATION_CODE,
						 EmspcrPlugin.INSTANCE.getString("CurrentlyOnMedicationCode"),
						 new Object [] { currentlyOnMedication }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCurrentlyOnMedicationValue(CurrentlyOnMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Currently On Medication Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCurrentlyOnMedicationValue(CurrentlyOnMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CURRENTLY_ON_MEDICATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::BL)))";

	/**
	 * The cached OCL invariant for the '{@link #validateCurrentlyOnMedicationValue(CurrentlyOnMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Currently On Medication Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCurrentlyOnMedicationValue(CurrentlyOnMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_CURRENTLY_ON_MEDICATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param currentlyOnMedication The receiving '<em><b>Currently On Medication</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateCurrentlyOnMedicationValue(CurrentlyOnMedication currentlyOnMedication, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_CURRENTLY_ON_MEDICATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.CURRENTLY_ON_MEDICATION);
			try {
				VALIDATE_CURRENTLY_ON_MEDICATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CURRENTLY_ON_MEDICATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CURRENTLY_ON_MEDICATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(currentlyOnMedication)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.CURRENTLY_ON_MEDICATION__CURRENTLY_ON_MEDICATION_VALUE,
						 EmspcrPlugin.INSTANCE.getString("CurrentlyOnMedicationValue"),
						 new Object [] { currentlyOnMedication }));
			}
			 
			return false;
		}
		return true;
	}

} // CurrentlyOnMedicationOperations