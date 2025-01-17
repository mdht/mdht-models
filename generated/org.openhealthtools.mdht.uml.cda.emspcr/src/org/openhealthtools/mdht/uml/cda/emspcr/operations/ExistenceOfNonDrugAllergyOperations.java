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
import org.openhealthtools.mdht.uml.cda.emspcr.ExistenceOfNonDrugAllergy;
import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Existence Of Non Drug Allergy</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ExistenceOfNonDrugAllergy#validateExistenceOfNonDrugAllergyTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Existence Of Non Drug Allergy Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ExistenceOfNonDrugAllergy#validateExistenceOfNonDrugAllergyMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Existence Of Non Drug Allergy Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ExistenceOfNonDrugAllergy#validateExistenceOfNonDrugAllergyCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Existence Of Non Drug Allergy Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ExistenceOfNonDrugAllergy#validateExistenceOfNonDrugAllergyValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Existence Of Non Drug Allergy Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExistenceOfNonDrugAllergyOperations extends org.eclipse.mdht.uml.cda.operations.ClinicalStatementOperations {
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
	protected ExistenceOfNonDrugAllergyOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateExistenceOfNonDrugAllergyTemplateId(ExistenceOfNonDrugAllergy, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Existence Of Non Drug Allergy Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateExistenceOfNonDrugAllergyTemplateId(ExistenceOfNonDrugAllergy, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EXISTENCE_OF_NON_DRUG_ALLERGY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.1133883.17.3.10.1.103')";

	/**
	 * The cached OCL invariant for the '{@link #validateExistenceOfNonDrugAllergyTemplateId(ExistenceOfNonDrugAllergy, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Existence Of Non Drug Allergy Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateExistenceOfNonDrugAllergyTemplateId(ExistenceOfNonDrugAllergy, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_EXISTENCE_OF_NON_DRUG_ALLERGY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param existenceOfNonDrugAllergy The receiving '<em><b>Existence Of Non Drug Allergy</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateExistenceOfNonDrugAllergyTemplateId(
			ExistenceOfNonDrugAllergy existenceOfNonDrugAllergy, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_EXISTENCE_OF_NON_DRUG_ALLERGY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EXISTENCE_OF_NON_DRUG_ALLERGY);
			try {
				VALIDATE_EXISTENCE_OF_NON_DRUG_ALLERGY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_EXISTENCE_OF_NON_DRUG_ALLERGY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_EXISTENCE_OF_NON_DRUG_ALLERGY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(existenceOfNonDrugAllergy)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.EXISTENCE_OF_NON_DRUG_ALLERGY__EXISTENCE_OF_NON_DRUG_ALLERGY_TEMPLATE_ID,
						 EmspcrPlugin.INSTANCE.getString("ExistenceOfNonDrugAllergyExistenceOfNonDrugAllergyTemplateId"),
						 new Object [] { existenceOfNonDrugAllergy }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateExistenceOfNonDrugAllergyMoodCode(ExistenceOfNonDrugAllergy, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Existence Of Non Drug Allergy Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateExistenceOfNonDrugAllergyMoodCode(ExistenceOfNonDrugAllergy, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EXISTENCE_OF_NON_DRUG_ALLERGY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateExistenceOfNonDrugAllergyMoodCode(ExistenceOfNonDrugAllergy, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Existence Of Non Drug Allergy Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateExistenceOfNonDrugAllergyMoodCode(ExistenceOfNonDrugAllergy, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_EXISTENCE_OF_NON_DRUG_ALLERGY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param existenceOfNonDrugAllergy The receiving '<em><b>Existence Of Non Drug Allergy</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateExistenceOfNonDrugAllergyMoodCode(
			ExistenceOfNonDrugAllergy existenceOfNonDrugAllergy, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_EXISTENCE_OF_NON_DRUG_ALLERGY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EXISTENCE_OF_NON_DRUG_ALLERGY);
			try {
				VALIDATE_EXISTENCE_OF_NON_DRUG_ALLERGY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_EXISTENCE_OF_NON_DRUG_ALLERGY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_EXISTENCE_OF_NON_DRUG_ALLERGY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(existenceOfNonDrugAllergy)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.EXISTENCE_OF_NON_DRUG_ALLERGY__EXISTENCE_OF_NON_DRUG_ALLERGY_MOOD_CODE,
						 EmspcrPlugin.INSTANCE.getString("ExistenceOfNonDrugAllergyExistenceOfNonDrugAllergyMoodCode"),
						 new Object [] { existenceOfNonDrugAllergy }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateExistenceOfNonDrugAllergyCode(ExistenceOfNonDrugAllergy, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Existence Of Non Drug Allergy Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateExistenceOfNonDrugAllergyCode(ExistenceOfNonDrugAllergy, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EXISTENCE_OF_NON_DRUG_ALLERGY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.code = '69747-4' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateExistenceOfNonDrugAllergyCode(ExistenceOfNonDrugAllergy, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Existence Of Non Drug Allergy Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateExistenceOfNonDrugAllergyCode(ExistenceOfNonDrugAllergy, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_EXISTENCE_OF_NON_DRUG_ALLERGY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param existenceOfNonDrugAllergy The receiving '<em><b>Existence Of Non Drug Allergy</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateExistenceOfNonDrugAllergyCode(ExistenceOfNonDrugAllergy existenceOfNonDrugAllergy,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_EXISTENCE_OF_NON_DRUG_ALLERGY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EXISTENCE_OF_NON_DRUG_ALLERGY);
			try {
				VALIDATE_EXISTENCE_OF_NON_DRUG_ALLERGY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_EXISTENCE_OF_NON_DRUG_ALLERGY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_EXISTENCE_OF_NON_DRUG_ALLERGY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(existenceOfNonDrugAllergy)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.EXISTENCE_OF_NON_DRUG_ALLERGY__EXISTENCE_OF_NON_DRUG_ALLERGY_CODE,
						 EmspcrPlugin.INSTANCE.getString("ExistenceOfNonDrugAllergyExistenceOfNonDrugAllergyCode"),
						 new Object [] { existenceOfNonDrugAllergy }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateExistenceOfNonDrugAllergyValue(ExistenceOfNonDrugAllergy, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Existence Of Non Drug Allergy Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateExistenceOfNonDrugAllergyValue(ExistenceOfNonDrugAllergy, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EXISTENCE_OF_NON_DRUG_ALLERGY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::BL)))";

	/**
	 * The cached OCL invariant for the '{@link #validateExistenceOfNonDrugAllergyValue(ExistenceOfNonDrugAllergy, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Existence Of Non Drug Allergy Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateExistenceOfNonDrugAllergyValue(ExistenceOfNonDrugAllergy, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_EXISTENCE_OF_NON_DRUG_ALLERGY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param existenceOfNonDrugAllergy The receiving '<em><b>Existence Of Non Drug Allergy</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateExistenceOfNonDrugAllergyValue(ExistenceOfNonDrugAllergy existenceOfNonDrugAllergy,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_EXISTENCE_OF_NON_DRUG_ALLERGY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EXISTENCE_OF_NON_DRUG_ALLERGY);
			try {
				VALIDATE_EXISTENCE_OF_NON_DRUG_ALLERGY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_EXISTENCE_OF_NON_DRUG_ALLERGY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_EXISTENCE_OF_NON_DRUG_ALLERGY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(existenceOfNonDrugAllergy)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.EXISTENCE_OF_NON_DRUG_ALLERGY__EXISTENCE_OF_NON_DRUG_ALLERGY_VALUE,
						 EmspcrPlugin.INSTANCE.getString("ExistenceOfNonDrugAllergyExistenceOfNonDrugAllergyValue"),
						 new Object [] { existenceOfNonDrugAllergy }));
			}
			 
			return false;
		}
		return true;
	}

} // ExistenceOfNonDrugAllergyOperations
