/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.ImmunizationRefusalReason;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;
import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Immunization Refusal Reason</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationRefusalReason#validateImmunizationRefusalReasonTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Refusal Reason Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationRefusalReason#validateImmunizationRefusalReasonClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Refusal Reason Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationRefusalReason#validateImmunizationRefusalReasonCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Refusal Reason Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationRefusalReason#validateImmunizationRefusalReasonId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Refusal Reason Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationRefusalReason#validateImmunizationRefusalReasonMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Refusal Reason Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationRefusalReason#validateImmunizationRefusalReasonStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Refusal Reason Status Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ImmunizationRefusalReasonOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImmunizationRefusalReasonOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateImmunizationRefusalReasonTemplateId(ImmunizationRefusalReason, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Refusal Reason Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImmunizationRefusalReasonTemplateId(ImmunizationRefusalReason, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_IMMUNIZATION_REFUSAL_REASON_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.53')";

	/**
	 * The cached OCL invariant for the '{@link #validateImmunizationRefusalReasonTemplateId(ImmunizationRefusalReason, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Refusal Reason Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImmunizationRefusalReasonTemplateId(ImmunizationRefusalReason, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_IMMUNIZATION_REFUSAL_REASON_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.53')
	 * @param immunizationRefusalReason The receiving '<em><b>Immunization Refusal Reason</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateImmunizationRefusalReasonTemplateId(
			ImmunizationRefusalReason immunizationRefusalReason, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_IMMUNIZATION_REFUSAL_REASON_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.IMMUNIZATION_REFUSAL_REASON);
			try {
				VALIDATE_IMMUNIZATION_REFUSAL_REASON_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_IMMUNIZATION_REFUSAL_REASON_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_IMMUNIZATION_REFUSAL_REASON_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			immunizationRefusalReason)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.IMMUNIZATION_REFUSAL_REASON__IMMUNIZATION_REFUSAL_REASON_TEMPLATE_ID,
					ConsolPlugin.INSTANCE.getString("ImmunizationRefusalReasonTemplateId"),
					new Object[] { immunizationRefusalReason }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateImmunizationRefusalReasonClassCode(ImmunizationRefusalReason, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Refusal Reason Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImmunizationRefusalReasonClassCode(ImmunizationRefusalReason, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_IMMUNIZATION_REFUSAL_REASON_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('classCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateImmunizationRefusalReasonClassCode(ImmunizationRefusalReason, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Refusal Reason Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImmunizationRefusalReasonClassCode(ImmunizationRefusalReason, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_IMMUNIZATION_REFUSAL_REASON_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * isDefined('classCode')
	 * @param immunizationRefusalReason The receiving '<em><b>Immunization Refusal Reason</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateImmunizationRefusalReasonClassCode(
			ImmunizationRefusalReason immunizationRefusalReason, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_IMMUNIZATION_REFUSAL_REASON_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.IMMUNIZATION_REFUSAL_REASON);
			try {
				VALIDATE_IMMUNIZATION_REFUSAL_REASON_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_IMMUNIZATION_REFUSAL_REASON_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_IMMUNIZATION_REFUSAL_REASON_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			immunizationRefusalReason)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.IMMUNIZATION_REFUSAL_REASON__IMMUNIZATION_REFUSAL_REASON_CLASS_CODE,
					ConsolPlugin.INSTANCE.getString("ImmunizationRefusalReasonClassCode"),
					new Object[] { immunizationRefusalReason }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateImmunizationRefusalReasonCode(ImmunizationRefusalReason, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Refusal Reason Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImmunizationRefusalReasonCode(ImmunizationRefusalReason, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_IMMUNIZATION_REFUSAL_REASON_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "
			+ "value.codeSystem = '2.16.840.1.113883.5.8' and (value.code = 'IMMUNE' or value.code = 'MEDPREC' or value.code = 'OSTOCK' or value.code = 'PATOBJ' or value.code = 'PHILISOP' or value.code = 'RELIG' or value.code = 'VACEFF' or value.code = 'VACSAF'))";

	/**
	 * The cached OCL invariant for the '{@link #validateImmunizationRefusalReasonCode(ImmunizationRefusalReason, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Refusal Reason Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImmunizationRefusalReasonCode(ImmunizationRefusalReason, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_IMMUNIZATION_REFUSAL_REASON_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and 
	 * let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in 
	 * value.codeSystem = '2.16.840.1.113883.5.8' and (value.code = 'IMMUNE' or value.code = 'MEDPREC' or value.code = 'OSTOCK' or value.code = 'PATOBJ' or value.code = 'PHILISOP' or value.code = 'RELIG' or value.code = 'VACEFF' or value.code = 'VACSAF'))
	 * @param immunizationRefusalReason The receiving '<em><b>Immunization Refusal Reason</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateImmunizationRefusalReasonCode(ImmunizationRefusalReason immunizationRefusalReason,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_IMMUNIZATION_REFUSAL_REASON_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.IMMUNIZATION_REFUSAL_REASON);
			try {
				VALIDATE_IMMUNIZATION_REFUSAL_REASON_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_IMMUNIZATION_REFUSAL_REASON_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_IMMUNIZATION_REFUSAL_REASON_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			immunizationRefusalReason)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.IMMUNIZATION_REFUSAL_REASON__IMMUNIZATION_REFUSAL_REASON_CODE,
					ConsolPlugin.INSTANCE.getString("ImmunizationRefusalReasonCode"),
					new Object[] { immunizationRefusalReason }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateImmunizationRefusalReasonId(ImmunizationRefusalReason, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Refusal Reason Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImmunizationRefusalReasonId(ImmunizationRefusalReason, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_IMMUNIZATION_REFUSAL_REASON_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateImmunizationRefusalReasonId(ImmunizationRefusalReason, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Refusal Reason Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImmunizationRefusalReasonId(ImmunizationRefusalReason, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_IMMUNIZATION_REFUSAL_REASON_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())
	 * @param immunizationRefusalReason The receiving '<em><b>Immunization Refusal Reason</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateImmunizationRefusalReasonId(ImmunizationRefusalReason immunizationRefusalReason,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_IMMUNIZATION_REFUSAL_REASON_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.IMMUNIZATION_REFUSAL_REASON);
			try {
				VALIDATE_IMMUNIZATION_REFUSAL_REASON_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_IMMUNIZATION_REFUSAL_REASON_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_IMMUNIZATION_REFUSAL_REASON_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			immunizationRefusalReason)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.IMMUNIZATION_REFUSAL_REASON__IMMUNIZATION_REFUSAL_REASON_ID,
					ConsolPlugin.INSTANCE.getString("ImmunizationRefusalReasonId"),
					new Object[] { immunizationRefusalReason }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateImmunizationRefusalReasonMoodCode(ImmunizationRefusalReason, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Refusal Reason Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImmunizationRefusalReasonMoodCode(ImmunizationRefusalReason, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_IMMUNIZATION_REFUSAL_REASON_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateImmunizationRefusalReasonMoodCode(ImmunizationRefusalReason, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Refusal Reason Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImmunizationRefusalReasonMoodCode(ImmunizationRefusalReason, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_IMMUNIZATION_REFUSAL_REASON_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * isDefined('moodCode')
	 * @param immunizationRefusalReason The receiving '<em><b>Immunization Refusal Reason</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateImmunizationRefusalReasonMoodCode(
			ImmunizationRefusalReason immunizationRefusalReason, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_IMMUNIZATION_REFUSAL_REASON_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.IMMUNIZATION_REFUSAL_REASON);
			try {
				VALIDATE_IMMUNIZATION_REFUSAL_REASON_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_IMMUNIZATION_REFUSAL_REASON_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_IMMUNIZATION_REFUSAL_REASON_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			immunizationRefusalReason)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.IMMUNIZATION_REFUSAL_REASON__IMMUNIZATION_REFUSAL_REASON_MOOD_CODE,
					ConsolPlugin.INSTANCE.getString("ImmunizationRefusalReasonMoodCode"),
					new Object[] { immunizationRefusalReason }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateImmunizationRefusalReasonStatusCode(ImmunizationRefusalReason, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Refusal Reason Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImmunizationRefusalReasonStatusCode(ImmunizationRefusalReason, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_IMMUNIZATION_REFUSAL_REASON_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (self.statusCode.oclIsKindOf(datatypes::CS) and "
			+ "let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in " + "value.code = 'completed')";

	/**
	 * The cached OCL invariant for the '{@link #validateImmunizationRefusalReasonStatusCode(ImmunizationRefusalReason, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Refusal Reason Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImmunizationRefusalReasonStatusCode(ImmunizationRefusalReason, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_IMMUNIZATION_REFUSAL_REASON_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (self.statusCode.oclIsKindOf(datatypes::CS) and 
	 * let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in 
	 * value.code = 'completed')
	 * @param immunizationRefusalReason The receiving '<em><b>Immunization Refusal Reason</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateImmunizationRefusalReasonStatusCode(
			ImmunizationRefusalReason immunizationRefusalReason, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_IMMUNIZATION_REFUSAL_REASON_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.IMMUNIZATION_REFUSAL_REASON);
			try {
				VALIDATE_IMMUNIZATION_REFUSAL_REASON_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_IMMUNIZATION_REFUSAL_REASON_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_IMMUNIZATION_REFUSAL_REASON_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			immunizationRefusalReason)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.IMMUNIZATION_REFUSAL_REASON__IMMUNIZATION_REFUSAL_REASON_STATUS_CODE,
					ConsolPlugin.INSTANCE.getString("ImmunizationRefusalReasonStatusCode"),
					new Object[] { immunizationRefusalReason }));
			}

			return false;
		}
		return true;
	}

} // ImmunizationRefusalReasonOperations
