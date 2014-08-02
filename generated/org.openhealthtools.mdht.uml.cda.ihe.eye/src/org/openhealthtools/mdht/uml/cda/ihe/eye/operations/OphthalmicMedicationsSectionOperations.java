/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.ihe.eye.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClassifier;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.eclipse.ocl.expressions.OCLExpression;

import org.openhealthtools.mdht.uml.cda.ihe.Medication;

import org.openhealthtools.mdht.uml.cda.ihe.eye.EyePackage;
import org.openhealthtools.mdht.uml.cda.ihe.eye.EyePlugin;
import org.openhealthtools.mdht.uml.cda.ihe.eye.OphthalmicMedicationsSection;

import org.openhealthtools.mdht.uml.cda.ihe.eye.util.EyeValidator;

import org.openhealthtools.mdht.uml.cda.ihe.operations.MedicationsSectionOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Ophthalmic Medications Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.eye.OphthalmicMedicationsSection#validateOphthalmicMedicationsSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Ophthalmic Medications Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.eye.OphthalmicMedicationsSection#validateOphthalmicMedicationsSectionMedication(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Ophthalmic Medications Section Medication</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.eye.OphthalmicMedicationsSection#getEyeMedication() <em>Get Eye Medication</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.eye.OphthalmicMedicationsSection#validateIHEMedicationsSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate IHE Medications Section Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OphthalmicMedicationsSectionOperations extends MedicationsSectionOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OphthalmicMedicationsSectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOphthalmicMedicationsSectionCode(OphthalmicMedicationsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Ophthalmic Medications Section Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOphthalmicMedicationsSectionCode(OphthalmicMedicationsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPHTHALMIC_MEDICATIONS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in "+
"value.code = '70935-2' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateOphthalmicMedicationsSectionCode(OphthalmicMedicationsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Ophthalmic Medications Section Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOphthalmicMedicationsSectionCode(OphthalmicMedicationsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_OPHTHALMIC_MEDICATIONS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param ophthalmicMedicationsSection The receiving '<em><b>Ophthalmic Medications Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateOphthalmicMedicationsSectionCode(OphthalmicMedicationsSection ophthalmicMedicationsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_OPHTHALMIC_MEDICATIONS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EyePackage.Literals.OPHTHALMIC_MEDICATIONS_SECTION);
			try {
				VALIDATE_OPHTHALMIC_MEDICATIONS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_OPHTHALMIC_MEDICATIONS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_OPHTHALMIC_MEDICATIONS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(ophthalmicMedicationsSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EyeValidator.DIAGNOSTIC_SOURCE,
						 EyeValidator.OPHTHALMIC_MEDICATIONS_SECTION__OPHTHALMIC_MEDICATIONS_SECTION_CODE,
						 EyePlugin.INSTANCE.getString("OphthalmicMedicationsSectionCode"),
						 new Object [] { ophthalmicMedicationsSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOphthalmicMedicationsSectionMedication(OphthalmicMedicationsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Ophthalmic Medications Section Medication</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOphthalmicMedicationsSectionMedication(OphthalmicMedicationsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPHTHALMIC_MEDICATIONS_SECTION_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.substanceAdministration.oclIsUndefined() and entry.substanceAdministration.oclIsKindOf(ihe::Medication))";

	/**
	 * The cached OCL invariant for the '{@link #validateOphthalmicMedicationsSectionMedication(OphthalmicMedicationsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Ophthalmic Medications Section Medication</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOphthalmicMedicationsSectionMedication(OphthalmicMedicationsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_OPHTHALMIC_MEDICATIONS_SECTION_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param ophthalmicMedicationsSection The receiving '<em><b>Ophthalmic Medications Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateOphthalmicMedicationsSectionMedication(OphthalmicMedicationsSection ophthalmicMedicationsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_OPHTHALMIC_MEDICATIONS_SECTION_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EyePackage.Literals.OPHTHALMIC_MEDICATIONS_SECTION);
			try {
				VALIDATE_OPHTHALMIC_MEDICATIONS_SECTION_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_OPHTHALMIC_MEDICATIONS_SECTION_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_OPHTHALMIC_MEDICATIONS_SECTION_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(ophthalmicMedicationsSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 EyeValidator.DIAGNOSTIC_SOURCE,
						 EyeValidator.OPHTHALMIC_MEDICATIONS_SECTION__OPHTHALMIC_MEDICATIONS_SECTION_MEDICATION,
						 EyePlugin.INSTANCE.getString("OphthalmicMedicationsSectionMedication"),
						 new Object [] { ophthalmicMedicationsSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getEyeMedication(OphthalmicMedicationsSection) <em>Get Eye Medication</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEyeMedication(OphthalmicMedicationsSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_EYE_MEDICATION__EOCL_EXP = "self.getSubstanceAdministrations()->select(substanceAdministration : cda::SubstanceAdministration | not substanceAdministration.oclIsUndefined() and substanceAdministration.oclIsKindOf(ihe::Medication))->asSequence()->any(true).oclAsType(ihe::Medication)";

	/**
	 * The cached OCL query for the '{@link #getEyeMedication(OphthalmicMedicationsSection) <em>Get Eye Medication</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEyeMedication(OphthalmicMedicationsSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_EYE_MEDICATION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  Medication getEyeMedication(OphthalmicMedicationsSection ophthalmicMedicationsSection) {
		if (GET_EYE_MEDICATION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(EyePackage.Literals.OPHTHALMIC_MEDICATIONS_SECTION, EyePackage.Literals.OPHTHALMIC_MEDICATIONS_SECTION.getEAllOperations().get(69));
			try {
				GET_EYE_MEDICATION__EOCL_QRY = helper.createQuery(GET_EYE_MEDICATION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_EYE_MEDICATION__EOCL_QRY);
		return (Medication) query.evaluate(ophthalmicMedicationsSection);
	}

	/**
	 * The cached OCL expression body for the '{@link #validateIHEMedicationsSectionTemplateId(OphthalmicMedicationsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate IHE Medications Section Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateIHEMedicationsSectionTemplateId(OphthalmicMedicationsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_IHE_MEDICATIONS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.12.1.2.4')";

  /**
	 * The cached OCL invariant for the '{@link #validateIHEMedicationsSectionTemplateId(OphthalmicMedicationsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate IHE Medications Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateIHEMedicationsSectionTemplateId(OphthalmicMedicationsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  
  protected static Constraint VALIDATE_IHE_MEDICATIONS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param ophthalmicMedicationsSection The receiving '<em><b>Ophthalmic Medications Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  boolean validateIHEMedicationsSectionTemplateId(OphthalmicMedicationsSection ophthalmicMedicationsSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
		if (VALIDATE_IHE_MEDICATIONS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EyePackage.Literals.OPHTHALMIC_MEDICATIONS_SECTION);
			try {
				VALIDATE_IHE_MEDICATIONS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_IHE_MEDICATIONS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_IHE_MEDICATIONS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(ophthalmicMedicationsSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EyeValidator.DIAGNOSTIC_SOURCE,
						 EyeValidator.OPHTHALMIC_MEDICATIONS_SECTION__IHE_MEDICATIONS_SECTION_TEMPLATE_ID,
						 EyePlugin.INSTANCE.getString("IHEMedicationsSectionTemplateId"),
						 new Object [] { ophthalmicMedicationsSection }));
			}
			 
			return false;
		}
		return true;
	}

} // OphthalmicMedicationsSectionOperations