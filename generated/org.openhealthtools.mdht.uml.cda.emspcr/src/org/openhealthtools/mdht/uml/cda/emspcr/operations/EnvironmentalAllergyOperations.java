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
import org.openhealthtools.mdht.uml.cda.emspcr.EnvironmentalAllergy;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Environmental Allergy</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EnvironmentalAllergy#validateEnvironmentalAllergyTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Environmental Allergy Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EnvironmentalAllergy#validateEnvironmentalAllergyCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Environmental Allergy Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EnvironmentalAllergy#validateEnvironmentalAllergyValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Environmental Allergy Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EnvironmentalAllergy#validateEnvironmentalAllergyMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Environmental Allergy Mood Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EnvironmentalAllergyOperations extends ClinicalStatementOperations {
	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	protected EnvironmentalAllergyOperations() {
		super();
	}

	/**
	* The cached OCL expression body for the '{@link #validateEnvironmentalAllergyTemplateId(EnvironmentalAllergy, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Environmental Allergy Template Id</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateEnvironmentalAllergyTemplateId(EnvironmentalAllergy, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_ENVIRONMENTAL_ALLERGY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.1133883.17.3.10.1.104')";

	/**
	* The cached OCL invariant for the '{@link #validateEnvironmentalAllergyTemplateId(EnvironmentalAllergy, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Environmental Allergy Template Id</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateEnvironmentalAllergyTemplateId(EnvironmentalAllergy, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_ENVIRONMENTAL_ALLERGY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param environmentalAllergy The receiving '<em><b>Environmental Allergy</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateEnvironmentalAllergyTemplateId(EnvironmentalAllergy environmentalAllergy,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_ENVIRONMENTAL_ALLERGY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.ENVIRONMENTAL_ALLERGY);
			try {
				VALIDATE_ENVIRONMENTAL_ALLERGY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ENVIRONMENTAL_ALLERGY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ENVIRONMENTAL_ALLERGY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			environmentalAllergy)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.ENVIRONMENTAL_ALLERGY__ENVIRONMENTAL_ALLERGY_TEMPLATE_ID,
					EmspcrPlugin.INSTANCE.getString("EnvironmentalAllergyTemplateId"),
					new Object[] { environmentalAllergy }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateEnvironmentalAllergyCode(EnvironmentalAllergy, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Environmental Allergy Code</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateEnvironmentalAllergyCode(EnvironmentalAllergy, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_ENVIRONMENTAL_ALLERGY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "
			+ "value.code = '69748-2' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	* The cached OCL invariant for the '{@link #validateEnvironmentalAllergyCode(EnvironmentalAllergy, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Environmental Allergy Code</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateEnvironmentalAllergyCode(EnvironmentalAllergy, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_ENVIRONMENTAL_ALLERGY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param environmentalAllergy The receiving '<em><b>Environmental Allergy</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateEnvironmentalAllergyCode(EnvironmentalAllergy environmentalAllergy,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_ENVIRONMENTAL_ALLERGY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.ENVIRONMENTAL_ALLERGY);
			try {
				VALIDATE_ENVIRONMENTAL_ALLERGY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ENVIRONMENTAL_ALLERGY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ENVIRONMENTAL_ALLERGY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			environmentalAllergy)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.ENVIRONMENTAL_ALLERGY__ENVIRONMENTAL_ALLERGY_CODE,
					EmspcrPlugin.INSTANCE.getString("EnvironmentalAllergyCode"), new Object[] { environmentalAllergy }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateEnvironmentalAllergyValue(EnvironmentalAllergy, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Environmental Allergy Value</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateEnvironmentalAllergyValue(EnvironmentalAllergy, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_ENVIRONMENTAL_ALLERGY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = element.oclAsType(datatypes::CD) in "
			+ "value.codeSystem = '2.16.840.1.113883.6.1' and (value.code = 'LA137-2' or value.code = 'LA17059-9' or value.code = 'LA18356-8' or value.code = 'LA18357-6' or value.code = 'LA18358-4' or value.code = 'LA18359-2' or value.code = 'LA18360-0' or value.code = 'LA18361-8')))";

	/**
	* The cached OCL invariant for the '{@link #validateEnvironmentalAllergyValue(EnvironmentalAllergy, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Environmental Allergy Value</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateEnvironmentalAllergyValue(EnvironmentalAllergy, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_ENVIRONMENTAL_ALLERGY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param environmentalAllergy The receiving '<em><b>Environmental Allergy</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateEnvironmentalAllergyValue(EnvironmentalAllergy environmentalAllergy,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_ENVIRONMENTAL_ALLERGY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.ENVIRONMENTAL_ALLERGY);
			try {
				VALIDATE_ENVIRONMENTAL_ALLERGY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ENVIRONMENTAL_ALLERGY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ENVIRONMENTAL_ALLERGY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			environmentalAllergy)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.ENVIRONMENTAL_ALLERGY__ENVIRONMENTAL_ALLERGY_VALUE,
					EmspcrPlugin.INSTANCE.getString("EnvironmentalAllergyValue"), new Object[] { environmentalAllergy }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateEnvironmentalAllergyMoodCode(EnvironmentalAllergy, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Environmental Allergy Mood Code</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateEnvironmentalAllergyMoodCode(EnvironmentalAllergy, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_ENVIRONMENTAL_ALLERGY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	* The cached OCL invariant for the '{@link #validateEnvironmentalAllergyMoodCode(EnvironmentalAllergy, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Environmental Allergy Mood Code</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateEnvironmentalAllergyMoodCode(EnvironmentalAllergy, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_ENVIRONMENTAL_ALLERGY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param environmentalAllergy The receiving '<em><b>Environmental Allergy</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateEnvironmentalAllergyMoodCode(EnvironmentalAllergy environmentalAllergy,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_ENVIRONMENTAL_ALLERGY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.ENVIRONMENTAL_ALLERGY);
			try {
				VALIDATE_ENVIRONMENTAL_ALLERGY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ENVIRONMENTAL_ALLERGY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ENVIRONMENTAL_ALLERGY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			environmentalAllergy)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.ENVIRONMENTAL_ALLERGY__ENVIRONMENTAL_ALLERGY_MOOD_CODE,
					EmspcrPlugin.INSTANCE.getString("EnvironmentalAllergyMoodCode"),
					new Object[] { environmentalAllergy }));
			}

			return false;
		}
		return true;
	}

} // EnvironmentalAllergyOperations
