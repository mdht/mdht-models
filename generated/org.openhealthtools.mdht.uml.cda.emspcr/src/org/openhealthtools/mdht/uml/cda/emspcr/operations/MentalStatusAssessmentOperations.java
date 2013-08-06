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
import org.openhealthtools.mdht.uml.cda.emspcr.MentalStatusAssessment;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Mental Status Assessment</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.MentalStatusAssessment#validateMentalStatusAssessmentTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Assessment Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.MentalStatusAssessment#validateMentalStatusAssessmentCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Assessment Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.MentalStatusAssessment#validateMentalStatusAssessmentCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Assessment Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.MentalStatusAssessment#validateMentalStatusAssessmentValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Assessment Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.MentalStatusAssessment#validateMentalStatusAssessmentMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Assessment Mood Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MentalStatusAssessmentOperations extends ClinicalStatementOperations {
	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	protected MentalStatusAssessmentOperations() {
		super();
	}

	/**
	* The cached OCL expression body for the '{@link #validateMentalStatusAssessmentTemplateId(MentalStatusAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Assessment Template Id</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateMentalStatusAssessmentTemplateId(MentalStatusAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_MENTAL_STATUS_ASSESSMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.1133883.17.3.10.1.122')";

	/**
	* The cached OCL invariant for the '{@link #validateMentalStatusAssessmentTemplateId(MentalStatusAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Assessment Template Id</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateMentalStatusAssessmentTemplateId(MentalStatusAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_MENTAL_STATUS_ASSESSMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param mentalStatusAssessment The receiving '<em><b>Mental Status Assessment</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateMentalStatusAssessmentTemplateId(MentalStatusAssessment mentalStatusAssessment,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MENTAL_STATUS_ASSESSMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.MENTAL_STATUS_ASSESSMENT);
			try {
				VALIDATE_MENTAL_STATUS_ASSESSMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MENTAL_STATUS_ASSESSMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MENTAL_STATUS_ASSESSMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			mentalStatusAssessment)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.MENTAL_STATUS_ASSESSMENT__MENTAL_STATUS_ASSESSMENT_TEMPLATE_ID,
					EmspcrPlugin.INSTANCE.getString("MentalStatusAssessmentTemplateId"),
					new Object[] { mentalStatusAssessment }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateMentalStatusAssessmentCodeP(MentalStatusAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Assessment Code P</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateMentalStatusAssessmentCodeP(MentalStatusAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_MENTAL_STATUS_ASSESSMENT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	* The cached OCL invariant for the '{@link #validateMentalStatusAssessmentCodeP(MentalStatusAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Assessment Code P</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateMentalStatusAssessmentCodeP(MentalStatusAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_MENTAL_STATUS_ASSESSMENT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param mentalStatusAssessment The receiving '<em><b>Mental Status Assessment</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateMentalStatusAssessmentCodeP(MentalStatusAssessment mentalStatusAssessment,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MENTAL_STATUS_ASSESSMENT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.MENTAL_STATUS_ASSESSMENT);
			try {
				VALIDATE_MENTAL_STATUS_ASSESSMENT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MENTAL_STATUS_ASSESSMENT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MENTAL_STATUS_ASSESSMENT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			mentalStatusAssessment)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.MENTAL_STATUS_ASSESSMENT__MENTAL_STATUS_ASSESSMENT_CODE_P,
					EmspcrPlugin.INSTANCE.getString("MentalStatusAssessmentCodeP"),
					new Object[] { mentalStatusAssessment }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.emspcr.MentalStatusAssessmentCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.emspcr.MentalStatusAssessmentCodeP", passToken);
				}
				passToken.add(mentalStatusAssessment);
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateMentalStatusAssessmentCode(MentalStatusAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Assessment Code</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateMentalStatusAssessmentCode(MentalStatusAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_MENTAL_STATUS_ASSESSMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "
			+ "value.code = '67535-5' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	* The cached OCL invariant for the '{@link #validateMentalStatusAssessmentCode(MentalStatusAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Assessment Code</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateMentalStatusAssessmentCode(MentalStatusAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_MENTAL_STATUS_ASSESSMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param mentalStatusAssessment The receiving '<em><b>Mental Status Assessment</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateMentalStatusAssessmentCode(MentalStatusAssessment mentalStatusAssessment,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.emspcr.MentalStatusAssessmentCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(mentalStatusAssessment)) {
			// I have a free pass to short-circuit
			return true;
		}

		if (VALIDATE_MENTAL_STATUS_ASSESSMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.MENTAL_STATUS_ASSESSMENT);
			try {
				VALIDATE_MENTAL_STATUS_ASSESSMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MENTAL_STATUS_ASSESSMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MENTAL_STATUS_ASSESSMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			mentalStatusAssessment)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.MENTAL_STATUS_ASSESSMENT__MENTAL_STATUS_ASSESSMENT_CODE,
					EmspcrPlugin.INSTANCE.getString("MentalStatusAssessmentCode"),
					new Object[] { mentalStatusAssessment }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateMentalStatusAssessmentValue(MentalStatusAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Assessment Value</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateMentalStatusAssessmentValue(MentalStatusAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_MENTAL_STATUS_ASSESSMENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (not self.value->isEmpty() and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = element.oclAsType(datatypes::CD) in "
			+ "value.codeSystem = '2.16.840.1.113883.6.1' and (value.code = 'LA17286-8' or value.code = 'LA17287-6' or value.code = 'LA17288-4' or value.code = 'LA17289-2' or value.code = 'LA17290-0' or value.code = 'LA18259-4' or value.code = 'LA18260-2' or value.code = 'LA6560-2' or value.code = 'LA6630-3' or value.code = 'LA7438-0' or value.code = 'LA9343-0')))";

	/**
	* The cached OCL invariant for the '{@link #validateMentalStatusAssessmentValue(MentalStatusAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Assessment Value</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateMentalStatusAssessmentValue(MentalStatusAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_MENTAL_STATUS_ASSESSMENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param mentalStatusAssessment The receiving '<em><b>Mental Status Assessment</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateMentalStatusAssessmentValue(MentalStatusAssessment mentalStatusAssessment,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MENTAL_STATUS_ASSESSMENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.MENTAL_STATUS_ASSESSMENT);
			try {
				VALIDATE_MENTAL_STATUS_ASSESSMENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MENTAL_STATUS_ASSESSMENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MENTAL_STATUS_ASSESSMENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			mentalStatusAssessment)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.MENTAL_STATUS_ASSESSMENT__MENTAL_STATUS_ASSESSMENT_VALUE,
					EmspcrPlugin.INSTANCE.getString("MentalStatusAssessmentValue"),
					new Object[] { mentalStatusAssessment }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateMentalStatusAssessmentMoodCode(MentalStatusAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Assessment Mood Code</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateMentalStatusAssessmentMoodCode(MentalStatusAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_MENTAL_STATUS_ASSESSMENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	* The cached OCL invariant for the '{@link #validateMentalStatusAssessmentMoodCode(MentalStatusAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Assessment Mood Code</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateMentalStatusAssessmentMoodCode(MentalStatusAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_MENTAL_STATUS_ASSESSMENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param mentalStatusAssessment The receiving '<em><b>Mental Status Assessment</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateMentalStatusAssessmentMoodCode(MentalStatusAssessment mentalStatusAssessment,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MENTAL_STATUS_ASSESSMENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.MENTAL_STATUS_ASSESSMENT);
			try {
				VALIDATE_MENTAL_STATUS_ASSESSMENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MENTAL_STATUS_ASSESSMENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MENTAL_STATUS_ASSESSMENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			mentalStatusAssessment)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.MENTAL_STATUS_ASSESSMENT__MENTAL_STATUS_ASSESSMENT_MOOD_CODE,
					EmspcrPlugin.INSTANCE.getString("MentalStatusAssessmentMoodCode"),
					new Object[] { mentalStatusAssessment }));
			}

			return false;
		}
		return true;
	}

} // MentalStatusAssessmentOperations
