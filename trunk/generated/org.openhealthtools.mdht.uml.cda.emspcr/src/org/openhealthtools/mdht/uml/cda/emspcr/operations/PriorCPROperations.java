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
import org.openhealthtools.mdht.uml.cda.emspcr.PriorCPR;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Prior CPR</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PriorCPR#validatePriorCPRPriorCPRProviderParticipation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prior CPR Prior CPR Provider Participation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PriorCPR#validatePriorCPRTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prior CPR Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PriorCPR#validatePriorCPRCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prior CPR Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PriorCPR#validatePriorCPRValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prior CPR Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PriorCPR#validatePriorCPRMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prior CPR Mood Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PriorCPROperations extends ClinicalStatementOperations {
	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	protected PriorCPROperations() {
		super();
	}

	/**
	* The cached OCL expression body for the '{@link #validatePriorCPRPriorCPRProviderParticipation(PriorCPR, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prior CPR Prior CPR Provider Participation</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validatePriorCPRPriorCPRProviderParticipation(PriorCPR, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_PRIOR_CPR_PRIOR_CPR_PROVIDER_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->one(participant : cda::Participant2 | not participant.oclIsUndefined() and participant.oclIsKindOf(cda::Participant2))";

	/**
	* The cached OCL invariant for the '{@link #validatePriorCPRPriorCPRProviderParticipation(PriorCPR, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prior CPR Prior CPR Provider Participation</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validatePriorCPRPriorCPRProviderParticipation(PriorCPR, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_PRIOR_CPR_PRIOR_CPR_PROVIDER_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param priorCPR The receiving '<em><b>Prior CPR</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validatePriorCPRPriorCPRProviderParticipation(PriorCPR priorCPR, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PRIOR_CPR_PRIOR_CPR_PROVIDER_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PRIOR_CPR);
			try {
				VALIDATE_PRIOR_CPR_PRIOR_CPR_PROVIDER_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PRIOR_CPR_PRIOR_CPR_PROVIDER_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PRIOR_CPR_PRIOR_CPR_PROVIDER_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			priorCPR)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.PRIOR_CPR__PRIOR_CPR_PRIOR_CPR_PROVIDER_PARTICIPATION,
					EmspcrPlugin.INSTANCE.getString("PriorCPRPriorCPRProviderParticipation"), new Object[] { priorCPR }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validatePriorCPRTemplateId(PriorCPR, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prior CPR Template Id</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validatePriorCPRTemplateId(PriorCPR, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_PRIOR_CPR_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.1133883.17.3.10.1.125')";

	/**
	* The cached OCL invariant for the '{@link #validatePriorCPRTemplateId(PriorCPR, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prior CPR Template Id</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validatePriorCPRTemplateId(PriorCPR, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_PRIOR_CPR_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param priorCPR The receiving '<em><b>Prior CPR</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validatePriorCPRTemplateId(PriorCPR priorCPR, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PRIOR_CPR_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PRIOR_CPR);
			try {
				VALIDATE_PRIOR_CPR_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PRIOR_CPR_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PRIOR_CPR_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(priorCPR)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.PRIOR_CPR__PRIOR_CPR_TEMPLATE_ID,
					EmspcrPlugin.INSTANCE.getString("PriorCPRTemplateId"), new Object[] { priorCPR }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validatePriorCPRCode(PriorCPR, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prior CPR Code</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validatePriorCPRCode(PriorCPR, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_PRIOR_CPR_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "
			+ "value.code = '67506-6' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	* The cached OCL invariant for the '{@link #validatePriorCPRCode(PriorCPR, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prior CPR Code</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validatePriorCPRCode(PriorCPR, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_PRIOR_CPR_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param priorCPR The receiving '<em><b>Prior CPR</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validatePriorCPRCode(PriorCPR priorCPR, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PRIOR_CPR_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PRIOR_CPR);
			try {
				VALIDATE_PRIOR_CPR_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PRIOR_CPR_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PRIOR_CPR_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(priorCPR)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE, EmspcrValidator.PRIOR_CPR__PRIOR_CPR_CODE,
					EmspcrPlugin.INSTANCE.getString("PriorCPRCode"), new Object[] { priorCPR }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validatePriorCPRValue(PriorCPR, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prior CPR Value</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validatePriorCPRValue(PriorCPR, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_PRIOR_CPR_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::BL)))";

	/**
	* The cached OCL invariant for the '{@link #validatePriorCPRValue(PriorCPR, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prior CPR Value</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validatePriorCPRValue(PriorCPR, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_PRIOR_CPR_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param priorCPR The receiving '<em><b>Prior CPR</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validatePriorCPRValue(PriorCPR priorCPR, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PRIOR_CPR_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PRIOR_CPR);
			try {
				VALIDATE_PRIOR_CPR_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PRIOR_CPR_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PRIOR_CPR_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(priorCPR)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE, EmspcrValidator.PRIOR_CPR__PRIOR_CPR_VALUE,
					EmspcrPlugin.INSTANCE.getString("PriorCPRValue"), new Object[] { priorCPR }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validatePriorCPRMoodCode(PriorCPR, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prior CPR Mood Code</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validatePriorCPRMoodCode(PriorCPR, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_PRIOR_CPR_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	* The cached OCL invariant for the '{@link #validatePriorCPRMoodCode(PriorCPR, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prior CPR Mood Code</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validatePriorCPRMoodCode(PriorCPR, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_PRIOR_CPR_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param priorCPR The receiving '<em><b>Prior CPR</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validatePriorCPRMoodCode(PriorCPR priorCPR, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PRIOR_CPR_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PRIOR_CPR);
			try {
				VALIDATE_PRIOR_CPR_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PRIOR_CPR_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PRIOR_CPR_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(priorCPR)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.PRIOR_CPR__PRIOR_CPR_MOOD_CODE,
					EmspcrPlugin.INSTANCE.getString("PriorCPRMoodCode"), new Object[] { priorCPR }));
			}

			return false;
		}
		return true;
	}

} // PriorCPROperations
