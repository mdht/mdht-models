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

import org.openhealthtools.mdht.uml.cda.emspcr.ChestAndLungsAssessment;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPlugin;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Chest And Lungs Assessment</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ChestAndLungsAssessment#validateChestAndLungsAssessmentTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chest And Lungs Assessment Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ChestAndLungsAssessment#validateChestAndLungsAssessmentCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chest And Lungs Assessment Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ChestAndLungsAssessment#validateChestAndLungsAssessmentValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chest And Lungs Assessment Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ChestAndLungsAssessment#validateChestAndLungsAssessmentEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chest And Lungs Assessment Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ChestAndLungsAssessment#validateChestAndLungsAssessmentMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chest And Lungs Assessment Mood Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ChestAndLungsAssessmentOperations extends ClinicalStatementOperations {
	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	protected ChestAndLungsAssessmentOperations() {
		super();
	}

	/**
	* The cached OCL expression body for the '{@link #validateChestAndLungsAssessmentTemplateId(ChestAndLungsAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chest And Lungs Assessment Template Id</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateChestAndLungsAssessmentTemplateId(ChestAndLungsAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_CHEST_AND_LUNGS_ASSESSMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.1133883.17.3.10.1.115')";

	/**
	* The cached OCL invariant for the '{@link #validateChestAndLungsAssessmentTemplateId(ChestAndLungsAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chest And Lungs Assessment Template Id</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateChestAndLungsAssessmentTemplateId(ChestAndLungsAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_CHEST_AND_LUNGS_ASSESSMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param chestAndLungsAssessment The receiving '<em><b>Chest And Lungs Assessment</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateChestAndLungsAssessmentTemplateId(ChestAndLungsAssessment chestAndLungsAssessment,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CHEST_AND_LUNGS_ASSESSMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.CHEST_AND_LUNGS_ASSESSMENT);
			try {
				VALIDATE_CHEST_AND_LUNGS_ASSESSMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CHEST_AND_LUNGS_ASSESSMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CHEST_AND_LUNGS_ASSESSMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			chestAndLungsAssessment)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.CHEST_AND_LUNGS_ASSESSMENT__CHEST_AND_LUNGS_ASSESSMENT_TEMPLATE_ID,
					EmspcrPlugin.INSTANCE.getString("ChestAndLungsAssessmentTemplateId"),
					new Object[] { chestAndLungsAssessment }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateChestAndLungsAssessmentCode(ChestAndLungsAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chest And Lungs Assessment Code</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateChestAndLungsAssessmentCode(ChestAndLungsAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_CHEST_AND_LUNGS_ASSESSMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "
			+ "value.code = '67528-0' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	* The cached OCL invariant for the '{@link #validateChestAndLungsAssessmentCode(ChestAndLungsAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chest And Lungs Assessment Code</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateChestAndLungsAssessmentCode(ChestAndLungsAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_CHEST_AND_LUNGS_ASSESSMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param chestAndLungsAssessment The receiving '<em><b>Chest And Lungs Assessment</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateChestAndLungsAssessmentCode(ChestAndLungsAssessment chestAndLungsAssessment,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CHEST_AND_LUNGS_ASSESSMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.CHEST_AND_LUNGS_ASSESSMENT);
			try {
				VALIDATE_CHEST_AND_LUNGS_ASSESSMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CHEST_AND_LUNGS_ASSESSMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CHEST_AND_LUNGS_ASSESSMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			chestAndLungsAssessment)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.CHEST_AND_LUNGS_ASSESSMENT__CHEST_AND_LUNGS_ASSESSMENT_CODE,
					EmspcrPlugin.INSTANCE.getString("ChestAndLungsAssessmentCode"),
					new Object[] { chestAndLungsAssessment }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateChestAndLungsAssessmentValue(ChestAndLungsAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chest And Lungs Assessment Value</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateChestAndLungsAssessmentValue(ChestAndLungsAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_CHEST_AND_LUNGS_ASSESSMENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (not self.value->isEmpty() and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = element.oclAsType(datatypes::CD) in "
			+ "value.codeSystem = '2.16.840.1.113883.6.1' and (value.code = 'LA17208-2' or value.code = 'LA17209-0' or value.code = 'LA17214-0' or value.code = 'LA17215-7' or value.code = 'LA17220-7' or value.code = 'LA17222-3' or value.code = 'LA17223-1' or value.code = 'LA17224-9' or value.code = 'LA17225-6' or value.code = 'LA17226-4' or value.code = 'LA17227-2' or value.code = 'LA17228-0' or value.code = 'LA17229-8' or value.code = 'LA17230-6' or value.code = 'LA17231-4' or value.code = 'LA17232-2' or value.code = 'LA17233-0' or value.code = 'LA17234-8' or value.code = 'LA17236-3' or value.code = 'LA17237-1' or value.code = 'LA17238-9' or value.code = 'LA17244-7' or value.code = 'LA17245-4' or value.code = 'LA18220-6' or value.code = 'LA18221-4' or value.code = 'LA18222-2' or value.code = 'LA18223-0' or value.code = 'LA18224-8' or value.code = 'LA18225-5' or value.code = 'LA18226-3' or value.code = 'LA18229-7' or value.code = 'LA18230-5' or value.code = 'LA18231-3' or value.code = 'LA18232-1' or value.code = 'LA18233-9' or value.code = 'LA18234-7' or value.code = 'LA18235-4' or value.code = 'LA18236-2' or value.code = 'LA18237-0' or value.code = 'LA18238-8' or value.code = 'LA18239-6' or value.code = 'LA18240-4' or value.code = 'LA18402-0' or value.code = 'LA6626-1' or value.code = 'LA6630-3' or value.code = 'LA7410-9' or value.code = 'LA7452-1' or value.code = 'LA7460-4')))";

	/**
	* The cached OCL invariant for the '{@link #validateChestAndLungsAssessmentValue(ChestAndLungsAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chest And Lungs Assessment Value</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateChestAndLungsAssessmentValue(ChestAndLungsAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_CHEST_AND_LUNGS_ASSESSMENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param chestAndLungsAssessment The receiving '<em><b>Chest And Lungs Assessment</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateChestAndLungsAssessmentValue(ChestAndLungsAssessment chestAndLungsAssessment,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CHEST_AND_LUNGS_ASSESSMENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.CHEST_AND_LUNGS_ASSESSMENT);
			try {
				VALIDATE_CHEST_AND_LUNGS_ASSESSMENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CHEST_AND_LUNGS_ASSESSMENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CHEST_AND_LUNGS_ASSESSMENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			chestAndLungsAssessment)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.CHEST_AND_LUNGS_ASSESSMENT__CHEST_AND_LUNGS_ASSESSMENT_VALUE,
					EmspcrPlugin.INSTANCE.getString("ChestAndLungsAssessmentValue"),
					new Object[] { chestAndLungsAssessment }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateChestAndLungsAssessmentEffectiveTime(ChestAndLungsAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chest And Lungs Assessment Effective Time</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateChestAndLungsAssessmentEffectiveTime(ChestAndLungsAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_CHEST_AND_LUNGS_ASSESSMENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
	* The cached OCL invariant for the '{@link #validateChestAndLungsAssessmentEffectiveTime(ChestAndLungsAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chest And Lungs Assessment Effective Time</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateChestAndLungsAssessmentEffectiveTime(ChestAndLungsAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_CHEST_AND_LUNGS_ASSESSMENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param chestAndLungsAssessment The receiving '<em><b>Chest And Lungs Assessment</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateChestAndLungsAssessmentEffectiveTime(ChestAndLungsAssessment chestAndLungsAssessment,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CHEST_AND_LUNGS_ASSESSMENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.CHEST_AND_LUNGS_ASSESSMENT);
			try {
				VALIDATE_CHEST_AND_LUNGS_ASSESSMENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CHEST_AND_LUNGS_ASSESSMENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CHEST_AND_LUNGS_ASSESSMENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			chestAndLungsAssessment)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.CHEST_AND_LUNGS_ASSESSMENT__CHEST_AND_LUNGS_ASSESSMENT_EFFECTIVE_TIME,
					EmspcrPlugin.INSTANCE.getString("ChestAndLungsAssessmentEffectiveTime"),
					new Object[] { chestAndLungsAssessment }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateChestAndLungsAssessmentMoodCode(ChestAndLungsAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chest And Lungs Assessment Mood Code</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateChestAndLungsAssessmentMoodCode(ChestAndLungsAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_CHEST_AND_LUNGS_ASSESSMENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	* The cached OCL invariant for the '{@link #validateChestAndLungsAssessmentMoodCode(ChestAndLungsAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chest And Lungs Assessment Mood Code</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateChestAndLungsAssessmentMoodCode(ChestAndLungsAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_CHEST_AND_LUNGS_ASSESSMENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param chestAndLungsAssessment The receiving '<em><b>Chest And Lungs Assessment</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateChestAndLungsAssessmentMoodCode(ChestAndLungsAssessment chestAndLungsAssessment,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CHEST_AND_LUNGS_ASSESSMENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.CHEST_AND_LUNGS_ASSESSMENT);
			try {
				VALIDATE_CHEST_AND_LUNGS_ASSESSMENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CHEST_AND_LUNGS_ASSESSMENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CHEST_AND_LUNGS_ASSESSMENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			chestAndLungsAssessment)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.CHEST_AND_LUNGS_ASSESSMENT__CHEST_AND_LUNGS_ASSESSMENT_MOOD_CODE,
					EmspcrPlugin.INSTANCE.getString("ChestAndLungsAssessmentMoodCode"),
					new Object[] { chestAndLungsAssessment }));
			}

			return false;
		}
		return true;
	}

} // ChestAndLungsAssessmentOperations
