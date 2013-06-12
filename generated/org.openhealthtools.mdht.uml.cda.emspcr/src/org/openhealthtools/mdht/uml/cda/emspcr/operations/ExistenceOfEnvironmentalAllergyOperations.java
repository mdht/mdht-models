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
import org.openhealthtools.mdht.uml.cda.emspcr.ExistenceOfEnvironmentalAllergy;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Existence Of Environmental Allergy</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ExistenceOfEnvironmentalAllergy#validateExistenceOfEnvironmentalAllergyTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Existence Of Environmental Allergy Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ExistenceOfEnvironmentalAllergy#validateExistenceOfEnvironmentalAllergyCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Existence Of Environmental Allergy Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ExistenceOfEnvironmentalAllergy#validateExistenceOfEnvironmentalAllergyValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Existence Of Environmental Allergy Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ExistenceOfEnvironmentalAllergy#validateExistenceOfEnvironmentalAllergyMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Existence Of Environmental Allergy Mood Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExistenceOfEnvironmentalAllergyOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExistenceOfEnvironmentalAllergyOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateExistenceOfEnvironmentalAllergyTemplateId(ExistenceOfEnvironmentalAllergy, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Existence Of Environmental Allergy Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateExistenceOfEnvironmentalAllergyTemplateId(ExistenceOfEnvironmentalAllergy, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EXISTENCE_OF_ENVIRONMENTAL_ALLERGY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.1133883.17.3.10.1.103')";

	/**
	 * The cached OCL invariant for the '{@link #validateExistenceOfEnvironmentalAllergyTemplateId(ExistenceOfEnvironmentalAllergy, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Existence Of Environmental Allergy Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateExistenceOfEnvironmentalAllergyTemplateId(ExistenceOfEnvironmentalAllergy, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_EXISTENCE_OF_ENVIRONMENTAL_ALLERGY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param existenceOfEnvironmentalAllergy The receiving '<em><b>Existence Of Environmental Allergy</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateExistenceOfEnvironmentalAllergyTemplateId(ExistenceOfEnvironmentalAllergy existenceOfEnvironmentalAllergy, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_EXISTENCE_OF_ENVIRONMENTAL_ALLERGY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EXISTENCE_OF_ENVIRONMENTAL_ALLERGY);
			try {
				VALIDATE_EXISTENCE_OF_ENVIRONMENTAL_ALLERGY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EXISTENCE_OF_ENVIRONMENTAL_ALLERGY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_EXISTENCE_OF_ENVIRONMENTAL_ALLERGY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(existenceOfEnvironmentalAllergy)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.EXISTENCE_OF_ENVIRONMENTAL_ALLERGY__EXISTENCE_OF_ENVIRONMENTAL_ALLERGY_TEMPLATE_ID,
						 EmspcrPlugin.INSTANCE.getString("ExistenceOfEnvironmentalAllergyTemplateId"),
						 new Object [] { existenceOfEnvironmentalAllergy }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateExistenceOfEnvironmentalAllergyCode(ExistenceOfEnvironmentalAllergy, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Existence Of Environmental Allergy Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateExistenceOfEnvironmentalAllergyCode(ExistenceOfEnvironmentalAllergy, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EXISTENCE_OF_ENVIRONMENTAL_ALLERGY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.code = '69747-4' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateExistenceOfEnvironmentalAllergyCode(ExistenceOfEnvironmentalAllergy, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Existence Of Environmental Allergy Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateExistenceOfEnvironmentalAllergyCode(ExistenceOfEnvironmentalAllergy, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_EXISTENCE_OF_ENVIRONMENTAL_ALLERGY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param existenceOfEnvironmentalAllergy The receiving '<em><b>Existence Of Environmental Allergy</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateExistenceOfEnvironmentalAllergyCode(ExistenceOfEnvironmentalAllergy existenceOfEnvironmentalAllergy, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_EXISTENCE_OF_ENVIRONMENTAL_ALLERGY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EXISTENCE_OF_ENVIRONMENTAL_ALLERGY);
			try {
				VALIDATE_EXISTENCE_OF_ENVIRONMENTAL_ALLERGY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EXISTENCE_OF_ENVIRONMENTAL_ALLERGY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_EXISTENCE_OF_ENVIRONMENTAL_ALLERGY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(existenceOfEnvironmentalAllergy)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.EXISTENCE_OF_ENVIRONMENTAL_ALLERGY__EXISTENCE_OF_ENVIRONMENTAL_ALLERGY_CODE,
						 EmspcrPlugin.INSTANCE.getString("ExistenceOfEnvironmentalAllergyCode"),
						 new Object [] { existenceOfEnvironmentalAllergy }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateExistenceOfEnvironmentalAllergyValue(ExistenceOfEnvironmentalAllergy, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Existence Of Environmental Allergy Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateExistenceOfEnvironmentalAllergyValue(ExistenceOfEnvironmentalAllergy, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EXISTENCE_OF_ENVIRONMENTAL_ALLERGY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::BL)))";

	/**
	 * The cached OCL invariant for the '{@link #validateExistenceOfEnvironmentalAllergyValue(ExistenceOfEnvironmentalAllergy, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Existence Of Environmental Allergy Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateExistenceOfEnvironmentalAllergyValue(ExistenceOfEnvironmentalAllergy, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_EXISTENCE_OF_ENVIRONMENTAL_ALLERGY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param existenceOfEnvironmentalAllergy The receiving '<em><b>Existence Of Environmental Allergy</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateExistenceOfEnvironmentalAllergyValue(ExistenceOfEnvironmentalAllergy existenceOfEnvironmentalAllergy, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_EXISTENCE_OF_ENVIRONMENTAL_ALLERGY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EXISTENCE_OF_ENVIRONMENTAL_ALLERGY);
			try {
				VALIDATE_EXISTENCE_OF_ENVIRONMENTAL_ALLERGY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EXISTENCE_OF_ENVIRONMENTAL_ALLERGY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_EXISTENCE_OF_ENVIRONMENTAL_ALLERGY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(existenceOfEnvironmentalAllergy)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.EXISTENCE_OF_ENVIRONMENTAL_ALLERGY__EXISTENCE_OF_ENVIRONMENTAL_ALLERGY_VALUE,
						 EmspcrPlugin.INSTANCE.getString("ExistenceOfEnvironmentalAllergyValue"),
						 new Object [] { existenceOfEnvironmentalAllergy }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateExistenceOfEnvironmentalAllergyMoodCode(ExistenceOfEnvironmentalAllergy, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Existence Of Environmental Allergy Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateExistenceOfEnvironmentalAllergyMoodCode(ExistenceOfEnvironmentalAllergy, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EXISTENCE_OF_ENVIRONMENTAL_ALLERGY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateExistenceOfEnvironmentalAllergyMoodCode(ExistenceOfEnvironmentalAllergy, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Existence Of Environmental Allergy Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateExistenceOfEnvironmentalAllergyMoodCode(ExistenceOfEnvironmentalAllergy, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_EXISTENCE_OF_ENVIRONMENTAL_ALLERGY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param existenceOfEnvironmentalAllergy The receiving '<em><b>Existence Of Environmental Allergy</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateExistenceOfEnvironmentalAllergyMoodCode(ExistenceOfEnvironmentalAllergy existenceOfEnvironmentalAllergy, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_EXISTENCE_OF_ENVIRONMENTAL_ALLERGY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EXISTENCE_OF_ENVIRONMENTAL_ALLERGY);
			try {
				VALIDATE_EXISTENCE_OF_ENVIRONMENTAL_ALLERGY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EXISTENCE_OF_ENVIRONMENTAL_ALLERGY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_EXISTENCE_OF_ENVIRONMENTAL_ALLERGY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(existenceOfEnvironmentalAllergy)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.EXISTENCE_OF_ENVIRONMENTAL_ALLERGY__EXISTENCE_OF_ENVIRONMENTAL_ALLERGY_MOOD_CODE,
						 EmspcrPlugin.INSTANCE.getString("ExistenceOfEnvironmentalAllergyMoodCode"),
						 new Object [] { existenceOfEnvironmentalAllergy }));
			}
			 
			return false;
		}
		return true;
	}

} // ExistenceOfEnvironmentalAllergyOperations